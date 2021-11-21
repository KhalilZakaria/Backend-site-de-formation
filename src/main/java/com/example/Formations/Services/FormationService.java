package com.example.Formations.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Formations.Repository.CategorieRepository;
import com.example.Formations.Repository.FormationRepository;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Formation;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
public class FormationService {
	
	private final FormationRepository formationRepo;
	    
	    public List<Formation> findAll() {
	        return formationRepo.findAll();
	    }
	    
	    public Formation findByNom(String nom) {
	        return formationRepo.findByNom(nom);
	    }
	    public void save(Formation formation) {
	    	formationRepo.save(formation);
	}
		public Formation findById(long id) {
			 return formationRepo.findById(id);
		}
}
