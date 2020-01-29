/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medicalrecord;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.net.www.content.image.jpeg;
/**
 *
 * @author ITUNU
 */
public class records extends javax.swing.JFrame {
    
   private ArrayList<String> date= new ArrayList<>();
    //private String date, time, pulse_rate, blood_pressure, respiration_rate, heart_rate, temperature, reports;
    private ArrayList<String> time= new ArrayList<>();
    private ArrayList<String> pulse_rate= new ArrayList<>();
    private ArrayList<String> blood_pressure= new ArrayList<>();
    private ArrayList<String> respiration_rate= new ArrayList<>();
    private ArrayList<String> heart_rate=new ArrayList<>();
    private ArrayList<String> temperature=new ArrayList<>();
    private ArrayList<String> reports=new ArrayList<>();
    private String [] values= new String[8];
     int listCounter=0;
    /**
     * Creates new form records
     */

    public records() {
        initComponents();
        setLocationRelativeTo(this);
        jPanel1.setVisible(false);
       jFrame1.setVisible(false);
       jButton1.setVisible(false);
       jButton2.setVisible(false);
       jComboBox1.setVisible(false);
       //jPanel2.setVisible(false);
       //jScrollPane2.setVisible(false);
       //jTable1.setVisible(false);
       //jButton7.setVisible(false);
      jDesktopPane1.setPreferredSize(new Dimension(793, 528));
    }
    public records(String rep){
        initComponents();
        setLocationRelativeTo(this);
     jPanel1.setVisible(false);
     jDesktopPane1.setPreferredSize(new Dimension(793, 528));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dat = new javax.swing.JLabel();
        tim = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bp = new javax.swing.JLabel();
        pr = new javax.swing.JLabel();
        rr = new javax.swing.JLabel();
        hr = new javax.swing.JLabel();
        tem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        REPORT = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        repo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tex1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 150, 204));
        jDesktopPane1.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(957, 618));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(564, 437));

        name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        name.setText("Name:");

        email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        email.setText("Date of Birth:");

        gender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gender.setText("Gender:");

        mobile.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        mobile.setText("Mobile Number:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("1.");

        dat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        dat.setText("Date:");

        tim.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tim.setText("Time:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("03-01-2016");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("05:32:24 PM");

        bp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        bp.setText("Bloood Pressure:");

        pr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pr.setText("Pulse Rate:");

        rr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rr.setText("Respiration Rate:");

        hr.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        hr.setText("Weight:");

        tem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tem.setText("Temperature:");

        REPORT.setColumns(20);
        REPORT.setRows(5);
        jScrollPane1.setViewportView(REPORT);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("PREV.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton4.setText("NEXT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("PRINT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setText("CLOSE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel19.setText("12");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel20.setText("12");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel21.setText("12");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel22.setText("12");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel23.setText("12");

        repo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        repo.setText("REPORT");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dat)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(bp)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tim)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12)
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(pr)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addGap(183, 183, 183))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mobile)
                        .addGap(175, 175, 175))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(repo)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rr)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel21)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(hr)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel23))
                            .addComponent(email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addGap(186, 186, 186))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jButton3)
                        .addGap(33, 33, 33)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gender)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(mobile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tim)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(dat))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bp)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pr)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rr)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(tem)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(hr))
                        .addGap(59, 59, 59)
                        .addComponent(repo)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addContainerGap())))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText(".......  CHECK PATIENT RECORDS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Card no:");
        jLabel2.setRequestFocusEnabled(false);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Medical History", "Drug History" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("select the record category");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tex1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(tex1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2)
                                    .addComponent(jLabel3)))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel3))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(tex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tex1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static ArrayList<String> pdate = new ArrayList<>();
public static ArrayList<String>ptime = new ArrayList<>();
public static ArrayList<String>ptemperature = new ArrayList<>();
public static ArrayList<String>ppulse_rate = new ArrayList<>();
public static ArrayList<String>pheart_rate = new ArrayList<>(); 
public static ArrayList<String> pblood_pressure = new ArrayList<>();
public static  ArrayList<String> preports = new ArrayList<>();
public static ArrayList<String> prespiration_rate= new ArrayList<>();
          public static String pName, pDob, pSex, pPhone;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nam= tex1.getText();
                if (nam.equals("")){
            JOptionPane.showMessageDialog(null, "supply your id");
        }
        else{
                     {
        pdate.clear();
        ptime.clear();
        ppulse_rate.clear();
        pblood_pressure.clear();
        ptemperature.clear();
        pheart_rate.clear();
        prespiration_rate.clear();
        preports.clear();
        }
          MedicalRecord op= new MedicalRecord();
          boolean k=op.getDetails(nam);
          //date, time, pulse_rate, blood_pressure, respiration_rate, heart_rate, temperature, reports, values);
          if(k==true){
              pdate=op.date;
              ptime=op.time;
              ptemperature=op.temperature;
              ppulse_rate=op.pulse_rate;
              pblood_pressure=op.blood_pressure;
              pheart_rate=op.heart_rate;
              preports=op.reports;
              prespiration_rate=op.respiration_rate;
              pName=op.pName; 
              pDob=op.pDob; 
              pSex=op.pSex;
              pPhone=op.pPhone;
              
               
              jPanel1.setVisible(true);
              setNormalValues();
              setTextField(0);
              listCounter=0;
          }else{
              
              jPanel1.setVisible(false);
              jDesktopPane1.setPreferredSize(new Dimension(793, 528));
              JOptionPane.showMessageDialog(null, "No Record found!!!");
          }
         
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            listCounter--; 
            jLabel8.setText(String.valueOf(listCounter+1)+".");
           // nextOrPreviousRecord();
             int MY_LIST_MAX_VALUE= pdate.size();
               if (listCounter>=MY_LIST_MAX_VALUE){
        jLabel8.setText(String.valueOf(MY_LIST_MAX_VALUE)+".");
            listCounter=MY_LIST_MAX_VALUE-1;  
            System.out.println("counter at this poin >"+MY_LIST_MAX_VALUE);
           // setTextField(listCounter);
        }
       else if (listCounter<=0){
            jLabel8.setText(String.valueOf("1."));
            listCounter=0; 
        }
       else if((listCounter>0)&&(listCounter<MY_LIST_MAX_VALUE)){
         jLabel8.setText(String.valueOf(listCounter-1)+".");
           System.out.println("counter >=0 and <"+MY_LIST_MAX_VALUE); 
           System.out.println("counter at this poin="+listCounter);
       }
        setTextField(listCounter);
        }
        catch (Exception e){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
            System.out.println("counter before="+listCounter);
        try{
            listCounter++; //Increments the Global Variable 'listCounter' by 1
           // jLabel8.setText(String.valueOf(listCounter+2)+".");
           // nextOrPreviousRecord(); // Meod Call to retrieve the record
            System.out.println("counter imm="+listCounter);
             int MY_LIST_MAX_VALUE= pdate.size();
             
        if (listCounter>=MY_LIST_MAX_VALUE){
        jLabel8.setText(String.valueOf(MY_LIST_MAX_VALUE)+".");
            listCounter=MY_LIST_MAX_VALUE-1;  
            System.out.println("counter at this poin >"+MY_LIST_MAX_VALUE);
           // setTextField(listCounter);
        }
       else if (listCounter<0){
            jLabel8.setText(String.valueOf("1."));
            listCounter=0; 
        }
       else if((listCounter>=0)&&(listCounter<MY_LIST_MAX_VALUE)){
         jLabel8.setText(String.valueOf(listCounter+1)+".");
           System.out.println("counter >=0 and <"+MY_LIST_MAX_VALUE); 
           System.out.println("counter at this poin="+listCounter);
       }
        setTextField(listCounter);
        }
        catch (Exception e){

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jDesktopPane1.setVisible (true);
        jPanel1.setVisible(true);
        jFrame1.setVisible(false);
        //jPanel2.setVisible(true);
        //jScrollPane2.setVisible(true);
        //jTable1.setVisible(true);
        //jButton7.setVisible(true);
        jComboBox1.setVisible(false);
        tex1.setVisible(true);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        jButton1.setVisible(false);
        printWork();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         jPanel1.setVisible(false);
        jDesktopPane1.setPreferredSize(new Dimension(793, 528));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        intro pre= new intro();
        pre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tex1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex1ActionPerformed
        // TODO add your handling code here:
        if (tex1.equals("") ) {
          JOptionPane.showMessageDialog(null, "supply ID please");
        } else 
        jButton1.setVisible(true);
        jButton2.setVisible(true);
    }//GEN-LAST:event_tex1ActionPerformed
 /*private void clearTable() {
        DefaultTableModel LocalTableModel = (DefaultTableModel)jTable1.getModel();
        int size = LocalTableModel.getRowCount() - 1;
        if (LocalTableModel.getRowCount() <= 0) {

        } else if (LocalTableModel.getRowCount() > 0) {
            while (size != -1) {

                LocalTableModel.removeRow(size);
                size--;

            }
        }
        jTable1.setModel(LocalTableModel);
    }
    private void print(){
         clearTable();
       setTableRecords();
       //jFrame1.setSize(new Dimension(1200, 600));
       //jFrame1.setLocationRelativeTo(this);
       //jFrame1.setVisible(true);
       
    }
      void setTableRecords(){
         DefaultTableModel dfm=  (DefaultTableModel)jTable1.getModel();
         for(int i=0; i<pdate.size(); i++){
        dfm.addRow(new Object[]{pblood_pressure.get(i),ppulse_rate.get(i),prespiration_rate.get(i), pheart_rate.get(i), ptemperature.get(i), preports.get(i),pdate.get(i), ptime.get(i),});
         }
         
        jTable1.setModel(dfm);
    }*/
public void printWork()
{
    PrinterJob pj = PrinterJob.getPrinterJob();
    pj.setJobName(" Opt De Solver Printing ");

    pj.setPrintable(new Printable()
    {
        @Override
        public int print(Graphics pg, PageFormat pf, int pageNum)
        {
            if(pageNum > 0)
                return Printable.NO_SUCH_PAGE;

            Graphics2D g2 = (Graphics2D)pg;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            jPanel1.paintAll(g2);
             return Printable.PAGE_EXISTS;
        }
    });
    if(pj.printDialog() == false)
        return;
    try
    {
        pj.print();
    }
    catch(PrinterException xcp)
    {
        xcp.printStackTrace(System.err);
    }
}
 void setNormalValues(){
        name.setText("Name: "+pName);
       email.setText("Date of Birth: "+pDob);
        gender.setText("Gender: "+pSex);
        mobile.setText("Mobile Number: "+pPhone);
    }
     private void setTextField(int i){
      jLabel11.setText(pdate.get(i));
      jLabel12.setText(ptime.get(i));
      jLabel20.setText(ppulse_rate.get(i));
      jLabel19.setText(pblood_pressure.get(i));
      jLabel21.setText(prespiration_rate.get(i));
      jLabel22.setText(pheart_rate.get(i));
      jLabel23.setText(ptemperature.get(i));
      REPORT.setText(preports.get(i));
    }
void nextOrPreviousRecord(){
        int MY_LIST_MAX_VALUE= date.size();
        if (listCounter>=MY_LIST_MAX_VALUE){
        jLabel8.setText(String.valueOf(MY_LIST_MAX_VALUE)+".");
            listCounter=MY_LIST_MAX_VALUE-1;  
           // setTextField(listCounter);
        }
        if (listCounter<0){
            jLabel8.setText(String.valueOf("1."));
            listCounter=0; 
        }
        setTextField(listCounter);
    }


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
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea REPORT;
    private javax.swing.JLabel bp;
    private javax.swing.JLabel dat;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel hr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel name;
    private javax.swing.JLabel pr;
    private javax.swing.JLabel repo;
    private javax.swing.JLabel rr;
    private javax.swing.JLabel tem;
    private javax.swing.JTextField tex1;
    private javax.swing.JLabel tim;
    // End of variables declaration//GEN-END:variables
}