/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import dhp.DHPMAIN;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC-COLLEGE
 */
public class AddAdmin extends javax.swing.JFrame {

    /**
     * Creates new form AddAdmin
     */
    public AddAdmin() {
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

        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField3.setText("jTextField1");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField2.setText("jTextField1");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField9.setText("jTextField1");
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel3.setText("FIRSTNAME");

        jTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTER USER");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 30));

        fname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 51, 199, -1));

        lname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 95, 199, -1));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 134, 199, -1));

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 173, 199, -1));

        type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Patient" }));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 200, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("FIRSTNAME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 54, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("LASTNAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 98, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("USERNAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 137, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("EMAIL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 176, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("TYPE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-user-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, -1, 100));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ProBook\\Desktop\\DHP-DESTINADO-IT2B-GUI\\src\\icons\\log in bg.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 240, 450, 320));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setText("EXIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 110, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ProBook\\Downloads\\back.jpg")); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -180, 460, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DHPMAIN m = new DHPMAIN();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
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
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lname;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
