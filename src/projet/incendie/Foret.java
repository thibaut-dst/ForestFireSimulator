/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.incendie;

import java.awt.Color;

/**
 *
 * @author thibautdesauty
 */
public class Foret extends Inflammable {
    
   
    
public Foret (float proba, String etat){
    super (proba, etat);
    this.tps_enflamme = 3 ; 
    
    
}
       @Override
public String toString() {
   
    return "2" ; // les cases de type 2 sont associées à des foret 
}
 

public Color toColor() {
   
    return new java.awt.Color(85, 107, 47) ; // les cases de type 2 sont associées à des foret 
}

}
