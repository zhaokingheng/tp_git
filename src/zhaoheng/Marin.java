package zhaoheng;

public class Marin {
	
	
	public String nom;
	
	public String prenom;
	
	public int salaire;

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

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Marin [nom=" + nom + ", prenom=" + prenom + ", salaire="
				+ salaire + "]";
	}
	
	

}
