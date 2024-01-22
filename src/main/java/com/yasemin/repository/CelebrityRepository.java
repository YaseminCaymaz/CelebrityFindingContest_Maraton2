package com.yasemin.repository;

import com.yasemin.entity.Celebrity;

public class CelebrityRepository extends RepositoryManager<Celebrity,Long> {
    public CelebrityRepository() {
        super(new Celebrity());
    }
}
