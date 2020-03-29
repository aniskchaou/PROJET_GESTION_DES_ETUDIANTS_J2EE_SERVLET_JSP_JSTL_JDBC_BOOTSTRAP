package entity;

import java.io.Serializable;

public class Produit implements Serializable {

	//proprietes
	private long id;
	private String nom;
	private String prix;
	
	
	//constructors
	public Produit() {
	
	}
	public Produit(String nom, String prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}
	
	//getters & setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	
	
}
