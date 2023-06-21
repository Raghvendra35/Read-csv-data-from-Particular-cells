package com.psl.FinalDataExtract.Helpers;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.psl.FinalDataExtract.Entities.ConstituencyEntity;

public class ConstituencyHelper2 
{


    
    public static List<ConstituencyEntity> convertExcelToDbUsingForloop(InputStream is)
    {
    	List<ConstituencyEntity> list=new ArrayList<>();
    	
    	try
    	{
    	XSSFWorkbook workbook=new XSSFWorkbook(is);
    	XSSFSheet sheet=workbook.getSheet("sheet1");
    	Iterator<Row> iterator=sheet.iterator();
    	
    	boolean flag1=false;
    	boolean flag2=false;
    	
    	boolean electGen=false;
    	boolean electTot=false;
   
    	int startingIndex=1;
    	int lastIndex=30;
    	
    	for(int i=1; i<=70; i++)
    	{
    	 ConstituencyEntity c=new ConstituencyEntity();
    	
    	 electGen=false;
    	 electTot=false;
        
    	  
    	 for(int j=startingIndex; j<=lastIndex; j++)
    	 {
    	 Row row=iterator.next(); 
    	 Matcher m=new Matcher();
    		 
    		 String s0 = String.valueOf(row.getCell(0));
    		// System.out.println(s0);
              String[] split = s0.split("[:,-]");

              if (s0.contains("STITUENCY")) 
              {
            	  
                 //System.out.println("const num " + split[1]);
                  c.setConsti_num(split[1]);
                  c.setConstiName(split[2]);
                  System.out.println("const num " + split[1]);
                  System.out.println("Constituency Name : " + c.getConstiName());

              }
    		 
    	

String s1 = String.valueOf(row.getCell(0));
if (s1.contains("1. NOMINATED"))
	
{

    c.setNomimnatedMale(row.getCell(1).getNumericCellValue());
    c.setNomimnatedFemale(row.getCell(2).getNumericCellValue());
   // c.setNomimnatedOther(row.getCell(5).getNumericCellValue());
    c.setNomimnatedTotal(row.getCell(3).getNumericCellValue());
   
    System.out.println("Nominated male : " + c.getNomimnatedMale());
    System.out.println("Nominated female : " + c.getNomimnatedFemale());
    //System.out.println("Nominated thirdGender : " + c.getNomimnatedOther());
    System.out.println("Nominated total : " + c.getNomimnatedTotal());
}

String s2 = String.valueOf(row.getCell(0));
if (s2.equalsIgnoreCase("2. Rejected"))
{
    c.setRejectMale(row.getCell(1).getNumericCellValue());
    c.setRejectFemale(row.getCell(2).getNumericCellValue());
    //c.setRejectOther(row.getCell(5).getNumericCellValue());
    c.setRejectTotal(row.getCell(3).getNumericCellValue());
    
    System.out.println("RejectedMale : " + c.getRejectMale());
    System.out.println("RejectedFemale : " + c.getRejectFemale());
    //System.out.println("RejectedThird Gender : " + c.getRejectOther());
    System.out.println("RejectedTotal : " + c.getRejectTotal());
}



String s3 = String.valueOf(row.getCell(0));
if (s3.equalsIgnoreCase("3. WITHDRAWN"))
{
    c.setWithdrawMale(row.getCell(1).getNumericCellValue());
    c.setWithdrawFemale(row.getCell(2).getNumericCellValue());
    //c.setWithdrawOther(row.getCell().getNumericCellValue());
    c.setWithdrawTotal(row.getCell(3).getNumericCellValue());
    
    System.out.println("WithdrawnMale : " + c.getWithdrawMale());
    System.out.println("WithdrawnFemale : " + c.getWithdrawFemale());
    System.out.println("WithdrawnThird Gender : " + c.getWithdrawOther());
    System.out.println("WithdrawnTotal : " + c.getWithdrawTotal());
}

String s4 = String.valueOf(row.getCell(0));
if (s4.equalsIgnoreCase("4. CONTESTED"))
{
    c.setContestMale(row.getCell(1).getNumericCellValue());
    c.setContestFemale(row.getCell(2).getNumericCellValue());
    //c.setContestOther(row.getCell(5).getNumericCellValue());
    c.setContestTotal(row.getCell(3).getNumericCellValue());
    
    System.out.println("ContestedMale : " + c.getContestMale());
    System.out.println("ContestedFemale : " + c.getContestFemale());
   // System.out.println("ContestedThird Gender : " + c.getContestOther());
    System.out.println("ContestedTotal : " + c.getContestTotal());
}

String s41 = String.valueOf(row.getCell(0));
if (s41.equalsIgnoreCase("5. FORFEITED DEPOSIT"))
{
    c.setFORFEITEDMale(row.getCell(1).getNumericCellValue());
    c.setFORFEITEDFemale(row.getCell(2).getNumericCellValue());
   // c.setFORFEITEDOther(row.getCell(5).getNumericCellValue());
    c.setFORFEITEDTotal(row.getCell(3).getNumericCellValue());
    
    System.out.println("ForfeitedDepositMale : " + c.getFORFEITEDMale());
    System.out.println("ForfeitedDepositFemale : " + c.getFORFEITEDFemale());
    //System.out.println("ForfeitedDepositThird Gender : " + c.getFORFEITEDOther());
    System.out.println("ForfeitedDepositTotal : " + c.getFORFEITEDTotal());
}

String s5 = String.valueOf(row.getCell(0));
if (s5.equalsIgnoreCase("1. General") && electGen==false)//flag1) 
{
    c.setElectGenMale(row.getCell(1).getNumericCellValue());
    c.setElectGenFemale(row.getCell(2).getNumericCellValue());
    //c.setElectGenOther(row.getCell(5).getNumericCellValue());
    c.setElectGenTotal(row.getCell(3).getNumericCellValue());
    
    System.out.println("ElectorsGeneralMale : " + c.getElectGenMale());
    System.out.println("ElectorsGeneralFemale : " + c.getElectGenFemale());
   // System.out.println("ElectorsGeneralThirdGender : " + c.getElectGenOther());
    System.out.println("ElectorsGeneralTotal : " + c.getElectGenTotal());
    
    electGen=true;
    
   // flag1=false;
    //flag2=true;
}


String s6=String.valueOf(row.getCell(0));
if(s6.equalsIgnoreCase("2. Service"))
{
	c.setElectServMale(row.getCell(1).getNumericCellValue());
	c.setElectServFemale(row.getCell(2).getNumericCellValue());
	//c.setElectServOther(row.getCell(5).getNumericCellValue());
	c.setElectServTotal(row.getCell(3).getNumericCellValue());
	
	System.out.println("ElectorsServiceMale : " + c.getElectServMale());
	System.out.println("ElectorsServiceFemale : " + c.getElectServFemale());
	//System.out.println("ElectorsServiceThirdGender : " + c.getElectServOther());
    System.out.println("ElectorsServiceTotal : " + c.getElectServTotal());
}


String s7=String.valueOf(row.getCell(0));
if(s7.equalsIgnoreCase("3. Total") && electTot==false)
{
	c.setElectTotMale(row.getCell(1).getNumericCellValue());
	c.setElectTotFemale(row.getCell(2).getNumericCellValue());
	//c.setElectTotThirdGender(row.getCell(5).getNumericCellValue());
	c.setElectTotTotal(row.getCell(3).getNumericCellValue());
	
	System.out.println("ElectorsTotalMale : " + c.getElectTotMale());
	System.out.println("ElectorsTotalFemale : " + c.getElectTotFemale());
	//System.out.println("ElectorsTotalThirdGender : " + c.getElectorsTotalThirdGender());
    System.out.println("ElectorsTotalTotal : " + c.getElectTotTotal());
    
    electTot=true;
   
}


String s8 = String.valueOf(row.getCell(0));
if (s8.equalsIgnoreCase("1. General") && electGen==true)//flag2)
	{
    c.setVoterGenMale(row.getCell(1).getNumericCellValue());
    c.setVoterGenFemale(row.getCell(2).getNumericCellValue());
   // c.setVoterGenOther(row.getCell(5).getNumericCellValue());
    c.setVoterGenTotal(row.getCell(3).getNumericCellValue());
    
    System.out.println("VotersGeneralMale : " + c.getVoterGenMale());
    System.out.println("VotersGeneralFemale : " + c.getVoterGenFemale());
    //System.out.println("VotersGeneralThirdGender : " + c.getVoterGenOther());
    System.out.println("VotersGeneralTotal : " + c.getVoterGenTotal());
    
   // flag2=false;
    //flag1=true;
  
}


String s9 = String.valueOf(row.getCell(0));
if (s9.equalsIgnoreCase("2. Postal"))
	{

      c.setVoterPostMale(row.getCell(1).getNumericCellValue());
      c.setVoterPostFemale(row.getCell(2).getNumericCellValue());
      c.setVoterPostTotal(row.getCell(3).getNumericCellValue());
      System.out.println("VotersPostalMale : " + c.getVoterPostMale());
      System.out.println("VotersPostalFemale : " + c.getVoterPostFemale());
       System.out.println("VotersPostalTotal : " + c.getVoterPostTotal());
    }




String s10 = String.valueOf(row.getCell(0));
if (s10.equalsIgnoreCase("3. Total") && electTot==true)
	{
	  c.setVoterTotMale(row.getCell(1).getNumericCellValue()); 
	  c.setVoterTotFemale(row.getCell(2).getNumericCellValue());
      c.setVoterTotTotal(row.getCell(3).getNumericCellValue());
  
      System.out.println("VotersTotalMale : " + c.getVoterTotMale());
      System.out.println("VotersTotalFemale : " + c.getVoterTotFemale());
      System.out.println("VotersTotalTotal : " + c.getVoterTotTotal());
 
     
}

String s11=String.valueOf(row.getCell(0));
if(s11.equalsIgnoreCase("1. POLLED"))
{
	c.setVotesPolled(row.getCell(1).getNumericCellValue());
	System.out.println("Polled Votes:"+ c.getVotesPolled());
}

String s12=String.valueOf(row.getCell(0));
if(s12.equalsIgnoreCase("2. VALID"))
{
	c.setVotesValid(row.getCell(1).getNumericCellValue());
	System.out.println("Valid votes :"+ c.getVotesValid());
}

String s13=String.valueOf(row.getCell(0));
if(s13.equalsIgnoreCase("3. REJECTED"))
{
	c.setVotesReject(row.getCell(1).getNumericCellValue());
	System.out.println("Votes Rejected :"+ c.getVotesReject());
}

String s14=String.valueOf(row.getCell(0));
if(s14.equalsIgnoreCase("4. VOTES NOT RETREIVED"))
{
	c.setVotesNotRet(row.getCell(1).getNumericCellValue());
	System.out.println("VOTES NOT RETREIVED :"+ c.getVotesNotRet());
}

String s15=String.valueOf(row.getCell(0));
if(s15.equalsIgnoreCase("5. TENDERED"))
{
	c.setVotes_tender(row.getCell(1).getNumericCellValue());
	System.out.println("TENDERED :"+ c.getVotes_tender());
}


String s17=String.valueOf(row.getCell(2));
if(s17.contains("AVERAGE ELECTORS PER POLLING STATION"))
{
	    
        String[] sp3=s17.split("[:]");
     
        c.setPollingStationAvg(sp3[1]);
        //System.out.println("Avg -----:"+ sp3[1]);
  
      
     
}

String s16=String.valueOf(row.getCell(0));
if(s16.equals("NUMBER :"))
{
 c.setPollingStationNum(row.getCell(1).getNumericCellValue());
 System.out.println("Number 1----- :"+ c.getPollingStationNum());

}

String s18=String.valueOf(row.getCell(0));
if(s18.equals("POLLING"))
{
// c.setPollingStationNum(row.getCell(1).getNumericCellValue());
 //System.out.println("Number 1----- :"+ c.getPollingStationNum());
System.out.println("Break............");
break;
}
   
           

           
    		 
    	 }
    	
    	list.add(c);
    //	electGen=false;
    //	electTotal=false;
    	}
    	workbook.close();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return list;
    }
    
}















