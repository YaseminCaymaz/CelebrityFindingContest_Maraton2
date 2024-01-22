package com.yasemin.controller;

import com.yasemin.Runner;
import com.yasemin.entity.Contestant;
import com.yasemin.service.ContestantService;
import com.yasemin.utility.enums.Gender;

import java.util.Scanner;

public class ContestantController {
    private ContestantService contestantService;
    public ContestantController(){
        this.contestantService=new ContestantService();
    }

    public void save(Contestant contestant){
        contestantService.save(contestant);
    }

    public void findAll(){
        contestantService.findAll().forEach(System.out::println);
    }
    public void findById(Long id){

        contestantService.findById(id).ifPresentOrElse(System.out::println,()->System.out.println("Contestant not found"));
    }
}
