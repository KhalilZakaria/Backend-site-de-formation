package com.example.Formations.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Formations.Repository.CategorieRepository;
import com.example.Formations.Repository.FormateurFormationRepository;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.FormateurFormation;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
public class FormateurFormationService {
	
	private final FormateurFormationRepository formateurformationRepo;
	    
	    public List<FormateurFormation> findAll() {
	        return formateurformationRepo.findAll();
	    }
	    
	    public void save(FormateurFormation formateurformation) {
	    	formateurformationRepo.save(formateurformation);
	}
		public FormateurFormation findById(long id) {
			 return formateurformationRepo.findById(id);
		}
}
