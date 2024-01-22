package com.yasemin.repository;

import com.yasemin.entity.Contest;

public class ContestRepository extends RepositoryManager<Contest,Long> {
    public ContestRepository() {
        super(new Contest());
    }
}
