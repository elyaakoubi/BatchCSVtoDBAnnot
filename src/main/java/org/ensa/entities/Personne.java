package org.ensa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personne {
	@Id
	private int id;
	private String nom;
	private String prenom;
	private String civilite;
	
	public Personne() {
		super();
	}

	public Personne(int id, String nom, String prenom, String civilite) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.civilite = civilite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}
	
}
