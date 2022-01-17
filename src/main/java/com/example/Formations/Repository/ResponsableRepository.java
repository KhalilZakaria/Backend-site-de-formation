package com.example.Formations.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;
import com.example.Formations.entities.Responsable;




public interface ResponsableRepository extends JpaRepository<Responsable,Long> {

	Responsable findByNom(String nom);
	public Responsable findById(long id);
	public List<Responsable> findAll();
	@Query(value = "SELECT max(id) FROM responsable", nativeQuery = true)
	Long getLastCreated();

}