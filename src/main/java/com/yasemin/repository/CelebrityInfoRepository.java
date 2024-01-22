package com.yasemin.repository;

import com.yasemin.entity.CelebrityInfo;

public class CelebrityInfoRepository extends RepositoryManager<CelebrityInfo, Long> {
    public CelebrityInfoRepository() {
        super(new CelebrityInfo());
    }
}
