package com.soa.spider.dao;

import com.soa.spider.domain.Application;
import com.soa.spider.domain.NewsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface NewsInfoDao {
    @Select("select * from spider.NewsInfoTable where DATEDIFF(curTime,now())= #{day} ")
    List<NewsInfo> selectByTime(int day);
}
