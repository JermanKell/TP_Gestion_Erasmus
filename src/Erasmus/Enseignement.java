package Erasmus;

import javax.persistence.*;

public class Enseignement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String nom;
	private int nbECTS;
	private int volHoraire;
	
	
	public Enseignement(String nom, int nbects, int volumeH) {
		this.nom = nom;
		nbECTS = nbects;
		volHoraire = volumeH;
	}


	public int getId() {
		return id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbECTS() {
		return nbECTS;
	}


	public void setNbECTS(int nbECTS) {
		this.nbECTS = nbECTS;
	}


	public int getVolHoraire() {
		return volHoraire;
	}


	public void setVolHoraire(int volHoraire) {
		this.volHoraire = volHoraire;
	}
}
