
package film;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TraiterFilm extends javax.swing.JFrame {

    
    public TraiterFilm(String  a,ImageIcon b, String ch, String date ,String prx, String heur) 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       this.setResizable(false);
       this.setSize(1045, 750);
       text.setText(ch);
       Name.setText(a);
       Image.setIcon(b);
       Date.setText(date);
       heure.setText(heur);
       Prix.setText(prx);
               

       
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        Achete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextPane();
        Date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        heure = new javax.swing.JTextField();
        Prix = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("traiter Film");

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);
        jPanel1.add(Image);
        Image.setBounds(93, 185, 198, 263);

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
        Retour.setBounds(558, 651, 140, 50);

        Achete.setBackground(new java.awt.Color(0, 0, 0));
        Achete.setFont(new java.awt.Font("Footlight MT Light", 2, 36)); // NOI18N
        Achete.setForeground(new java.awt.Color(255, 255, 255));
        Achete.setText("achèter un ticket");
        Achete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        Achete.setContentAreaFilled(false);
        Achete.setFocusPainted(false);
        Achete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcheteActionPerformed(evt);
            }
        });
        jPanel1.add(Achete);
        Achete.setBounds(709, 651, 280, 50);

        text.setEditable(false);
        text.setBackground(new java.awt.Color(204, 204, 204));
        text.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        text.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        text.setForeground(new java.awt.Color(0, 0, 0));
        text.setAutoscrolls(false);
        text.setCaretColor(new java.awt.Color(102, 255, 255));
        jScrollPane1.setViewportView(text);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(303, 191, 388, 178);

        Date.setEditable(false);
        Date.setBackground(new java.awt.Color(204, 204, 204));
        Date.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        Date.setForeground(new java.awt.Color(0, 0, 0));
        Date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Date.setCaretColor(new java.awt.Color(0, 0, 0));
        Date.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Date.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Date.setSelectionColor(new java.awt.Color(255, 255, 255));
        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
            }
        });
        jPanel1.add(Date);
        Date.setBounds(448, 390, 243, 38);

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(360, 396, 67, 23);

        jLabel2.setBackground(new java.awt.Color(102, 255, 255));
        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Heure :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(360, 443, 85, 23);

        jLabel3.setBackground(new java.awt.Color(102, 255, 255));
        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prix :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(360, 487, 70, 23);

        heure.setEditable(false);
        heure.setBackground(new java.awt.Color(204, 204, 204));
        heure.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        heure.setForeground(new java.awt.Color(0, 0, 0));
        heure.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        heure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heureActionPerformed(evt);
            }
        });
        jPanel1.add(heure);
        heure.setBounds(448, 436, 171, 40);

        Prix.setEditable(false);
        Prix.setBackground(new java.awt.Color(204, 204, 204));
        Prix.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        Prix.setForeground(new java.awt.Color(0, 0, 0));
        Prix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Prix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrixActionPerformed(evt);
            }
        });
        jPanel1.add(Prix);
        Prix.setBounds(448, 482, 127, 36);

        Name.setEditable(false);
        Name.setBackground(new java.awt.Color(204, 204, 204));
        Name.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 0));
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Name.setToolTipText("");
        jPanel1.add(Name);
        Name.setBounds(93, 485, 198, 51);

        jLabel4.setBackground(new java.awt.Color(102, 255, 255));
        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Description:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(303, 135, 133, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/salle-cinema.jpg"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-330, 0, 1370, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrixActionPerformed

    private void heureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heureActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void AcheteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcheteActionPerformed
        Atfilm q = new Atfilm ((ImageIcon)Image.getIcon() , Prix.getText() ,Date.getText(),heure.getText(),Name.getText());
        q.hide();
        q.show();
        this.setVisible(false);

    }//GEN-LAST:event_AcheteActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        Roi r=new Roi();
        r.hide();
        r.show();
        this.setVisible(false);
    }//GEN-LAST:event_RetourActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Achete;
    private javax.swing.JTextField Date;
    private javax.swing.JLabel Image;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Prix;
    private javax.swing.JButton Retour;
    private javax.swing.JTextField heure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane text;
    // End of variables declaration//GEN-END:variables
}
