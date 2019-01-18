
package film;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Atfilm extends javax.swing.JFrame {



    public Atfilm(ImageIcon im, String P,String D,String H,String N) 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       this.setResizable(false);
      IMG.setIcon(im);
      Pr.setText(P);
      Dr.setText(D);
      Hr.setText(H);
      Nm.setText(N);
      IMG.setVisible(false);
      Pr.setVisible(false);
      Dr.setVisible(false);
      Hr.setVisible(false);
      Nm.setVisible(false);
       
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ques = new javax.swing.JLabel();
        Carte = new javax.swing.JLabel();
        Pia = new javax.swing.JLabel();
        IMG = new javax.swing.JLabel();
        Pr = new javax.swing.JLabel();
        Dr = new javax.swing.JLabel();
        Hr = new javax.swing.JLabel();
        Nm = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Achete le ticket ");

        jPanel1.setLayout(null);

        Ques.setFont(new java.awt.Font("Footlight MT Light", 2, 36)); // NOI18N
        Ques.setForeground(new java.awt.Color(0, 0, 0));
        Ques.setText("comment  acheter un  ticket ????");
        jPanel1.add(Ques);
        Ques.setBounds(220, 120, 500, 70);

        Carte.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        Carte.setForeground(new java.awt.Color(0, 0, 0));
        Carte.setText("Carte bancaire ");
        Carte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CarteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CarteMouseExited(evt);
            }
        });
        jPanel1.add(Carte);
        Carte.setBounds(260, 190, 170, 50);

        Pia.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        Pia.setForeground(new java.awt.Color(0, 0, 0));
        Pia.setText("paiement ");
        Pia.setToolTipText("");
        Pia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PiaMouseExited(evt);
            }
        });
        jPanel1.add(Pia);
        Pia.setBounds(270, 250, 120, 40);
        jPanel1.add(IMG);
        IMG.setBounds(750, 310, 0, 50);
        jPanel1.add(Pr);
        Pr.setBounds(740, 420, 20, 0);
        jPanel1.add(Dr);
        Dr.setBounds(870, 430, 0, 0);
        jPanel1.add(Hr);
        Hr.setBounds(750, 470, 0, 0);
        jPanel1.add(Nm);
        Nm.setBounds(880, 520, 0, 0);

        Retour.setBackground(new java.awt.Color(51, 51, 51));
        Retour.setFont(new java.awt.Font("Footlight MT Light", 2, 36)); // NOI18N
        Retour.setForeground(new java.awt.Color(255, 255, 255));
        Retour.setText("Retour");
        Retour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Retour.setContentAreaFilled(false);
        Retour.setFocusPainted(false);
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        jPanel1.add(Retour);
        Retour.setBounds(750, 490, 140, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/maxresdefault.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 980, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CarteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarteMouseClicked
            Dis d=new Dis((ImageIcon) IMG.getIcon(),  Pr.getText(),Dr.getText(), Hr.getText(), Nm.getText());
             d.hide();
            d.show();
            this.setVisible(false);
    }//GEN-LAST:event_CarteMouseClicked

    private void CarteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarteMouseEntered
                Carte.setForeground(Color.red);
    }//GEN-LAST:event_CarteMouseEntered

    private void CarteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarteMouseExited
                Carte.setForeground(Color.black);

    }//GEN-LAST:event_CarteMouseExited

    private void PiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiaMouseClicked
        // TODO add your handling code here:
        Paiment d=new Paiment((ImageIcon) IMG.getIcon(),  Pr.getText(),Dr.getText(), Hr.getText(), Nm.getText());
             d.hide();
            d.show();
            this.setVisible(false);
    }//GEN-LAST:event_PiaMouseClicked

    private void PiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiaMouseEntered
        // TODO add your handling code here:
                        Pia.setForeground(Color.red);

    }//GEN-LAST:event_PiaMouseEntered

    private void PiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PiaMouseExited
        // TODO add your handling code here:
                                Pia.setForeground(Color.black);

    }//GEN-LAST:event_PiaMouseExited

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        Roi r=new Roi();
        r.hide();
        r.show();
        this.setVisible(false);
    }//GEN-LAST:event_RetourActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carte;
    private javax.swing.JLabel Dr;
    private javax.swing.JLabel Hr;
    private javax.swing.JLabel IMG;
    private javax.swing.JLabel Nm;
    private javax.swing.JLabel Pia;
    private javax.swing.JLabel Pr;
    private javax.swing.JLabel Ques;
    private javax.swing.JButton Retour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
