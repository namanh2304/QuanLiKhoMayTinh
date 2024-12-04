/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

/**
 *
 * @author thanh
 */
public class SanPhamForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form SanPhamForm
     */
    public SanPhamForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        Them = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        Sua = new javax.swing.JButton();
        XemCT = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        XuatEx = new javax.swing.JButton();
        NhapEx = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LuaChon = new javax.swing.JComboBox<>();
        TimKiem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1180, 774));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chức năng"));
        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(371, 91));

        Them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        Them.setText("Thêm");
        Them.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Them.setFocusable(false);
        Them.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Them.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Them);

        Xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        Xoa.setText("Xóa");
        Xoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Xoa.setFocusable(false);
        Xoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Xoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Xoa);

        Sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fix.png"))); // NOI18N
        Sua.setText("Sửa");
        Sua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sua.setFocusable(false);
        Sua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Sua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(Sua);

        XemCT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        XemCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/see.png"))); // NOI18N
        XemCT.setText("Xem chi tiết");
        XemCT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XemCT.setFocusable(false);
        XemCT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        XemCT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(XemCT);
        jToolBar1.add(jSeparator1);

        XuatEx.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        XuatEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/export ex.png"))); // NOI18N
        XuatEx.setText("Xuất Excel");
        XuatEx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XuatEx.setFocusable(false);
        XuatEx.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        XuatEx.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        XuatEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XuatExActionPerformed(evt);
            }
        });
        jToolBar1.add(XuatEx);

        NhapEx.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NhapEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/import ex.png"))); // NOI18N
        NhapEx.setText("Nhập Excel");
        NhapEx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NhapEx.setFocusable(false);
        NhapEx.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        NhapEx.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(NhapEx);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LuaChon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(LuaChon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 140, 40));
        jPanel2.add(TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 390, 40));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/refresh.png"))); // NOI18N
        jButton1.setText("Làm mới");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 130, 40));

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblSanPham);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XuatExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XuatExActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XuatExActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> LuaChon;
    private javax.swing.JButton NhapEx;
    private javax.swing.JButton Sua;
    private javax.swing.JButton Them;
    private javax.swing.JTextField TimKiem;
    private javax.swing.JButton XemCT;
    private javax.swing.JButton Xoa;
    private javax.swing.JButton XuatEx;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblSanPham;
    // End of variables declaration//GEN-END:variables
}
