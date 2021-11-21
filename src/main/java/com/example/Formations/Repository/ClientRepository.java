package com.example.Formations.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Formations.entities.Categorie;
import com.example.Formations.entities.Client;




public interface ClientRepository extends JpaRepository<Client,Long> {

	Client findByNom(String nom);
	public Client findById(long id);
	public List<Client> findAll();

}