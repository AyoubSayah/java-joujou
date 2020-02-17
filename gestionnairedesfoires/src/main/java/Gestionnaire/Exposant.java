/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestionnaire;

import java.util.Scanner;

/**
 *
 * @author Mahmoud
 */
public class Exposant implements Comparable {

 
    private String matricule;
   private String nom ;
    private String description ;
    private String adresse ;
    private String telephone;

      public String getMatricule() {
        return matricule;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    
    
    
    
      public Exposant ()
     { System.out.println("la matricule : ");
       Scanner sc = new Scanner(System.in);
       this. matricule=sc.nextLine();
       System.out.println("Le nom : ");
       this.nom=sc.nextLine();
       System.out.println("La description : ");
       this.description=sc.nextLine();
    System.out.println("Ladresse : ");
       this.adresse=sc.nextLine();
    System.out.println(" le num telephone : ");
       this.telephone=sc.nextLine();
       
     }  
       
       
      
       
       
       
       
       @Override
     public String toString()
       {
           {
          System.out.println("Matricule"+"\t"+"Nom"+"\t"+"Description"+"\t"+"Adresse"+"\t"+"Telephone");
          return (this.matricule+"\t"+this.nom+"\t"+this.description+"\t"+this.adresse+"/t"+this.telephone);
    
      
            }
         
       }  

    public Exposant(String matricule, String nom, String description, String adresse, String telephone) {
        this.matricule = matricule;
        this.nom = nom;
        this.description = description;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    
    
    @Override
    public int compareTo(Object o) {
        Exposant e=(Exposant)o;
        return(this.nom.compareTo(e.getNom()));

    }
   
    
    
    
    
}
    
    
    
    
    
    
         
