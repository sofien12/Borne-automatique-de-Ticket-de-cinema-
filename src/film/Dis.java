package film;
//import AppPackage.AnimationClass;

import AppPackage.AnimationClass;
import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sun.audio.*;
public class Dis extends javax.swing.JFrame {
AnimationClass ac=new AnimationClass();
    int i=0;
    int m=0;
    int money=0;
    int j=0;
    String ch="";
    String Pass="";
            int t= 0;

    AudioPlayer ap=AudioPlayer.player;
    AudioStream as;
    AudioData ad;
    ContinuousAudioDataStream loop=null;
    public Dis(ImageIcon m,String P,String d,String h,String n) 
    {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       this.setResizable(false);
      bien.setVisible(false);
       IMG.setIcon(m);
       Prix.setText(P);
       Date.setText(d);
       Heure.setText(h);
       tckN.setText(n);
       tckDt.setText(d);
       tckP.setText(P);
       tckH.setText(h);
     ticket.setVisible(false);
               

    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        distributeur = new javax.swing.JPanel();
        Ecran = new javax.swing.JPanel();
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
        PanelBQ = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        NC = new javax.swing.JTextPane();
        flous = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        bienvenue = new javax.swing.JPanel();
        bien = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();
        DT6 = new javax.swing.JButton();
        oui2 = new javax.swing.JButton();
        Number = new javax.swing.JPanel();
        B4 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B0 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        Valide = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        Dt15 = new javax.swing.JButton();
        Non2 = new javax.swing.JButton();
        Dt10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CarteTick = new javax.swing.JPanel();
        carte = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BANc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tickets = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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
        jLabel11 = new javax.swing.JLabel();
        tck = new javax.swing.JPanel();

        jLabel7.setText("jLabel7");

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Distributeur");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.setLayout(null);

        distributeur.setBackground(new java.awt.Color(153, 153, 153));
        distributeur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.darkGray));
        distributeur.setForeground(new java.awt.Color(255, 255, 255));
        distributeur.setLayout(null);

        Ecran.setLayout(null);

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
        Quest.setText("Voulez-vous achete un ticket !!!!");
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

        Ecran.add(tickFilm);
        tickFilm.setBounds(0, -1, 490, 540);

        PanelBQ.setBackground(new java.awt.Color(204, 204, 204));
        PanelBQ.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Numero   de carte bancaire :");

        NC.setEditable(false);
        NC.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jScrollPane1.setViewportView(NC);

        javax.swing.GroupLayout PanelBQLayout = new javax.swing.GroupLayout(PanelBQ);
        PanelBQ.setLayout(PanelBQLayout);
        PanelBQLayout.setHorizontalGroup(
            PanelBQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBQLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(PanelBQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        PanelBQLayout.setVerticalGroup(
            PanelBQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBQLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        Ecran.add(PanelBQ);
        PanelBQ.setBounds(0, 0, 490, 540);

        flous.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("6DT =>");

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("10DT =>");

        jLabel10.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("15Dt =>");

        jLabel16.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("        Veuillez entrer de l'argent ");

        javax.swing.GroupLayout flousLayout = new javax.swing.GroupLayout(flous);
        flous.setLayout(flousLayout);
        flousLayout.setHorizontalGroup(
            flousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flousLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(flousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(flousLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(flousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, flousLayout.createSequentialGroup()
                                .addGroup(flousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)))
        );
        flousLayout.setVerticalGroup(
            flousLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flousLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        Ecran.add(flous);
        flous.setBounds(0, 0, 490, 540);

        bienvenue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bienvenueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bienvenueMouseExited(evt);
            }
        });
        bienvenue.setLayout(null);

        bien.setFont(new java.awt.Font("Footlight MT Light", 2, 48)); // NOI18N
        bien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/bienvenue_1.gif"))); // NOI18N
        bien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bienMouseExited(evt);
            }
        });
        bienvenue.add(bien);
        bien.setBounds(-30, 470, 520, 220);

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/giphy.gif"))); // NOI18N
        Image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImageMouseExited(evt);
            }
        });
        bienvenue.add(Image);
        Image.setBounds(0, 0, 490, 540);

        Ecran.add(bienvenue);
        bienvenue.setBounds(0, 0, 490, 540);

        distributeur.add(Ecran);
        Ecran.setBounds(326, 104, 488, 538);

        DT6.setBackground(new java.awt.Color(102, 102, 102));
        DT6.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        DT6.setText("<");
        DT6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        DT6.setContentAreaFilled(false);
        DT6.setFocusPainted(false);
        DT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DT6ActionPerformed(evt);
            }
        });
        distributeur.add(DT6);
        DT6.setBounds(850, 290, 94, 50);

        oui2.setBackground(new java.awt.Color(102, 102, 102));
        oui2.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        oui2.setForeground(new java.awt.Color(255, 255, 255));
        oui2.setText("oui");
        oui2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(102, 102, 102), java.awt.Color.lightGray, java.awt.Color.lightGray));
        oui2.setContentAreaFilled(false);
        oui2.setFocusPainted(false);
        oui2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oui2ActionPerformed(evt);
            }
        });
        distributeur.add(oui2);
        oui2.setBounds(190, 150, 94, 50);

        Number.setBackground(new java.awt.Color(204, 204, 204));
        Number.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.darkGray, java.awt.Color.gray, java.awt.Color.darkGray));

        B4.setBackground(new java.awt.Color(102, 102, 102));
        B4.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B4.setForeground(new java.awt.Color(0, 0, 0));
        B4.setText("4");
        B4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B4.setContentAreaFilled(false);
        B4.setFocusPainted(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(102, 102, 102));
        B6.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B6.setForeground(new java.awt.Color(0, 0, 0));
        B6.setText("6");
        B6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B6.setContentAreaFilled(false);
        B6.setFocusPainted(false);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(102, 102, 102));
        B2.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B2.setForeground(new java.awt.Color(0, 0, 0));
        B2.setText("2");
        B2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B2.setContentAreaFilled(false);
        B2.setFocusPainted(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(102, 102, 102));
        B7.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B7.setForeground(new java.awt.Color(0, 0, 0));
        B7.setText("7");
        B7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B7.setContentAreaFilled(false);
        B7.setFocusPainted(false);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(102, 102, 102));
        B5.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B5.setForeground(new java.awt.Color(0, 0, 0));
        B5.setText("5");
        B5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B5.setContentAreaFilled(false);
        B5.setFocusPainted(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(102, 102, 102));
        B9.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B9.setForeground(new java.awt.Color(0, 0, 0));
        B9.setText("9");
        B9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B9.setContentAreaFilled(false);
        B9.setFocusPainted(false);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B0.setBackground(new java.awt.Color(102, 102, 102));
        B0.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B0.setForeground(new java.awt.Color(0, 0, 0));
        B0.setText("0");
        B0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B0.setContentAreaFilled(false);
        B0.setFocusPainted(false);
        B0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B0ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(102, 102, 102));
        B8.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B8.setForeground(new java.awt.Color(0, 0, 0));
        B8.setText("8");
        B8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, javax.swing.UIManager.getDefaults().getColor("Button.focus"), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B8.setContentAreaFilled(false);
        B8.setFocusPainted(false);
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(102, 102, 102));
        B3.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B3.setForeground(new java.awt.Color(0, 0, 0));
        B3.setText("3");
        B3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B3.setContentAreaFilled(false);
        B3.setFocusPainted(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        Valide.setBackground(new java.awt.Color(102, 102, 102));
        Valide.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        Valide.setForeground(new java.awt.Color(0, 0, 0));
        Valide.setText("Valide");
        Valide.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        Valide.setContentAreaFilled(false);
        Valide.setFocusPainted(false);
        Valide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValideActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(102, 102, 102));
        B1.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        B1.setForeground(new java.awt.Color(0, 0, 0));
        B1.setText("1");
        B1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        B1.setContentAreaFilled(false);
        B1.setFocusPainted(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NumberLayout = new javax.swing.GroupLayout(Number);
        Number.setLayout(NumberLayout);
        NumberLayout.setHorizontalGroup(
            NumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumberLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NumberLayout.createSequentialGroup()
                        .addGroup(NumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(NumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NumberLayout.createSequentialGroup()
                                .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(NumberLayout.createSequentialGroup()
                                .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(NumberLayout.createSequentialGroup()
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NumberLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Valide, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        NumberLayout.setVerticalGroup(
            NumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NumberLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(NumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NumberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Valide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        distributeur.add(Number);
        Number.setBounds(0, 220, 300, 340);

        Dt15.setBackground(new java.awt.Color(102, 102, 102));
        Dt15.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        Dt15.setText("<");
        Dt15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        Dt15.setContentAreaFilled(false);
        Dt15.setFocusPainted(false);
        Dt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dt15ActionPerformed(evt);
            }
        });
        distributeur.add(Dt15);
        Dt15.setBounds(850, 510, 94, 50);

        Non2.setBackground(new java.awt.Color(102, 102, 102));
        Non2.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        Non2.setText("Non");
        Non2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        Non2.setContentAreaFilled(false);
        Non2.setFocusPainted(false);
        Non2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Non2ActionPerformed(evt);
            }
        });
        distributeur.add(Non2);
        Non2.setBounds(850, 180, 94, 50);

        Dt10.setBackground(new java.awt.Color(102, 102, 102));
        Dt10.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        Dt10.setText("<");
        Dt10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, new java.awt.Color(120, 120, 120), java.awt.Color.lightGray, java.awt.Color.lightGray));
        Dt10.setContentAreaFilled(false);
        Dt10.setFocusPainted(false);
        Dt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dt10ActionPerformed(evt);
            }
        });
        distributeur.add(Dt10);
        Dt10.setBounds(850, 390, 94, 50);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        distributeur.add(jPanel2);
        jPanel2.setBounds(300, 80, 540, 590);

        jPanel1.add(distributeur);
        distributeur.setBounds(0, 80, 950, 710);

        CarteTick.setBackground(new java.awt.Color(153, 153, 153));
        CarteTick.setLayout(null);

        carte.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout carteLayout = new javax.swing.GroupLayout(carte);
        carte.setLayout(carteLayout);
        carteLayout.setHorizontalGroup(
            carteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        carteLayout.setVerticalGroup(
            carteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        CarteTick.add(carte);
        carte.setBounds(952, 204, 400, 26);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Carte banquaire :");
        CarteTick.add(jLabel9);
        jLabel9.setBounds(100, 23, 190, 40);

        BANc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/film/carte.png"))); // NOI18N
        BANc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BANcMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BANcMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BANcMouseExited(evt);
            }
        });
        CarteTick.add(BANc);
        BANc.setBounds(100, 150, 316, 210);

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("carte bancaire:");
        CarteTick.add(jLabel1);
        jLabel1.setBounds(950, 170, 165, 23);

        tickets.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout ticketsLayout = new javax.swing.GroupLayout(tickets);
        tickets.setLayout(ticketsLayout);
        ticketsLayout.setHorizontalGroup(
            ticketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        ticketsLayout.setVerticalGroup(
            ticketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        CarteTick.add(tickets);
        tickets.setBounds(1002, 585, 280, 24);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        CarteTick.add(jPanel4);
        jPanel4.setBounds(90, 80, 330, 30);

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
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });

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
                                .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ticketLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(tckD, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tckDt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(ticketLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tckH, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ticketLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 54, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ticketLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tckN, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ticketLayout.setVerticalGroup(
            ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketLayout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(31, 31, 31)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ticketLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(tckD, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ticketLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tckN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(tckDt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tckH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ticketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tckP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        CarteTick.add(ticket);
        ticket.setBounds(120, 500, 310, 40);

        jLabel11.setFont(new java.awt.Font("Footlight MT Light", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("tickets :");
        CarteTick.add(jLabel11);
        jLabel11.setBounds(90, 420, 110, 50);

        tck.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout tckLayout = new javax.swing.GroupLayout(tck);
        tck.setLayout(tckLayout);
        tckLayout.setHorizontalGroup(
            tckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        tckLayout.setVerticalGroup(
            tckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        CarteTick.add(tck);
        tck.setBounds(110, 480, 330, 40);

        jPanel1.add(CarteTick);
        CarteTick.setBounds(960, 30, 470, 920);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1429, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if(i ==4)
        { ch=ch+"2";
        NC.setText(ch);
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
         if (i == 4)
         {
             ch=ch+"3";
              NC.setText(ch);
         }
       
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if(i == 4)
                {
                    ch=ch+"4";
                    NC.setText(ch);
                }
        
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if (i == 4)
        {
        ch=ch+"5";
        NC.setText(ch);
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if (i == 4)
        {
        ch=ch+"6";
        NC.setText(ch);
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
       
        if (i ==4 )
        {ch=ch+"7";
        NC.setText(ch);
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        if (i== 4)
        {
        ch=ch+"8";
        NC.setText(ch);
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
         if (i == 4)
         {ch=ch+"9";
        NC.setText(ch);
         }
    }//GEN-LAST:event_B9ActionPerformed

    private void B0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B0ActionPerformed
         if (i == 4)
         {ch=ch+"0";
        NC.setText(ch);
         }
    }//GEN-LAST:event_B0ActionPerformed

    private void bienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienMouseExited
        

    }//GEN-LAST:event_bienMouseExited

    private void ImageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageMouseExited
if (i == 4)
{
    ap.stop(loop);
        Ecran.removeAll();
        Ecran.repaint();
        Ecran.revalidate();
        Ecran.add(PanelBQ);
         Ecran.repaint();
         Ecran.revalidate();
}
    }//GEN-LAST:event_ImageMouseExited

    private void bienvenueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienvenueMouseExited
          
    }//GEN-LAST:event_bienvenueMouseExited

    private void ValideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValideActionPerformed
        if (i ==4)
        {
        if (ch.equals(""))
            {
                JOptionPane.showMessageDialog(null,"ajouter le numero de carte bancaire ");
            }
            else
            {     distributeur.remove(Number);
                  Ecran.removeAll();
                  Ecran.repaint();
                  Ecran.revalidate();
                  Ecran.add(tickFilm);
                 Ecran.repaint();
                 Ecran.revalidate();
                 
                ac.jLabelYUp(520, 280, 16, 2, Quest);
                   m=1;
            }
        }
    }//GEN-LAST:event_ValideActionPerformed

    private void QuestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuestMouseEntered
       
    }//GEN-LAST:event_QuestMouseEntered

    private void oui2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oui2ActionPerformed
            if (m == 1)           
            {
                m=2;   
                Ecran.removeAll();
                  Ecran.repaint();
                  Ecran.revalidate();
                  Ecran.add(flous);
                 Ecran.repaint();
                 Ecran.revalidate();
                
                  
            }
    }//GEN-LAST:event_oui2ActionPerformed

    private void DT6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DT6ActionPerformed
        if (m == 2 && Prix.getText().equals("6Dt"))
        {
                try {
                    //as=new AudioStream(new FileInputStream("C:\\Users\\sofien trabelsi\\Desktop\\untitled.wav"));
                    //ad=as.getData();
                    //loop=new ContinuousAudioDataStream(ad);
                    //ap.start(loop);
                    
                    
                         
           m=5;
            ticket.setVisible(true);   
            BANc.setSize(340, 57);
            i=3;
            } catch (Exception e) {
            }
                    
           
        }
      
      
    }//GEN-LAST:event_DT6ActionPerformed

    private void BANcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BANcMouseClicked
 if (i ==3)
        {
            ap.stop(loop);
            BANc.setSize(340, 157); 
            BANc.setSize(340, 210);
            ac.jLabelYDown(90, 150, 16, 1, BANc);

             i=-1;
              
             
        }    }//GEN-LAST:event_BANcMouseClicked

    private void BANcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BANcMouseEntered
             if (i==0)
        {
           ac.jLabelYUp(150, 90, 15, 2, BANc);
            i=1;
        }
        else
        if (i==1)
        {
             try {
                    //as=new AudioStream(new FileInputStream("C:\\Users\\sofien trabelsi\\Desktop\\sofien1.wav"));
                    //ad=as.getData();
                    //loop=new ContinuousAudioDataStream(ad);
                    //ap.start(loop);
           
                     i=2;
            BANc.setSize(340, 210);
            BANc.setSize(340, 157);                
            
             }catch(Exception e)
             {
                 System.out.println(e.getMessage());
                 
             }
          }
        else
        if (i == 2)
        {
         
             i=4;
             BANc.setSize(340, 57);
            BANc.setSize(340, 12);
            bien.setVisible(true);  
            ac.jLabelYUp(470, 130, 16, 2, bien);
        }
         
        
            
    }//GEN-LAST:event_BANcMouseEntered

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
if(i ==4)
        { ch=ch+"1";
        NC.setText(ch);
        }    }//GEN-LAST:event_B1ActionPerformed

    private void ImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageMouseEntered
            

    }//GEN-LAST:event_ImageMouseEntered

    private void bienvenueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bienvenueMouseEntered
        
    }//GEN-LAST:event_bienvenueMouseEntered

    private void ImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImageMouseClicked
        // TODO add your handling code here:
          

      
       
    }//GEN-LAST:event_ImageMouseClicked

    private void Dt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dt15ActionPerformed
        // TODO add your handling code here:
        if (m == 2 && Prix.getText().equals("15Dt"))
        {
           try{
                //as=new AudioStream(new FileInputStream("C:\\Users\\sofien trabelsi\\Desktop\\untitled.wav"));
                  //  ad=as.getData();
                    //loop=new ContinuousAudioDataStream(ad);
                    m=5;
            ticket.setVisible(true);   
            BANc.setSize(340, 57);
           // ap.start(loop);
            i=3;
            }catch(Exception e)
            {
                
            }
        }
    }//GEN-LAST:event_Dt15ActionPerformed

    private void Non2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Non2ActionPerformed
        if (m == 1)
        {
            m=3 ;
            Ecran.removeAll();
                  Ecran.repaint();
                  Ecran.revalidate();
                  Ecran.add(bienvenue);
                 Ecran.repaint();
                 Ecran.revalidate();
                
            BANc.setSize(340, 57);
            i=3;
            
        }
    }//GEN-LAST:event_Non2ActionPerformed

    private void Dt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dt10ActionPerformed
