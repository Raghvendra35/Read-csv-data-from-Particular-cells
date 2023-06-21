package com.psl.FinalDataExtract.Helpers;

import lombok.Data;

@Data
public class Matcher {

    private String consiName="CONSTITUENCY";
    private String candidateNominated="1.Nominated";
    private String candidateRejected = "2.REJECTED";
    private String candidateWithdrawn="3.WITHDRAWN";
    private String candidateContested = "4.CONTESTED";
    private String candidateForfeitedDeposit="5.FORFEITED DEPOSIT";

    private String electorsGeneral="1.GENERAL";
    private String electorService="2.SERVICE";
    private String electorTotal="3.TOTAL";

    private String votedGeneral="1.GENERAL";
    private String votedPostal="2.POSTAL";
    private String votedTotal="3.TOTAL";

    private String votesPolled="1. POLLED";
    private String votesValid="2. VALID";
    private String votesRejected="3. REJECTED";
    private String votesMissing="4. MISSING";
    private String votesTendered="5. TENDERED";

    private String pollingStationNumber="NUMBER";

    private String countingDate="24-02-2002";
    private String pollingDate="24-02-2002";
}
