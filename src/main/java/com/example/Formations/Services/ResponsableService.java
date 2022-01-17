package com.example.Formations.Services;
import java.util.List;

import org.springframework.stereotype.Service;


import com.example.Formations.Repository.ResponsableRepository;

import com.example.Formations.entities.Responsable;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ResponsableService {
	
	private final ResponsableRepository responsableRepo;
	    
	    public List<Responsable> findAll() {
	        return responsableRepo.findAll();
	    }
	    public Long getLastCreated() {
	    	return responsableRepo.getLastCreated();
	    }
	    public Responsable findByNom(String nom) {
	        return responsableRepo.findByNom(nom);
	    }
	    public void save(Responsable responsable) {
	    	responsableRepo.save(responsable);
	}
		public Responsable findById(long id) {
			 return responsableRepo.findById(id);
		}
		public void delete(Responsable responsable) {
			responsableRepo.delete(responsable);
			
		}
}