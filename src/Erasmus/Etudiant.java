package Erasmus;

import javax.persistence.*;

@Entity
public class Etudiant {
	
	private String nom;
	
	private String prenom;
	
	@Id
	private String numEtu; // Un etudiant ne peut pas changer de num pendant sa sco
	
	private double noteSem;
	
	public Etudiant(String nom, String prenom, String nEtu) {
		this.nom = nom;
		this.prenom = prenom;
		numEtu = nEtu;
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

	public String getNumEtu() {
		return numEtu;
	}

	public double getNoteSem() {
		return noteSem;
	}

	public void setNoteSem(double noteSem) {
		this.noteSem = noteSem;
	}
	
}
