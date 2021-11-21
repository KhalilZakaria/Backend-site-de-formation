package com.example.Formations.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
import com.example.Formations.entities.Formateur;
import com.example.Formations.entities.Formation;
import com.example.Formations.entities.Subscription;




public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {


	public Subscription findById(long id);
	public List<Subscription> findAll();

}