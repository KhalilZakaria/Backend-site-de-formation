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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "client")
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true,nullable = false)
    private long id;
	
	@Column(name = "nom")
    private String nom;
	
	@Column(name = "prenom")
    private String prenom;
	
	@Column(name = "cin")
    private String cin;
	
	@Column(name = "gsm")
    private String gsm;
	
	@Column(name = "email")
    private String email;
	
	
	@Column(name = "ville")
    private String ville;
	
	@Column(name = "adresse")
    private String Adresse;
	
	
}
