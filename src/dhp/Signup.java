/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhp;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC-COLLEGE
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form fillup
     */
    public Signup() {
        initComponents();
    }
    
    public static String em,usname;
   

    
    public boolean duplicateCheck()
    {
        dbConnector dbc = new dbConnector();
        String e = email.getText().trim();
        String us = username.getText().trim();
        
        try
        {
            String query = "SELECT * FROM tbl_user WHERE u_username='"+ us +"'OR u_email='"+ e +"'";
            ResultSet resultSet = dbc.getData(query);
            if(resultSet.next())
            {
                em = resultSet.getString("u_email");
                if(em.equals(e))
                {
                    JOptionPane.showMessageDialog(null, "Email is Already Used");
                    email.setText("");
                }
                
                usname = resultSet.getString("u_username");
                if(usname.equals(us))
                {
                    JOptionPane.showMessageDialog(null, "Username is Already Used");
                    username.setText("");
                }
                return true;
            }else
            {
                return false;
            }
        }catch(SQLException ex)
        {
            System.out.println(""+ex);
            return false;
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel41 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        stats = new javax.swing.JLabel();
        age1 = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        stats1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        dob1 = new javax.swing.JLabel();
        Cpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel41.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setText("FIRSTNAME");
        jPanel41.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 80, 30));

        age.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        age.setText("LASTNAME");
        jPanel41.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 80, 30));

        address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address.setText("USERNAME");
        jPanel41.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 80, 30));

        dob.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob.setText("PASSWORD");
        jPanel41.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 80, 30));

        phone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phone.setText("EMAIL");
        jPanel41.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 50, 30));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel41.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 270, 30));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel41.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 270, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel41.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 270, 30));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel41.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 270, 30));
        jPanel41.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel41.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGN UP FORM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 840, 50));

        jPanel41.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 70));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setText("BACK");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel41.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 190, 40));

        stats.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stats.setText("TYPE");
        jPanel41.add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 40, 30));
        jPanel41.add(age1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 270, 30));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Patient" }));
        jPanel41.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 270, 30));

        stats1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stats1.setText("AGE");
        jPanel41.add(stats1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 40, 30));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setText("REGISTER");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel41.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 190, 40));
        jPanel41.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 270, 30));

        dob1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dob1.setText("CONFIRM PASSWORD");
        jPanel41.add(dob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 150, 30));
        jPanel41.add(Cpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        DHPMAIN m = new DHPMAIN();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
    dbConnector dbc = new dbConnector();
    String fn = fname.getText().trim();
    String ln = lname.getText().trim();
    String uname = username.getText().trim();
    String pass = new String(password.getPassword()).trim();
    String Cpass = new String(Cpassword.getPassword()).trim();
    String e = email.getText().trim();
    String a = age1.getText().trim();
    String at = type.getSelectedItem().toString().trim();
    



        if(uname.isEmpty() || pass.isEmpty() || Cpass.isEmpty() || ln.isEmpty() || fn.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please Fill All Boxes");

        }else if(!pass.equals(Cpass))
        {
            JOptionPane.showMessageDialog(null, "Password Does Not Match");
            //System.out.println("Password ["+password+"] Length: "+password.length());
            //System.out.println("Confirm Password ["+Cpassword+"] Length: "+Cpassword.length());
        }else if (!isValidEmail(e)) {
            JOptionPane.showMessageDialog(null, "Invalid email format!");
             }else if(duplicateCheck())
        {
            System.out.println("Duplicate Exists");
        }else if (dbc.insertData("INSERT INTO tbl_user (u_fname, u_lname, u_username, u_type, u_password, u_email, u_age, u_status) "
        + "VALUES ('" + fn + "', '" + ln + "', '" + uname + "', '"+at+"','" + pass + "', '" + e + "', '" + a + "', 'Pending')")) 
        {
            JOptionPane.showMessageDialog(null, "Registered succesfully!");
            DHPMAIN d = new DHPMAIN();
            d.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Cpassword;
    private javax.swing.JLabel address;
    private javax.swing.JLabel age;
    private javax.swing.JTextField age1;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel dob1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel name;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel stats;
    private javax.swing.JLabel stats1;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables



    private boolean isValidEmail(String text) {
    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    return matcher.matches();

    }

    private boolean isNumeric(String text) {
        try {
        Double.parseDouble(text);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
    }
}
