package com.example.Formations.Services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Formations.Repository.CategorieRepository;
import com.example.Formations.Repository.SubscriptionRepository;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
import com.example.Formations.entities.Formation;
import com.example.Formations.entities.Subscription;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
public class SubscriptionService {
	
	private final SubscriptionRepository subscriptionRepo;
	    
	    public List<Subscription> findAll() {
	        return subscriptionRepo.findAll();
	    }
	    
	    public void save(Subscription subscription) {
	    	subscriptionRepo.save(subscription);
	}
		public Subscription findById(long id) {
			 return subscriptionRepo.findById(id);
		}
		
		public void delete(Subscription subcription) {
			subscriptionRepo.delete(subcription);
			
		}
		 public Client findIdclient(long id) {
			    return subscriptionRepo.findById(id).getClient();
		}
		 public Formation findIdformation(long id) {
			    return subscriptionRepo.findById(id).getFormation();
		}
}
