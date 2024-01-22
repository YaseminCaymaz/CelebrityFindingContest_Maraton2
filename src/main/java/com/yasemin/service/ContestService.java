package com.yasemin.service;

import com.yasemin.entity.Contest;
import com.yasemin.entity.Contestant;
import com.yasemin.repository.ContestRepository;

import java.util.List;
import java.util.Optional;

public class ContestService {
    private ContestRepository contestRepository;
    public ContestService(){this.contestRepository = new ContestRepository();}
    public void save(Contest contest){
        contestRepository.save(contest);
    }
    public List<Contest> findAll(){return contestRepository.findAll();}
    public Optional<Contest> findById(Long id){return contestRepository.findById(id);}

}
