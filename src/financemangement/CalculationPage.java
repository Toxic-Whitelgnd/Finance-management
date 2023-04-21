/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package financemangement;

import static financemangement.ViewExpence.accname;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 91861
 */
public class CalculationPage extends javax.swing.JFrame {

    /**
     * Creates new form CalculationPage
     */
    public CalculationPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Welcome to Finance Mangement");

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jLabel2.setText("Select the month to calculate the total expense and income");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton1.setText("Calculate Expense");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButton2.setText("Calculate Income");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setText("0");

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField2.setText("Advise mff");

        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jButton4.setText("Profit");
        jButton4.setAlignmentY(0.0F);
        jButton4.setMargin(new java.awt.Insets(5, 14, 0, 14));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(352, 352, 352))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198))))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String x = String.valueOf(jComboBox1.getSelectedItem());
        System.out.print(x);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomePage h = new HomePage();
        h.setVisible(true);
        h.getaccnameandbal(accname, password, startbal);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    public void gettingUserData(int month){
        int totalexpamt = 0;
        
        int month1 = month;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/financemanagement","root","1234");
            
            
            
            
            if (con!=null) {
                System.out.println("successfully connected");
                
//                specific user
                String query = "SELECT * FROM "+accname+" where month = "+month1+" ";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
               
                
                

                while(rs.next()){
                    String accname1 = rs.getString("accname");
                    int startingbal = rs.getInt("startingbal");
                    String expdes = rs.getString("expdes");
                    String expamt = rs.getString("expamt");
                    String expcat = rs.getString("expcat");
                    String incdes = rs.getString("incdes");
                    String incamt = rs.getString("incamt");
                    String inccat = rs.getString("inccat");
                    int balance = rs.getInt("balance");
                    String findate = rs.getString("findate");
                    
                    
                   System.out.format("[%s , %s , %s , %s ,%s ,%s ,%s,%s]\n",accname1,startingbal,expdes,expamt,expcat,incdes,incamt,inccat,balance,findate);
                   System.out.println("dates"+findate);
                   
                   String a = findate.substring(5,7);
                   System.out.print("sliced"+a);
                   
                  
                   
                   
                   totalexpamt += Integer.parseInt(expamt);
                  
                   
                  
                    
                }
             
             System.out.print("totla"+totalexpamt);
             String as = String.valueOf(totalexpamt);
             jTextField1.setText(as);
            
            }
            } catch (Exception e) {
            System.out.println(e);
            System.out.println("not connected");
            }
    }
    
    public void gettingUserDataIncome(int month){
        int totalincmt = 0;
        
        int month1 = month;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/financemanagement","root","1234");
            
            
            
            
            if (con!=null) {
                System.out.println("successfully connected");
                
//                specific user
                String query = "SELECT * FROM "+accname+" where month = "+month1+" ";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
               
                
                

                while(rs.next()){
                    String accname1 = rs.getString("accname");
                    int startingbal = rs.getInt("startingbal");
                    String expdes = rs.getString("expdes");
                    String expamt = rs.getString("expamt");
                    String expcat = rs.getString("expcat");
                    String incdes = rs.getString("incdes");
                    String incamt = rs.getString("incamt");
                    String inccat = rs.getString("inccat");
                    int balance = rs.getInt("balance");
                    String findate = rs.getString("findate");
                    
                    
                   System.out.format("[%s , %s , %s , %s ,%s ,%s ,%s,%s]\n",accname1,startingbal,expdes,expamt,expcat,incdes,incamt,inccat,balance,findate);
                   System.out.println("dates"+findate);
                   
                   String a = findate.substring(5,7);
                   System.out.print("sliced"+a);
                   
                  
                   
                   
                   totalincmt += Integer.parseInt(incamt);
                  
                   
                  
                    
                }
             
             System.out.print("totla"+totalincmt);
             String as = String.valueOf(totalincmt);
             jTextField1.setText(as);
            
            }
            } catch (Exception e) {
            System.out.println(e);
            System.out.println("not connected");
            }
    }
    
    public void gettingUserDataProfit(int month){
        int totalincmt = 0;
        int totalexpamt = 0;
        int month1 = month;
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/financemanagement","root","1234");
            
            
            
            
            if (con!=null) {
                System.out.println("successfully connected");
                
//                specific user
                String query = "SELECT * FROM "+accname+" where month = "+month1+" ";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
               
                
                

                while(rs.next()){
                    String accname1 = rs.getString("accname");
                    int startingbal = rs.getInt("startingbal");
                    String expdes = rs.getString("expdes");
                    String expamt = rs.getString("expamt");
                    String expcat = rs.getString("expcat");
                    String incdes = rs.getString("incdes");
                    String incamt = rs.getString("incamt");
                    String inccat = rs.getString("inccat");
                    int balance = rs.getInt("balance");
                    String findate = rs.getString("findate");
                    
                    
                   System.out.format("[%s , %s , %s , %s ,%s ,%s ,%s,%s]\n",accname1,startingbal,expdes,expamt,expcat,incdes,incamt,inccat,balance,findate);
                   System.out.println("dates"+findate);
                   
                   String a = findate.substring(5,7);
                   System.out.print("sliced"+a);
                   
                  
                   
                   
                   totalincmt += Integer.parseInt(incamt);
                   totalexpamt += Integer.parseInt(expamt);
                   
                  
                    
                }
                
                int totalincome = totalincmt - totalexpamt;
                
             if(totalincmt > totalexpamt){
                 jTextField2.setText("You are in right way to the savings!");
             }
             else{
                 JOptionPane.showMessageDialog(null, "There is no profit ", "Profit Error", JOptionPane.ERROR_MESSAGE, null);
                 jTextField2.setText("Your spending too much try to reduce!!");
             }
             
             System.out.print("totla"+totalincome);
             String as = String.valueOf(totalincome);
             jTextField1.setText(as);
            
            }
            } catch (Exception e) {
            System.out.println(e);
            System.out.println("not connected");
            }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        here we will be making the function call to sql db with all required things or
            String x = String.valueOf(jComboBox1.getSelectedItem());
        
        String fk = x.substring(1,2);
        System.out.print(fk);
        gettingUserData(Integer.parseInt(fk));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String x = String.valueOf(jComboBox1.getSelectedItem());
        
        String fk = x.substring(1,2);
        System.out.print(fk);
        gettingUserDataIncome(Integer.parseInt(fk));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String x = String.valueOf(jComboBox1.getSelectedItem());
        
        String fk = x.substring(1,2);
        System.out.print(fk);
        gettingUserDataProfit(Integer.parseInt(fk));
    }//GEN-LAST:event_jButton4ActionPerformed

    public static String accname;
    public static String password;
    public static int startbal;
    public static int reambal;
    public static int refstartamt;
    public void getaccnamestartbal(String accname,int startbal,String password){
        System.out.println("came to getting function");
        this.accname = accname;
        this.password = password;
        this.startbal = startbal;
        this.refstartamt = startbal;
        System.out.println(accname + password + startbal);
        
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
            java.util.logging.Logger.getLogger(CalculationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
