package com.yasemin.service;

import com.yasemin.entity.CelebrityInfo;
import com.yasemin.entity.Contestant;
import com.yasemin.repository.CelebrityInfoRepository;
import com.yasemin.repository.ContestantRepository;

import java.util.List;
import java.util.Optional;

public class CelebrityInfoService {
    private CelebrityInfoRepository celebrityInfoRepository;
    public CelebrityInfoService(){
        this.celebrityInfoRepository = new CelebrityInfoRepository();
    }
    public void save(CelebrityInfo celebrityInfo){
        celebrityInfoRepository.save(celebrityInfo);
    }
    public List<CelebrityInfo> findAll(){return celebrityInfoRepository.findAll();}
    public Optional<CelebrityInfo> findById(Long id){return celebrityInfoRepository.findById(id);}
}
