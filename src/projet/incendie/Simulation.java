/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.incendie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author thibautdesauty
 */



public class Simulation extends javax.swing.JDialog implements MouseListener {

    private JPanel tabPan[][];
    private static int a; // a est la taille du terrain
    private static Terrain grille = new Terrain(a);
    private static Vent V_s;
    private JPanel Pan = new JPanel();
    private int it_jeu;

    public Simulation(java.awt.Frame parent, boolean modal, int valTaille, Terrain T_acc, Vent V) {
        super(parent, modal);
        initComponents();
       //   new BackgroundImageJFrame();
        //   this.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
        this.a = valTaille;
        this.grille = T_acc;
        this.V_s = V;
        tabPan = new JPanel[a][a];
        Creation_grille();
        grille.Allumer_le_feu(V_s);
        maj_grille();
        jLit.setVisible(false);
        this.pack();
        it_jeu = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JBsave = new javax.swing.JButton();
        JTentreznom = new javax.swing.JTextField();
        JLnomfichier = new javax.swing.JLabel();
        jTBlac = new javax.swing.JToggleButton();
        jLit = new javax.swing.JLabel();
        Jbavancer_simu = new javax.swing.JButton();
        Baccueil = new javax.swing.JButton();
        Pfond = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        JBsave.setText("Sauvegarder le terrain");
        JBsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBsaveActionPerformed(evt);
            }
        });

        JTentreznom.setText("entrez un nom ici");
        JTentreznom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTentreznomActionPerformed(evt);
            }
        });

        JLnomfichier.setText("Nom du fichier :");

        jTBlac.setBackground(new java.awt.Color(102, 204, 255));
        jTBlac.setText("Placer un lac/rivière");
        jTBlac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBlacActionPerformed(evt);
            }
        });

        jLit.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLit.setForeground(new java.awt.Color(255, 255, 255));
        jLit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLit.setText("jLabel1");

        Jbavancer_simu.setBackground(new java.awt.Color(248, 201, 66));
        Jbavancer_simu.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Jbavancer_simu.setForeground(new java.awt.Color(255, 255, 255));
        Jbavancer_simu.setText("Faire avancer la simulation");
        Jbavancer_simu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbavancer_simuActionPerformed(evt);
            }
        });

        Baccueil.setText("< Accueil  ");
        Baccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaccueilActionPerformed(evt);
            }
        });

        Pfond.setBackground(new java.awt.Color(0, 102, 51));
        Pfond.setPreferredSize(new java.awt.Dimension(800, 800));
        Pfond.setSize(new java.awt.Dimension(600, 600));
        Pfond.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PfondMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PfondMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout PfondLayout = new javax.swing.GroupLayout(Pfond);
        Pfond.setLayout(PfondLayout);
        PfondLayout.setHorizontalGroup(
            PfondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        PfondLayout.setVerticalGroup(
            PfondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pfond, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBsave, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTentreznom, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTBlac)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(JLnomfichier)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Baccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jbavancer_simu, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(55, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pfond, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Baccueil)
                .addGap(39, 39, 39)
                .addComponent(Jbavancer_simu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jTBlac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLnomfichier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTentreznom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(JBsave)
                .addGap(122, 122, 122))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BaccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaccueilActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.getParent().setVisible(true);

    }//GEN-LAST:event_BaccueilActionPerformed

    private void Jbavancer_simuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbavancer_simuActionPerformed
        // TODO add your handling code here:
     //      while (it_jeu<61){
        grille.Propagation_feu(V_s, it_jeu);
        maj_grille();
        jLit.setText("itération : "+it_jeu);
        jLit.setVisible(true);
        it_jeu++;
    //}
        //   TimeUnit.SECONDS.sleep(1); 
    }//GEN-LAST:event_Jbavancer_simuActionPerformed

    private void JBsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBsaveActionPerformed
        try {
            // TODO add your handling code here:
            grille.Save(JTentreznom.getText());
            JOptionPane.showMessageDialog(this, "Terrain Sauvegardé ! ");
        } catch (IOException ex) {
            Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_JBsaveActionPerformed

    private void JTentreznomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTentreznomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTentreznomActionPerformed

    private void PfondMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PfondMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_PfondMouseMoved

    private void PfondMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PfondMouseDragged
        // TODO add your handling code here:

    }//GEN-LAST:event_PfondMouseDragged

    private void jTBlacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBlacActionPerformed
        // TODO add your handling code here:
for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                tabPan[i][j].addMouseListener(this);
            }
            }

    }//GEN-LAST:event_jTBlacActionPerformed

    private void Creation_grille() {
        //   this.tabPan = new JPanel[a][a];
        GridLayout grille = new GridLayout(a, a);
        Pfond.setLayout(grille);
        Pfond.setSize(5 * a, 5 * a);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                // créer un label
                Pan = new JPanel();

                // définir la taille du Panel
                Dimension dim = new Dimension(a / 20, a / 20);
                Pan.setPreferredSize(dim);
              //  Pan.addMouseListener(this);

                tabPan[i][j] = Pan;
                Pfond.add(tabPan[i][j]);

                //  Pan.removeMouseListener(this);
            }
        }
        this.pack();
    }

    private void maj_grille() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ("intacte".equals(grille.Terrain[i][j].getEtat())) {
                    // prairie
                    if ("1".equals(grille.Terrain[i][j].toString())) {
                        tabPan[i][j].setBackground(new java.awt.Color(154, 205, 50));
                    }
                    // foret
                    if ("2".equals(grille.Terrain[i][j].toString())) {
                        tabPan[i][j].setBackground(new java.awt.Color(85, 107, 47));
                    }
                    // eau
                    if ("3".equals(grille.Terrain[i][j].toString())) {
                        tabPan[i][j].setBackground(new java.awt.Color(0, 153, 255));
                    }
                    // terre
                    if ("0".equals(grille.Terrain[i][j].toString())) {
                        tabPan[i][j].setBackground(new java.awt.Color(210, 180, 140));
                    }
                } else {
                    if ("enflammée".equals(grille.Terrain[i][j].getEtat())) {
                        tabPan[i][j].setBackground(new java.awt.Color(220, 20, 60));
                    }
                    if ("brulé chaud".equals(grille.Terrain[i][j].getEtat())) {
                        tabPan[i][j].setBackground(new java.awt.Color(255, 140, 0));
                    }
                    if ("brulé froid".equals(grille.Terrain[i][j].getEtat())) {
                        tabPan[i][j].setBackground(new java.awt.Color(250, 250, 107));
                    }
                    if ("cendres".equals(grille.Terrain[i][j].getEtat())) {
                        tabPan[i][j].setBackground(new java.awt.Color(50, 50, 50));
                    }
                }
            }
        }
        this.pack();
        /*    try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Simulation.class.getName()).log(Level.SEVERE, null, ex);
            }*/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simulation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Simulation dialog = new Simulation(new javax.swing.JFrame(), true, a, grille, V_s);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baccueil;
    private javax.swing.JButton JBsave;
    private javax.swing.JLabel JLnomfichier;
    private javax.swing.JTextField JTentreznom;
    private javax.swing.JButton Jbavancer_simu;
    private javax.swing.JPanel Pfond;
    private javax.swing.JLabel jLit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jTBlac;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Pan.setBackground(Color.blue);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
