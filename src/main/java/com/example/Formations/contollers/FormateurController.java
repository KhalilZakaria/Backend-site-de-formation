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

import com.example.Formations.Services.FormateurService;
import com.example.Formations.entities.Formateur;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RequestMapping(value = "Formateur")
@AllArgsConstructor
@RestController
public class FormateurController {
	
	private  FormateurService formateurService;
	

	
	public Long getLastCreated() {
		 Long LastCreatedformateur = formateurService.getLastCreated();
		 return LastCreatedformateur;
	}
	 @GetMapping(value = "/find/all")
	    public List<Formateur> findAll( ){
	        return formateurService.findAll();
	    }
	 @PostMapping(value = "/add_formateur")
	    public long save(@RequestBody Formateur formateur){
		 int lastIndexOf = formateur.getPhoto().lastIndexOf(".");
		 if (lastIndexOf == -1) {
		        System.out.println("empty extension"); // 
		    }
		 String extention = formateur.getPhoto().substring(lastIndexOf);
		 Long LastCreatedformateur = getLastCreated() + 1;
		 formateur.setPhoto("Formateur_"+LastCreatedformateur+ extention);
		 formateurService.save(formateur);
		 return LastCreatedformateur;
	    }
	 
	 @PostMapping(value = "/getFile")
	    public String getFile(@RequestBody String id) throws IOException{
		 	File f = new File("../ImageStorage/" + id);
		 	FileInputStream fileInputReader = new FileInputStream(f);
		 	byte[] bytes = new byte[(int)f.length()];
		 	fileInputReader.read(bytes);
		 	return new String(Base64.encodeBase64(bytes),"UTF-8");

	    }
	 
	 @GetMapping(value = "/find/{id}")
	    public Formateur findById(@PathVariable long id  ){
	        return  formateurService.findById(id);
	    }
	 
	 @PatchMapping("/update")//replace an existing Resource entirely  // @PatchMapping partial update
	    public String update(@RequestBody Formateur formateur) {
		 formateurService.save(formateur);
	     return "updated  success";
	    }
	 
	 @DeleteMapping(value = "/delete/{id}")
	   public void Delete(@PathVariable long id ){
		 Formateur formateur = formateurService.findById(id);
		 formateurService.delete(formateur);
	    }
}