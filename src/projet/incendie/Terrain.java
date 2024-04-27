/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.incendie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author thibautdesauty
 */
public class Terrain {

    protected Case Terrain[][];
    private int nivHumidite; // 1 : très sec ... 4 : humide 
    private double proba_humidite;

    public Terrain(int taille) {
        this.Terrain = new Case[taille][taille];
    }

    public void setNivHumidite(int nivHumidite) {
        this.nivHumidite = nivHumidite;
    }

    public void setProba_humidite(double proba_humidite) {
        this.proba_humidite = proba_humidite;
    }

    public int getNivHumidite() {
        return nivHumidite;
    }

    public void Construction(int densité, int taille) {

        //    this.Terrain = new Case[taille][taille];
        for (int i = 0; i < Terrain.length; i++) {
            for (int j = 0; j < Terrain.length; j++) {
                Terrain[i][j] = new Terre(0, "intacte");
            }
        }
        // demander de rentrer le nom du terrain / de la simulation
        // on laisse 3 cases de chaque coté pour ne pas avoir d'erreur "out of range" lorsque la matrice du vent sera appliqué
        for (int i = 3; i < Terrain.length - 3; i++) {
            for (int j = 3; j < Terrain.length - 3; j++) {
                switch (this.nivHumidite) {
                    case 1:
                        this.proba_humidite = 0.9;
                        break;
                    case 3:
                        proba_humidite = 0.35;
                        break;
                    case 4:
                        proba_humidite = 0.1;
                        break;
                    default:
                        proba_humidite = 0.6;
                        break;
                }
                if (new Random().nextInt(100) < densité) {
                    Terrain[i][j] = new Foret(0, "intacte");
                }
            }
        }
    }

    public void Allumer_le_feu(Vent V) {

        if ("Nord".equals(V.getDirection())) {
            Terrain[5][(int) Terrain.length / 2].SetEtat("enflammée");
            Terrain[5][(int) Terrain.length / 2 + 1].SetEtat("enflammée");
        }
        if ("Sud".equals(V.getDirection())) {
            Terrain[Terrain.length - 5][(int) Terrain.length / 2].SetEtat("enflammée");
            Terrain[Terrain.length - 5][(int) Terrain.length / 2 + 1].SetEtat("enflammée");
        }
        if ("Ouest".equals(V.getDirection())) {
            Terrain[(int) Terrain.length / 2][5].SetEtat("enflammée");
            Terrain[(int) Terrain.length / 2 + 1][5].SetEtat("enflammée");
        }
        if ("Est".equals(V.getDirection())) {
            Terrain[(int) Terrain.length / 2][Terrain.length - 5].SetEtat("enflammée");
            Terrain[(int) Terrain.length / 2 + 1][Terrain.length - 5].SetEtat("enflammée");
        }
    }

