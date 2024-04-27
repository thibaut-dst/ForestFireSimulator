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
public class Terre extends Non_inflammable {
    
    public Terre (float proba, String etat){

    super (proba, etat);
    this.proba = 0 ; 
    this.tps_enflamme = 0;


    }

           @Override
public String toString() {
   
    return "0" ; // les cases de type 3 sont associées à des cases terres 
}

}
