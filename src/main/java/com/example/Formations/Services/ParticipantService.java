package com.example.Formations.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Formations.Repository.ParticipantRepository;
import com.example.Formations.Repository.ResponsableRepository;
import com.example.Formations.entities.Participant;
import com.example.Formations.entities.Responsable;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ParticipantService {
	private final ParticipantRepository participantRepo;
    
    public List<Participant> findAll() {
        return participantRepo.findAll();
    }
    public Long getLastCreated() {
    	return participantRepo.getLastCreated();
    }
    public Participant findByNom(String nom) {
        return participantRepo.findByNom(nom);
    }
    public void save(Participant participant) {
    	participantRepo.save(participant);
}
	public Participant findById(long id) {
		 return participantRepo.findById(id);
	}
	public void delete(Participant participant) {
		participantRepo.delete(participant);
		
	}
}