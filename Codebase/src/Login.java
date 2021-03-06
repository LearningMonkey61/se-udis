
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anurag
 */

public class Login extends javax.swing.JFrame {
    
    public String useridtest, passwordtest;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabelMin = new javax.swing.JLabel();
        LabelClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        log = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        stu = new javax.swing.JRadioButton();
        admin = new javax.swing.JRadioButton();
        fac = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(63, 195, 128));

        jLabel2.setFont(new java.awt.Font("Nexa Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LOGIN");

        LabelMin.setFont(new java.awt.Font("Nexa Bold", 1, 36)); // NOI18N
        LabelMin.setForeground(new java.awt.Color(255, 255, 255));
        LabelMin.setText("-");
        LabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelMinMouseClicked(evt);
            }
        });

        LabelClose.setFont(new java.awt.Font("Nexa Bold", 1, 36)); // NOI18N
        LabelClose.setForeground(new java.awt.Color(255, 255, 255));
        LabelClose.setText("X");
        LabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelMin)
                .addGap(18, 18, 18)
                .addComponent(LabelClose)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LabelMin)
                    .addComponent(LabelClose))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username :");

        jLabel5.setFont(new java.awt.Font("Myriad Pro Light", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password :");

        user.setBackground(new java.awt.Color(189, 195, 199));
        user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user.setForeground(new java.awt.Color(34, 49, 63));

        pass.setBackground(new java.awt.Color(189, 195, 199));
        pass.setForeground(new java.awt.Color(34, 49, 63));

        log.setBackground(new java.awt.Color(25, 181, 254));
        log.setFont(new java.awt.Font("Myriad Pro Light", 0, 14)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("Login");
        log.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
        });
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(214, 69, 65));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("click here to create a new Student account");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("click here to create a new Faculty account");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        stu.setBackground(new java.awt.Color(165, 214, 167));
        buttonGroup1.add(stu);
        stu.setForeground(new java.awt.Color(255, 255, 255));
        stu.setSelected(true);
        stu.setText("Student");
        stu.setBorder(null);
        stu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        admin.setBackground(new java.awt.Color(165, 214, 167));
        buttonGroup1.add(admin);
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setText("Admin");
        admin.setBorder(null);
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        fac.setBackground(new java.awt.Color(165, 214, 167));
        buttonGroup1.add(fac);
        fac.setForeground(new java.awt.Color(255, 255, 255));
        fac.setText("Faculty");
        fac.setBorder(null);
        fac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(user)
                                    .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(stu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(93, 93, 93)
                            .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fac, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_LabelCloseMouseClicked

    private void LabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_LabelMinMouseClicked

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        String uid = user.getText();
        String password = pass.getText();
        
    }//GEN-LAST:event_logActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Register rgf = new Register();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        user.setText(null);
        pass.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void logMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logMouseClicked
        
        if ( stu.isSelected()){
            try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"1234");
            String sql = "Select * from student where uiddb = ? and password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,pass.getText());
            String uid = user.getText();
            useridtest = uid;
            passwordtest = null;
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                passwordtest = pass.getText();
                HomeStuCourses hsf = new HomeStuCourses(uid);
                hsf.setVisible(true);
                hsf.pack();
                hsf.setLocationRelativeTo(null);
                hsf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                error sf = new error("SUCCESSFUL","Login Successful!");
                sf.setVisible(true);
                sf.pack();
                sf.setLocationRelativeTo(null);
                this.dispose();
                
                
            } else {
                error sf = new error("ERROR","Invalid userid or password!");
                sf.setVisible(true);
                sf.pack();
                sf.setLocationRelativeTo(null);
                user.setText(null);
                pass.setText(null);
            }
            conn.close();
            
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (fac.isSelected()){
            try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"1234");
            String sql = "Select * from faculty where uiddb = ? and password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,pass.getText());
            String uid = user.getText();
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                HomeFac hsf = new HomeFac(uid);
                hsf.setVisible(true);
                hsf.pack();
                hsf.setLocationRelativeTo(null);
                hsf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                error sf = new error("SUCCESSFUL","Login Successful!");
                sf.setVisible(true);
                sf.pack();
                sf.setLocationRelativeTo(null);
                this.dispose();
                
                
            } else {
                error sf = new error("ERROR","Invalid userid or password!");
                sf.setVisible(true);
                sf.pack();
                sf.setLocationRelativeTo(null);
                user.setText(null);
                pass.setText(null);
            }
            conn.close();
            
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (admin.isSelected()) {
            try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"1234");
            String sql = "Select * from admin where uiddb = ? and password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,pass.getText());
            String uid = user.getText();
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                HomeAdmin hsf = new HomeAdmin("Admin12");
                hsf.setVisible(true);
                hsf.pack();
                hsf.setLocationRelativeTo(null);
                hsf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                error sf = new error("SUCCESSFUL","Login Successful!");
                sf.setVisible(true);
                sf.pack();
                sf.setLocationRelativeTo(null);
                this.dispose();
                
                
            } else {
                error sf = new error("ERROR","Invalid userid or password!");
                sf.setVisible(true);
                sf.pack();
                sf.setLocationRelativeTo(null);
                user.setText(null);
                pass.setText(null);
            }
            conn.close();
            
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_logMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        RegisterFac rgf = new RegisterFac();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    protected void Clickstu (){
        stu.doClick();
    }
    protected void Clickfac (){
        fac.doClick();
    }
    protected void Clickadmin (){
        admin.doClick();
    }
    protected void Clicklogin (){
        try {
            String table = new String();
            if ( stu.isSelected())
                table = "student";
            else if ( fac.isSelected())
                table = "faculty";
            else table = "admin";
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root" ,"1234");
            String sql = "Select * from "+table+" where uiddb = ? and password = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,pass.getText());
            String uid = user.getText();
            useridtest = uid;
            passwordtest = null;
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                passwordtest = pass.getText();
                this.dispose();
                
                
            } else {
                user.setText(null);
                pass.setText(null);
            }
            conn.close();
            
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    protected void setuser ( String us ){
        user.setText(us);
    }
    protected void setpass ( String us ){
        pass.setText(us);
    }
    
    protected String checklogin (){
        return useridtest;
    }
    protected String checkpass (){
        return passwordtest;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelClose;
    private javax.swing.JLabel LabelMin;
    private javax.swing.JRadioButton admin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton fac;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton log;
    private javax.swing.JPasswordField pass;
    private javax.swing.JRadioButton stu;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
