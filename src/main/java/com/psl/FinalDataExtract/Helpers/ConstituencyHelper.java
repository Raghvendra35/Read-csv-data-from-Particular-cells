
package com.psl.FinalDataExtract.Helpers;

import java.io.InputStream;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import com.psl.FinalDataExtract.Entities.ConstituencyEntity;

public class ConstituencyHelper 
{

   
    public static boolean checkExcelFormate(MultipartFile file)
    {
        String contentType = file.getContentType();
        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
            return true;
        } else {
            return false;
        }
    }

    public static List<ConstituencyEntity> convertExcelToDb(InputStream is)
    {
        List<ConstituencyEntity> list = new ArrayList<>();
        try {

            XSSFWorkbook workbook = new XSSFWorkbook(is);
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            int rowNumber = 0;

            Iterator<Row> iterator = sheet.iterator();
            System.out.println("------------Green flag---------");

            ConstituencyEntity c =new ConstituencyEntity();
            boolean isElect = false;
            boolean electService=false;
        
            
            boolean isVoter = false;
            
            boolean electGen=false;
            boolean votersGen=false;
            boolean votersTotal=false;
            boolean electTotal=false;
            boolean number=false;
            
            String GEN;

            while (iterator.hasNext())
            {

                Row row = iterator.next();
                Matcher m = new Matcher();
                
                String s0 = String.valueOf(row.getCell(2));
                if (s0.contains("Constituency Name & Code")) 
                {  String s = String.valueOf(row.getCell(3));
                    c.setConstiName(s);
                   
                   System.out.println("Constituency Name : " + c.getConstiName());

                }

                String s1 = String.valueOf(row.getCell(1));
                if (s1.contains("Nominated"))
                {
    
//                    c.setNominatedMale(row.getCell(3).getNumericCellValue());
//                    c.setNominatedFemale(row.getCell(4).getNumericCellValue());
//                    c.setNominatedthirdGender(row.getCell(5).getNumericCellValue());
//                    c.setNominatedTotal(row.getCell(6).getNumericCellValue());
//                   
//                    System.out.println("Nominated male : " + c.getNominatedMale());
//                    System.out.println("Nominated female : " + c.getNominatedFemale());
//                    System.out.println("Nominated thirdGender : " + c.getNominatedthirdGender());
//                    System.out.println("Nominated total : " + c.getNominatedTotal());
                }
                
                String s2 = String.valueOf(row.getCell(1));
                if (s2.contains("Nomination Rejected"))
                {
//                    c.setRejectedMale(row.getCell(3).getNumericCellValue());
//                    c.setRejectedFemale(row.getCell(4).getNumericCellValue());
//                    c.setRejectedthirdGender(row.getCell(5).getNumericCellValue());
//                    c.setRejectedTotal(row.getCell(6).getNumericCellValue());
//                    
//                    System.out.println("RejectedMale : " + c.getRejectedMale());
//                    System.out.println("RejectedFemale : " + c.getRejectedFemale());
//                    System.out.println("RejectedThird Gender : " + c.getRejectedthirdGender());
//                    System.out.println("RejectedTotal : " + c.getRejectedTotal());
                }
                
             

                String s3 = String.valueOf(row.getCell(1));
                if (s3.contains("Withdrawn"))
                {
//                    c.setWithdrawnMale(row.getCell(3).getNumericCellValue());
//                    c.setWithdrawnFemale(row.getCell(4).getNumericCellValue());
//                    c.setWithdrawnthirdGender(row.getCell(5).getNumericCellValue());
//                    c.setWithdrawnTotal(row.getCell(6).getNumericCellValue());
//                    
//                    System.out.println("WithdrawnMale : " + c.getWithdrawnMale());
//                    System.out.println("WithdrawnFemale : " + c.getWithdrawnFemale());
//                    System.out.println("WithdrawnThird Gender : " + c.getWithdrawnthirdGender());
//                    System.out.println("WithdrawnTotal : " + c.getWithdrawnTotal());
                }
                
                String s4 = String.valueOf(row.getCell(1));
                if (s4.contains("Contested"))
                {
//                    c.setContestedMale(row.getCell(3).getNumericCellValue());
//                    c.setContestedFemale(row.getCell(4).getNumericCellValue());
//                    c.setContestedthirdGender(row.getCell(5).getNumericCellValue());
//                    c.setContestedTotal(row.getCell(6).getNumericCellValue());
//                    
//                    System.out.println("ContestedMale : " + c.getContestedMale());
//                    System.out.println("ContestedFemale : " + c.getContestedFemale());
//                    System.out.println("ContestedThird Gender : " + c.getContestedthirdGender());
//                    System.out.println("ContestedTotal : " + c.getContestedTotal());
                }
                
                String s41 = String.valueOf(row.getCell(1));
                if (s41.contains("Forfeited Deposit"))
                {
//                    c.setForfeitedDepositMale(row.getCell(3).getNumericCellValue());
//                    c.setForfeitedDepositFemale(row.getCell(4).getNumericCellValue());
//                    c.setForfeitedDepositthirdGender(row.getCell(5).getNumericCellValue());
//                    c.setForfeitedDepositTotal(row.getCell(6).getNumericCellValue());
//                    
//                    System.out.println("ForfeitedDepositMale : " + c.getForfeitedDepositMale());
//                    System.out.println("ForfeitedDepositFemale : " + c.getForfeitedDepositFemale());
//                    System.out.println("ForfeitedDepositThird Gender : " + c.getForfeitedDepositthirdGender());
//                    System.out.println("ForfeitedDepositTotal : " + c.getForfeitedDepositTotal());
                }
                
                String s5 = String.valueOf(row.getCell(1));
                if (s5.contains("General") && electGen==false) 
                {
//                    c.setElectorsGeneralMale(row.getCell(3).getNumericCellValue());
//                    c.setElectorsGeneralFemale(row.getCell(4).getNumericCellValue());
//                    c.setElectorsGeneralthirdGender(row.getCell(5).getNumericCellValue());
//                    c.setElectorsGeneralTotal(row.getCell(6).getNumericCellValue());
//                    
//                    System.out.println("ElectorsGeneralMale : " + c.getElectorsGeneralMale());
//                    System.out.println("ElectorsGeneralFemale : " + c.getElectorsGeneralFemale());
//                    System.out.println("ElectorsGeneralThirdGender : " + c.getElectorsGeneralthirdGender());
//                    System.out.println("ElectorsGeneralTotal : " + c.getElectorsGeneralTotal());
                    
                    electGen=true;
                    
                }
                
                
                String s6=String.valueOf(row.getCell(1));
                if(s6.contains("Service"))
                {
//                	c.setElectorsServiceMale(row.getCell(3).getNumericCellValue());
//                	c.setElectorsServiceFemale(row.getCell(4).getNumericCellValue());
//                	c.setElectorsServiceThirdGender(row.getCell(5).getNumericCellValue());
//                	c.setElectorsServiceTotal(row.getCell(6).getNumericCellValue());
//                	
//                	System.out.println("ElectorsServiceMale : " + c.getElectorsServiceMale());
//                	System.out.println("ElectorsServiceFemale : " + c.getElectorsServiceFemale());
//                	System.out.println("ElectorsServiceThirdGender : " + c.getElectorsServiceThirdGender());
//                    System.out.println("ElectorsServiceTotal : " + c.getElectorsServiceTotal());
                }
                
                
                String s7=String.valueOf(row.getCell(1));
                if(s7.contains("Total")&& electTotal==false)
                {
//                	c.setElectorsTotalMale(row.getCell(3).getNumericCellValue());
//                	c.setElectorsTotalFemale(row.getCell(4).getNumericCellValue());
//                	c.setElectorsTotalThirdGender(row.getCell(4).getNumericCellValue());
//                	c.setElectorsTotalTotal(row.getCell(6).getNumericCellValue());
//                	
//                	System.out.println("ElectorsTotalMale : " + c.getElectorsTotalMale());
//                	System.out.println("ElectorsTotalFemale : " + c.getElectorsTotalFemale());
//                	System.out.println("ElectorsTotalThirdGender : " + c.getElectorsTotalThirdGender());
//                    System.out.println("ElectorsTotalTotal : " + c.getElectorsTotalTotal());
                    
                    electTotal=true;
                   
                }
                
                
                String s8 = String.valueOf(row.getCell(1));
                if (s8.contains("Generals") && electGen==true)
                	{
//                    c.setVotersGeneralMale(row.getCell(3).getNumericCellValue());
//                    c.setVotersGeneralFemale(row.getCell(4).getNumericCellValue());
//                    c.setVotersGeneralThirdGender(row.getCell(5).getNumericCellValue());
//                    c.setVotersGeneralTotal(row.getCell(6).getNumericCellValue());
//                    
//                    System.out.println("VotersGeneralMale : " + c.getVotersGeneralMale());
//                    System.out.println("VotersGeneralFemale : " + c.getVotersGeneralFemale());
//                    System.out.println("VotersGeneralThirdGender : " + c.getVotersGeneralThirdGender());
//                    System.out.println("VotersGeneralTotal : " + c.getVotersGeneralTotal());
                   
                    electGen=false;
                }
                
                String s9 = String.valueOf(row.getCell(1));
                if (s9.contains("Postal"))
                	{
              
                    //  c.setVotersPostalTotal(row.getCell(6).getNumericCellValue());
                     //  System.out.println("VotersPostalTotal -----------------: " + c.getVotersPostalTotal());
                    }
                
                
                
                String s10 = String.valueOf(row.getCell(1));
                if (s10.contains("Totals") && electTotal==true)
                	{
                  
                      //c.setVotersTotalTotal(row.getCell(6).getNumericCellValue());
                  
                      //System.out.println("Inside votes total ==============================");
                      //System.out.println(row.getCell(6));
                      //System.out.println("VotersTotalTotal : " + c.getVotersTotalTotal());
                    //  electTotal=false;
                      
                }

             
                String s11 = String.valueOf(row.getCell(1));
                if (s11.contains("Votes Rejected due to other Reason"))
                	{
                	// c.setVotesRejectedDueToOtherReason(row.getCell(6).getNumericCellValue());
                    //System.out.println("Votes Rejected due to other Reason "+ c.getVotesRejectedDueToOtherReason());
                	
                	}
                
                String s12 = String.valueOf(row.getCell(0));
                if (s12.contains("POLLING PERCENTAGE"))
                	{
                	
                // 	System.out.println("POLLING PERCENTAGE");
                   //  c.setPollingPercentage(row.getCell(6).getNumericCellValue());
                    // System.out.println(" PollingPercentage "+ c.getPollingPercentage());
                	}
              

                
//                String s13 = String.valueOf(row.getCell(1));
//               if (s13.contains("Total Votes Polled On EVM"))
//                	{
//                	 //c.setTotalVotesPolledOnEVM(row.getCell(6).getNumericCellValue());
//                    // System.out.println("Total Votes Polled On EVM   1=============== "+ c.getTotalVotesPolledOnEVM());
//                	}
//                
//                String s14 = String.valueOf(row.getCell(1));
//                if (s14.contains("Total Deducted Votes From EVM"))
//                	{
//                	 c.setTotalDeductedVotesFromEVM(row.getCell(6).getNumericCellValue());
//                     System.out.println(" Total Deducted Votes From EVM  2============="+ c.getTotalDeductedVotesFromEVM());
//                	}
//                
//                String s15 = String.valueOf(row.getCell(1));
//                if (s15.contains("Total Valid Votes polled on EVM "))
//                	{
//                	 c.setTotalValidVotespolledonEVM(row.getCell(6).getNumericCellValue());
//                     System.out.println("Total Valid Votes polled on EVM  3================  "+ c.getTotalValidVotespolledonEVM());
//                	}
//                
//                String s16 = String.valueOf(row.getCell(1));
//                if (s16.contains("Counted"))
//                	{
//                	 c.setPostalVotesCounted(row.getCell(6).getNumericCellValue());
//                     System.out.println(" Postal Votes Counted 4================"+ c.getPostalVotesCounted());
//                	}
//                
//                String s17 = String.valueOf(row.getCell(1));
//                if (s17.contains("Postal Votes Deducted"))
//                	{
//                	 c.setPostalVotesDeducted(row.getCell(6).getNumericCellValue());
//                     System.out.println(" Postal Votes Deducted 5========="+ c.getPostalVotesDeducted());
//                	}
//                
//                String s18 = String.valueOf(row.getCell(1));
//                if (s18.contains("Valid Postal Votes"))
//                	{
//                	 c.setValidPostalVotes(row.getCell(6).getNumericCellValue());
//                     System.out.println(" Valid Postal Votes 6=============== "+ c.getValidPostalVotes());
//                	}
//                
//                String s19 = String.valueOf(row.getCell(1));
//                if (s19.contains("Total Valid Votes Polled"))
//                	{
//                	 c.setTotalValidVotesPolled(row.getCell(6).getNumericCellValue());
//                     System.out.println("Total Valid Votes Polled 7 =========="+ c.getTotalValidVotesPolled());
//                	}
//                
//                String s20 = String.valueOf(row.getCell(1));
//                if (s20.contains("Test Votes polled On EVM"))
//                	{
//                	 c.setTestVotespolledOnEVM(row.getCell(6).getNumericCellValue());
//            
//                     System.out.println(" Test Votes Polled On EVM 8 ============"+ c.getTestVotespolledOnEVM());
//                	}
//                
//                String s21 = String.valueOf(row.getCell(1));
//                if (s21.contains("Votes Polled for 'NOTA'(Including Postal)"))
//                	{
//                	 c.setVotesPolledForNOTA(row.getCell(6).getNumericCellValue());
//                     System.out.println(" Votes Polled for 'NOTA'(Including Postal) 9=========="+ c.getVotesPolledForNOTA());
//                	}
//                
//                String s22 = String.valueOf(row.getCell(1));
//              //  System.out.println(s22);
//                if (s22.contains("Tendered Votes"))
//                	{
//                	 c.setTenderedVotes(row.getCell(6).getNumericCellValue());
//                     System.out.println(" Tendered Votes 10 =========="+ c.getTenderedVotes());
//                     
//                	}
               
                                              
               // String s23=String.valueOf(row.getCell(1));
                //if(s23.contains("Number"))//&& number==false)
                //{
              //    c.setNumber(row.getCell(3).getNumericCellValue());
                 // System.out.println("Number 1----- :"+ row.getCell(3));
                //}
            
                
//                String s24=String.valueOf(row.getCell(4));
//                if(s24.contains("Average Electors Per Polling"))
//                {
//                 c.setAverageElectorsPerPolling(row.getCell(6).getNumericCellValue());
//                 c.setNumber(row.getCell(3).getNumericCellValue());
//                 System.out.println("AverageElectorsPerPolling  :"+ c.getAverageElectorsPerPolling());
//                 System.out.println("Number 1----- :"+ row.getCell(3));
//                
//                 c = new ConstituencyEntity();
//                }
                
             
                

      
               

         
            
            list.add(c);
          //  electGen=false;
          //  electTotal=false;
            //number=false;
            rowNumber++;
            workbook.close();
            }
            
        } catch (Exception e) {
            
        }
        return list;
    }

    

}