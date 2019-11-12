package com.soa.spider.controller;

import com.soa.spider.dao.ApplicationDao;
import com.soa.spider.domain.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.valueOf;

@RestController
public class ApplicationController {

    @Autowired
    ApplicationDao applicationDao;


    @RequestMapping(value ="/application",method = RequestMethod.POST)
    public List<Application> applications(@RequestBody int day){


        System.out.println(day);

        List<Application> applicationList =applicationDao.selectByTime(-7);

        return applicationList;

    }

}
