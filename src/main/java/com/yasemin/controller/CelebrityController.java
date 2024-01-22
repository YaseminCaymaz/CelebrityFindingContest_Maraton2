package com.yasemin.controller;

import com.yasemin.entity.Celebrity;
import com.yasemin.entity.Contestant;
import com.yasemin.service.CelebrityService;
import com.yasemin.service.ContestantService;

import java.util.List;

public class CelebrityController {
    private CelebrityService celebrityService;
    public CelebrityController(){

        this.celebrityService = new CelebrityService();
    }

    public void save(Celebrity celebrity){
        celebrityService.save(celebrity);
    }
    public List<Celebrity> findAll() {

        return celebrityService.findAll();
    }

    public void findById(Long id){

        celebrityService.findById(id).ifPresentOrElse(System.out::println,()->System.out.println("Contestant not found"));
    }
}
