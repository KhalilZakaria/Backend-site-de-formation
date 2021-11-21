package com.example.Formations.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Formations.Repository.CategorieRepository;
import com.example.Formations.entities.Categorie;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
public class CategorieService {
	
	private final CategorieRepository categorieRepo;
	    
	    public List<Categorie> findAll() {
	        return categorieRepo.findAll();
	    }
	    
	    public Categorie findByNom(String nom) {
	        return categorieRepo.findByNom(nom);
	    }
	    public void save(Categorie category) {
	    	categorieRepo.save(category);
	}
		public Categorie findById(long id) {
			 return categorieRepo.findById(id);
		}
}
