package com.example.Formations.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Formations.Repository.CategorieRepository;
import com.example.Formations.Repository.FormateurRepository;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
import com.example.Formations.entities.Formateur;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
public class FormateurService {
	
	private final FormateurRepository formateurRepo;
	    
	    public List<Formateur> findAll() {
	        return formateurRepo.findAll();
	    }
	    
	    public Formateur findByNom(String nom) {
	        return formateurRepo.findByNom(nom);
	    }
	    public void save(Formateur formateur) {
	    	formateurRepo.save(formateur);
	}
		public Formateur findById(long id) {
			 return formateurRepo.findById(id);
		}
		public void delete(Formateur formateur) {
			formateurRepo.delete(formateur);
			
		}
}