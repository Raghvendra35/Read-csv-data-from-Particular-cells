package com.psl.FinalDataExtract.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psl.FinalDataExtract.Entities.ConstituencyEntity;

@Repository
public interface ConstituencyRepo extends JpaRepository<ConstituencyEntity,Long>{
    
}
