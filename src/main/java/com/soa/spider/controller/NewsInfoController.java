package com.soa.spider.controller;

import com.soa.spider.dao.NewsInfoDao;
import com.soa.spider.domain.Application;
import com.soa.spider.domain.NewsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class NewsInfoController {

    @Autowired
    NewsInfoDao newsInfoDao;

    @RequestMapping(value ="/newsInfo",method = RequestMethod.POST)
    public List<NewsInfo> newsInfos(@RequestBody int day){

        System.out.println(day);
        List<NewsInfo> newsInfoList=newsInfoDao.selectByTime(day);
        return newsInfoList;

    }

    @GetMapping(value ="/newsInfoXml",produces = MediaType.APPLICATION_XML_VALUE)
    public List<NewsInfo> newsInfosXml(){

        List<NewsInfo> newsInfoList=newsInfoDao.selectByTime(0);
        return newsInfoList;

    }

}
