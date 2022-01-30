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

import com.example.Formations.Services.ParticipantService;
import com.example.Formations.entities.Participant;


import lombok.AllArgsConstructor;

@CrossOrigin(origins = "*")
@RequestMapping(value = "Participant")
@AllArgsConstructor
@RestController
public class ParticipantController {
private  ParticipantService participantService;
	

	
	public Long getLastCreated() {
		 Long LastCreatedparticipant = participantService.getLastCreated();
		 return LastCreatedparticipant;
	}
	 @GetMapping(value = "/find/all")
	    public List<Participant> findAll( ){
	        return participantService.findAll();
	    }
	 @PostMapping(value = "/add_participant")
	    public String save(@RequestBody Participant participant){
		 participantService.save(participant);
		 return "Success";
	    }
	 
	 
	 @GetMapping(value = "/find/{id}")
	    public Participant findById(@PathVariable long id  ){
	        return  participantService.findById(id);
	    }
	 
	 @PatchMapping("/update")//replace an existing Resource entirely  // @PatchMapping partial update
	    public String update(@RequestBody Participant participant) {
		 participantService.save(participant);
	     return "updated  success";
	    }
	 
	 @DeleteMapping(value = "/delete/{id}")
	   public void Delete(@PathVariable long id ){
		 Participant participant = participantService.findById(id);
		 participantService.delete(participant);
	    }
}