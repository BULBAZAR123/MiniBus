
package mini.bus.main;

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
        time.setText(currentTime);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        time = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        busmonthlyBtn = new javax.swing.JButton();
        busdailyBtn = new javax.swing.JButton();
        dashBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DASHBOARD = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelBorder1 = new swing.PanelBorder();
        busname = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setBackground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(232, 359));

        time.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("time");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 151, 178)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(51, 51, 51));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/log-out-50.png"))); // NOI18N
        logoutBtn.setBorder(null);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel4.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 477, 113, 113));

        staffBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        staffBtn.setForeground(new java.awt.Color(51, 51, 51));
        staffBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user-groups-50.png"))); // NOI18N
        staffBtn.setBorder(null);
        staffBtn.setContentAreaFilled(false);
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });
        jPanel4.add(staffBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 358, 113, 113));

        busmonthlyBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        busmonthlyBtn.setForeground(new java.awt.Color(51, 51, 51));
        busmonthlyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/route-50.png"))); // NOI18N
        busmonthlyBtn.setBorder(null);
        busmonthlyBtn.setContentAreaFilled(false);
        busmonthlyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busmonthlyBtnActionPerformed(evt);
            }
        });
        jPanel4.add(busmonthlyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 239, 113, 113));

        busdailyBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        busdailyBtn.setForeground(new java.awt.Color(51, 51, 51));
        busdailyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bus-50.png"))); // NOI18N
        busdailyBtn.setBorder(null);
        busdailyBtn.setContentAreaFilled(false);
        busdailyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busdailyBtnActionPerformed(evt);
            }
        });
        jPanel4.add(busdailyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 120, 113, 113));

        dashBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        dashBtn.setForeground(new java.awt.Color(51, 51, 51));
        dashBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dashboard-50.png"))); // NOI18N
        dashBtn.setBorder(null);
        dashBtn.setContentAreaFilled(false);
        dashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashBtnActionPerformed(evt);
            }
        });
        jPanel4.add(dashBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 113, 113));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("        Log out");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 543, 110, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText(" Dashboard");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, 50));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("    Staffs");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 80, 50));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("     Bus");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 80, 60));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("   Route");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 80, 50));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(time))
        );

        DASHBOARD.setBackground(new java.awt.Color(255, 255, 255));
        DASHBOARD.setPreferredSize(new java.awt.Dimension(786, 583));

        javax.swing.GroupLayout DASHBOARDLayout = new javax.swing.GroupLayout(DASHBOARD);
        DASHBOARD.setLayout(DASHBOARDLayout);
        DASHBOARDLayout.setHorizontalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1375, Short.MAX_VALUE)
        );
        DASHBOARDLayout.setVerticalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 151, 178));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder1.setBackground(new java.awt.Color(3, 180, 211));

        busname.setBackground(new java.awt.Color(255, 0, 51));
        busname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        busname.setForeground(new java.awt.Color(51, 51, 51));
        busname.setText("busname");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/company-45.png"))); // NOI18N

        panelBorder1.setLayer(busname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busname, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(busname, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel3.add(panelBorder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, 170, 60));

        jLabel1.setText("  jLabel1");
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, 60, 60));

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

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DASHBOARD, javax.swing.GroupLayout.DEFAULT_SIZE, 1375, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1553, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
                    .addComponent(DASHBOARD, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busdailyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busdailyBtnActionPerformed
        forms(daily);
    }//GEN-LAST:event_busdailyBtnActionPerformed

    private void busmonthlyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busmonthlyBtnActionPerformed
        forms(monthly);
    }//GEN-LAST:event_busmonthlyBtnActionPerformed

    private void dashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashBtnActionPerformed
        forms(dashh);

    }//GEN-LAST:event_dashBtnActionPerformed

    private void staffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffBtnActionPerformed
     forms(staf);
    }//GEN-LAST:event_staffBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
   login LoginFrame = new login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed


   
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                maindash dash = new maindash();
            dash.setVisible(true);
                dash.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DASHBOARD;
    private javax.swing.JButton busdailyBtn;
    private javax.swing.JButton busmonthlyBtn;
    private javax.swing.JLabel busname;
    private javax.swing.JButton dashBtn;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton logoutBtn;
    private swing.PanelBorder panelBorder1;
    private javax.swing.JButton staffBtn;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
