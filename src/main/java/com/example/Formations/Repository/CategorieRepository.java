package com.example.Formations.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Formations.entities.Categorie;




public interface CategorieRepository extends JpaRepository<Categorie,Long> {

	Categorie findByNom(String nom);
	public Categorie findById(long id);
	public List<Categorie> findAll();

}