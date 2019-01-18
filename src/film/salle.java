

package film;

import java.awt.Color;

public class salle extends javax.swing.JFrame {

    public salle() {
        initComponents();
         this.setVisible(true);
        this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setSize(1759, 879);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Cin = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salle de Cinema");

        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);

        Cin.setBackground(new java.awt.Color(255, 0, 0));
        Cin.setFont(new java.awt.Font("Footlight MT Light", 2, 36)); // NOI18N
        Cin.setForeground(new java.awt.Color(255, 255, 255));
        Cin.setText("Cinema de theatre le Roi");
        Cin.setToolTipText("Cinema de theatre le Roi");
        Cin.setFocusPainted(false);
        Cin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CinMouseExited(evt);
            }
        });
        Cin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CinActionPerformed(evt);
            }
        });
        jPanel2.add(Cin);
        Cin.setBounds(600, 240, 710, 90);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Footlight MT Light", 2, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cinema ABC");
        jButton2.setToolTipText("Cinema ABC");
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(610, 470, 710, 90);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Footlight MT Light", 2, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cinema de la Colisée");
        jButton3.setToolTipText("Cinema de la Colisée");
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(610, 670, 710, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/salle-cinema.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1860, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1748, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinMouseEntered
            Cin.setBackground(Color.BLACK);
    }//GEN-LAST:event_CinMouseEntered

    private void CinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinMouseExited
            Cin.setBackground(Color.red);
    }//GEN-LAST:event_CinMouseExited

    private void CinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinMouseClicked
       
    }//GEN-LAST:event_CinMouseClicked

    private void CinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CinActionPerformed
         Roi r=new Roi();
        r.hide();
       r.show();
       this.setVisible(false);
    }//GEN-LAST:event_CinActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
                    jButton2.setBackground(Color.BLACK);

    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
         jButton2.setBackground(Color.red);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Roi r=new Roi();
        r.hide();
       r.show();
       this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
     Roi r=new Roi();
        r.hide();
       r.show();
       this.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
                            jButton3.setBackground(Color.BLACK);

    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
                                        jButton3.setBackground(Color.red);

    }//GEN-LAST:event_jButton3MouseExited

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cin;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
