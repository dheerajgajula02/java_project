/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mini_proj;

import java.io.FileReader;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class sign_in_page extends javax.swing.JFrame {

    /**
     * Creates new form sign_in_page
     */
    public sign_in_page() {
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
        loginusername = new javax.swing.JTextField();
        loginpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EXPRESS DISPATCH-SIGN IN");
        setMinimumSize(new java.awt.Dimension(601, 362));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel1.setText("USERNAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 40, 180, 21);

        jLabel2.setFont(new java.awt.Font("Courier New", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 120, 160, 21);

        loginusername.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        getContentPane().add(loginusername);
        loginusername.setBounds(180, 70, 210, 20);
        getContentPane().add(loginpassword);
        loginpassword.setBounds(180, 160, 210, 22);

        jButton1.setBackground(new java.awt.Color(119, 51, 255));
        jButton1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("CUSTOMERLOGIN");
        jButton1.setActionCommand("CUSTOMER LOGIN");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 240, 160, 23);

        jButton2.setBackground(new java.awt.Color(119, 51, 255));
        jButton2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("DELIVERY BOY LOGIN");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(320, 240, 170, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home_page_image.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 340);

        jMenu3.setText("HOME");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/home.jpg"))); // NOI18N
        jMenuItem1.setText("HOME");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu2.setBackground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("NEW USER");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sign_up.png"))); // NOI18N
        jMenuItem2.setText("SIGN UP");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        new sign_up_page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //on clicking login
        JSONArray username_jrr=new JSONArray();
        JSONArray password_jrr=new JSONArray();
        JSONArray spl_customer_jrr=new JSONArray();
        
        Object ob1=null;
        Object ob2=null;
        Object ob3=null;
        
        JSONParser Jp1=new JSONParser();
        JSONParser Jp2=new JSONParser();
        JSONParser Jp3=new JSONParser();
        
        try{
            FileReader username_file=new FileReader("usernamefile.json");
            ob1=Jp1.parse(username_file);
            username_jrr=(JSONArray)ob1;
            username_file.close();
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING USERNAME FILE");
        }
        
        try{
            FileReader password_file=new FileReader("passwordfile.json");
            ob2=Jp2.parse(password_file);
            password_jrr=(JSONArray)ob2;
            password_file.close();
        }
        catch(Exception e2)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING PASSWORD FILE");
        }
        
        try{
            FileReader spl_customer_file=new FileReader("specialcustomerfile.json");
            ob3=Jp3.parse(spl_customer_file);
            spl_customer_jrr=(JSONArray)ob3;
            spl_customer_file.close();
        }
        catch(Exception e3)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING SPECIAL CUSTOMER FILE");
        }
        
        JSONObject username_obj=new JSONObject();
        int usernames_size=username_jrr.size();
        username_obj.put("username", loginusername.getText());
        
        JSONObject password_obj=new JSONObject();
        int passwords_size=password_jrr.size();
        password_obj.put("password", loginpassword.getText());
        
        JSONObject spl_customer_obj_yes=new JSONObject();
        spl_customer_obj_yes.put("special_customer", "YES");
        JSONObject spl_customer_obj_no=new JSONObject();
        spl_customer_obj_no.put("special_customer", "NO");
        
        
        for(int i=0;i<usernames_size;i++)
        {
            if(username_obj.equals(username_jrr.get(i)) && password_obj.equals(password_jrr.get(i)))
            {
                JOptionPane.showMessageDialog(null, "login successful");
                
                
                if(spl_customer_obj_yes.equals(spl_customer_jrr.get(i)))//if he is a special customer
                {
                    new first_page().setVisible(true);
                }
                else if(spl_customer_obj_no.equals(spl_customer_jrr.get(i)))//if hi is not a special customer
                {
                    new multiple_options_page().setVisible(true);
                }
                this.setVisible(false);
                break;
            
            }
            else if(i==usernames_size-1)
            {
                JOptionPane.showMessageDialog(null,"password incorrect");
            
            }  
        }

     

        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //on clicking home
        
        this.setVisible(false);


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //on clicking delivery boy login
        
        JSONArray dboy_username_jrr=new JSONArray();
        JSONArray dboy_password_jrr=new JSONArray();
        
        
        Object ob1=null;
        Object ob2=null;
        
        
        JSONParser Jp1=new JSONParser();
        JSONParser Jp2=new JSONParser();
        
        
        try{
            FileReader dboy_username_file=new FileReader("dboyusernamefile.json");
            ob1=Jp1.parse(dboy_username_file);
            dboy_username_jrr=(JSONArray)ob1;
            dboy_username_file.close();
        }
        catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING DBOY USERNAME FILE");
        }
        
        try{
            FileReader dboy_password_file=new FileReader("dboypasswordfile.json");
            ob2=Jp2.parse(dboy_password_file);
            dboy_password_jrr=(JSONArray)ob2;
            dboy_password_file.close();
        }
        catch(Exception e2)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING DBOY PASSWORD FILE");
        }
        
        
        
        JSONObject dboy_username_obj=new JSONObject();
        int dboy_usernames_size=dboy_username_jrr.size();
        dboy_username_obj.put("dboyusername", loginusername.getText());
        
        JSONObject dboy_password_obj=new JSONObject();
        int dboy_passwords_size=dboy_password_jrr.size();
        dboy_password_obj.put("dboypassword", loginpassword.getText());
        
        
        
        
        for(int i=0;i<dboy_usernames_size;i++)
        {
            if(dboy_username_obj.equals(dboy_username_jrr.get(i)) && dboy_password_obj.equals(dboy_password_jrr.get(i)))
            {
                JOptionPane.showMessageDialog(null, "login successful");
                
                new dboy_delivery_info().setVisible(true);


                this.setVisible(false);
                
                break;
            
            }
            else if(i==dboy_usernames_size-1)
            {
                JOptionPane.showMessageDialog(null,"Username/Password incorrect");
            
            }  
        }
        
        

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
            java.util.logging.Logger.getLogger(sign_in_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_in_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_in_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_in_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_in_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPasswordField loginpassword;
    private javax.swing.JTextField loginusername;
    // End of variables declaration//GEN-END:variables
}
