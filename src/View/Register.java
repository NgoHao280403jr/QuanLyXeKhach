/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Database.ConnectOracle;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;
    /**
     * Creates new form Register

/**
 *
 * @author ADMIN
 */

public class Register extends javax.swing.JFrame {
    private void loadAllDataTablespace() throws ClassNotFoundException {
        try (Connection conn = ConnectOracle.getConnecOracle()) {
            try (CallableStatement cstmt = conn.prepareCall("{call sys.GetAllTablespaces(?)}")) {
                cstmt.registerOutParameter(1, OracleTypes.CURSOR); 
                cstmt.execute();
                try (ResultSet rs = (ResultSet) cstmt.getObject(1)) {
                    while (rs.next()) {
                        String tbsName = rs.getString("tablespace_name");
                        cbbTBSName.addItem(tbsName);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public Register() throws ClassNotFoundException {
        initComponents();
        loadAllDataTablespace();
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
        txtTK = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMK = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtReMK = new javax.swing.JPasswordField();
        btnDK = new javax.swing.JButton();
        btnDN = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbbTBSName = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtQuota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("ĐĂNG KÝ");

        jLabel2.setText("Tài khoản:");

        txtTK.setName("txtTK"); // NOI18N

        jLabel3.setText("Gmail:");

        txtGmail.setName("txtGmail"); // NOI18N

        jLabel4.setText("Mật khẩu");

        txtMK.setName("txtPass"); // NOI18N

        jLabel5.setText("Nhập lại mật khẩu:");

        txtReMK.setName("txtRePass"); // NOI18N

        btnDK.setText("Đăng ký");
        btnDK.setName("txtDK"); // NOI18N
        btnDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDKActionPerformed(evt);
            }
        });

        btnDN.setText("Đăng nhập");
        btnDN.setName("txtDN"); // NOI18N
        btnDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDNActionPerformed(evt);
            }
        });

        jLabel6.setText("Tên Tablespace:");

        cbbTBSName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn tên tablespace" }));

        jLabel7.setText("Bộ nhớ Quota:");

        txtQuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtReMK, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(txtMK, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(txtGmail, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtTK, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDK, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbbTBSName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuota)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReMK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbTBSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtQuota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDNActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnDNActionPerformed
    public static void createUser(String username, String password, String tbsName, String quotaSize) throws SQLException, ClassNotFoundException {
        String call = "{ call create_user_with_grants(?, ?, ?, ?) }";
        try (Connection conn = ConnectOracle.getConnecOracle();
             CallableStatement stmt = conn.prepareCall(call);) {
             
            stmt.setString(1, username); // 
            stmt.setString(2, password); 
            stmt.setString(3, tbsName); 
            stmt.setString(4, quotaSize); 
            stmt.execute();

            stmt.close();
            conn.close();
        }
    }
    public static String hashPassword(String password) {
        String hashedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            byte[] bytes = md.digest(password.getBytes());
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            
            hashedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashedPassword;
    }
    private void btnDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDKActionPerformed
        try {
            // TODO add your handling code here:
            Connection con = ConnectOracle.getConnecOracle();
            String tk = txtTK.getText().toString();
            String mail = txtGmail.getText();
            String pass = txtMK.getText().toString();
            String rePass = txtReMK.getText().toString();
            String tenTBS = (String) cbbTBSName.getSelectedItem();
            String quotaSize = txtQuota.getText();
            String hashPass = hashPassword(pass);
            if(pass.equals(rePass)) {
                String insertUserSql = "INSERT INTO khachhang(TenDangNhap, EMAIL) VALUES (?, ?)";
                PreparedStatement pstmt;
                try {
                    pstmt = con.prepareStatement(insertUserSql);
                    pstmt.setString(1, tk);
                    pstmt.setString(2, mail);
                    int rowsAffected = pstmt.executeUpdate(); // Số hàng được thêm, nếu > 0 thì thành công
                    if(rowsAffected > 0) {
                        JOptionPane.showMessageDialog(new JFrame(), "Đăng ký thành công", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                        Login login = new Login();
                        login.setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(new JFrame(), "Đăng ký thất bại", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                    }
                    createUser(tk, pass, tenTBS, quotaSize);
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnDKActionPerformed
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

    private void txtQuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuotaActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDK;
    private javax.swing.JButton btnDN;
    private javax.swing.JComboBox<String> cbbTBSName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtGmail;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtQuota;
    private javax.swing.JPasswordField txtReMK;
    private javax.swing.JTextField txtTK;
    // End of variables declaration//GEN-END:variables
}