    public void Propagation_feu(Vent V, int it) {

        double[][] matVent = V.getMatriceVent();

        // début des itérations d'incendie 
        // 1ere boucle "double for" sert à enflammé les cases marquées
        for (int i = 3; i < Terrain.length - 3; i++) {
            for (int j = 3; j < Terrain.length - 3; j++) {
                //            Terrain[i][j].probaHum(); // quand il arrive sur une case, il recupère la proba lié à l'humidité en donnant une vraie valeur de proba à l'attribut proba humidité                    
                if ("tempo".equals(Terrain[i][j].getEtat())) { // enflamme les cases marquées
                    Terrain[i][j].SetEtat("enflammée");
                    Terrain[i][j].setIt_feu(it);
                }
                if ("brulé chaud".equals(Terrain[i][j].getEtat())) {
                    int p = new Random().nextInt(100);
                    if (p < 40) {
                        Terrain[i][j].SetEtat("brulé froid");
                        Terrain[i][j].it_Bfroid = it;
                    }
                }
                if (("enflammée".equals(Terrain[i][j].getEtat())) && (it - Terrain[i][j].it_feu == Terrain[i][j].tps_enflamme)) { // passe les cases enflammé à l'état de brulé chaud 
                    Terrain[i][j].SetEtat("brulé chaud");
                }
                if (("brulé froid".equals(Terrain[i][j].getEtat())) && (it - Terrain[i][j].it_Bfroid == 3)) {
                    Terrain[i][j].SetEtat("cendres");
                }
            }
        }
        // Cette 2eme boucle "double for" sert à appliquer les proba et marquer les cases à enflammmer à la prochaine itération
        for (int i = 3; i < Terrain.length - 3; i++) {
            for (int j = 3; j < Terrain.length - 3; j++) {
                if ("enflammée".equals(Terrain[i][j].getEtat())) {

                    for (int x = -3; x < 4; x++) {      // on centre la matrice de vent selon l'axe des x
                        for (int y = -3; y < 4; y++) {      // on centre la matrice de vent selon l'axe des y
                            Terrain[i + x][j + y].proba = proba_humidite * matVent[3 + x][3 + y]; // on calque chaque case de la matrice de vent sur notre case i,j, afin de pouvoir calculé les proba                            
                            if ((i + x >= 3) && (i + x) <= Terrain.length - 3) {
                                if ((j + y >= 3) && (j + y) <= Terrain.length - 3) {
                                    if ((Terrain[i + x][j + y].appli_proba()) && (Terrain[i + x][j + y].Categorie() == 1) && ("intacte".equals(Terrain[i + x][j + y].getEtat()))) {
                                        Terrain[i + x][j + y].SetEtat("tempo");
                                    }
                                }
                            }
                        }
                    } 
                } // securité des matrices centré 
                if ("brulé chaud".equals(Terrain[i][j].getEtat())) {
                    for (int x = -3; x < 4; x++) {
                        for (int y = -3; y < 4; y++) {
                 // on calque chaque case de la matrice de vent sur notre case i,j, afin de pouvoir calculé les proba
                            Terrain[i + x][j + y].proba = ((0.5 * (1 + 2 * V.getForce())) / 100) * (1 - proba_humidite) * matVent[3 + x][3 + y];
                            if ((i + x >= 3) && (i + x) <= Terrain.length - 3) {
                                if ((j + y >= 3) && (j + y) <= Terrain.length - 3) {
                                    if ((Terrain[i + x][j + y].appli_proba()) && (Terrain[i + x][j + y].Categorie() == 1) && ("intacte".equals(Terrain[i + x][j + y].getEtat()))) {
                                        Terrain[i + x][j + y].SetEtat("tempo");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String TailleVersFichier() {
        return Terrain.length + System.lineSeparator();
    }

    public void Save(String nom) throws IOException {
        FileWriter fich = new FileWriter(nom + ".txt");
        fich.write(TailleVersFichier());
        for (int i = 0; i < Terrain.length; i++) {
            for (int j = 0; j < Terrain.length; j++) {
                String element = Terrain[i][j].toString();
                fich.write(element + ";");
            }
            fich.write(System.lineSeparator());
        }
        fich.close(); // fermeture du fichier
    }

    public Terrain Download(String nomdufichiercharge) throws FileNotFoundException, IOException {
        FileReader fich = new FileReader(nomdufichiercharge); // ouvertures du fichier en mode lecture
        BufferedReader br = new BufferedReader(fich);
        String t = br.readLine();
        int taille = Integer.valueOf(t);
        Terrain terrain_charge = new Terrain(taille);
        for (int i = 0; i < taille; i++) {
            String element = br.readLine();
            String[] tab = element.split(";");
            for (int j = 0; j < taille; j++) {
                if ("0".equals(tab[j])) {
                    terrain_charge.Terrain[i][j] = new Terre(0, "intacte");
                } else if ("3".equals(tab[j])) {
                    terrain_charge.Terrain[i][j] = new Eau(0, "intacte");
                } else if ("2".equals(tab[j])) {
                    terrain_charge.Terrain[i][j] = new Foret(0, "intacte");
                } else {
                    terrain_charge.Terrain[i][j] = new Prairie(0, "intacte");
                }
            }
        }
        fich.close();
        return terrain_charge;
    }
}
