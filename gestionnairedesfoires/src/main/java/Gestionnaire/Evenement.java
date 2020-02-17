package Gestionnaire;

import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Evenement {
    int code_foire ;
    String intitulé_foire;
    Date  date_debut;
    Date date_fin;
    Vector <Exposant> Ex= new Vector();

    public int getCode_foire() {
        return code_foire;
    }

    public void setCode_foire(int code_foire) {
        this.code_foire = code_foire;
    }

    public String getIntitulé_foire() {
        return intitulé_foire;
    }

    public void setIntitulé_foire(String intitulé_foire) {
        this.intitulé_foire = intitulé_foire;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Vector<Exposant> getEx() {
        return Ex;
    }

    public void setEx(Vector<Exposant> Ex) {
        this.Ex = Ex;
    }

    public Evenement(int code_foire, String intitulé_foire, Date date_debut, Date date_fin,Vector <Exposant> ex) {
        this.code_foire = code_foire;
        this.intitulé_foire = intitulé_foire;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.Ex=ex;
    }
    

   
    
    
     
}
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