if (m == 2 && Prix.getText().equals("10Dt"))
        {
            try{
                //as=new AudioStream(new FileInputStream("C:\\Users\\sofien trabelsi\\Desktop\\untitled.wav"));
                  //  ad=as.getData();
                    //loop=new ContinuousAudioDataStream(ad);
                    m=5;
            ticket.setVisible(true);   
            BANc.setSize(340, 57);
            //ap.start(loop);
            i=3;
            }catch(Exception e)
            {
                
            }
            
        }
    }//GEN-LAST:event_Dt10ActionPerformed

    private void ticketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketMouseClicked
        
        
    }//GEN-LAST:event_ticketMouseClicked

    private void ticketMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketMouseEntered
if (i == -1)
        {
           
            if (t==0)
            {
                 try{
                //as=new AudioStream(new FileInputStream("C:\\Users\\sofien trabelsi\\Desktop\\sofien1.wav"));
                  //  ad=as.getData();
                    //loop=new ContinuousAudioDataStream(ad);
            //ap.start(loop);
            ticket.setSize(310, 100);
                t=1;
            }catch(Exception e)
            {
                
            }
                
            }
               else
                 if (t==1)
                 {
                    ticket.setSize(310, 200);
                    t=2;
                   // ap.stop(loop);
                 }  
            else
                if (t==2)
                {
                  ticket.setSize(310, 300);
                  t=3;
                }
            else
                    if (t == 3)
                    {
                      ticket.setSize(310, 400);
                        t= 4;

                    }
                    else if (t == 4)
                    {
                        JFilm j=new JFilm();
                        this.setVisible (false);
                        t=-1;
                    }
        }
        else
        {
                         JOptionPane.showMessageDialog(null,"SVP retirer la carte bancaire  ");
   
        }    }//GEN-LAST:event_ticketMouseEntered

    private void BANcMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BANcMouseExited
        // TODO add your handling code here:
        if (m == 3)
        {
             JFilm j=new JFilm();
                        this.setVisible (false);
        }
    }//GEN-LAST:event_BANcMouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseEntered

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B0;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel BANc;
    private javax.swing.JPanel CarteTick;
    private javax.swing.JButton DT6;
    private javax.swing.JTextPane Date;
    private javax.swing.JButton Dt10;
    private javax.swing.JButton Dt15;
    private javax.swing.JPanel Ecran;
    private javax.swing.JTextPane Heure;
    private javax.swing.JLabel IMG;
    private javax.swing.JLabel Image;
    private javax.swing.JTextPane NC;
    private javax.swing.JButton Non2;
    private javax.swing.JPanel Number;
    private javax.swing.JPanel PanelBQ;
    private javax.swing.JTextPane Prix;
    private javax.swing.JLabel Quest;
    private javax.swing.JButton Valide;
    private javax.swing.JLabel bien;
    private javax.swing.JPanel bienvenue;
    private javax.swing.JPanel carte;
    private javax.swing.JPanel distributeur;
    private javax.swing.JPanel flous;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JButton oui2;
    private javax.swing.JPanel tck;
    private javax.swing.JLabel tckD;
    private javax.swing.JLabel tckDt;
    private javax.swing.JLabel tckH;
    private javax.swing.JLabel tckN;
    private javax.swing.JLabel tckP;
    private javax.swing.JPanel tickFilm;
    private javax.swing.JPanel ticket;
    private javax.swing.JPanel tickets;
    // End of variables declaration//GEN-END:variables
     
}

