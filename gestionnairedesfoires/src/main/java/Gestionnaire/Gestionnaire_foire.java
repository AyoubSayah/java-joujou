
package Gestionnaire;

import java.awt.Container;
import static java.awt.PageAttributes.MediaType.A;
import static java.lang.System.in;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;



public class Gestionnaire_foire {

    Vector <Evenement> Ev= new Vector();
    Vector <Exposant> Ex= new Vector();
    
    
    
      public void ajoutexp(String matricule, String nom, String description, String adresse, String telephone)
         
    { 
       
      Ex.add(new Exposant(matricule,nom,description,adresse,telephone)) ; } 
    
 public boolean verifmat(String matricule)
 {
     if (("".equals(matricule))|| (" ".equals(matricule)) ) 
     {return false ;}
     else return true ; 
 
     
 }
  public boolean verifnom(String nom)
 {
     if (("".equals(nom))|| (" ".equals(nom))||(nom.length()<3) ) 
     {return false ;}
     else return true ; 
 
     
 }
  
 public boolean verifnum(String num)
 {boolean ok=true;
     try {
        double d = Double.parseDouble(num);
    } catch (NumberFormatException nfe) {
        ok=false;
    }
    
     if (("".equals(num))|| (" ".equals(num)) ||(ok==false)||(num.length()!=8))
     {return false ;}
             else return true ; 
 
     
 }
 public boolean unique (String mat)  {
     boolean k =true; 
     
      
        for(int i=0 ;i<Ex.size();i++) { if ((Ex.get(i).getMatricule()).equals(mat)) {k=false ;}} ;
        return k;
    }
 public int rechexp(String matricule) {
    
    
    for(int i=0;i<Ex.size();i++) 
    {
     if (Ex.get(i).getMatricule().equals(matricule)) {return i ; } 
    }
        return 0;
 }
 public String getnom (String matricule){
        int i = rechexp(matricule);
       String nom=Ex.get(i).getNom();
        return nom;
    }
 public String getnum(String matricule){
        int i = rechexp(matricule);
       String telph=Ex.get(i).getTelephone();
        return telph;
    }
 public String getdes (String matricule){
        int i = rechexp(matricule);
       String nom=Ex.get(i).getDescription() ;
        return nom;
    }
 public String getadr(String matricule){
        int i = rechexp(matricule);
       String nom=Ex.get(i).getAdresse();
        return nom;
    }
public boolean uniqueeve (int cd)  {
     boolean k =true;
     
     
      
        for(int i=0 ;i<Ev.size();i++) { if ((Ev.get(i).code_foire)==cd )
        {k=false ;}} ;
        return k;
    }
public boolean verifdate(String jj ,String mm, String aa)
        
{try {
int j =Integer.parseInt(jj);
int a =Integer.parseInt(aa);
int m =Integer.parseInt(mm);
if ((j<=0)||(m<=0)||(a<=0)||(a<2019)||(a>2999)||(m>12)||(j>31)) 
{return false ;}
if (m==4||m==6||m==9||m==10)
{ if (j>30)return false ;}
else { if (m==2)
{ if (a%4==0) {
    if (j>29) return false;
    
}else if(a%4!=0){
    if(j>28) return false;
}
}
    
}
} catch (NumberFormatException nfe) {
        return false ;
    }


return true ;
}



public void ajouteve(int cd , String nom , String j ,String m,String a, String j1 ,String m1,String a1) throws ParseException
{ Vector <Exposant> ex1= new Vector();
    j=j+"/"+m+"/"+a ; 
     j1=j1+"/"+m1+"/"+a1 ;
    Date DB,DF;
        SimpleDateFormat simpledateformat=new SimpleDateFormat("mm/dd/yyyy");
        DB=simpledateformat.parse(j);
        DF=simpledateformat.parse(j1);
        
        
Ev.add(new Evenement(cd,nom,DB,DF,ex1));
}


public boolean verifdate1(String jj ,String mm, String aa,String jjf ,String mmf, String aaf) throws ParseException
{ jj=(jj+"/"+mm+"/"+aa) ; 
     jjf=(jjf+"/"+mmf+"/"+aaf) ;
     
Date DB,DF;
        SimpleDateFormat simpledateformat=new SimpleDateFormat("mm/dd/yyyy");
        DB=simpledateformat.parse(jj);
        DF=simpledateformat.parse(jjf);
        if(DF.before(DB)) {return false ;}
  return true;      
}
public boolean verifcd(String cd)
 {
     if (("".equals(cd))|| (" ".equals(cd)) ) 
     {return false ;}
     
  try {
        double d = Double.parseDouble(cd);
    } catch (NumberFormatException nfe) {
        return false;
    }
   return true ;  
 }
public boolean verifplanf(String jj ,String mm, String aa,String jjf ,String mmf, String aaf) throws ParseException
{ jj=(jj+"/"+mm+"/"+aa) ; 
     jjf=(jjf+"/"+mmf+"/"+aaf) ;
     boolean ok =true ; 
Date DB,DF;
        SimpleDateFormat simpledateformat=new SimpleDateFormat("mm/dd/yyyy");
        DB=simpledateformat.parse(jj);
        DF=simpledateformat.parse(jjf);
       for(int i =0 ; i<Ev.size();i++)
       {if ((Ev.get(i).date_debut.equals(DB))||(Ev.get(i).date_fin.equals(DF)))
       {ok=false ;}
       else if ((Ev.get(i).date_debut.before(DB)&&(Ev.get(i).date_fin.after(DB)))||(Ev.get(i).date_debut.before(DF)&&(Ev.get(i).date_fin.after(DF))))
       {ok=false; }
       
       }
    return ok;     
}
public void affecter (String cd , String mat)
{
    int n = Integer.parseInt(cd);
Ev.get(recheve(n)).Ex.add(Ex.get(rechexp(mat)));

}
public boolean affecte1(String cd , String mat)
{
    int n = Integer.parseInt(cd);
    for (int i =0 ; i<Ev.get(recheve(n)).Ex.size();i++)
    {if (Ev.get(recheve(n)).Ex.get(i).getMatricule().equals(mat))
        return false ; 
   
    }
     return true;
}
public int recheve(int cd) {
    
    
    for(int i=0;i<Ex.size();i++) 
    {
     if (Ev.get(i).code_foire==(cd)) {return i ; } 
    }
        return 0;
 }
public void afficher (String jj ,String mm ,String aa,String jjf,String mmf,String aaf) throws ParseException
{
    jj=(jj+"/"+mm+"/"+aa) ; 
     jjf=(jjf+"/"+mmf+"/"+aaf) ;
     
Date DB,DF;
        SimpleDateFormat simpledateformat=new SimpleDateFormat("mm/dd/yyyy");
        DB=simpledateformat.parse(jj);
        DF=simpledateformat.parse(jjf);
        for (int i=0; i<Ev.size();i++)
        { if ((Ev.get(i).date_debut.after(DB) && Ev.get(i).date_fin.before(DF)))
        {System.out.println(Ev.get(i).intitulé_foire);
        }
            
        }
}
 public void afficherfoire(String cd){
     int j =recheve(Integer.parseInt(cd));
        try {
            Collections.sort(Ev.get(j).Ex);
        }
        catch(Exception e){
            
            System.out.println("tri inncorrect");
        }
            for (int i = 0; i < Ev.get(j).Ex.size(); i++) {
                    
                System.out.println(Ev.get(j).Ex.get(i));  
                    
                }
            }   
        }
   





