
package film;

import javax.swing.ImageIcon;
import AppPackage.AnimationClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;


public class Paiment extends javax.swing.JFrame {
AnimationClass ac=new AnimationClass();
int t=0;
int D10=0;
int Dt=0;
AudioPlayer ap=AudioPlayer.player;
    AudioStream as;
    AudioData ad;
    ContinuousAudioDataStream loop=null;
    public Paiment(ImageIcon img,String P,String D,String H,String N) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       this.setResizable(false);
       IMG1.setIcon(img);
       Prix1.setText(P);
       Date1.setText(D);
       Heure1.setText(H);
      ac.jLabelYUp(520, 280, 25, 2, Quest1);
       argent.setVisible(false);
       Merci.setVisible(false);
       tckN.setText(N);
       tckDt.setText(D);
       tckH.setText(H);
       tckP.setText(P);
       ticket.setVisible(false);
       Dt3.setVisible(false);
       Dt2.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tickFilm = new javax.swing.JPanel();
        IMG = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prix = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Heure = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        Quest = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Date = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        Ecran = new javax.swing.JPanel();
        tickFilm1 = new javax.swing.JPanel();
        IMG1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Prix1 = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Heure1 = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        Quest1 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Date1 = new javax.swing.JTextPane();
        oui2 = new javax.swing.JButton();
        oui3 = new javax.swing.JButton();
        Merci = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        argent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Dt10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Dt5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Dt2 = new javax.swing.JLabel();
        Dt3 = new javax.swing.JLabel();
        Dt1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ticket = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tckN = new javax.swing.JLabel();
        tckD = new javax.swing.JLabel();
        tckDt = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tckP = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tckH = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        tickFilm.setBackground(new java.awt.Color(204, 204, 204));
        tickFilm.setLayout(null);
        tickFilm.add(IMG);
        IMG.setBounds(127, 12, 190, 201);

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Prix :");
        tickFilm.add(jLabel5);
        jLabel5.setBounds(85, 254, 64, 23);

        Prix.setEditable(false);
        Prix.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        jScrollPane2.setViewportView(Prix);

        tickFilm.add(jScrollPane2);
        jScrollPane2.setBounds(186, 242, 156, 44);

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date :");
        tickFilm.add(jLabel6);
        jLabel6.setBounds(85, 331, 64, 23);

        Heure.setEditable(false);
        Heure.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        jScrollPane3.setViewportView(Heure);

        tickFilm.add(jScrollPane3);
        jScrollPane3.setBounds(186, 392, 156, 45);

        jLabel8.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Heure :");
        tickFilm.add(jLabel8);
        jLabel8.setBounds(85, 402, 89, 23);

