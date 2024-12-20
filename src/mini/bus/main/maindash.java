
package mini.bus.main;

import static connection.populateController.populateDailyTable;
import static connection.populateController.populateStaffTable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.Timer;
import mini.bus.form.dashboard;
import mini.bus.form.busdaily;
import mini.bus.form.busmonthly;
import mini.bus.form.staff;
import mini.bus.management.system.login;
import raven.glasspanepopup.GlassPanePopup;


/**
 *
 * @author Administrator
 */
 


public class maindash extends javax.swing.JFrame {

     private busdaily daily;
     private busmonthly monthly;
     private dashboard dashh;
     private staff staf;

  
     
    public maindash() {
        initComponents();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setBackground( Color.white);
        DASHBOARD.setLayout(new BorderLayout());
        
        daily = new busdaily();
         monthly = new busmonthly();
         dashh = new dashboard();
         staf = new staff();
         
         GlassPanePopup.install(this);
              forms(dashh);
          startClock();
         
    }
 public void forms(Component con){
     DASHBOARD.removeAll();
     DASHBOARD.add(con);
     repaint();
     revalidate();
 }
 public void setUser(String name){
        busname.setText(name);
    }

 private void startClock() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTime();
            }
        });
        timer.start();
    }

    // Method to update the time in the JLabel
    private void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        String currentTime = sdf.format(new Date());
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pictureBox2 = new swing.PictureBox();
        pictureBox3 = new swing.PictureBox();
        pictureBox4 = new swing.PictureBox();
        pictureBox5 = new swing.PictureBox();
        pictureBox6 = new swing.PictureBox();
        DASHBOARD = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pictureBox1 = new swing.PictureBox();
        panelBorder2 = new swing.PanelBorder();
        jLabel5 = new javax.swing.JLabel();
        busname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(232, 359));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 151, 178)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("    Log out");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 80, 20));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText(" Dashboard");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 20));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("   Staffs");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 20));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("    Bus");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, 20));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("   Route");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 80, 20));

        pictureBox2.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard-50.png"))); // NOI18N
        pictureBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureBox2MouseClicked(evt);
            }
        });
        jPanel4.add(pictureBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, 40));

        pictureBox3.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/bus-50.png"))); // NOI18N
        pictureBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureBox3MouseClicked(evt);
            }
        });
        jPanel4.add(pictureBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 40));

        pictureBox4.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/route-50.png"))); // NOI18N
        pictureBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureBox4MouseClicked(evt);
            }
        });
        jPanel4.add(pictureBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 40, 40));

        pictureBox5.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/user-groups-50.png"))); // NOI18N
        pictureBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureBox5MouseClicked(evt);
            }
        });
        jPanel4.add(pictureBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 40, 40));

        pictureBox6.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/log-out-50.png"))); // NOI18N
        pictureBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pictureBox6MouseClicked(evt);
            }
        });
        jPanel4.add(pictureBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 40, 40));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
        );

        DASHBOARD.setBackground(new java.awt.Color(255, 255, 255));
        DASHBOARD.setPreferredSize(new java.awt.Dimension(786, 583));

        javax.swing.GroupLayout DASHBOARDLayout = new javax.swing.GroupLayout(DASHBOARD);
        DASHBOARD.setLayout(DASHBOARDLayout);
        DASHBOARDLayout.setHorizontalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DASHBOARDLayout.setVerticalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 151, 178));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(3, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 3, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 222, 89));
        jLabel2.setText("M");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 20, 20));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 222, 89));
        jLabel3.setText("M");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 20, 40));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 222, 89));
        jLabel4.setText("S");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 30, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("anagement");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 87, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ystem");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 56, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ini-Bus");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 56, 20));

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        jPanel3.add(pictureBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        panelBorder2.setBackground(new java.awt.Color(3, 180, 211));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/company-45.png"))); // NOI18N
        panelBorder2.add(jLabel5);
        jLabel5.setBounds(10, 0, 45, 45);

        busname.setBackground(new java.awt.Color(255, 0, 51));
        busname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        busname.setForeground(new java.awt.Color(51, 51, 51));
        busname.setText("busname");
        panelBorder2.add(busname);
        busname.setBounds(70, 10, 70, 37);

        jPanel3.add(panelBorder2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DASHBOARD, javax.swing.GroupLayout.DEFAULT_SIZE, 1264, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DASHBOARD, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pictureBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureBox2MouseClicked
        // TODO add your handling code here:
        forms(dashh);
        populateStaffTable(dashboard.staffTable);
        populateDailyTable(dashboard.busTable);
    }//GEN-LAST:event_pictureBox2MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        forms(dashh);
        populateStaffTable(dashboard.staffTable);
        populateDailyTable(dashboard.busTable);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void pictureBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureBox3MouseClicked
        // TODO add your handling code here:
        forms(daily);
    }//GEN-LAST:event_pictureBox3MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        forms(daily);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void pictureBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureBox4MouseClicked
        // TODO add your handling code here:
        forms(monthly);
    }//GEN-LAST:event_pictureBox4MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        forms(monthly);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void pictureBox6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureBox6MouseClicked
        // TODO add your handling code here:
        login LoginFrame = new login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_pictureBox6MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        login LoginFrame = new login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void pictureBox5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pictureBox5MouseClicked
        // TODO add your handling code here:
        forms(staf);
    }//GEN-LAST:event_pictureBox5MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
forms(staf);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked


   
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
            java.util.logging.Logger.getLogger(maindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DASHBOARD;
    private javax.swing.JLabel busname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private swing.PanelBorder panelBorder2;
    private swing.PictureBox pictureBox1;
    private swing.PictureBox pictureBox2;
    private swing.PictureBox pictureBox3;
    private swing.PictureBox pictureBox4;
    private swing.PictureBox pictureBox5;
    private swing.PictureBox pictureBox6;
    // End of variables declaration//GEN-END:variables
}
