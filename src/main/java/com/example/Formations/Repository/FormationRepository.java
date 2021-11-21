package com.example.Formations.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
import com.example.Formations.entities.Formateur;
import com.example.Formations.entities.Formation;




public interface FormationRepository extends JpaRepository<Formation,Long> {

	Formation findByNom(String nom);
	public Formation findById(long id);
	public List<Formation> findAll();

}