package com.example.Formations.contollers;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Formations.Services.CategorieService;
import com.example.Formations.Services.SubscriptionService;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Subscription;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RequestMapping(value = "Subscription")
@AllArgsConstructor
@RestController
public class SubscriptionController {
	
	private  SubscriptionService subscriptionService;
	
	 @GetMapping(value = "/find/all")
	    public List<Subscription> findAll( ){
	        return subscriptionService.findAll();
	    }
	 @PostMapping(value = "/add_Subscription")
	    public void save(@RequestBody Subscription subscription){
		 subscriptionService.save(subscription);
	    }
}