package gestionContratsCession;

import classesMetier.ContratCession;
import classesMetier.Spectacle;
import nezdames.serialisation.NezDamesSerialisation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author gaellecastel
 */
public class ContratCessionModifier extends javax.swing.JFrame {

    private int lIndexDuContratCession;
    String numeroContrat;

    public ContratCessionModifier(int laLigneSelectionnee) {
        initComponents();

        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //on remplit la combobox
        jComboBoxSpectacle.removeAllItems();
        // remplissage de la JComboBox
        for (Spectacle unSpectacle : NezDamesSerialisation.lesSpectacles) {
            jComboBoxSpectacle.addItem(unSpectacle.getTitre());
        }

        lIndexDuContratCession = laLigneSelectionnee;

        //on charge les données du spectacle sélectionné
        txtMontantContrat.setText(String.valueOf((((ContratCession) NezDamesSerialisation.lesContratsCession.get(laLigneSelectionnee)).getMontantGlobalContrat())));
        jComboBoxSpectacle.setSelectedItem(String.valueOf((((ContratCession) NezDamesSerialisation.lesContratsCession.get(laLigneSelectionnee)).getLeSpectacleDuContratDeCession().getTitre())));

        numeroContrat = String.valueOf((((ContratCession) NezDamesSerialisation.lesContratsCession.get(laLigneSelectionnee)).getNumeroContratCession()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitre1 = new javax.swing.JLabel();
        btnEnvoyer = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        txtMontantContrat = new javax.swing.JTextField();
        lblMontantContrat = new javax.swing.JLabel();
        lblTitreSpectacle = new javax.swing.JLabel();
        jComboBoxSpectacle = new javax.swing.JComboBox();
        lblImageManu = new javax.swing.JLabel();
        lblImageOlivier = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 153, 51));

        lblTitre1.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre1.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre1.setText("MODIFICATION D'UN CONTRAT DE CESSION");

        btnEnvoyer.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnEnvoyer.setText("Modifier le contrat");
        btnEnvoyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvoyerActionPerformed(evt);
            }
        });

        btnAnnuler.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        btnAnnuler.setText("Annuler");
        btnAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnulerActionPerformed(evt);
            }
        });

        txtMontantContrat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontantContratActionPerformed(evt);
            }
        });

        lblMontantContrat.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblMontantContrat.setForeground(new java.awt.Color(255, 153, 51));
        lblMontantContrat.setText("Montant global du contrat");

        lblTitreSpectacle.setFont(new java.awt.Font("Hannotate SC", 0, 13)); // NOI18N
        lblTitreSpectacle.setForeground(new java.awt.Color(255, 153, 51));
        lblTitreSpectacle.setText("Spectacle");

        jComboBoxSpectacle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSpectacleActionPerformed(evt);
            }
        });

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImageManu)
                        .addGap(24, 24, 24)
                        .addComponent(lblTitre1)
                        .addGap(18, 18, 18)
                        .addComponent(lblImageOlivier))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnEnvoyer)
                        .addGap(45, 45, 45)
                        .addComponent(btnAnnuler)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMontantContrat)
                        .addGap(18, 18, 18)
                        .addComponent(txtMontantContrat, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitreSpectacle)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxSpectacle, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblTitre1))
                    .addComponent(lblImageOlivier)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImageManu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMontantContrat)
                    .addComponent(txtMontantContrat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitreSpectacle)
                    .addComponent(jComboBoxSpectacle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnvoyer)
                    .addComponent(btnAnnuler))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(621, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnvoyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvoyerActionPerformed
        // test qui vérifie que les champs sont remplis

        //--------------MODIFICATION DU CONTRAT DE CESSION-------------------------------------
        if (txtMontantContrat.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Il faut saisir le montant du contrat");
        } else {
            // recherche du spectacle
            Spectacle theSpectacle = null;
            // recherche du spectacle
            for (Spectacle leSpectacle : NezDamesSerialisation.lesSpectacles) {
                if (leSpectacle.getTitre().compareTo((String) jComboBoxSpectacle.getSelectedItem()) == 0) {
                    theSpectacle = leSpectacle;
                }
            }

            NezDamesSerialisation.lesContratsCession.get(lIndexDuContratCession).modifier(numeroContrat, Double.parseDouble(txtMontantContrat.getText()), theSpectacle);
            JOptionPane.showMessageDialog(null, "Contrat de cession modifié.");

            this.dispose();

        }
    }//GEN-LAST:event_btnEnvoyerActionPerformed

    private void btnAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnulerActionPerformed
        // fermeture de la fenêtre SaisieMenu
        this.dispose();
        
    }//GEN-LAST:event_btnAnnulerActionPerformed

    private void txtMontantContratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontantContratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontantContratActionPerformed

    private void jComboBoxSpectacleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSpectacleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSpectacleActionPerformed

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
            java.util.logging.Logger.getLogger(ContratCessionModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratCessionModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratCessionModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratCessionModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new ContratProductionModifier().setVisible(true);
         }
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>
         //</editor-fold>

         /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
         new ContratCessionModifier().setVisible(true);
         }
         });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnEnvoyer;
    private javax.swing.JComboBox jComboBoxSpectacle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblMontantContrat;
    private javax.swing.JLabel lblTitre1;
    private javax.swing.JLabel lblTitreSpectacle;
    private javax.swing.JTextField txtMontantContrat;
    // End of variables declaration//GEN-END:variables
}
