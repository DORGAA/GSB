package com.modele;

public class Test {
	
	//cette methode est le point d'entrer des programmes java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//On instancie un Objet personne en utlisant le constructeur par defaut
		//Qui crée une reference vers un objet personne 
		/*
		Personne pr= new Personne();
		
		//On utilise les setters pour initialiser notre projet
		
		pr.setMatricule(1);
		pr.setNom("seck");
		pr.setPrenom("Serigne");
		pr.setAge(25);
		
		// On utilise les getters pour recupérer les valeurs des propriétés
		
		int matricule=pr.getMatricule();
		String nom=pr.getNom();
		String prenom=pr.getPrenom();
		int age=pr.getAge();
		
		System.out.println("Matricule= "+matricule+"Nom=" +nom+"Prenom=" +prenom+"Age=" +age);
		*/
		
		/*
		Personne pr1 = new Personne(1,"seck","serigne");
		
		pr1.setAge(25);
		
		int age=pr1.getAge();

		System.out.println("Age=" +age);
		*/
		
		Personne pr2=new Personne(1,"seck");
		
		pr2.setPrenom("Serigne");
		pr2.setAge(25);
		
		int matricule=pr2.getMatricule();
		String nom=pr2.getNom();
		String prenom=pr2.getPrenom();
		int age=pr2.getAge();
		
		System.out.println("Matricule= " +matricule+ "Nom=" +nom+"Prenom=" +prenom+"Age=" +age);
		

		

		
		
	}

}
