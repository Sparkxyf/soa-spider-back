package com.soa.spider.dao;

import com.soa.spider.domain.Application;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Mapper
public interface ApplicationDao {


    @Select("select * from spider.Application where DATEDIFF(curTime,now()) > #{day} ")
    List<Application> selectByTime(int day);


}
