/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FootballTeamManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author jayakrishnan
 */
public class Login extends javax.swing.JFrame {

 Connection conn;
  Statement st; 
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setTitle("Log In ");
        this.setIconImage(new ImageIcon(getClass().getResource("logo.jpg")).getImage());
   
         try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
             conn=DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl", "scott",
					"password");
             st=conn.createStatement();
   
        }
        catch(Exception e)
        {
             System.out.println(e);
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

        jPanel1 = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Username.setToolTipText("");
        Username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Username", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), java.awt.Color.black)); // NOI18N
        Username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Username.setSelectionColor(new java.awt.Color(255, 51, 51));
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsernameKeyPressed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)), "Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), java.awt.Color.black)); // NOI18N
        Password.setSelectionColor(new java.awt.Color(255, 51, 51));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Log In");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), new java.awt.Color(204, 204, 204)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(109, 109, 109))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-339)/2, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void UsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            login();
        }
    }//GEN-LAST:event_UsernameKeyPressed

    private void PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
        {
            login();
        }

    }//GEN-LAST:event_PasswordKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        login();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER)
               {
                   login();
                   
               }
    }//GEN-LAST:event_jButton1KeyPressed

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
                try{
                    Thread.sleep(8000);
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }
                new Login().setVisible(true);
            }
        });
    }
    
    public void login(){
        String U=Username.getText();
        String P = Password.getText();
        int count=0;
           try{
                ResultSet r = st.executeQuery("SELECT COUNT(*) FROM login where username='"+U+"'and password='" +P+"'");
                r.next();
                count= r.getInt(1);
                r.close(); 
                

        }
        catch(Exception e)
        {
             System.out.println(e);
        }
       // if (P.equals(pas) && use.equals(U) && adm==true)  {// sql return 1 row 
        if(count==1){ 
        this.dispose();
             try{
              ResultSet r = st.executeQuery("SELECT isadmin FROM login where username='"+U+"'and password='" +P+"'");
                r.next();
                    if(r.getInt(1)==1){
                    AdminFace a = new AdminFace();
                    a.setVisible(true);
                    }
                    else {
                    UserFace u = new UserFace();
                    u.setVisible(true);
                    }      
}catch(Exception e)
        {
             System.out.println(e);
        }
        }
        else {
                    JOptionPane.showMessageDialog(this, "Error Occured!.\nUserName or Password Error .\n Try Again. ");
                 if(U.length()==0){
                     Username.requestFocus();
                 }
                 else if(P.length()==0)  {
                   Password.requestFocus();
                 }
        }     
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
