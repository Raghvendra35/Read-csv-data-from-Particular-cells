package com.psl.FinalDataExtract.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.psl.FinalDataExtract.Entities.ConstituencyEntity;
import com.psl.FinalDataExtract.Helpers.ConstituencyHelper;
import com.psl.FinalDataExtract.Helpers.ConstituencyHelper2;
import com.psl.FinalDataExtract.Repo.ConstituencyRepo;

@Service
public class ConstituencyServices {

    @Autowired
    private ConstituencyRepo repo;

     public void save(MultipartFile file){
        try {
             
        	//List<ConstituencyEntity> excel2 = ConstituencyHelper.convertExcelToDb(file.getInputStream());
           List<ConstituencyEntity> list= ConstituencyHelper2.convertExcelToDbUsingForloop(file.getInputStream());
                           
            this.repo.saveAll(list);

        } catch (Exception e) {
            // TODO: handle exception
        }
     }

     public List<ConstituencyEntity> getAllConstituency(){
        return this.repo.findAll();
     }
    
}
