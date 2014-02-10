package zhaoheng;

import java.util.List;

public class Bateau {

	
	private String nom;
	
	private int tonnage;
	
	private List<Marin> equipage;
	
	
	
	public Bateau(){
		
		
		
		
	}

	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTonnage() {
		return tonnage;
	}

	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	public List<Marin> getEquipage() {
		return equipage;
	}

	public void setEquipage(List<Marin> equipage) {
		this.equipage = equipage;
	}
}
