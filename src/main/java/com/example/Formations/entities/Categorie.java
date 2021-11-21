package com.example.Formations.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "categorie")
public class Categorie {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "id", unique = true,nullable = false)
    private long id;
	@Column(name = "nom")
    private String nom;
	@Column(name = "description")
    private String description;
	
}