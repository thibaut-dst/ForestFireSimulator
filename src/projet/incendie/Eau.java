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
public class Eau extends Non_inflammable {
    
    public Eau (float proba, String etat){
    
    super (proba, etat);
    this.tps_enflamme = 0;

    }    
           @Override
public String toString() {
   
    return "3" ; // les cases de type 4 sont associées à des cases eau 
}


}
