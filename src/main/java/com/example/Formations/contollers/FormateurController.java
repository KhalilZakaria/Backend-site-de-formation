package com.example.Formations.contollers;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Formations.Services.CategorieService;
import com.example.Formations.Services.FormateurService;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
import com.example.Formations.entities.Formateur;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RequestMapping(value = "Formateur")
@AllArgsConstructor
@RestController
public class FormateurController {
	
	private  FormateurService formateurService;
	
	 @GetMapping(value = "/find/all")
	    public List<Formateur> findAll( ){
	        return formateurService.findAll();
	    }
	 @PostMapping(value = "/add_formateur")
	    public void save(@RequestBody Formateur formateur){
		 formateurService.save(formateur);
	    }
	 
	 @GetMapping(value = "/find/{id}")
	    public Formateur findById(@PathVariable long id  ){
	        return  formateurService.findById(id);
	    }
	 
	 @DeleteMapping(value = "/delete/{id}")
	   public void Delete(@PathVariable long id ){
		 Formateur formateur = formateurService.findById(id);
		 formateurService.delete(formateur);
	    }
}