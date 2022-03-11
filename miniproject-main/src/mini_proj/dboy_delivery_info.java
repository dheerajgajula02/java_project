/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mini_proj;

import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;


public class dboy_delivery_info extends javax.swing.JFrame {

    /**
     * Creates new form dboy_delivery_info
     */
    public dboy_delivery_info() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(406, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(119, 51, 240));
        jButton1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("CLICK HERE TO SEE NEXT DELIVERY ");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(55, 40, 280, 65);

        jButton2.setBackground(new java.awt.Color(119, 51, 240));
        jButton2.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 240, 240));
        jButton2.setText("CLICK HERE IF THE ITEM IS DELIVERED");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(57, 150, 280, 66);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dboydelivinfopageimg.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 410, 280);

        jMenu1.setText("LOG OUT");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Courier New", 3, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.jpg"))); // NOI18N
        jMenuItem1.setText("LOG OUT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //on clicking CLICK HERE TO SEE NEXT DELIVERY
        JSONArray spl_customer_jrr=new JSONArray();
        JSONArray non_spl_customer_jrr=new JSONArray();
        
        Object ob1=null;
        Object ob2=null;
        
        JSONParser Jp1=new JSONParser();
        JSONParser Jp2=new JSONParser();
        
        try{
            FileReader spl_customer_file=new FileReader("rdeliveryspecialcustomerfile.json");
            ob1=Jp1.parse(spl_customer_file);
            spl_customer_jrr=(JSONArray)ob1;
            spl_customer_file.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING spl customer  FILE");
        }
        
        try{
            FileReader non_spl_customer_file=new FileReader("rdeliverynonspecialcustomerfile.json");
            ob2=Jp2.parse(non_spl_customer_file);
            non_spl_customer_jrr=(JSONArray)ob2;
            non_spl_customer_file.close();
        }
        catch(Exception e2)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING non spl FILE");
        }
              
        
        if(spl_customer_jrr.size()!=0)
        {
            JOptionPane.showMessageDialog(null,spl_customer_jrr.get(0));
        }
        else if(non_spl_customer_jrr.size()!=0)
        {
            JOptionPane.showMessageDialog(null,non_spl_customer_jrr.get(0));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No new deliveries!");
        }
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //on clicking item delivered
        
        JSONArray spl_customer_jrr=new JSONArray();
        JSONArray non_spl_customer_jrr=new JSONArray();
        
        Object ob1=null;
        Object ob2=null;
        
        JSONParser Jp1=new JSONParser();
        JSONParser Jp2=new JSONParser();
        
        try{
            FileReader spl_customer_file=new FileReader("rdeliveryspecialcustomerfile.json");
            ob1=Jp1.parse(spl_customer_file);
            spl_customer_jrr=(JSONArray)ob1;
            spl_customer_file.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING spl customer  FILE");
        }
        
        try{
            FileReader non_spl_customer_file=new FileReader("rdeliverynonspecialcustomerfile.json");
            ob2=Jp2.parse(non_spl_customer_file);
            non_spl_customer_jrr=(JSONArray)ob2;
            non_spl_customer_file.close();
        }
        catch(Exception e2)
        {
            JOptionPane.showMessageDialog(null,"ERROR OCCURED WHILE READING non spl FILE");
        }
              
        
        if(spl_customer_jrr.size()!=0)
        {
            try{
                FileWriter spl_customer_file=new FileWriter("rdeliveryspecialcustomerfile.json");
                spl_customer_jrr.remove(0);
                spl_customer_file.write(spl_customer_jrr.toJSONString());
                spl_customer_file.close();
            }
            catch(Exception ex1)
            {
                JOptionPane.showMessageDialog(null, "Error occured while fetching");
            }
        }
        else if(non_spl_customer_jrr.size()!=0)
        {
            try{
                FileWriter non_spl_customer_file=new FileWriter("rdeliverynonspecialcustomerfile.json");
                non_spl_customer_jrr.remove(0);
                non_spl_customer_file.write(non_spl_customer_jrr.toJSONString());
                non_spl_customer_file.close();
            }
            catch(Exception ex1)
            {
                JOptionPane.showMessageDialog(null, "Error occured while fetching");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"INVALID OPERATION");
        }
        JOptionPane.showMessageDialog(null,"ITEM DELIVERED! WELL DONE!");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //on clicking log out
        
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(dboy_delivery_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dboy_delivery_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dboy_delivery_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dboy_delivery_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dboy_delivery_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
