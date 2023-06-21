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
@Table(name="history_const_data_2002")
public class ConstituencyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long constId;
    
    private String consti_num;
    private String constiName;

    private double nomimnatedMale;
    private double nomimnatedFemale;
    private double nomimnatedOther;
    private double nomimnatedTotal;

    private double rejectMale;
    private double rejectFemale;
    private double rejectOther;
    private double rejectTotal;

    private double withdrawMale;
    private double withdrawFemale;
    private double withdrawOther;
    private double withdrawTotal;

    private double contestMale;
    private double contestFemale;
    private double contestOther;
    private double contestTotal;
    

    private double FORFEITEDMale;
    private double FORFEITEDFemale;
    private double FORFEITEDOther;
    private double FORFEITEDTotal;

    private double electGenMale;
    private double electGenFemale;
    private double electGenOther;
    private double electGenTotal;

      
    private double electServMale;
    private double electServFemale;
    private double electServOther;
    private double electServTotal;

    private double electTotMale;
    private double electTotFemale;
    private double electTotOther;
    private double electTotTotal;

    private double voterGenMale;
    private double voterGenFemale;
    private double voterGenOther;
    private double voterGenTotal;

    private double voterPostMale;
    private double voterPostFemale;
    private double voterPostOther;
    private double voterPostTotal;
    
    private double voterProxyMale;
    private double voterProxyFemale;
    private double voterProxyOther;
    private double voterProxyTotal;

    private double voterTotMale;
    private double voterTotFemale;
    private double voterTotOther;
    private double voterTotTotal;
 
    private double votesPolled;
    private double votesNotRet;
    private double votesValid;
    private double votesPostal;
    private double votesNota;
    private double votesReject;
    private double votesMissing;
    private double votes_tender;
    
    private double pollingStationNum;
    private String pollingStationAvg;

    
    private String pollingDate="24-02-2002";
    private String countingDate="24-02-2002";
    //private String declarationOfResult="01/01/1970";
    private String pollingPercent;
    
    
}
