package com.psl.FinalDataExtract.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.psl.FinalDataExtract.Helpers.ConstituencyHelper;
import com.psl.FinalDataExtract.Services.CandidateDataService;
import com.psl.FinalDataExtract.Services.ConstituencyServices;

@RestController
public class ConstituencyController {

    @Autowired
    private ConstituencyServices services;
    @Autowired
    private CandidateDataService candidateDataService;

    //for Constituency
    @PostMapping("/upload/constituency")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file){

        if(ConstituencyHelper.checkExcelFormate(file)){
            this.services.save(file);
            return ResponseEntity.ok(Map.of("meassage","file uploaded successfully"));
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel file only");
    }
    
    
    //for Candidate Data
    @PostMapping("/upload/candidate")
    public ResponseEntity<?> candidateDataUpload(@RequestParam("file") MultipartFile file)
    {
    	if(ConstituencyHelper.checkExcelFormate(file))
    	{
    		this.candidateDataService.saveCandidateData(file);
    		return ResponseEntity.ok(Map.of("meassage","file uploaded successfully"));
    	}
    	 return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excel file only");
    }
}
