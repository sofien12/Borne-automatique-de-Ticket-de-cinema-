package film;
import AppPackage.AnimationClass;
import java.awt.Color;
public class JFilm extends javax.swing.JFrame {
  AnimationClass ac=new AnimationClass();
    public JFilm() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setSize(720, 700);
      ac.jLabelYUp(700, 30, 16, 2, Cinema);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Cinema = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CinemaTography");

        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Footlight MT Light", 2, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Commancer");
        jButton2.setAutoscrolls(true);
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, null, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jButton2.setFocusPainted(false);
        jButton2.setHideActionText(true);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
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
        jPanel1.add(jButton2);
        jButton2.setBounds(250, 560, 230, 60);

        Cinema.setFont(new java.awt.Font("Footlight MT Light", 2, 48)); // NOI18N
        Cinema.setForeground(new java.awt.Color(255, 255, 255));
        Cinema.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Cinema.setText("Cinematography");
        Cinema.setFocusable(false);
        Cinema.setInheritsPopupMenu(false);
        Cinema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CinemaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CinemaMouseExited(evt);
            }
        });
        jPanel1.add(Cinema);
        Cinema.setBounds(180, 700, 350, 100);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/ba1aca2fc80472c003991e01b43e7d18.gif"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 720, 740);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(Color.GRAY);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(Color.BLACK);
    }//GEN-LAST:event_jButton2MouseExited

    private void CinemaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinemaMouseExited
    }//GEN-LAST:event_CinemaMouseExited

    private void CinemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CinemaMouseEntered
        
    }//GEN-LAST:event_CinemaMouseEntered

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
            
        salle s=new salle();
            s.hide();
            s.show();
            this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cinema;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
