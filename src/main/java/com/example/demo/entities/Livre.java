package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name = "Livre") @Data @AllArgsConstructor @NoArgsConstructor

public class Livre {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@OrderBy
	private Integer id;
	@Column(length = 50,nullable=false)
	private String titre;
	@Column(nullable=false,updatable = false)
	private String maisonedition;
	@Temporal(TemporalType.DATE) @Column(nullable=false)
	private Date datedesortie;
	@Column(unique=true,nullable=false)
	private String auteur;
	@Column(nullable=false)
	private Integer nombredepage ;
	@Column(unique=true,nullable=false,updatable = false)
	private String isbn;
	@Temporal(TemporalType.TIMESTAMP) @CreationTimestamp @Column(nullable=false)
	private Date datedederniereconsultation;
	@Column(nullable=false)
	private Boolean disponible;



}
