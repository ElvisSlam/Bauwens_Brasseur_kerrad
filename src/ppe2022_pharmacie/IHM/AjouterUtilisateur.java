/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppe2022_pharmacie.IHM;

import ppe2022_pharmacie.Metiers.Utilisateur;
import ppe2022_pharmacie.Metiers.Service;
import java.security.MessageDigest;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import jakarta.xml.bind.DatatypeConverter;
import ppe2022_pharmacie.DAOClass.*;

/**
 *
 * @author hbana
 */
public class AjouterUtilisateur extends javax.swing.JFrame {

    private static final UtilisateurDAO passerelleUser = new UtilisateurDAO();
    private static final ServiceDAO passerelleService = new ServiceDAO();
    private AfficherLesUsers frameuser;

    /**
     * Creates new form AjouterUtilisateur
     */
    public AjouterUtilisateur() {

        this.setResizable(false);
        initComponents();
        btnModifier.setVisible(false);
        lblId.setVisible(false);
        lblOutputID.setVisible(false);
        passerelleUser.Connection();

        for (Service s : passerelleService.findAll()) {
            cbxService.addItem(s.getLibelle());
        }
    }

    public AjouterUtilisateur(Utilisateur unUser) {

        this.setResizable(false);
        initComponents();
        btnValider.setVisible(false);
        lblOutputID.setText(String.valueOf(unUser.getIdUser()));
        passerelleUser.Connection();
        txtLogin.setText(unUser.getLogin());

        for (Service s : passerelleService.findAll()) {
            cbxService.addItem(s.getLibelle());
        }

        cbxService.setSelectedItem(unUser.getService());
    }

    public AjouterUtilisateur(Utilisateur unUser, AfficherLesUsers frameuser) {

        this.setResizable(false);
        initComponents();
        this.frameuser = frameuser;
        btnValider.setVisible(false);
        lblOutputID.setText(String.valueOf(unUser.getIdUser()));
        passerelleUser.Connection();
        txtLogin.setText(unUser.getLogin());

        for (Service s : passerelleService.findAll()) {
            cbxService.addItem(s.getLibelle());
        }

        cbxService.setSelectedItem(unUser.getService());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        lblPasse = new javax.swing.JLabel();
        lblMdp = new javax.swing.JLabel();
        lblService = new javax.swing.JLabel();
        cbxService = new javax.swing.JComboBox<>();
        txtLogin = new javax.swing.JTextField();
        btnValider = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        pwdPasse = new javax.swing.JPasswordField();
        lblId = new javax.swing.JLabel();
        lblOutputID = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPasse.setText("Login");

        lblMdp.setText("Mot de passe");

        lblService.setText("Service");

        txtLogin.setText("Login");

        btnValider.setText("Valider");
        btnValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValiderMouseClicked(evt);
            }
        });
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });

        jButton2.setText("Annuler");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        btnModifier.setText("Modifier");
        btnModifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifierMouseClicked(evt);
            }
        });

        pwdPasse.setText("jPasswordField1");

        lblId.setText("id Utilisateur");

        lblOutputID.setText(".");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPasse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMdp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblService, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnValider, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModifier)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwdPasse, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(txtLogin)
                            .addComponent(cbxService, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOutputID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblOutputID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdPasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblService, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier)
                    .addComponent(btnValider))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnValiderActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValiderMouseClicked
        String login = txtLogin.getText();
        String passe = "";
        char[] passeChar = pwdPasse.getPassword();
        for (char unChar : passeChar) {
            passe += unChar;
        }
        String hash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte raw[] = md.digest(passe.getBytes("UTF-8"));
            hash = DatatypeConverter.printHexBinary(raw);
            System.out.println(hash);

            String service = (String) cbxService.getSelectedItem();
            int idService = passerelleService.getIdService(service);

            Utilisateur unUser
                    = new Utilisateur(login, new Service(idService, service), 2, hash);

            passerelleUser.create(unUser);
            JOptionPane.showMessageDialog(null, "Utilisateur créé");
            dispose();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnValiderMouseClicked

    private void btnModifierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifierMouseClicked
        String login = txtLogin.getText();
        String passe = "";
        char[] passeChar = pwdPasse.getPassword();
        for (char unChar : passeChar) {
            passe += unChar;
        }
        int idUser = Integer.parseInt(lblOutputID.getText());
        String service = (String) cbxService.getSelectedItem();
        String hash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte raw[] = md.digest(passe.getBytes("UTF-8"));
            hash = DatatypeConverter.printHexBinary(raw);
        } catch (Exception e) {
            System.out.println(e);
        }

        int idService = passerelleService.getIdService(service);

        Utilisateur unUser
                = new Utilisateur(login,
                        new Service(idService, service), idUser, hash);

        passerelleUser.update(unUser);
        DefaultListModel listModel = new DefaultListModel();
        for (Utilisateur u : passerelleUser.findAll()) {
            listModel.addElement(u);
        }

        JOptionPane.showMessageDialog(null, "Utilisateur Modifié");
        dispose();

    }//GEN-LAST:event_btnModifierMouseClicked

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
            java.util.logging.Logger.getLogger(AjouterUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjouterUtilisateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnValider;
    private javax.swing.JComboBox<String> cbxService;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblMdp;
    private javax.swing.JLabel lblOutputID;
    private javax.swing.JLabel lblPasse;
    private javax.swing.JLabel lblService;
    private javax.swing.JPasswordField pwdPasse;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
