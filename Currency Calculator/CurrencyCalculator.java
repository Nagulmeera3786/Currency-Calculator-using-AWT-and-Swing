import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import javax.swing.*;
class CurrencyCalculator{
  
  public static void main(String args[]){
    JLabel Bg;
    JFrame jf = new JFrame("currency calculator");
    JFrame ResultFrame = new JFrame();
    String Cur[] = {"kuwaiti dinari(KWD)","baharaini dinari(BHD)","Omani Rial(OMR)","Jordanian Dinar (JOD)","British Pound (GBP)","Cayman Island Dollar (KYD)","Swiss Franc (CHF)","Euro (EUR)","United States Dollar (USD)","Indian Rupee (INR)","Singapore Dollar","Russian Ruble","Nepalese Rupee","SriLanka Rupee","UAE dirham","South African Rand","Canadian Dollar","Australian Dollar"};
    JComboBox cb = new JComboBox(Cur);
    ImageIcon img = new ImageIcon("C:\\projects\\Currency Calculator\\currencies.jpg");
    Bg = new JLabel(img);
    JComboBox cb1 = new JComboBox(Cur);
    JButton inr = new JButton("India");
    JButton kwd = new JButton("Kuwait");
    JButton bhd = new JButton("baharain");
    JButton omr = new JButton("Oman");
    JButton jod = new JButton("Jordan");
    JButton gbp = new JButton("uk");
    JButton kyd = new JButton("Cayman Island");
    JButton chf = new JButton("Switzerland");
    JButton euro = new JButton("Europe");
    JButton cd = new JButton("Canada");
    JButton sd = new JButton("Singapore");
    JButton rr = new JButton("Russia");
    JButton nr = new JButton("Nepal");
    JButton sr = new JButton("Srilanka");
    JButton uaed = new JButton("UAE");
    JButton sar = new JButton("South Africa");
    JButton us = new JButton("USA");
    JButton au = new JButton("Australia");
    JLabel a = new JLabel("Amount   ");
    a.setOpaque(true);
    JLabel l1 = new JLabel("FROM  ");
    l1.setOpaque(true);
    JLabel l2 = new JLabel("TO    ");
    l2.setOpaque(true);
    JLabel l3 = new JLabel("Money   ");
    l3.setOpaque(true);
    JTextField money = new JTextField("");
    JTextField result = new JTextField();
    JButton b = new JButton("Convert");
    a.setBounds(20,160,100,20);
    rr.setBounds(700,80,300,80);
    kwd.setBounds(735,260,100,20);
    bhd.setBounds(735,280,100,20);
    jod.setBounds(670,260,100,20);
    omr.setBounds(760,310,100,20);
    uaed.setBounds(740,295,100,20);
    gbp.setBounds(480,150,100,20);
    euro.setBounds(530,150,100,30);
    sd.setBounds(950,390,100,20);
    chf.setBounds(520,180,100,20);
    kyd.setBounds(130,310,100,20);
    sar.setBounds(600,500,100,60);
    inr.setBounds(850,300,100,20);
    au.setBounds(1100,500,100,100);
    sr.setBounds(870,365,100,20);
    nr.setBounds(860,280,100,20);
    cd.setBounds(20,150,100,20);
    us.setBounds(20,220,100,20);
    l1.setBounds(20,80,100,20);
    l2.setBounds(20,120,100,20);
    l3.setBounds(80,240,100,20);
    cb.setBounds(150,80,200,20);
    cb1.setBounds(150,120,200,20);
    money.setBounds(150,160,100,20);
    result.setBounds(200,240,200,40);
    b.setBounds(200,200,100,20);
    Bg.setBounds(0,0,1200,700);
    jf.add(a);jf.add(l1);jf.add(l2);jf.add(cb);jf.add(cb1);jf.add(money);jf.add(b);jf.add(l3);jf.add(result);jf.add(Bg);jf.add(inr);jf.add(us);jf.add(uaed);jf.add(au);jf.add(sar);
    jf.add(kwd);jf.add(bhd);jf.add(omr);jf.add(jod);jf.add(gbp);jf.add(kyd);jf.add(chf);jf.add(euro);jf.add(sd);jf.add(rr);jf.add(nr);jf.add(sr);jf.add(cd);
    jf.setSize(1200,700);
    ResultFrame.setSize(200,200);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setLayout(null);
    jf.setVisible(true);
    inr.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is India and its currency is Indian Rupee(INR)");
      }
    });
    sd.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Singapore and its currency is Singapore Dollar");
      }
    });
    kwd.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Kuwait and its currency is Kuwaiti Dinar(KWD)");
      }
    });
    jod.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Jordania and its currency is Jordnian Dinar(JOD)");
      }
    });
    bhd.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Baharain and its currency is Baharaini Dinar(BHD)");
      }
    });
    omr.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Oman and its currency is Omari Rial(OMR)");
      }
    });
    uaed.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is UAE and its currency is UAE Dollar");
      }
    });
    gbp.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is United Kingdom(UK) and its currency is British Pound(GBP)");
      }
    });
    euro.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Europe and its currency is Euro(EURO)");
      }
    });
    chf.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Switzerland and its currency is Swiss France(CHF)");
      }
    });
    rr.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Russia and its currency is Russian Ruble");
      }
    });
    nr.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Nepal and its currency is Nepali Rupee");
      }
    });
    sr.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Sri Lanka and its currency is Srilankan Rupee");
      }
    });
    sar.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is South Africa and its currency is South African Rand");
      }
    });
    au.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Australia and its currency is Australian Dollar");
      }
    });
    kyd.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Cayman Island and its currency is Cayman Island Dollar(P)");
      }
    });
    us.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is United States Of America(USA) and its currency is US Dollar(USD)");
      }
    });
    cd.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(jf, "This is Canada and its currency is canadian Dollar");
      }
    });
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          String amount = money.getText();
          if (amount.isEmpty()) {
              JOptionPane.showMessageDialog(jf, "Plese Enter an amount");
          }
          double amo;
          try {
              amo = Double.parseDouble(amount);
          }
          catch (NumberFormatException ex) {
              JOptionPane.showMessageDialog(jf, "Please Enter a valid amount");
              return;
          }
          String fc = (String) cb.getSelectedItem(); 
          String tc = (String) cb1.getSelectedItem();
          double res = 0;
          if(fc.equals("kuwaiti dinari(KWD)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 1;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 1.23;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 1.26;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 2.31;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 2.50;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 2.72;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 2.80;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 2.98;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 3.26;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 274.03;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 4.26;
            else if(tc.equals("Russian Ruble"))
              res = amo * 316.31;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 4.49;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 438.36;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 955.61;
            else if(tc.equals("UAE dirham"))
              res = amo * 11.98;
            else if(tc.equals("South African Rand"))
              res = amo * 57.14;
            else if(tc.equals("Australian Dollar"))
              res = amo * 4.85;
            else
              res = amo;
          }
          else if(fc.equals("baharaini dinari(BHD)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.81;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 1;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 1.26;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 1.88;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 2.03;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 2.21;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 2.27;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 2.43;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 2.65;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 222.79;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 3.46;
            else if(tc.equals("Russian Ruble"))
              res = amo * 256.25;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 3.65;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 356.39;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 777.02;
            else if(tc.equals("UAE dirham"))
              res = amo * 9.74;
            else if(tc.equals("South African Rand"))
              res = amo * 46.42;
            else if(tc.equals("Australian Dollar"))
              res = amo * 3.94;
            else
              res = amo;
          }
          else if(fc.equals("Omani Rial(OMR)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.80;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.98;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 1;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 1.84;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 1.99;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 2.16;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 2.23;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 2.38;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 2.60;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 218.17;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 3.39;
            else if(tc.equals("Russian Ruble"))
              res = amo * 251.83;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 3.57;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 348.99;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 760.88;
            else if(tc.equals("UAE dirham"))
              res = amo * 9.54;
            else if(tc.equals("South African Rand"))
              res = amo * 45.46;
            else if(tc.equals("Australian Dollar"))
              res = amo * 3.86;
            else
              res = amo;
          }
          else if(fc.equals("Jordanian Dinar (JOD)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.43;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.53;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.54;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 1;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 1.08;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 1.18;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 1.21;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 1.29;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 1.41;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 118.58;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 1.84;
            else if(tc.equals("Russian Ruble"))
              res = amo * 136.78;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 1.94;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 189.57;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 413.31;
            else if(tc.equals("UAE dirham"))
              res = amo * 5.18;
            else if(tc.equals("South African Rand"))
              res = amo * 24.70;
            else if(tc.equals("Australian Dollar"))
              res = amo * 2.09;
            else
              res = amo;
          }
          else if(fc.equals("British Pound (GBP)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.40;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.49;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.50;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.92;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 1;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 1.09;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 1.12;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 1.19;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 1.30;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 109.66;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 1.70;
            else if(tc.equals("Russian Ruble"))
              res = amo * 126.50;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 1.80;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 175.30;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 382.19;
            else if(tc.equals("UAE dirham"))
              res = amo * 4.79;
            else if(tc.equals("South African Rand"))
              res = amo * 22.86;
            else if(tc.equals("Australian Dollar"))
              res = amo * 1.94;
            else
              res = amo;
          }
          else if(fc.equals("Cayman Island Dollar (KYD)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.37;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.45;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.46;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.85;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.92;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 1;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 1.03;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 1.10;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 1.20;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 100.91;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 1.57;
            else if(tc.equals("Russian Ruble"))
              res = amo * 116.38;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 1.65;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 161.27;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 351.62;
            else if(tc.equals("UAE dirham"))
              res = amo * 4.41;
            else if(tc.equals("South African Rand"))
              res = amo * 21.445;
            else if(tc.equals("Australian Dollar"))
              res = amo * 1.78;
            else
              res = amo;
          }
          else if(fc.equals("Swiss Franc (CHF)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.36;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.44;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.45;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.83;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.89;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.97;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 1;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 1.07;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 1.17;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 98.07;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 1.52;
            else if(tc.equals("Russian Ruble"))
              res = amo * 113.027;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 1.61;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 156.74;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 341.67;
            else if(tc.equals("UAE dirham"))
              res = amo * 4.28;
            else if(tc.equals("South African Rand"))
              res = amo * 20.42;
            else if(tc.equals("Australian Dollar"))
              res = amo * 1.73;
            else
              res = amo;
          }
          else if(fc.equals("Euro (EUR)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.34;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.41;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.42;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.78;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.84;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.91;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.94;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 1;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 1.09;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 91.92;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 1.43;
            else if(tc.equals("Russian Ruble"))
              res = amo * 106.06;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 1.51;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 146.98;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 320.45;
            else if(tc.equals("UAE dirham"))
              res = amo * 4.02;
            else if(tc.equals("South African Rand"))
              res = amo * 19.12;
            else if(tc.equals("Australian Dollar"))
              res = amo * 1.62;
            else
              res = amo;
          }
          else if(fc.equals("United States Dollar (USD)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.31;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.38;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.39;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.71;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.77;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.83;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.86;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 0.91;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 1;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 84.07;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 1.31;
            else if(tc.equals("Russian Ruble"))
              res = amo * 96.77;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 1.38;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 134.35;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 292.91;
            else if(tc.equals("UAE dirham"))
              res = amo * 3.67;
            else if(tc.equals("South African Rand"))
              res = amo * 17.47;
            else if(tc.equals("Australian Dollar"))
              res = amo * 1.48;
            else
              res = amo;
          }
          else if(fc.equals("Indian Rupee (INR)")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.0036;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.0045;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.0046;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.0084;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.0091;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.0099;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.010;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 0.011;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 0.012;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 1;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 0.016;
            else if(tc.equals("Russian Ruble"))
              res = amo * 1.15;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 0.016;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 1.16;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 3.48;
            else if(tc.equals("UAE dirham"))
              res = amo * 0.044;
            else if(tc.equals("South African Rand"))
              res = amo * 0.21;
            else if(tc.equals("Australian Dollar"))
              res = amo * 0.018;
            else
              res = amo;
          }
          else if(fc.equals("Singapore Dollar")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.23;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.29;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.29;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.54;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.59;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.64;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.66;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 0.70;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 0.77;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 64.34;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 1;
            else if(tc.equals("Russian Ruble"))
              res = amo * 73.92;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 1.05;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 102.85;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 224.24;
            else if(tc.equals("UAE dirham"))
              res = amo * 2.81;
            else if(tc.equals("South African Rand"))
              res = amo * 13.36;
            else if(tc.equals("Australian Dollar"))
              res = amo * 1.14;
            else
              res = amo;
          }
          else if(fc.equals("Russian Ruble")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.0032;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.0039;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.0040;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.0073;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.0079;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.0086;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.0089;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 0.0095;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 0.010;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 0.87;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 0.014;
            else if(tc.equals("Russian Ruble"))
              res = amo * 1;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 0.014;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 1.39;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 3.03;
            else if(tc.equals("UAE dirham"))
              res = amo * 0.038;
            else if(tc.equals("South African Rand"))
              res = amo * 0.18;
            else if(tc.equals("Australian Dollar"))
              res = amo * 0.015;
            else
              res = amo;
          }
          else if(fc.equals("Canadian Dollar")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.22;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.27;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.28;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.51;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.56;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.61;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.62;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 0.66;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 0.73;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 61.09;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 0.95;
            else if(tc.equals("Russian Ruble"))
              res = amo * 70.17;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 1;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 97.64;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 212.87;
            else if(tc.equals("UAE dirham"))
              res = amo * 2.67;
            else if(tc.equals("South African Rand"))
              res = amo * 12.67;
            else if(tc.equals("Australian Dollar"))
              res = amo * 1.08;
            else
              res = amo;
          }
          else if(fc.equals("Nepalese Rupee")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.0023;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.0028;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.0029;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.0053;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.0057;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.0062;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.0064;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 0.0068;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 0.0074;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 0.63;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 0.0097;
            else if(tc.equals("Russian Ruble"))
              res = amo * 0.72;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 0.010;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 1;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 2.18;
            else if(tc.equals("UAE dirham"))
              res = amo * 0.027;
            else if(tc.equals("South African Rand"))
              res = amo * 0.13;
            else if(tc.equals("Australian Dollar"))
              res = amo * 0.011;
            else
              res = amo;
          }
          else if(fc.equals("SriLanka Rupee")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.0010;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.0013;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.0013;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.0024;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.0026;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.0028;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.0029;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 0.0031;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 0.0034;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 0.29;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 0.0045;
            else if(tc.equals("Russian Ruble"))
              res = amo * 0.33;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 0.0047;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 0.46;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 1;
            else if(tc.equals("UAE dirham"))
              res = amo * 0.013;
            else if(tc.equals("South African Rand"))
              res = amo * 0.059;
            else if(tc.equals("Australian Dollar"))
              res = amo * 0.0051;
            else
              res = amo;
          }
          else if(fc.equals("UAE dirham")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.083;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.10;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.10;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.19;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.21;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.23;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.23;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 0.25;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 0.27;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 22.89;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 0.36;
            else if(tc.equals("Russian Ruble"))
              res = amo * 26.30;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 0.37;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 36.58;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 79.75;
            else if(tc.equals("UAE dirham"))
              res = amo * 1;
            else if(tc.equals("South African Rand"))
              res = amo * 4.75;
            else if(tc.equals("Australian Dollar"))
              res = amo * 0.40;
            else
              res = amo;
          }
          else if(fc.equals("South African Rand")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.018;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.022;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.022;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.041;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.044;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.048;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.049;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 2.43;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 0.057;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 4.82;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 0.075;
            else if(tc.equals("Russian Ruble"))
              res = amo * 5.54;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 0.079;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 7.71;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 16.80;
            else if(tc.equals("UAE dirham"))
              res = amo * 0.21;
            else if(tc.equals("South African Rand"))
              res = amo * 1;
            else if(tc.equals("Australian Dollar"))
              res = amo * 0.08;
            else
              res = amo;
          }
          else if(fc.equals("Australian Dollar")){
            if(tc.equals("kuwaiti dinari(KWD)"))
              res = amo * 0.21;
            else if(tc.equals("baharaini dinari(BHD)"))
              res = amo * 0.25;
            else if(tc.equals("Omani Rial(OMR)"))
              res = amo * 0.26;
            else if(tc.equals("Jordanian Dinar (JOD)"))
              res = amo * 0.48;
            else if(tc.equals("British Pound (GBP)"))
              res = amo * 0.52;
            else if(tc.equals("Cayman Island Dollar (KYD)"))
              res = amo * 0.56;
            else if(tc.equals("Swiss Franc (CHF)"))
              res = amo * 0.58;
            else if(tc.equals("Euro (EUR)"))
              res = amo * 0.62;
            else if(tc.equals("United States Dollar (USD)"))
              res = amo * 0.67;
            else if(tc.equals("Indian Rupee (INR)"))
              res = amo * 56.71;
            else if(tc.equals("Singapore Dollar"))
              res = amo * 0.88;
            else if(tc.equals("Russian Ruble"))
              res = amo * 64.59;
            else if(tc.equals("Canadian Dollar"))
              res = amo * 0.93;
            else if(tc.equals("Nepalese Rupee"))
              res = amo * 90.53;
            else if(tc.equals("SriLanka Rupee"))
              res = amo * 197.04;
            else if(tc.equals("UAE dirham"))
              res = amo * 2.48;
            else if(tc.equals("South African Rand"))
              res = amo * 11.73;
            else if(tc.equals("Australian Dollar"))
              res = amo * 1;
            else
              res = amo;
          }
          result.setText( "Result   " + res);
        }
      });
    }
  }

    