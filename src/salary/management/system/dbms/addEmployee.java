/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary.management.system.dbms;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author TARIF
 */
public class addEmployee extends javax.swing.JFrame {

  
    public addEmployee() {
        initComponents();
     //  conn=DBMS.db();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_firstname = new javax.swing.JTextField();
        txt_surename = new javax.swing.JTextField();
        txt_birth = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_padd = new javax.swing.JTextField();
        txt_peradd = new javax.swing.JTextField();
        txt_house = new javax.swing.JTextField();
        txt_code = new javax.swing.JTextField();
        txt_depertment = new javax.swing.JTextField();
        txt_designation = new javax.swing.JTextField();
        txt_hired = new javax.swing.JTextField();
        txt_basicSalary = new javax.swing.JTextField();
        txt_title = new javax.swing.JTextField();
        txt_status = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        c_gender = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        jButton_Delete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        tfilename = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        txt_firstname.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_firstname);
        txt_firstname.setBounds(220, 210, 270, 40);

        txt_surename.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_surename);
        txt_surename.setBounds(220, 270, 270, 40);

        txt_birth.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_birth);
        txt_birth.setBounds(220, 330, 270, 40);

        txt_email.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_email);
        txt_email.setBounds(220, 390, 270, 40);

        txt_contact.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_contact);
        txt_contact.setBounds(220, 450, 270, 40);

        txt_padd.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_padd);
        txt_padd.setBounds(220, 510, 270, 40);

        txt_peradd.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_peradd);
        txt_peradd.setBounds(220, 570, 270, 40);

        txt_house.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_house);
        txt_house.setBounds(770, 140, 270, 40);

        txt_code.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_code);
        txt_code.setBounds(770, 200, 270, 40);

        txt_depertment.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_depertment);
        txt_depertment.setBounds(770, 260, 270, 40);

        txt_designation.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_designation);
        txt_designation.setBounds(770, 320, 270, 40);

        txt_hired.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_hired);
        txt_hired.setBounds(770, 380, 270, 40);

        txt_basicSalary.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_basicSalary);
        txt_basicSalary.setBounds(770, 440, 270, 40);

        txt_title.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_title);
        txt_title.setBounds(770, 500, 270, 40);

        txt_status.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(txt_status);
        txt_status.setBounds(770, 560, 270, 40);

        txt_id.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id);
        txt_id.setBounds(220, 150, 270, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 220, 160, 21);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Surname:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 280, 130, 21);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Date of Birth:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 340, 160, 21);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(120, 400, 80, 21);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Contact:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 460, 110, 21);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Present Address:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 520, 190, 21);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 255, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("permanent Address:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-20, 580, 230, 21);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Gender:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 630, 120, 21);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Apt./house No:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(570, 150, 190, 21);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Post Code:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(600, 210, 160, 21);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 255, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Department:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(590, 270, 170, 21);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Designation:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(580, 330, 180, 21);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Date Hired:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(610, 390, 150, 21);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Basic Salary:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(600, 450, 160, 21);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Job Title:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(600, 510, 160, 21);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Status:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(680, 570, 80, 21);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 255, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Employee ID:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 160, 170, 21);

        c_gender.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        c_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female", "Custom" }));
        jPanel1.add(c_gender);
        c_gender.setBounds(220, 630, 270, 30);

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(860, 650, 85, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Search Employee:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 60, 200, 27);

        txt_search.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        jPanel1.add(txt_search);
        txt_search.setBounds(220, 60, 810, 30);

        jButton_Delete.setBackground(new java.awt.Color(153, 0, 0));
        jButton_Delete.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton_Delete.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_Delete);
        jButton_Delete.setBounds(960, 650, 105, 40);

        jButtonUpdate.setBackground(new java.awt.Color(0, 153, 153));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate);
        jButtonUpdate.setBounds(710, 650, 120, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salary/management/system/dbms/images/Screenshot (248).png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1266, 798));
        jPanel1.add(background);
        background.setBounds(-10, -10, 1370, 810);
        jPanel1.add(tfilename);
        tfilename.setBounds(0, 90, 10, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
        txt_id.setEditable(false);
    }//GEN-LAST:event_txt_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showConfirmDialog(null, "Are You sure want to clear?","Clear",JOptionPane.YES_NO_OPTION);
     if(x==0){
          txt_id.setEditable(false);
        txt_id.setText("");
          // int id=Integer.parseInt(s1);
           txt_firstname.setText("");
           txt_surename.setText("");
           txt_birth.setText("");
           //int dob=Integer.parseInt(s2);
           txt_email.setText("");
           txt_contact.setText("");
           txt_padd.setText("");
           txt_peradd.setText("");
           c_gender.setSelectedItem("");
           txt_house.setText("");
          txt_code.setText("");
           txt_depertment.setText("");
           txt_designation.setText("");
           txt_hired.setText("");
           //int doh=Integer.parseInt(s3);
           txt_basicSalary.setText("");
           txt_title.setText("");
          txt_status.setText("");
          txt_search.setText("");
         // img.setText("");
          
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String password="";
            String url="jdbc:mysql://127.0.0.1:3306/salary management system dbms?serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement statment = conn.createStatement();
          String s=txt_search.getText();
          int i=Integer.parseInt(s);
            String sql="SELECT* FROM `staff information` WHERE `id`="+i+"";
            ResultSet rs;
            rs=statment.executeQuery(sql);
            rs.next();
            String add1=rs.getString("id");
             txt_id.setEditable(false);
            txt_id.setText(add1);
            String add2=rs.getString("First_Name");
            txt_firstname.setText(add2);
            String add3=rs.getString("Surname");
            txt_surename.setText(add3);
            String add4=rs.getString("Date_Of_Birth");
            txt_birth.setText(add4);
            String add5=rs.getString("Email");
            txt_email.setText(add5);
            String add6=rs.getString("Contact");
            txt_contact.setText(add6);
            String add7=rs.getString("Gender");
            c_gender.setSelectedItem(add7);
            String add8=rs.getString("Present_Address");
            txt_padd.setText(add8);
            String add9=rs.getString("Permanent_Address");
            txt_peradd.setText(add9);
            String add10=rs.getString("Department");
            txt_depertment.setText(add10);
            txt_depertment.setEditable(false);
            String add12=rs.getString("Salary");
            txt_basicSalary.setText(add12);
            txt_basicSalary.setEditable(false);
            String add13=rs.getString("Apartment");
            txt_house.setText(add13);
            String add14=rs.getString("Post_Code");
            txt_code.setText(add14);
            String add15=rs.getString("Designation");
            txt_designation.setText(add15);
            txt_designation.setEditable(false);
            String add16=rs.getString("Status");
            txt_status.setText(add16);
            String add17=rs.getString("Date_Hired");
            txt_hired.setText(add17);
            String add18=rs.getString("Job_Title");
            txt_title.setText(add18);
            txt_title.setEditable(false);
            
           
            statment.close();
            conn.close();
            
        }catch(Exception e)
        {
           
        }
        
        
        
        
        
        
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showConfirmDialog(null, "Are You sure want to delete?","Delete",JOptionPane.YES_NO_OPTION);
     if(x==0){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String password="";
            String url="jdbc:mysql://127.0.0.1:3306/salary management system dbms?serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement statment = conn.createStatement();
             txt_id.setEditable(false);
            String i=txt_id.getText();
            int id=Integer.parseInt(i);
            String sql="DELETE FROM `staff information` WHERE id="+id+"";
            statment.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Successfully Deleted");
           statment.close();
           conn.close();
        }catch(Exception e)
        {
          //  JOptionPane.showMessageDialog(null, "");
        }
        
    }//GEN-LAST:event_jButton_DeleteActionPerformed
    }
    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        int x=JOptionPane.showConfirmDialog(null, "Are You sure want to update record?","Update",JOptionPane.YES_NO_OPTION);
     if(x==0){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String password="";
            String url="jdbc:mysql://127.0.0.1:3306/salary management system dbms?serverTimezone=UTC";
            Connection conn = DriverManager.getConnection(url,user,password);
            Statement statment = conn.createStatement();
             txt_id.setEditable(false);
            String s1=txt_id.getText();
           int id=Integer.parseInt(s1);
           String fname=txt_firstname.getText();
           String sname=txt_surename.getText();
           String dob=txt_birth.getText();
           //int dob=Integer.parseInt(s2);
           
           String email=txt_email.getText();
           String contact=txt_contact.getText();
           String paddress=txt_padd.getText();
           String peraddress=txt_peradd.getText();
           String gender=c_gender.getSelectedItem().toString();
           String house=txt_house.getText();
           String post=txt_code.getText();
           String department=txt_depertment.getText();
           String designation=txt_designation.getText();
           String doh=txt_hired.getText();
           String salary=txt_basicSalary.getText();
          String title=txt_title.getText();
          String status=txt_status.getText();
          String sql="UPDATE `staff information` SET `id`="+id+",`First_Name`='"+fname+"',`Surname`='"+sname+"',`Date_Of_Birth`='"+dob+"',`Email`='"+email+"',`Contact`='"+contact+"',`Gender`='"+gender+"',`Present_Address`='"+paddress+"',`Permanent_Address`='"+peraddress+"',`Department`='"+department+"',`Salary`='"+salary+"',`Apartment`='"+house+"',`Post_Code`='"+post+"',`Designation`='"+designation+"',`Status`='"+status+"',`Date_Hired`='"+doh+"',`Job_Title`='"+title+"' WHERE id="+id+"";
         String sid=txt_search.getText();
         int sid1=Integer.parseInt(sid);
         if(sid1==id){
          statment.executeUpdate(sql);
          
          JOptionPane.showMessageDialog(this,"Successfully Updated");
         }
         else{
             JOptionPane.showMessageDialog(this,"ID Cannot be Update");
         }
         statment.close();
          conn.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Wrong ID ");
        }
        
    }//GEN-LAST:event_jButtonUpdateActionPerformed
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
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> c_gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfilename;
    private javax.swing.JTextField txt_basicSalary;
    private javax.swing.JTextField txt_birth;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_depertment;
    private javax.swing.JTextField txt_designation;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_hired;
    private javax.swing.JTextField txt_house;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_padd;
    private javax.swing.JTextField txt_peradd;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_status;
    private javax.swing.JTextField txt_surename;
    private javax.swing.JTextField txt_title;
    // End of variables declaration//GEN-END:variables

}
