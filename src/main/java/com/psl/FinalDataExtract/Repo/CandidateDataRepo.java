package com.psl.FinalDataExtract.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.psl.FinalDataExtract.Entities.CandidateData;


public interface CandidateDataRepo extends JpaRepository<CandidateData, Long>
{

	//void saveAll(List<CandidateData> candidateData);

	

}
