package com.yasemin.controller;

import com.yasemin.entity.Celebrity;
import com.yasemin.entity.Contest;
import com.yasemin.entity.Contestant;
import com.yasemin.service.ContestService;
import com.yasemin.utility.enums.Gender;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ContestController {
    private ContestService contestService;

    public ContestController(){

    }
    public void save(Contest contest){

        contestService.save(contest);
    }

    public void findAll(){
        contestService.findAll().forEach(System.out::println);}
    public void findById(Long id){
        contestService.findById(id).ifPresentOrElse(System.out::println,()->System.out.println("Contestant not found"));
    }

}
