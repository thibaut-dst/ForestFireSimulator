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
public class Inflammable extends Case {
    
    public Inflammable (float proba, String etat){
        
        super(proba, etat);
        
}
    

    @Override
    public int Categorie() {
   
    return 1 ; 
}

}