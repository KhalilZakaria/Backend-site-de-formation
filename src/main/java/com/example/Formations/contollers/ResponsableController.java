package com.example.Formations.contollers;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Formations.Services.ResponsableService;
import com.example.Formations.entities.Responsable;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RequestMapping(value = "Responsable")
@AllArgsConstructor
@RestController
public class ResponsableController {
	
	private  ResponsableService responsableService;
	

	
	public Long getLastCreated() {
		 Long LastCreatedformateur = responsableService.getLastCreated();
		 return LastCreatedformateur;
	}
	 @GetMapping(value = "/find/all")
	    public List<Responsable> findAll( ){
	        return responsableService.findAll();
	    }
	 @PostMapping(value = "/add_responsable")
	    public String save(@RequestBody Responsable responsable){
		 responsableService.save(responsable);
		 return "Success";
	    }
	 
	 
	 @GetMapping(value = "/find/{id}")
	    public Responsable findById(@PathVariable long id  ){
	        return  responsableService.findById(id);
	    }
	 
	 @PatchMapping("/update")//replace an existing Resource entirely  // @PatchMapping partial update
	    public String update(@RequestBody Responsable responsable) {
		 responsableService.save(responsable);
	     return "updated  success";
	    }
	 
	 @DeleteMapping(value = "/delete/{id}")
	   public void Delete(@PathVariable long id ){
		 Responsable responsable = responsableService.findById(id);
		 responsableService.delete(responsable);
	    }
}