        Quest.setFont(new java.awt.Font("Footlight MT Light", 2, 36)); // NOI18N
        Quest.setForeground(new java.awt.Color(0, 0, 0));
        Quest.setText("Voulez-vous achete le film !!!!");
        Quest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                QuestMouseEntered(evt);
            }
        });
        tickFilm.add(Quest);
        Quest.setBounds(10, 520, 470, 50);

        Date.setEditable(false);
        Date.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        jScrollPane4.setViewportView(Date);

        tickFilm.add(jScrollPane4);
        jScrollPane4.setBounds(186, 320, 156, 45);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("paiement");

        jPanel1.setLayout(null);

        Ecran.setBackground(new java.awt.Color(153, 153, 153));
        Ecran.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        Ecran.setForeground(new java.awt.Color(204, 204, 204));

        tickFilm1.setBackground(new java.awt.Color(204, 204, 204));
        tickFilm1.setLayout(null);
        tickFilm1.add(IMG1);
        IMG1.setBounds(140, 20, 190, 190);

        jLabel7.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Prix :");
        tickFilm1.add(jLabel7);
        jLabel7.setBounds(85, 254, 64, 23);

        Prix1.setEditable(false);
        Prix1.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        jScrollPane5.setViewportView(Prix1);

        tickFilm1.add(jScrollPane5);
        jScrollPane5.setBounds(186, 242, 156, 44);

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Date :");
        tickFilm1.add(jLabel9);
        jLabel9.setBounds(85, 331, 64, 23);

        Heure1.setEditable(false);
        Heure1.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        jScrollPane6.setViewportView(Heure1);

        tickFilm1.add(jScrollPane6);
        jScrollPane6.setBounds(186, 392, 156, 45);

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Heure :");
        tickFilm1.add(jLabel10);
        jLabel10.setBounds(85, 402, 89, 23);

        Quest1.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        Quest1.setForeground(new java.awt.Color(0, 0, 0));
        Quest1.setText("       Voulez-vous achete un ticket !!!!");
        Quest1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Quest1MouseEntered(evt);
            }
        });
        tickFilm1.add(Quest1);
        Quest1.setBounds(0, 520, 490, 50);

        Date1.setEditable(false);
        Date1.setFont(new java.awt.Font("Footlight MT Light", 2, 20)); // NOI18N
        jScrollPane7.setViewportView(Date1);

        tickFilm1.add(jScrollPane7);
        jScrollPane7.setBounds(186, 320, 156, 45);

        oui2.setBackground(new java.awt.Color(102, 102, 102));
        oui2.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        oui2.setForeground(new java.awt.Color(255, 255, 255));
        oui2.setText("oui");
        oui2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(102, 102, 102), java.awt.Color.lightGray, java.awt.Color.lightGray));
        oui2.setFocusPainted(false);
        oui2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oui2ActionPerformed(evt);
            }
        });
        tickFilm1.add(oui2);
        oui2.setBounds(0, 70, 94, 50);

        oui3.setBackground(new java.awt.Color(102, 102, 102));
        oui3.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        oui3.setForeground(new java.awt.Color(255, 255, 255));
        oui3.setText("Non");
        oui3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(102, 102, 102), java.awt.Color.lightGray, java.awt.Color.lightGray));
        oui3.setFocusPainted(false);
        oui3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oui3ActionPerformed(evt);
            }
        });
        tickFilm1.add(oui3);
        oui3.setBounds(350, 70, 94, 50);

        Merci.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("bonne regarder le film ");
        Merci.add(jLabel4);
        jLabel4.setBounds(30, 500, 350, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/giphy.gif"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        Merci.add(jLabel3);
        jLabel3.setBounds(0, 0, 460, 540);

        javax.swing.GroupLayout EcranLayout = new javax.swing.GroupLayout(Ecran);
        Ecran.setLayout(EcranLayout);
        EcranLayout.setHorizontalGroup(
            EcranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EcranLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Merci, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(EcranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EcranLayout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(tickFilm1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        EcranLayout.setVerticalGroup(
            EcranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EcranLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Merci, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(EcranLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EcranLayout.createSequentialGroup()
                    .addContainerGap(52, Short.MAX_VALUE)
                    .addComponent(tickFilm1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        jPanel1.add(Ecran);
        Ecran.setBounds(340, 0, 530, 640);

        argent.setBackground(new java.awt.Color(204, 204, 204));
        argent.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("L'argent :");
        argent.add(jLabel2);
        jLabel2.setBounds(10, 40, 120, 30);

        Dt10.setFont(new java.awt.Font("Footlight MT Light", 2, 14)); // NOI18N
        Dt10.setForeground(new java.awt.Color(0, 0, 0));
        Dt10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/billet-10dt-chebbi-1.jpg"))); // NOI18N
        Dt10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dt10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Dt10MouseEntered(evt);
            }
        });
        argent.add(Dt10);
        Dt10.setBounds(20, 340, 260, 110);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(null);
        argent.add(jPanel4);
        jPanel4.setBounds(10, 100, 280, 40);

        Dt5.setFont(new java.awt.Font("Baskerville Old Face", 2, 14)); // NOI18N
        Dt5.setForeground(new java.awt.Color(0, 0, 0));
        Dt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/rsz_5dinar.jpg"))); // NOI18N
        Dt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dt5MouseClicked(evt);
            }
        });
        argent.add(Dt5);
        Dt5.setBounds(170, 480, 40, 30);

        jLabel19.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Le reste d'argent : ");
        argent.add(jLabel19);
        jLabel19.setBounds(10, 210, 210, 50);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
        });

        Dt2.setFont(new java.awt.Font("Footlight MT Light", 2, 18)); // NOI18N
        Dt2.setForeground(new java.awt.Color(255, 255, 255));
        Dt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/rsz_2dinar.jpg"))); // NOI18N

        Dt3.setFont(new java.awt.Font("Footlight MT Light", 2, 18)); // NOI18N
        Dt3.setForeground(new java.awt.Color(255, 255, 255));
        Dt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/rsz_2dinar.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Dt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Dt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        argent.add(jPanel5);
        jPanel5.setBounds(20, 270, 280, 40);

        Dt1.setFont(new java.awt.Font("Eras Medium ITC", 2, 18)); // NOI18N
        Dt1.setForeground(new java.awt.Color(0, 0, 0));
        Dt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/rsz_dinar.jpg"))); // NOI18N
        Dt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dt1MouseClicked(evt);
            }
        });
        argent.add(Dt1);
        Dt1.setBounds(60, 490, 40, 40);

        jPanel1.add(argent);
        argent.setBounds(880, 40, 310, 560);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ticket :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 20, 110, 60);

        ticket.setBackground(new java.awt.Color(255, 255, 255));
        ticket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ticketMouseEntered(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Franklin Gothic Demi", 2, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("    ticket");

        jLabel13.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Nom de Film :");

        tckN.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        tckN.setForeground(new java.awt.Color(0, 0, 0));

        tckD.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        tckD.setForeground(new java.awt.Color(0, 0, 0));
        tckD.setText("Date :");

        tckDt.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        tckDt.setForeground(new java.awt.Color(0, 0, 0));
        tckDt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Prix :");

        tckP.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        tckP.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText(" Heure :");

        tckH.setFont(new java.awt.Font("Felix Titling", 2, 18)); // NOI18N
        tckH.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ticketLayout = new javax.swing.GroupLayout(ticket);
        ticket.setLayout(ticketLayout);
        ticketLayout.setHorizontalGroup(
            ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketLayout.createSequentialGroup()
                .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ticketLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tckP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ticketLayout.createSequentialGroup()
                        .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ticketLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ticketLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ticketLayout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tckH, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ticketLayout.createSequentialGroup()
                                        .addComponent(tckD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tckDt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ticketLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tckN, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(ticketLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ticketLayout.setVerticalGroup(
            ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(19, 19, 19)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tckN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ticketLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(tckD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ticketLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(tckDt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tckH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tckP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2.add(ticket);
        ticket.setBounds(20, 130, 290, 50);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 100, 310, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 40, 330, 520);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/maxresdefault.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1220, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QuestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuestMouseEntered

    }//GEN-LAST:event_QuestMouseEntered

    private void Quest1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Quest1MouseEntered

    }//GEN-LAST:event_Quest1MouseEntered

    private void oui2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oui2ActionPerformed
            argent.setVisible(true);
                  Merci.setVisible(true);
                  tickFilm1.setVisible(false);
            
                 ac.jLabelYUp(500, 200, 25, 2, jLabel4);

    }//GEN-LAST:event_oui2ActionPerformed

    private void oui3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oui3ActionPerformed
            JFilm j=new JFilm();
            j.hide();
            j.show();
            this.setVisible(false);
    }//GEN-LAST:event_oui3ActionPerformed

    private void ticketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketMouseClicked

    }//GEN-LAST:event_ticketMouseClicked

    private void ticketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketMouseEntered
        
              if (t==0)
            {
                 try{
               // as=new AudioStream(new FileInputStream("C:\\Users\\sofien trabelsi\\Desktop\\sofien1.wav"));
                 //   ad=as.getData();
                   // loop=new ContinuousAudioDataStream(ad);
            //ap.start(loop);
            ticket.setSize(290, 100);
                t=1;
            }catch(Exception e)
            {
                
            }
                
            }
            else
            if (t==1)
            {
                //ap.stop(loop);
                ticket.setSize(290, 200);
                t=2;
            }
            else
            if (t==2)
            {
                ticket.setSize(290, 300);
                t=3;
            }
            else
            if (t == 3)
            {
                ticket.setSize(290, 400);
                t= 4;

            }
            else if (t == 4)
            {
                JFilm j=new JFilm();
                this.setVisible (false);
                t=-1;
            }
        
       

    }//GEN-LAST:event_ticketMouseEntered

    private void Dt10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dt10MouseClicked
        // TODO add your handling code here:
        
             try {
                         ac.jLabelYUp(340, 120, 16,4, Dt10);
                          
                    //as=new AudioStream(new FileInputStream("C:\\Users\\sofien trabelsi\\Desktop\\untitled.wav"));
                    //ad=as.getData();
                    //loop=new ContinuousAudioDataStream(ad);
                    //ap.start(loop);
                     D10++;
                    if (Prix1.getText().equals("10Dt") && D10 == 1)
                         {
                  ticket.setVisible(true);
                        }  
             
          }catch(Exception e)
          {
              
          }
                
        
    }//GEN-LAST:event_Dt10MouseClicked

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
            if (Prix1.getText().equals("6Dt") && D10 == 1)
            {
                Dt2.setVisible(true);
                Dt3.setVisible(true);
                ticket.setVisible(true);
            }
    }//GEN-LAST:event_jPanel5MouseEntered

    private void Dt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dt1MouseClicked
        // TODO add your handling code here:
          try {
                      ac.jLabelYUp(490, 100, 16,5, Dt1);
                   // as=new AudioStream(new FileInputStream("C:\\Users\\sofien trabelsi\\Desktop\\untitled.wav"));
                    //ad=as.getData();
                    //loop=new ContinuousAudioDataStream(ad);
                    //ap.start(loop);
                       
              Dt++;
             
              if (Dt == 2  )
              {
                  ticket.setVisible(true);
              }
          }catch(Exception e)
          {
              
          }
              
               
              

    }//GEN-LAST:event_Dt1MouseClicked

    private void Dt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dt5MouseClicked
        // TODO add your handling code here:
              try {
                     ac.jLabelYUp(480, 100, 16,4, Dt5);
                    //as=new AudioStream(new FileInputStream("C:\\Users\\sofien trabelsi\\Desktop\\untitled.wav"));
                    //ad=as.getData();
                    //loop=new ContinuousAudioDataStream(ad);
                    //ap.start(loop);
                       
              Dt++;
             
              if (Dt == 2 || D10 == 1 )
              {
                  ticket.setVisible(true);
              }
          }catch(Exception e)
          {
              
          }
    }//GEN-LAST:event_Dt5MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        //ap.stop(loop);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void Dt10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dt10MouseEntered
        // TODO add your handling code here:
        if (D10 == 1)
        {
            Dt10.setSize(260,0);
           //ap.stop(loop);
        }
    }//GEN-LAST:event_Dt10MouseEntered

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Date;
    private javax.swing.JTextPane Date1;
    private javax.swing.JLabel Dt1;
    private javax.swing.JLabel Dt10;
    private javax.swing.JLabel Dt2;
    private javax.swing.JLabel Dt3;
    private javax.swing.JLabel Dt5;
    private javax.swing.JPanel Ecran;
    private javax.swing.JTextPane Heure;
    private javax.swing.JTextPane Heure1;
    private javax.swing.JLabel IMG;
    private javax.swing.JLabel IMG1;
    private javax.swing.JPanel Merci;
    private javax.swing.JTextPane Prix;
    private javax.swing.JTextPane Prix1;
    private javax.swing.JLabel Quest;
    private javax.swing.JLabel Quest1;
    private javax.swing.JPanel argent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JButton oui2;
    private javax.swing.JButton oui3;
    private javax.swing.JLabel tckD;
    private javax.swing.JLabel tckDt;
    private javax.swing.JLabel tckH;
    private javax.swing.JLabel tckN;
    private javax.swing.JLabel tckP;
    private javax.swing.JPanel tickFilm;
    private javax.swing.JPanel tickFilm1;
    private javax.swing.JPanel ticket;
    // End of variables declaration//GEN-END:variables
}
