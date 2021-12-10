package com.example.Formations.contollers;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Formations.Services.CategorieService;
import com.example.Formations.Services.FormateurFormationService;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Formateur;
import com.example.Formations.entities.FormateurFormation;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RequestMapping(value = "FormateurFormation")
@AllArgsConstructor
@RestController
public class FormateurFormationController {
	
	private  FormateurFormationService formateurformationService;
	
	 @GetMapping(value = "/find/all")
	    public List<FormateurFormation> findAll( ){
	        return formateurformationService.findAll();
	    }
	 @PostMapping(value = "/add_FormateurFormation")
	    public void save(@RequestBody FormateurFormation formateurformation){
		 formateurformationService.save(formateurformation);
	    }
	 
	 @GetMapping(value = "/find/{id}")
	    public FormateurFormation findById(@PathVariable long id  ){
	        return  formateurformationService.findById(id);
	    }
}