/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.incendie;

/**
 *
 * @author thibautdesauty
 */
public class Non_inflammable extends Case {
    
    public Non_inflammable (float proba, String etat){
        
        super(proba, etat);
        this.tps_enflamme = 0 ; 
        this.proba=0;
    }
    
  
    @Override
    public int Categorie() {
   
    return 0 ; 
}

}
