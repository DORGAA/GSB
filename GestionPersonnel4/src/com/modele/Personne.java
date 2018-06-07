package com.modele;

public class Personne {

	public int matricule;
	public String nom;
	public String prenom;
	public int age;
	
	// Constructeur par defaut
	public Personne() {
		
	}
	
	// Constructeur initialisant 3 propriétés
	
	public Personne (int matricule,String nom,String prenom) {
		this.matricule=matricule;
		this.nom=nom;
		this.prenom=prenom;
		
	}
	
	//constructeur initialisant 2 propriétés
	
	public Personne(int matricule,String nom) {
		
		this.matricule=matricule;
		this.nom=nom;
	}
	
	//constructeur initialisant 4 propriétés
	
	public Personne(int matricule,String nom,String prenom,int age) {
		
		// on fait appel au contructeur contenant 3 propriétés avec la methode this 
		this(matricule,nom,prenom);
		// on rajoute l'age qui manque dans la propriété de 3 
		this.age=age;
	}
	
	//les getters et setters sont appelés modificateur il permettent d'acceder au propriétés de l'objet qui sont privé (private)
	
	public int getMatricule() {
		return matricule;
	}
	
	public void setMatricule(int matricule){
		this.matricule=matricule;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	

	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}