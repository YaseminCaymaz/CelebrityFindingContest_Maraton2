package com.yasemin.controller;

import com.yasemin.entity.CelebrityInfo;
import com.yasemin.entity.Contestant;
import com.yasemin.service.CelebrityInfoService;
import com.yasemin.service.ContestantService;

public class CelebrityInfoController {
    private CelebrityInfoService  celebrityInfoService;
    public CelebrityInfoController(){
        this.celebrityInfoService = new CelebrityInfoService();
    }

    public void save(CelebrityInfo celebrityInfo){
        celebrityInfoService.save(celebrityInfo);
    }
    public void findAll(){
        celebrityInfoService.findAll().forEach(System.out::println);
    }
    public void findById(Long id){
        celebrityInfoService.findById(id).ifPresentOrElse(System.out::println,()->System.out.println("Contestant not found"));
    }
}
