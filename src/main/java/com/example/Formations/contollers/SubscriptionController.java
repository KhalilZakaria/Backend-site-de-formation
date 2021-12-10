package com.example.Formations.contollers;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Formations.Services.CategorieService;
import com.example.Formations.Services.SubscriptionService;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Formation;
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
	 
	 @DeleteMapping(value = "/delete/{id}")
	   public void Delete(@PathVariable long id ){
		 Subscription subcription = subscriptionService.findById(id);
		 subscriptionService.delete(subcription);
	    }
	 
	 @PatchMapping("/update")
	    public String update(@RequestBody  Subscription subcription) {
		 subscriptionService.save(subcription);
	        return "updated  success";
	    }
}