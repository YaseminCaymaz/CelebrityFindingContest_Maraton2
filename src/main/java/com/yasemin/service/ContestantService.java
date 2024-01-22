package com.yasemin.service;

import com.yasemin.entity.Contestant;
import com.yasemin.repository.ContestantRepository;

import java.util.List;
import java.util.Optional;

public class ContestantService {
    private ContestantRepository contestantRepository;
    public ContestantService(){this.contestantRepository = new ContestantRepository();}
    public void save(Contestant contestant){
        contestantRepository.save(contestant);
    }
    public List<Contestant> findAll(){return contestantRepository.findAll();}
    public Optional<Contestant> findById(Long id){return contestantRepository.findById(id);}
 }
