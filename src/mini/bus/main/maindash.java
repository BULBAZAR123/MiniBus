
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
        busdailyBtn = new javax.swing.JButton();
        busmonthlyBtn = new javax.swing.JButton();
        dashBtn = new javax.swing.JButton();
        staffBtn = new javax.swing.JButton();
        businfoBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        DASHBOARD = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        panelBorder2 = new swing.PanelBorder();
        busname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(76, 111, 191));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(76, 111, 191));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(232, 359));

        busdailyBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        busdailyBtn.setForeground(new java.awt.Color(255, 255, 255));
        busdailyBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        busdailyBtn.setBorderPainted(false);
        busdailyBtn.setContentAreaFilled(false);
        busdailyBtn.setLabel("Bus Daily");
        busdailyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busdailyBtnActionPerformed(evt);
            }
        });

        busmonthlyBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        busmonthlyBtn.setForeground(new java.awt.Color(255, 255, 255));
        busmonthlyBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        busmonthlyBtn.setBorderPainted(false);
        busmonthlyBtn.setContentAreaFilled(false);
        busmonthlyBtn.setLabel("Bus Monthly");
        busmonthlyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busmonthlyBtnActionPerformed(evt);
            }
        });

        dashBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        dashBtn.setForeground(new java.awt.Color(255, 255, 255));
        dashBtn.setText("Dashboard");
        dashBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        dashBtn.setBorderPainted(false);
        dashBtn.setContentAreaFilled(false);
        dashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashBtnActionPerformed(evt);
            }
        });

        staffBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        staffBtn.setForeground(new java.awt.Color(255, 255, 255));
        staffBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        staffBtn.setBorderPainted(false);
        staffBtn.setContentAreaFilled(false);
        staffBtn.setLabel("Staff");
        staffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffBtnActionPerformed(evt);
            }
        });

        businfoBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        businfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        businfoBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        businfoBtn.setBorderPainted(false);
        businfoBtn.setContentAreaFilled(false);
        businfoBtn.setLabel("Bus Information");
        businfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businfoBtnActionPerformed(evt);
            }
        });

        logoutBtn.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        logoutBtn.setBorderPainted(false);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.setLabel("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(76, 111, 191));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mini-Bus");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 5, -1, 40));

        jLabel3.setText("LOGO");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 15, 43, 41));

        jPanel3.setPreferredSize(new java.awt.Dimension(3, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 15, -1, 41));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Management System");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 36, -1, 20));

        time.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setText("time");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(dashBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(busdailyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(busmonthlyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(staffBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(businfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dashBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(busdailyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(busmonthlyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(staffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(businfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        DASHBOARD.setBackground(new java.awt.Color(255, 255, 255));
        DASHBOARD.setPreferredSize(new java.awt.Dimension(786, 583));

        javax.swing.GroupLayout DASHBOARDLayout = new javax.swing.GroupLayout(DASHBOARD);
        DASHBOARD.setLayout(DASHBOARDLayout);
        DASHBOARDLayout.setHorizontalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1293, Short.MAX_VALUE)
        );
        DASHBOARDLayout.setVerticalGroup(
            DASHBOARDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelBorder2.setBackground(new java.awt.Color(76, 111, 191));

        busname.setBackground(new java.awt.Color(255, 0, 51));
        busname.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        busname.setForeground(new java.awt.Color(255, 255, 255));
        busname.setText("busname");

        jLabel1.setText(" LOGO");
        jLabel1.setOpaque(true);

        panelBorder2.setLayer(busname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelBorder2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(busname, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(busname))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1099, 1099, 1099)
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DASHBOARD, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(DASHBOARD, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
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

    private void businfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businfoBtnActionPerformed

    }//GEN-LAST:event_businfoBtnActionPerformed

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
    private javax.swing.JButton businfoBtn;
    private javax.swing.JButton busmonthlyBtn;
    private javax.swing.JLabel busname;
    private javax.swing.JButton dashBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton logoutBtn;
    private swing.PanelBorder panelBorder2;
    private javax.swing.JButton staffBtn;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
