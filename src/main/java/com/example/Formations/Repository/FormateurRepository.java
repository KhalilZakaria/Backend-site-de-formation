package com.example.Formations.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
import com.example.Formations.entities.Formateur;




public interface FormateurRepository extends JpaRepository<Formateur,Long> {

	Formateur findByNom(String nom);
	public Formateur findById(long id);
	public List<Formateur> findAll();

}