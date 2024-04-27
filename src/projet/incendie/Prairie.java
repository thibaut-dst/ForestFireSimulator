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
public class Prairie extends Inflammable {
    
    // ty
public Prairie (float proba, String etat){
    
    super (proba, etat);
    this.tps_enflamme = 2;

}
   @Override
public String toString() {
    return "1" ; // les cases de type 1 sont associées à des prairies 
}

}
