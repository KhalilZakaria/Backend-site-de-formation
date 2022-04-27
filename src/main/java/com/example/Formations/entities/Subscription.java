package com.example.Formations.entities;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subscription")
public class Subscription {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true,nullable = false)
    private long id;
	
	@Column(name = "date_debut")
    private String date_debut;
	
	@Column(name = "date_fin")
    private String date_fin;
	
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private Formateur formateur;
	
	@ManyToOne
	private Formation formation;
	
	@ManyToOne
	private Responsable responsable;
	
	@Column(name = "isConfirmed")
    private String isConfirmed;
}
