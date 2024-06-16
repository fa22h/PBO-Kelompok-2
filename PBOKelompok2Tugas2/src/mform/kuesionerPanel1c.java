package mform;

import mform.entity.DataPerkebunan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

public class KuesionerPanel1c extends javax.swing.JFrame {
    private String namaPetugas;
    private boolean kenaValidasi;
    private boolean memilikiGroupPerusahaan;
    private DataPerkebunan dataPerkebunan;
    /**
     * Creates new form MF_Blok1_b
     */
    public KuesionerPanel1c(String namaPetugas, boolean kenaValidasi, boolean memilikiGroupPerusahaan, DataPerkebunan dataPerkebunan) {
        this.namaPetugas = namaPetugas;
        this.kenaValidasi = kenaValidasi;
        this.memilikiGroupPerusahaan = memilikiGroupPerusahaan;
        this.dataPerkebunan = dataPerkebunan;
        
        // Jika tidak memilih memiliki Group Perusahaan
        if (!memilikiGroupPerusahaan) {
            //Jika kena validasi dan memilih memiliki group perusahaan sebelumnya
            if(kenaValidasi && (dataPerkebunan.getGroupPerusahaan()!= null)) {
                dataPerkebunan.setGroupPerusahaan(null);
            }
            KuesionerPanel2 panel2 = new KuesionerPanel2(namaPetugas, kenaValidasi, dataPerkebunan);
            panel2.setVisible(true);
            this.setVisible(false);
            return;
        }
        initComponents();
        //Jika terkena validasi dan memilih memiliki kantor pusat sebelumnya
        if (kenaValidasi && (dataPerkebunan.getGroupPerusahaan()!= null)) {
            setField();
        }else {
            dataPerkebunan.setGroupPerusahaan();
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

        jLabel2 = new javax.swing.JLabel();
        kode_pos_group_perusahaanTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telepon_group_perusahaanTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        email_group_perusahaanTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat_group_perusahaanTextArea = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        fax_group_perusahaanTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        provinsi_kode_group_perusahaanTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        kab_kota_kode_group_perusahaanTextField = new javax.swing.JTextField();
        nextToggleButton = new javax.swing.JToggleButton();
        nama_group_perusahaanTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("3. Nama Group Perusahaan:");

        kode_pos_group_perusahaanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_pos_group_perusahaanTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Telepon:");

        telepon_group_perusahaanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telepon_group_perusahaanTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("Email:");

        email_group_perusahaanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_group_perusahaanTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Telepon:");

        jLabel3.setText("Alamat:");

        alamat_group_perusahaanTextArea.setColumns(20);
        alamat_group_perusahaanTextArea.setRows(5);
        jScrollPane1.setViewportView(alamat_group_perusahaanTextArea);

        jLabel4.setText("Kode Pos:");

        fax_group_perusahaanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fax_group_perusahaanTextFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("Fax:");

        jLabel11.setText("Provinsi:");

        provinsi_kode_group_perusahaanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinsi_kode_group_perusahaanTextFieldActionPerformed(evt);
            }
        });

        jLabel13.setText("Kabupaten/Kota:");

        kab_kota_kode_group_perusahaanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kab_kota_kode_group_perusahaanTextFieldActionPerformed(evt);
            }
        });

        nextToggleButton.setText("NEXT");
        nextToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nama_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(kode_pos_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(nextToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(fax_group_perusahaanTextField)
                                                        .addComponent(telepon_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(kab_kota_kode_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(provinsi_kode_group_perusahaanTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(kode_pos_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(telepon_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(email_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fax_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))))
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(provinsi_kode_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(kab_kota_kode_group_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextToggleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kode_pos_group_perusahaanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_pos_group_perusahaanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_pos_group_perusahaanTextFieldActionPerformed

    private void telepon_group_perusahaanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telepon_group_perusahaanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telepon_group_perusahaanTextFieldActionPerformed

    private void email_group_perusahaanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_group_perusahaanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_group_perusahaanTextFieldActionPerformed

    private void fax_group_perusahaanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fax_group_perusahaanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fax_group_perusahaanTextFieldActionPerformed

    private void provinsi_kode_group_perusahaanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinsi_kode_group_perusahaanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsi_kode_group_perusahaanTextFieldActionPerformed

    private void kab_kota_kode_group_perusahaanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kab_kota_kode_group_perusahaanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kab_kota_kode_group_perusahaanTextFieldActionPerformed

    private void nextToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextToggleButtonActionPerformed
        // TODO add your handling code here:
        dataPerkebunan.getGroupPerusahaan().setNama(nama_group_perusahaanTextField.getText());
        dataPerkebunan.getGroupPerusahaan().getAlamat().setAlamatLengkap(alamat_group_perusahaanTextArea.getText());
        dataPerkebunan.getGroupPerusahaan().getAlamat().setKodePos(kode_pos_group_perusahaanTextField.getText());
        dataPerkebunan.getGroupPerusahaan().getAlamat().setTelepon(telepon_group_perusahaanTextField.getText());
        dataPerkebunan.getGroupPerusahaan().getAlamat().setEmail(email_group_perusahaanTextField.getText());
        dataPerkebunan.getGroupPerusahaan().getAlamat().setFax(fax_group_perusahaanTextField.getText());
        dataPerkebunan.getGroupPerusahaan().getAlamat().setProv(provinsi_kode_group_perusahaanTextField.getText());
        dataPerkebunan.getGroupPerusahaan().getAlamat().setKabKota(kab_kota_kode_group_perusahaanTextField.getText());
        
        KuesionerPanel2 panel2 = new KuesionerPanel2(namaPetugas, kenaValidasi, dataPerkebunan);
        panel2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nextToggleButtonActionPerformed

    private void setField(){
        nama_group_perusahaanTextField.setText(dataPerkebunan.getGroupPerusahaan().getNama());
        alamat_group_perusahaanTextArea.setText(dataPerkebunan.getGroupPerusahaan().getAlamat().getAlamatLengkap());
        kode_pos_group_perusahaanTextField.setText(dataPerkebunan.getGroupPerusahaan().getAlamat().getKodePos());
        telepon_group_perusahaanTextField.setText(dataPerkebunan.getGroupPerusahaan().getAlamat().getTelepon());
        email_group_perusahaanTextField.setText(dataPerkebunan.getGroupPerusahaan().getAlamat().getEmail());
        fax_group_perusahaanTextField.setText(dataPerkebunan.getGroupPerusahaan().getAlamat().getFax());
        provinsi_kode_group_perusahaanTextField.setText(dataPerkebunan.getGroupPerusahaan().getAlamat().getProv());
        kab_kota_kode_group_perusahaanTextField.setText(dataPerkebunan.getGroupPerusahaan().getAlamat().getKabKota());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String namaPetugas = null;
        boolean kenaValidasi = false;
        boolean memilikiGroupPerusahaan = false;
        DataPerkebunan dataPerkebunan = null;
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
            java.util.logging.Logger.getLogger(KuesionerPanel1c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KuesionerPanel1c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KuesionerPanel1c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KuesionerPanel1c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KuesionerPanel1c(namaPetugas, kenaValidasi, memilikiGroupPerusahaan, dataPerkebunan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat_group_perusahaanTextArea;
    private javax.swing.JTextField email_group_perusahaanTextField;
    private javax.swing.JTextField fax_group_perusahaanTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kab_kota_kode_group_perusahaanTextField;
    private javax.swing.JTextField kode_pos_group_perusahaanTextField;
    private javax.swing.JTextField nama_group_perusahaanTextField;
    private javax.swing.JToggleButton nextToggleButton;
    private javax.swing.JTextField provinsi_kode_group_perusahaanTextField;
    private javax.swing.JTextField telepon_group_perusahaanTextField;
    // End of variables declaration//GEN-END:variables
}
