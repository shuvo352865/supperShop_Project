/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.awt.Desktop;
import java.sql.*;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import login.Home_Page;
import login.add_employee;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author hp
 */
public class employee extends javax.swing.JFrame {

    /**
     * Creates new form employee
     */
    public employee() {
        initComponents();
        
         Connect();
      table_load();
        
    }
    
     Connection con;
PreparedStatement pst;
ResultSet rs;
public void Connect()
    {
        try {
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/super_shop", "root","");
        }
        catch (Exception e)
        {
        }
    }
    

   public void table_load()
	    {
	    	try 
	    	{
		    pst = con.prepareStatement("select * from employee_details");
		    rs = pst.executeQuery();
		  jTable.setModel(DbUtils.resultSetToTableModel(rs));
		} 
	    	catch (SQLException e) 
	    	 {
	    		e.printStackTrace();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addnew = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pics/employee_1.png"))); // NOI18N
        jLabel1.setText("  Employee Information ");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 180, 750, 64);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Designed By Team c");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(930, 950, 140, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pics/teamc.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1070, 910, 60, 80);

        addnew.setBackground(new java.awt.Color(204, 102, 0));
        addnew.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        addnew.setForeground(new java.awt.Color(255, 255, 255));
        addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pics/edit.png"))); // NOI18N
        addnew.setText("Edit ");
        addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewActionPerformed(evt);
            }
        });
        jPanel1.add(addnew);
        addnew.setBounds(700, 850, 113, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Click Edit To Add or Remove any Employee");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 850, 690, 50);

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));

        jTable.setAutoCreateRowSorter(true);
        jTable.setBackground(java.awt.Color.black);
        jTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable.setForeground(new java.awt.Color(255, 255, 255));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Phone No", "Address"
            }
        ));
        jScrollPane2.setViewportView(jTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 240, 750, 600);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pics/BUBT.png"))); // NOI18N
        jLabel15.setText("jLabel6");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1760, 0, 120, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pics/employee_3.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -190, 1930, 1610);

        jMenuBar1.setBackground(new java.awt.Color(153, 51, 0));
        jMenuBar1.setToolTipText("");
        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N

        jMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jMenu4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pics/home_1.png"))); // NOI18N
        jMenu4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu3.setForeground(new java.awt.Color(204, 51, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/pics/rsz_1exittttt.png"))); // NOI18N
        jMenu3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2229, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1155, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewActionPerformed

       add_employee info = new  add_employee();
        info.setBounds(1,1,2000,1080);
        info.setVisible(true);
         dispose();// TODO add your handling code here:
    }//GEN-LAST:event_addnewActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked

        Home_Page info = new  Home_Page();
         info.setBounds(1,1,2000,1080);
        info.setVisible(true);
         dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        JOptionPane.showConfirmDialog (null, "Are you sure to exit ?","WARNING", dialogButton);
        if(dialogButton == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        if(dialogButton == JOptionPane.NO_OPTION) {
            remove(dialogButton);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        Group_info  info = new Group_info ();
        info.setBounds(1,1,2000,1080);
        info.setVisible(true);
         dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked


Desktop browser=Desktop.getDesktop();

    try {
        browser.browse(new URI("https://bubt.edu.bd"));
    }   catch (URISyntaxException ex) { 
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } 
    

      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
