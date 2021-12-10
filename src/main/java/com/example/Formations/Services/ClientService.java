package com.example.Formations.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Formations.Repository.CategorieRepository;
import com.example.Formations.Repository.ClientRepository;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
import com.example.Formations.entities.Formation;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
public class ClientService {
	
	private final ClientRepository clientRepo;
	    
	    public List<Client> findAll() {
	        return clientRepo.findAll();
	    }
	    
	    public Client findByNom(String nom) {
	        return clientRepo.findByNom(nom);
	    }
	    public void save(Client client) {
	    	clientRepo.save(client);
	}
		public Client findById(long id) {
			 return clientRepo.findById(id);
		}
		public void delete(Client client) {
			clientRepo.delete(client);
			
		}
}
