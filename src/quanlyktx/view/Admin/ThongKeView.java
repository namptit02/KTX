/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlyktx.view.Admin;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import quanlyktx.DAO.DAO;
import quanlyktx.model.Phong;
import quanlyktx.view.DangNhap.DangNhapView;

/**
 *
 * @author luong
 */
public class ThongKeView extends javax.swing.JFrame {

    static String id;
    private DAO controller = new DAO();
    private List<Phong> rooms;
    private DefaultTableModel model;
    private DefaultTableModel modelTPKTX;
    private DefaultTableModel modelTPPS;

    /**
     * Creates new form ThongKeView
     */
    public ThongKeView(String user) {
        id = user;
        setIcon();
        initComponents();
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        model = (DefaultTableModel) tb_thong_ke_day.getModel();
        modelTPKTX = (DefaultTableModel) table_thu_phi_ktx.getModel();
        modelTPPS = (DefaultTableModel) tb_thu_phi_ps.getModel();
        //////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();
        btn_help = new javax.swing.JLabel();
        btn_user = new javax.swing.JLabel();
        setting_view = new javax.swing.JLabel();
        btn_setting = new javax.swing.JLabel();
        panel_chart_sv = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        panel_demo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cb_day = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        panel_phong_theo_day = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_thong_ke_day = new javax.swing.JTable();
        cb_nam = new javax.swing.JComboBox<>();
        panel_tk = new javax.swing.JPanel();
        cb_thong_ke_day = new javax.swing.JComboBox<>();
        cb_thong_ke_phong = new javax.swing.JComboBox<>();
        panel_phong = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panel_thu_phi = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_thu_phi_ktx = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        panel_thu_phi_phat_sinh = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_thu_phi_ps = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/close.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 20, -1));

        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 446, 190, 55));

        btn_help.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_helpMouseClicked(evt);
            }
        });
        getContentPane().add(btn_help, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 190, 55));

        btn_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_userMouseClicked(evt);
            }
        });
        getContentPane().add(btn_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 335, 190, 55));

        setting_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/setting.jpg"))); // NOI18N
        getContentPane().add(setting_view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 220));

        btn_setting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_settingMouseClicked(evt);
            }
        });
        getContentPane().add(btn_setting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 192, 50));

        panel_chart_sv.setBackground(new java.awt.Color(102, 153, 255));
        panel_chart_sv.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        panel_chart_sv.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        panel_chart_sv.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                panel_chart_svStateChanged(evt);
            }
        });
        panel_chart_sv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_chart_svMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_demoLayout = new javax.swing.GroupLayout(panel_demo);
        panel_demo.setLayout(panel_demoLayout);
        panel_demoLayout.setHorizontalGroup(
            panel_demoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_demoLayout.setVerticalGroup(
            panel_demoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SỐ LƯỢNG SINH VIÊN ĐĂNG KÍ KÍ TÚC XÁ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_demo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_demo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_demo.getAccessibleContext().setAccessibleParent(panel_demo);

        panel_chart_sv.addTab("Sinh Viên", jPanel1);

        cb_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "I", "J", "H", "Q", "M", "N", "K", "P" }));
        cb_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_dayActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thống kê số lượng sinh viên theo dãy phòng");

        javax.swing.GroupLayout panel_phong_theo_dayLayout = new javax.swing.GroupLayout(panel_phong_theo_day);
        panel_phong_theo_day.setLayout(panel_phong_theo_dayLayout);
        panel_phong_theo_dayLayout.setHorizontalGroup(
            panel_phong_theo_dayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_phong_theo_dayLayout.setVerticalGroup(
            panel_phong_theo_dayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );

        tb_thong_ke_day.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Phòng", "Số lượng sinh viên"
            }
        ));
        jScrollPane1.setViewportView(tb_thong_ke_day);

        cb_nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default" }));
        cb_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_namActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cb_nam, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_day, javax.swing.GroupLayout.Alignment.LEADING, 0, 125, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panel_phong_theo_day, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cb_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_phong_theo_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_chart_sv.addTab("Dãy", jPanel3);

        cb_thong_ke_day.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cb_thong_ke_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "I", "J", "H", "Q", "M", "N", "K", "P" }));
        cb_thong_ke_day.setBorder(null);
        cb_thong_ke_day.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_thong_ke_day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_thong_ke_dayActionPerformed(evt);
            }
        });

        cb_thong_ke_phong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default" }));
        cb_thong_ke_phong.setBorder(null);
        cb_thong_ke_phong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_thong_ke_phong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_thong_ke_phongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_phongLayout = new javax.swing.GroupLayout(panel_phong);
        panel_phong.setLayout(panel_phongLayout);
        panel_phongLayout.setHorizontalGroup(
            panel_phongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_phongLayout.setVerticalGroup(
            panel_phongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_tkLayout = new javax.swing.GroupLayout(panel_tk);
        panel_tk.setLayout(panel_tkLayout);
        panel_tkLayout.setHorizontalGroup(
            panel_tkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_phong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_tkLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_tkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_thong_ke_day, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_thong_ke_phong, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        panel_tkLayout.setVerticalGroup(
            panel_tkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tkLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(cb_thong_ke_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_thong_ke_phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(panel_phong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_chart_sv.addTab("Phòng kí túc", panel_tk);

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_thu_phiLayout = new javax.swing.GroupLayout(panel_thu_phi);
        panel_thu_phi.setLayout(panel_thu_phiLayout);
        panel_thu_phiLayout.setHorizontalGroup(
            panel_thu_phiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        panel_thu_phiLayout.setVerticalGroup(
            panel_thu_phiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        table_thu_phi_ktx.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Năm", "Tổng tiền"
            }
        ));
        jScrollPane2.setViewportView(table_thu_phi_ktx);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_thu_phi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_thu_phi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_chart_sv.addTab("Thu phí KTX", jPanel2);

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_thu_phi_phat_sinhLayout = new javax.swing.GroupLayout(panel_thu_phi_phat_sinh);
        panel_thu_phi_phat_sinh.setLayout(panel_thu_phi_phat_sinhLayout);
        panel_thu_phi_phat_sinhLayout.setHorizontalGroup(
            panel_thu_phi_phat_sinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_thu_phi_phat_sinhLayout.setVerticalGroup(
            panel_thu_phi_phat_sinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        tb_thu_phi_ps.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Năm", "Tổng tiền"
            }
        ));
        jScrollPane3.setViewportView(tb_thu_phi_ps);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_thu_phi_phat_sinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_thu_phi_phat_sinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_chart_sv.addTab("Thu phí phát sinh", jPanel4);

        getContentPane().add(panel_chart_sv, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 50, 710, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quanlyktx/images/ThongKeView.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0; i <= 1; i += 0.2) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        new AdminView(id).setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_userMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        flag = true;
        System.out.println("click user");
        this.dispose();
        new UserView().setVisible(true);
    }//GEN-LAST:event_btn_userMouseClicked
    private boolean flag = true;
    private void btn_settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_settingMouseClicked
        if (flag) {
            setting_view.setVisible(true);
            btn_user.setVisible(true);
            btn_help.setVisible(true);
            btn_logout.setVisible(true);
            flag = false;
        } else {
            setting_view.setVisible(false);
            btn_user.setVisible(false);
            btn_help.setVisible(false);
            btn_logout.setVisible(false);
            flag = true;
        }    }//GEN-LAST:event_btn_settingMouseClicked

    private void btn_helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_helpMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        flag = true;
        System.out.println("click help");
        new HelpView().setVisible(true);
    }//GEN-LAST:event_btn_helpMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        setting_view.setVisible(false);
        btn_user.setVisible(false);
        btn_help.setVisible(false);
        btn_logout.setVisible(false);
        flag = true;
        System.out.println("click logout");
        this.dispose();
        new DangNhapView().setVisible(true);
    }//GEN-LAST:event_btn_logoutMouseClicked

    private void panel_chart_svStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_panel_chart_svStateChanged
        DefaultCategoryDataset datas;

        datas = controller.getTotalStudentWithYear();

        JFreeChart chart = ChartFactory.createBarChart3D("", "Năm", "Số lượng sinh viên", datas, PlotOrientation.VERTICAL, true, false, false);

        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseZoomable(true);
        panel.setPreferredSize(new Dimension(400, 400));
        panel_demo.setLayout(new BorderLayout());
        panel_demo.add(panel, BorderLayout.NORTH);

        //List<Integer> years = controller.getYear();
        ///////////////////////////////////////////////////////////////////////

    }//GEN-LAST:event_panel_chart_svStateChanged

    private void cb_thong_ke_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_thong_ke_dayActionPerformed
        String maDay = cb_thong_ke_day.getSelectedItem().toString().trim();
        //System.out.println(maDay + " _+++  " + !maDay.equals("Default"));
        if (!maDay.equals("Default")) {
            cb_thong_ke_phong.setEnabled(true);
            rooms = controller.getListRoomByIDRange(maDay);
            cb_thong_ke_phong.removeAllItems();

            for (Phong room : rooms) {
                cb_thong_ke_phong.addItem(room.getMaPhong());
            }
        } else {
            cb_thong_ke_phong.setEnabled(false);
        }
        //System.out.println(cb_thong_ke_phong.getSelectedItem().toString());


    }//GEN-LAST:event_cb_thong_ke_dayActionPerformed

    private void cb_thong_ke_phongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_thong_ke_phongActionPerformed
        if ((String) cb_thong_ke_phong.getSelectedItem() != null) {
            DefaultCategoryDataset datas;
            datas = controller.getTotalStudentInRoom((String) cb_thong_ke_phong.getSelectedItem());
            JFreeChart chart = ChartFactory.createBarChart3D("Thống kê số lượng sinh viên từng phòng " + ((String) cb_thong_ke_phong.getSelectedItem()).trim() + " theo năm", "Năm", "Số lượng sinh viên", datas, PlotOrientation.VERTICAL, true, false, false);
            ChartPanel panel = new ChartPanel(chart);
            panel_phong.removeAll();
            panel.setMouseZoomable(true);
            panel.setPreferredSize(new Dimension(400, 400));

            panel_phong.setLayout(new BorderLayout());
            panel_phong.add(panel, BorderLayout.NORTH);
            panel_phong.revalidate();
            panel_phong.repaint();
        } else {
            System.out.println("vadvad");
        }
    }//GEN-LAST:event_cb_thong_ke_phongActionPerformed

    private void cb_dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_dayActionPerformed
        String maDay = cb_day.getSelectedItem().toString().trim();
        if (!maDay.equals("Default")) {
            List<Integer> years = controller.getYear();

            cb_nam.removeAllItems();

            for (int year : years) {
                cb_nam.addItem(year + "");
            }
        } else {
            cb_nam.setEnabled(false);
        }
    }//GEN-LAST:event_cb_dayActionPerformed

    private void cb_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_namActionPerformed

        if (cb_nam.getSelectedItem() != null && (String) cb_day.getSelectedItem() != null) {
            int nam = Integer.parseInt((String) cb_nam.getSelectedItem());
            String maDay = cb_day.getSelectedItem().toString().trim();
            model.setRowCount(0);
            DefaultCategoryDataset datas;
            datas = controller.getListRoomwithNumberStudentByIDRange(nam, maDay, model);

            JFreeChart chart = ChartFactory.createBarChart3D("Thống kê số lượng sinh viên từng phòng " + ((String) cb_thong_ke_phong.getSelectedItem()).trim() + " theo năm", "Năm", "Số lượng sinh viên", datas, PlotOrientation.VERTICAL, true, false, false);
            ChartPanel panel = new ChartPanel(chart);
            panel_phong_theo_day.removeAll();
            panel.setMouseZoomable(true);
            panel.setPreferredSize(new Dimension(300, 250));

            panel_phong_theo_day.setLayout(new BorderLayout());
            panel_phong_theo_day.add(panel, BorderLayout.NORTH);
            panel_phong_theo_day.revalidate();
            panel_phong_theo_day.repaint();
        } else {
            System.out.println("vadvad");
        }
    }//GEN-LAST:event_cb_namActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked

    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked


    }//GEN-LAST:event_jPanel2MouseClicked

    private void panel_chart_svMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_chart_svMouseClicked
        System.out.println("11");
        DefaultCategoryDataset datas1;
        modelTPKTX.setRowCount(0);
        datas1 = controller.getTotalCostStudentWithEveryYear(modelTPKTX);
        JFreeChart chart1 = ChartFactory.createBarChart3D("Thống kê số lượng sinh viên từng phòng " + ((String) cb_thong_ke_phong.getSelectedItem()).trim() + " theo năm", "Năm", "Tổng tiền(vnđ)", datas1, PlotOrientation.VERTICAL, true, false, false);
        ChartPanel panel1 = new ChartPanel(chart1);
        panel_thu_phi.removeAll();
        panel1.setMouseZoomable(true);
        panel1.setPreferredSize(new Dimension(400, 400));

        panel_thu_phi.setLayout(new BorderLayout());
        panel_thu_phi.add(panel1, BorderLayout.NORTH);
        panel_thu_phi.revalidate();
        panel_thu_phi.repaint();

        //////////////////////////////////
        System.out.println("12");
        DefaultCategoryDataset datas2;
        modelTPPS.setRowCount(0);
        datas2 = controller.getTotalCostServicesWithEveryYear(modelTPPS);
        JFreeChart chart2 = ChartFactory.createBarChart3D("Thống kê số lượng sinh viên từng phòng " + ((String) cb_thong_ke_phong.getSelectedItem()).trim() + " theo năm", "Năm", "Tổng tiền(vnđ)", datas2, PlotOrientation.VERTICAL, true, false, false);
        ChartPanel panel2 = new ChartPanel(chart2);
        panel_thu_phi_phat_sinh.removeAll();
        panel2.setMouseZoomable(true);
        panel2.setPreferredSize(new Dimension(400, 400));

        panel_thu_phi_phat_sinh.setLayout(new BorderLayout());
        panel_thu_phi_phat_sinh.add(panel2, BorderLayout.NORTH);
        panel_thu_phi_phat_sinh.revalidate();
        panel_thu_phi_phat_sinh.repaint();


    }//GEN-LAST:event_panel_chart_svMouseClicked

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
            java.util.logging.Logger.getLogger(ThongKeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeView(id).setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_help;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel btn_setting;
    private javax.swing.JLabel btn_user;
    private javax.swing.JComboBox<String> cb_day;
    private javax.swing.JComboBox<String> cb_nam;
    private javax.swing.JComboBox<String> cb_thong_ke_day;
    private javax.swing.JComboBox<String> cb_thong_ke_phong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane panel_chart_sv;
    private javax.swing.JPanel panel_demo;
    private javax.swing.JPanel panel_phong;
    private javax.swing.JPanel panel_phong_theo_day;
    private javax.swing.JPanel panel_thu_phi;
    private javax.swing.JPanel panel_thu_phi_phat_sinh;
    private javax.swing.JPanel panel_tk;
    private javax.swing.JLabel setting_view;
    private javax.swing.JTable table_thu_phi_ktx;
    private javax.swing.JTable tb_thong_ke_day;
    private javax.swing.JTable tb_thu_phi_ps;
    // End of variables declaration//GEN-END:variables
}
