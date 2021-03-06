/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionContratsTravail;

import classesMetier.ContratCession;
import classesMetier.ContratTravail;
import classesMetier.Intermittent;
import classesMetier.Representation;
import classesMetier.Spectacle;
import classesMetier.User;
import javax.swing.JOptionPane;
import nezdames.serialisation.NezDamesSerialisation;
import javax.swing.JFrame;
import static nezdames.serialisation.NezDamesSerialisation.lesRepresentations;

/**
 *
 * @author johary
 */
public class ContratTravailModifier extends javax.swing.JFrame {

    /**
     * Creates new form ContratTravailModifier
     */
        int i=0;
    public void VoirContrat(int i){
     
        ContratTravail unContrat = NezDamesSerialisation.lesContrat.get(i);
        
        
        
        txtNbHeure.setText(String.valueOf(unContrat.getNombreHeures()));
        txtDebut.setText(String.valueOf(unContrat.getDebut()));
        txtHeure.setText(String.valueOf(unContrat.getHeures()));
        txtNbHeure.setText(String.valueOf(unContrat.getNombreHeures()));
        txtDateCrea.setText(String.valueOf(unContrat.getDateCrea()));
                
    }
    public ContratTravailModifier() {
        initComponents();
        
        //pour que toute l'application ne se ferme pas quand on clique sur la croix rouge
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRole = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNbHeure = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtIntermittent = new javax.swing.JTextField();
        txtDebut = new javax.swing.JTextField();
        txtHeure = new javax.swing.JTextField();
        txtDateCrea = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblImageManu = new javax.swing.JLabel();
        lblImageOlivier = new javax.swing.JLabel();
        lblTitre2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Intermitent");

        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Role");

        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Nombres d'heures");

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setText("Annuler");

        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Date Début");

        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Heure");

        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Date création");

        lblImageManu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitManu.png"))); // NOI18N

        lblImageOlivier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/portraitOlivier.png"))); // NOI18N

        lblTitre2.setFont(new java.awt.Font("Hannotate SC", 1, 18)); // NOI18N
        lblTitre2.setForeground(new java.awt.Color(255, 153, 51));
        lblTitre2.setText("CRÉATION D'UN CONTRAT DE TRAVAIL ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIntermittent, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                .addComponent(txtRole)
                                .addComponent(txtDebut, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNbHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDateCrea, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(143, 143, 143)
                        .addComponent(jButton2)))
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblImageManu)
                .addGap(18, 18, 18)
                .addComponent(lblTitre2)
                .addGap(18, 18, 18)
                .addComponent(lblImageOlivier)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImageManu)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblTitre2))
                    .addComponent(lblImageOlivier, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIntermittent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDebut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNbHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDateCrea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    ContratTravail unContrat = NezDamesSerialisation.lesContrat.get(i);
    String valeur1,valeur2,valeur3,valeur4,valeur5;
    valeur1 = txtNbHeure.getText();
    valeur2 = txtDebut.getText();
    valeur3 = txtHeure.getText();
    valeur4 = txtNbHeure.getText();
    valeur5 = txtDateCrea.getText();
            if (txtRole.getText().compareTo("") == 0) 
        {
            JOptionPane.showMessageDialog(null, "Il faut saisir le role");
        } else {
            if (txtDebut.getText().compareTo("") == 0) 
            {
                JOptionPane.showMessageDialog(null, "Il faut saisir la date de debut");
            } else {
                if (txtHeure.getText().compareTo("") == 0) 
                {
                    JOptionPane.showMessageDialog(null, "Il faut saisir l'heure ");
                } else {
                    if (txtNbHeure.getText().compareTo("") == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Il faut saisir le nombre d'heure");
                    } else {
                         
                                if (txtDateCrea.getText().compareTo("") == 0) 
                                {
                                    JOptionPane.showMessageDialog(null, "Il faut saisir la date de création");
                                } else {
    unContrat.modifier(txtRole.getText(), txtDebut.getText(), Integer.parseInt(txtHeure.getText()), Integer.parseInt(txtNbHeure.getText()), txtDateCrea.getText());
    JOptionPane.showMessageDialog(null, "Contrat de travail modifié.");
                                this.dispose();}}}}}
       /* if (txtRole.getText().compareTo("") == 0) 
        {
            JOptionPane.showMessageDialog(null, "Il faut saisir le role");
        } else {
            if (txtDebut.getText().compareTo("") == 0) 
            {
                JOptionPane.showMessageDialog(null, "Il faut saisir la date de debut");
            } else {
                if (txtHeure.getText().compareTo("") == 0) 
                {
                    JOptionPane.showMessageDialog(null, "Il faut saisir l'heure ");
                } else {
                    if (txtNbHeure.getText().compareTo("") == 0) 
                    {
                        JOptionPane.showMessageDialog(null, "Il faut saisir le nombre d'heure");
                    } else {
                         
                                if (txtDateCrea.getText().compareTo("") == 0) 
                                {
                                    JOptionPane.showMessageDialog(null, "Il faut saisir la date de création");
                                } else {
        NezDamesSerialisation.lesContrat.modifier(txtRole.getText(), txtDebut.getText(), Integer.parseInt(txtHeure.getText()), Integer.parseInt(txtNbHeure.getText()), txtDateCrea.getText());
        JOptionPane.showMessageDialog(null, "Contrat de cession modifié.");}}}}}    */         
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ContratTravailModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratTravailModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratTravailModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratTravailModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContratTravailModifier().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImageManu;
    private javax.swing.JLabel lblImageOlivier;
    private javax.swing.JLabel lblTitre2;
    private javax.swing.JTextField txtDateCrea;
    private javax.swing.JTextField txtDebut;
    private javax.swing.JTextField txtHeure;
    private javax.swing.JTextField txtIntermittent;
    private javax.swing.JTextField txtNbHeure;
    private javax.swing.JTextField txtRole;
    // End of variables declaration//GEN-END:variables
}
