/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.incendie;

import java.util.Random;

/**
 *
 * @author thibautdesauty
 */
public class Case {

    protected double proba;
    protected String etat; // ordre des états :  intacte -> tempo -> enflammée -> brulé chaud -> brulé froid -> cendres  
    protected int tps_enflamme;
    protected int it_feu = 0;  // retiens l'iteration a laquelle le passage à l'etat enflamme se fait
    protected int it_Bfroid = 0; // retiens l'iteration a laquelle le passage à l'etat brulé froid se fait

    public Case(float proba, String etat) {
        this.proba = proba;
        this.etat = etat;
    }

    public Case(float proba, String etat, int type) {
        this.proba = proba;
        this.etat = etat;
    }

    public int Categorie() {
        return 0;
    }

    public void SetEtat(String ca) {
        this.etat = ca;
    }

    public String getEtat() {
        return etat;
    }

    public boolean appli_proba() {
        int p = new Random().nextInt(100);
        if (p < proba * 100) {
            return true; // si ca retourne true, la case s'enflamme
        } else {
            return false;
        }
    }

    public String versFichier() {
        return toString() + System.lineSeparator();
    }

    public void setIt_feu(int it_feu) {
        this.it_feu = it_feu;
    }

    public void setIt_Bfroid(int it_Bfroid) {
        this.it_Bfroid = it_Bfroid;
    }

}
