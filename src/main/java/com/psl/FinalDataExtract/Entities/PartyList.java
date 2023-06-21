package com.psl.FinalDataExtract.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name="party_2019")
public class PartyList 
{

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long partId;
	
	private String abb;
	private String pname;
	private String pstat;
}
