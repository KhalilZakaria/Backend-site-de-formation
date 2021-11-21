package com.example.Formations.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.FormateurFormation;




public interface FormateurFormationRepository extends JpaRepository<FormateurFormation,Long> {

	public FormateurFormation findById(long id);
	public List<FormateurFormation> findAll();

}