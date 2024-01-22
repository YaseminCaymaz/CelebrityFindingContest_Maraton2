package com.yasemin.service;

import com.yasemin.entity.Celebrity;
import com.yasemin.entity.Contestant;
import com.yasemin.repository.CelebrityRepository;


import java.util.List;
import java.util.Optional;

public class CelebrityService {
    private CelebrityRepository celebrityRepository;
    public CelebrityService(){
      this.celebrityRepository = new CelebrityRepository();
    }
    public void save(Celebrity celebrity){
        celebrityRepository.save(celebrity);
    }
    public List<Celebrity> findAll(){return celebrityRepository.findAll();}
    public Optional<Celebrity> findById(Long id){return celebrityRepository.findById(id);}
}
