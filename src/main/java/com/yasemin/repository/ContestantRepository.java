package com.yasemin.repository;

import com.yasemin.entity.Contestant;

public class ContestantRepository extends RepositoryManager<Contestant,Long> {
    public ContestantRepository() {
        super(new Contestant());
    }
}
