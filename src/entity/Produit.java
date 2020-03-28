package entity;

import java.io.Serializable;

public class Produit implements Serializable {

	private long id;
	private String nom;
	private String prix;
	public Produit() {
		// TODO Auto-generated constructor stub
	}
	public Produit(String nom, String prix) {
		super();
		this.nom = nom;
		this.prix = prix;
	}
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
