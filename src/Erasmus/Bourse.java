package Erasmus;

import javax.persistence.*;

@Entity
public class Bourse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String destination;
	
	private int nbPlaceDispo;
	
	private Enseignant ens;
	
	public Bourse(String dest, int nbPlaces) {
		destination = dest;
		nbPlaceDispo = nbPlaces;
	}

	public int getId() {
		return id;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNbPlaceDispo() {
		return nbPlaceDispo;
	}

	public void setNbPlaceDispo(int nbPlaceDispo) {
		this.nbPlaceDispo = nbPlaceDispo;
	}

	public Enseignant getEns() {
		return ens;
	}

	public void setEns(Enseignant ens) {
		this.ens = ens;
	}
	
	
}
