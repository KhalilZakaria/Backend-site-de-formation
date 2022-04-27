package com.example.Formations.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
import com.example.Formations.entities.Formateur;
import com.example.Formations.entities.Formation;
import com.example.Formations.entities.Subscription;




public interface SubscriptionRepository extends JpaRepository<Subscription,Long> {

	
	public Subscription findById(long id);
	public List<Subscription> findAll();
	@Transactional
	@Modifying
	@Query("update Subscription s set s.isConfirmed = 'Oui' where s.id = :id")
	void validate(@Param("id") long id);
}