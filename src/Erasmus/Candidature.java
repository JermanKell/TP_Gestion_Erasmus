package Erasmus;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Candidature {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Etudiant etu;
	private Bourse	bourse;
	private List<Enseignement> lEnseignements;
	private double note1;
	private double note2;
	
	public Candidature(Etudiant etu, Bourse bourse) {
		this.etu = etu;
		this.bourse = bourse;
		lEnseignements = new ArrayList<Enseignement>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Etudiant getEtu() {
		return etu;
	}

	public void setEtu(Etudiant etu) {
		this.etu = etu;
	}

	public Bourse getBourse() {
		return bourse;
	}

	public void setBourse(Bourse bourse) {
		this.bourse = bourse;
	}

	public List<Enseignement> getlEnseignements() {
		return lEnseignements;
	}

	public void setEnseignements(Enseignement ens) {
		lEnseignements.add(ens);
	}

	public double getNote1() {
		return note1;
	}

	public void setNote1(double note1) {
		this.note1 = note1;
	}

	public double getNote2() {
		return note2;
	}

	public void setNote2(double note2) {
		this.note2 = note2;
	}
	
	
}
