package com.example.Formations.contollers;
import java.util.List;
import java.text.SimpleDateFormat;  
import java.util.Date;  


import org.springframework.web.bind.annotation.* ;


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
	private CategorieService   categorieService;
	
	 @GetMapping(value = "/find/all")
	    public List<Formation> findAll( ){
	        return formationService.findAll();
	    }
	 
	
	    public Categorie findidcategorie(long idformation ){
	        return formationService.findidcategorie(idformation);
	    }
	 
	 @PostMapping(value = "/add_Formation")
	    public void save(@RequestBody Formation formation){
		 formationService.save(formation);
	    }
	 
	 @GetMapping(value = "/find/Categorie/{nom}")
	    public List<Formation>  findByCategorie(@PathVariable String nom ){
		    Categorie categorie =  categorieService.findByNom(nom);
	        return  formationService.findByCategorie(categorie);
	    }
	
	 @DeleteMapping(value = "/delete/{id}")
	   public void Delete(@PathVariable long id ){
		 Formation formation = formationService.findbyId(id);
		 formationService.delete(formation);
	    }
	  @PatchMapping("/update")//replace an existing Resource entirely  // @PatchMapping partial update
	    public String update(@RequestBody  Formation formation) {
		  formation.setCategorie(findidcategorie(formation.getId()));
		  formationService.save(formation);
	       return "updated  success";
	    }
}