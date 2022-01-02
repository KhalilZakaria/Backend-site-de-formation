package com.example.Formations.entities;

import java.sql.Date;
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
@Table(name = "formation")
public class Formation {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true,nullable = false)
    private long id;
	
	@Column(name = "nom")
    private String nom;
	
	@Column(name = "date")
    private Date date;
	
	@Column(name = "description")
    private String description;
	
	@ManyToOne
	private Categorie categorie;
}
