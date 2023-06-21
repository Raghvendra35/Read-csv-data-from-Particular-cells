package com.psl.FinalDataExtract.Services;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.psl.FinalDataExtract.Entities.CandidateData;
import com.psl.FinalDataExtract.Repo.CandidateDataRepo;



@Service
public class CandidateDataService 
{
      @Autowired
      private CandidateDataRepo candidateDataRepo;
	
	
	

	
	public List<CandidateData> convertExcelToListCandidateData(InputStream inputStream)
	{
	 List<CandidateData> list=new ArrayList<>();
	 try
	 {
	  XSSFWorkbook workBook=new XSSFWorkbook(inputStream);	
	  XSSFSheet sheet=workBook.getSheet("sheet1");
	  
	  int rowNumber=0;
	  
	  Iterator<Row> iterator=sheet.iterator();
	  
	  while(iterator.hasNext())
	  {
		  Row row=iterator.next();
		  if(rowNumber==0)
		  {
			  rowNumber++;
			  continue;
		  }
		  
		Iterator<Cell> cells=row.iterator();
		int cellId=0;
		
		CandidateData candidateData=new CandidateData();
		
		while(cells.hasNext())
		{
			Cell cell=cells.next();
			
			switch(cellId)
			{
			case 0:
				
				candidateData.setState(cell.getStringCellValue());
				break;
			case 1:
				candidateData.setAbbr(cell.getStringCellValue());
				break;
			case 2:
				candidateData.setCandiname(cell.getStringCellValue());
				break;
			case 3:
				candidateData.setSex(cell.getStringCellValue());
				break;
			case 4:
				candidateData.setAge((int)cell.getNumericCellValue());
				break;
			case 5:
				candidateData.setParty(cell.getStringCellValue());
				break;
			case 6:
				candidateData.setGen_Vote(cell.getNumericCellValue());
				break;
			case 7:
				candidateData.setPostal_Vote(cell.getNumericCellValue());
				break;
			case 8:
				candidateData.setTotal_Vote(cell.getNumericCellValue());
				break;
			
		    default :
		    	break;
			}
			cellId++;
		}
		list.add(candidateData);
	  }
	 }catch(Exception e)
	 {
	  e.printStackTrace();	 
	 }
		
		return list;
	}
	
	
	
	
	public void saveCandidateData(MultipartFile file)
	{
		try
		{
		List<CandidateData> candidateData=this.convertExcelToListCandidateData(file.getInputStream());	
	
		this.candidateDataRepo.saveAll(candidateData);
		}catch(IOException e)
		{
		e.printStackTrace();
		}	
	}
}







