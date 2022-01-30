package com.example.Formations.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Formations.entities.Participant;


public interface ParticipantRepository extends JpaRepository<Participant,Long>{
	Participant findByNom(String nom);
	public Participant findById(long id);
	public List<Participant> findAll();
	@Query(value = "SELECT max(id) FROM participant", nativeQuery = true)
	Long getLastCreated();
}
