package com.example.Formations.contollers;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Formations.Services.CategorieService;
import com.example.Formations.Services.FormationService;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Formation;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RequestMapping(value = "Formation")
@AllArgsConstructor
@RestController
public class FormationController {
	
	private  FormationService formationService;
	
	 @GetMapping(value = "/find/all")
	    public List<Formation> findAll( ){
	        return formationService.findAll();
	    }
	 @PostMapping(value = "/add_Formation")
	    public void save(@RequestBody Formation formation){
		 formationService.save(formation);
	    }
}