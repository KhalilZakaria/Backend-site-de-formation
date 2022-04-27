package com.example.Formations.contollers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.example.Formations.Services.ClientService;
import com.example.Formations.Services.FormationService;
import com.example.Formations.Services.SubscriptionService;
import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
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
	    public int save(@RequestBody Subscription subscription){
		 int result = subscriptionService.save(subscription);
		 return result;
	    }
	 @PostMapping(value = "/validate")
	    public void validate(@RequestBody long id){
		subscriptionService.validate(id);
		}
	 
	 @DeleteMapping(value = "/delete/{id}")
	   public void Delete(@PathVariable long id ){
		 Subscription subcription = subscriptionService.findById(id);
		 subscriptionService.delete(subcription);
	    }
	 
	  public Client findIdClient(long idsub ){
	        return subscriptionService.findIdclient(idsub);
	    }
	  public Formation findIdFormation(long idsub ){
	        return subscriptionService.findIdformation(idsub);
	    }
	 @PatchMapping("/update")
	    public String update(@RequestBody  Subscription subcription) throws ParseException {
		 subcription.setClient(findIdClient(subcription.getId()));
		 subcription.setFormation(findIdFormation(subcription.getId()));
//		 Date startdate=new SimpleDateFormat("yyyy-MM-dd").parse(subcription.getDate_debut());  
//		 Date enddate=new SimpleDateFormat("yyyy-MM-dd").parse(subcription.getDate_fin());  
//		 if(startdate != null) {subcription.setDate_debut(startdate)}
//		 if(enddate != null) {}
		 subscriptionService.save(subcription);
	        return "updated  success";
	    }
}