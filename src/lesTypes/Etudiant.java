package lesTypes;

public class Etudiant {
	
	//Les attributs
	int age;
	String nom;
	
	//Les méthodes
	public void infoEtudiant()
	{
		System.out.println("Votre nom : "+this.nom+" Votre age : "+age);
	}
	
	// constructeur
	public Etudiant(String nom, int age) {
		this.age = age;
		this.nom = nom;
	}

}
