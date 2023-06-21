package com.psl.FinalDataExtract.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="candidate_data_2019")
public class CandidateData
{
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long candidateDataId;
	
   // private String ccode;
    private String cname;
    //private String rank;
    private String candiname;
    private String sex;
    private String abbr;
    private double gen_Vote;
    private double postal_Vote;
    private double total_Vote;
    private int age;
    private String party;
    private String state;
    //private double  no_of_seats;

}
