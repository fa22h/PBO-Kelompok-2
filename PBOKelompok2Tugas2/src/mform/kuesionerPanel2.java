/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mform;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import mform.entity.DataPerkebunan;

/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

public class KuesionerPanel2 extends javax.swing.JFrame {
    private String namaPetugas;
    private boolean kenaValidasi;
    private DataPerkebunan dataPerkebunan;
    /**
     * Creates new form MF_Blok2
     */
    public KuesionerPanel2(String namaPetugas, boolean kenaValidasi, DataPerkebunan dataPerkebunan) {
        initComponents();
        this.namaPetugas = namaPetugas;
        this.kenaValidasi = kenaValidasi;
        this.dataPerkebunan = dataPerkebunan;
        if (kenaValidasi) {
            setField();
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

        status_pemodalanbuttonGroup = new javax.swing.ButtonGroup();
        pelaksana_kemitraanGroup = new javax.swing.ButtonGroup();
        kebun_plasma_belum_konversibuttonGroup = new javax.swing.ButtonGroup();
        unit_pengolahanbuttonGroup = new javax.swing.ButtonGroup();
        kebun_pabrikbuttonGroup = new javax.swing.ButtonGroup();
        jLabel17 = new javax.swing.JLabel();
        pmdnRadioButton = new javax.swing.JRadioButton();
        pmaRadioButton = new javax.swing.JRadioButton();
        bentuk_badan_hukumComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ya_pelaksana_kemitraanRadioButton = new javax.swing.JRadioButton();
        tidak_pelaksana_kemitraanRadioButton = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        ya_kebun_plasma_belum_dikonversiRadioButton = new javax.swing.JRadioButton();
        tidak_kebun_plasma_belum_dikonversiRadioButton = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        ya_unit_pengolahan_produksiRadioButton = new javax.swing.JRadioButton();
        tidak_unit_pengolahan_produksiRadioButton = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        kebunRadioButton = new javax.swing.JRadioButton();
        pabrikRadioButton = new javax.swing.JRadioButton();
        tahun_berdiri_perusahaanTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        kebun_pabrikRadioButton = new javax.swing.JRadioButton();
        nextToggleButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        produk_UtamaTextField = new javax.swing.JTextField();
        kbkiTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jumlah_KebunComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel17.setText("Status Permodalan/Pemilikan:");

        status_pemodalanbuttonGroup.add(pmdnRadioButton);
        pmdnRadioButton.setText("PMDN");
        pmdnRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmdnRadioButtonActionPerformed(evt);
            }
        });

        status_pemodalanbuttonGroup.add(pmaRadioButton);
        pmaRadioButton.setText("PMA");

        bentuk_badan_hukumComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persero/Perum", "Perusahaan Daerah (PD)/BUMD", "Perseroan Terbatas (PT)", "Koperasi/KUD", "Yayasan", "NV", "CV", "Firma", "Perwakilan Perusahaan/Lembaga Asing" }));
        bentuk_badan_hukumComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bentuk_badan_hukumComboBoxActionPerformed(evt);
            }
        });

        jLabel18.setText("Bentuk Badan Hukum:");

        jLabel19.setText("Apakah sebagai Pelaksana Kemitraan?");

        pelaksana_kemitraanGroup.add(ya_pelaksana_kemitraanRadioButton);
        ya_pelaksana_kemitraanRadioButton.setText("Ya");
        ya_pelaksana_kemitraanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ya_pelaksana_kemitraanRadioButtonActionPerformed(evt);
            }
        });

        pelaksana_kemitraanGroup.add(tidak_pelaksana_kemitraanRadioButton);
        tidak_pelaksana_kemitraanRadioButton.setText("Tidak");

        jLabel24.setText("Apakah mempunyai Kebun Plasma yang belum dikonversi?");

        kebun_plasma_belum_konversibuttonGroup.add(ya_kebun_plasma_belum_dikonversiRadioButton);
        ya_kebun_plasma_belum_dikonversiRadioButton.setText("Ya");
        ya_kebun_plasma_belum_dikonversiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ya_kebun_plasma_belum_dikonversiRadioButtonActionPerformed(evt);
            }
        });

        kebun_plasma_belum_konversibuttonGroup.add(tidak_kebun_plasma_belum_dikonversiRadioButton);
        tidak_kebun_plasma_belum_dikonversiRadioButton.setText("Tidak");

        jLabel25.setText("Apakah mempunyai unit pengolahan produksi?");

        unit_pengolahanbuttonGroup.add(ya_unit_pengolahan_produksiRadioButton);
        ya_unit_pengolahan_produksiRadioButton.setText("Ya");
        ya_unit_pengolahan_produksiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ya_unit_pengolahan_produksiRadioButtonActionPerformed(evt);
            }
        });

        unit_pengolahanbuttonGroup.add(tidak_unit_pengolahan_produksiRadioButton);
        tidak_unit_pengolahan_produksiRadioButton.setText("Tidak");

        jLabel26.setText("Tahun berdiri/operasional perusahaan");

        kebun_pabrikbuttonGroup.add(kebunRadioButton);
        kebunRadioButton.setText("Kebun");
        kebunRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kebunRadioButtonActionPerformed(evt);
            }
        });

        kebun_pabrikbuttonGroup.add(pabrikRadioButton);
        pabrikRadioButton.setText("Pabrik");

        jLabel27.setText("Apakah mempunyai kebun/pabrik/kebun dan pabrik");

        kebun_pabrikbuttonGroup.add(kebun_pabrikRadioButton);
        kebun_pabrikRadioButton.setText("Kebun dan Pabrik");

        nextToggleButton.setText("NEXT");
        nextToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextToggleButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Jumlah Kebun :");

        jLabel2.setText("Nama Produk Utama yang dihasilkan:");

        jLabel3.setText("Kode KBKI:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("KETERANGAN PERUSAHAAN/KANTOR ADMINISTRATUR");

        jumlah_KebunComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ya_pelaksana_kemitraanRadioButton)
                                    .addComponent(ya_kebun_plasma_belum_dikonversiRadioButton)
                                    .addComponent(ya_unit_pengolahan_produksiRadioButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tidak_pelaksana_kemitraanRadioButton)
                                    .addComponent(tidak_kebun_plasma_belum_dikonversiRadioButton)
                                    .addComponent(tidak_unit_pengolahan_produksiRadioButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kebunRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pabrikRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kebun_pabrikRadioButton))
                            .addComponent(tahun_berdiri_perusahaanTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pmdnRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pmaRadioButton))
                            .addComponent(bentuk_badan_hukumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(produk_UtamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlah_KebunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbkiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(nextToggleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pmdnRadioButton)
                        .addComponent(pmaRadioButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bentuk_badan_hukumComboBox)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(ya_pelaksana_kemitraanRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ya_kebun_plasma_belum_dikonversiRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ya_unit_pengolahan_produksiRadioButton)
                                    .addComponent(jLabel25)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tidak_pelaksana_kemitraanRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tidak_kebun_plasma_belum_dikonversiRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tidak_unit_pengolahan_produksiRadioButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tahun_berdiri_perusahaanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(kebun_pabrikRadioButton)
                    .addComponent(kebunRadioButton)
                    .addComponent(pabrikRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jumlah_KebunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(produk_UtamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kbkiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextToggleButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pmdnRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmdnRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmdnRadioButtonActionPerformed

    private void bentuk_badan_hukumComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bentuk_badan_hukumComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bentuk_badan_hukumComboBoxActionPerformed

    private void ya_pelaksana_kemitraanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ya_pelaksana_kemitraanRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ya_pelaksana_kemitraanRadioButtonActionPerformed

    private void ya_kebun_plasma_belum_dikonversiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ya_kebun_plasma_belum_dikonversiRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ya_kebun_plasma_belum_dikonversiRadioButtonActionPerformed

    private void ya_unit_pengolahan_produksiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ya_unit_pengolahan_produksiRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ya_unit_pengolahan_produksiRadioButtonActionPerformed

    private void kebunRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kebunRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kebunRadioButtonActionPerformed

    private void nextToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextToggleButtonActionPerformed
        // TODO add your handling code here:
        //Keterangan perusahaan
        if(pmdnRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setStatusPemodalan('1');
        }
        if(pmaRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setStatusPemodalan('2');
        }
        //Bentuk badan hukum
        if("Persero/Perum".equals(bentuk_badan_hukumComboBox.getSelectedItem().toString())){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('1');
        }
        if("Perusahaan Daerah (PD)/BUMD".equals(bentuk_badan_hukumComboBox.getSelectedItem().toString())){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('2');
        }
        if("Perseroan Terbatas (PT)".equals(bentuk_badan_hukumComboBox.getSelectedItem().toString())){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('3');
        }
        if("Koperasi/KUD".equals(bentuk_badan_hukumComboBox.getSelectedItem().toString())){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('4');
        }
        if("Yayasan".equals(bentuk_badan_hukumComboBox.getSelectedItem().toString())){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('5');
        }
        if("NV".equals(bentuk_badan_hukumComboBox.getSelectedItem().toString())){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('6');
        }
        if("CV".equals(bentuk_badan_hukumComboBox.getSelectedItem().toString())){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('7');
        }
        if("Firma".equals(bentuk_badan_hukumComboBox.getSelectedItem().toString())){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('8');
        }
        if("Perwakilan Perusahaan/Lembaga Asing".equals(bentuk_badan_hukumComboBox.getSelectedItem().toString())){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum('9');
        }
        //Pelaksana kemitraan
        if(ya_pelaksana_kemitraanRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setPelaksanaanKemitraan('1');
        }
        if(tidak_pelaksana_kemitraanRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setPelaksanaanKemitraan('2');
        }
        //Kebun plasma konversi
        if(ya_kebun_plasma_belum_dikonversiRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setKebunPlasmaKonversi('1');
        }
        if(tidak_kebun_plasma_belum_dikonversiRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setKebunPlasmaKonversi('2');
        }
        //Unit pengolahan produksi
        if(ya_unit_pengolahan_produksiRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setUnitPengolahanProduksi('1');
        }
        if(tidak_unit_pengolahan_produksiRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setUnitPengolahanProduksi('2');
        }
        
        dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setTahunBerdiri(Integer.parseInt(tahun_berdiri_perusahaanTextField.getText()));
        
        //Jenis perusahaan tebu
        if(kebunRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setJenisPerusahaanTebu('1');
        }
        if(pabrikRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setJenisPerusahaanTebu('2');
        }
        if(kebun_pabrikRadioButton.isSelected()){
            dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().setJenisPerusahaanTebu('3');
        }
        
        dataPerkebunan.setProdukUtama(produk_UtamaTextField.getText());
        dataPerkebunan.setKBKI(kbkiTextField.getText());
        
        int jumlah_kebun = Integer.parseInt(jumlah_KebunComboBox.getSelectedItem().toString());
        int nomorKebun = 1;
        setVisible(false);
        KuesionerPanel3 panel3 = new KuesionerPanel3(namaPetugas, kenaValidasi, jumlah_kebun, nomorKebun, dataPerkebunan);
        panel3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_nextToggleButtonActionPerformed

    private void setField(){
        //Keterangan perusahaan
        if(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getStatusPemodalan() == '1'){
            pmdnRadioButton.setSelected(true);
        }
        else{
            pmaRadioButton.setSelected(true);
        }
        //Bentuk badan hukum
        switch (dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getBentukBadanHukum()) {
            case '1' -> bentuk_badan_hukumComboBox.setSelectedIndex(0);
            case '2' -> bentuk_badan_hukumComboBox.setSelectedIndex(1);
            case '3' -> bentuk_badan_hukumComboBox.setSelectedIndex(2);
            case '4' -> bentuk_badan_hukumComboBox.setSelectedIndex(3);
            case '5' -> bentuk_badan_hukumComboBox.setSelectedIndex(4);
            case '6' -> bentuk_badan_hukumComboBox.setSelectedIndex(5);
            case '7' -> bentuk_badan_hukumComboBox.setSelectedIndex(6);
            case '8' -> bentuk_badan_hukumComboBox.setSelectedIndex(7);
            default -> bentuk_badan_hukumComboBox.setSelectedIndex(8);
        }
        //Pelaksana kemitraan
        if(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getPelaksanaanKemitraan() == '1'){
            ya_pelaksana_kemitraanRadioButton.setSelected(true);
        }
        else if(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getPelaksanaanKemitraan() == '2'){
            tidak_pelaksana_kemitraanRadioButton.setSelected(true);
        }
        //Kebun plasma konversi
        if(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getKebunPlasmaKonversi() == '1'){
            ya_kebun_plasma_belum_dikonversiRadioButton.setSelected(true);
        }
        else if(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getKebunPlasmaKonversi() == '2'){
            tidak_kebun_plasma_belum_dikonversiRadioButton.setSelected(true);
        }
        //Unit pengolahan produksi
        if(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getUnitPengolahanProduksi() == '1'){
            ya_unit_pengolahan_produksiRadioButton.setSelected(true);
        }
        else if(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getUnitPengolahanProduksi() == '2'){
            tidak_unit_pengolahan_produksiRadioButton.setSelected(true);
        }
        
        tahun_berdiri_perusahaanTextField.setText(Integer.toString(dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getTahunBerdiri()));
        
        //Jenis perusahaan tebu
        switch (dataPerkebunan.getPerusahaan().getKeteranganPerusahaan().getJenisPerusahaanTebu()) {
            case '1' -> kebunRadioButton.setSelected(true);
            case '2' -> pabrikRadioButton.setSelected(true);
            case '3' -> kebun_pabrikRadioButton.setSelected(true);
            default -> kebunRadioButton.setSelected(false);
        }
        //Jumlah kebun
        switch (dataPerkebunan.getJumlahKebun()) {
            case 1 -> jumlah_KebunComboBox.setSelectedIndex(0);
            case 2 -> jumlah_KebunComboBox.setSelectedIndex(1);
            case 3 -> jumlah_KebunComboBox.setSelectedIndex(2);
            case 4 -> jumlah_KebunComboBox.setSelectedIndex(3);
            case 5 -> jumlah_KebunComboBox.setSelectedIndex(4);
            case 6 -> jumlah_KebunComboBox.setSelectedIndex(5);
            case 7 -> jumlah_KebunComboBox.setSelectedIndex(6);
            case 8 -> jumlah_KebunComboBox.setSelectedIndex(7);
            case 9 -> jumlah_KebunComboBox.setSelectedIndex(8);
            case 10 -> jumlah_KebunComboBox.setSelectedIndex(9);
            default -> jumlah_KebunComboBox.setSelectedIndex(0);
        }
        
        produk_UtamaTextField.setText(dataPerkebunan.getProdukUtama());
        kbkiTextField.setText(dataPerkebunan.getKBKI());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String namaPetugas = null;
        boolean kenaValidasi = false;
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
            java.util.logging.Logger.getLogger(KuesionerPanel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KuesionerPanel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KuesionerPanel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KuesionerPanel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KuesionerPanel2(namaPetugas, kenaValidasi, dataPerkebunan).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bentuk_badan_hukumComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jumlah_KebunComboBox;
    private javax.swing.JTextField kbkiTextField;
    private javax.swing.JRadioButton kebunRadioButton;
    private javax.swing.JRadioButton kebun_pabrikRadioButton;
    private javax.swing.ButtonGroup kebun_pabrikbuttonGroup;
    private javax.swing.ButtonGroup kebun_plasma_belum_konversibuttonGroup;
    private javax.swing.JToggleButton nextToggleButton;
    private javax.swing.JRadioButton pabrikRadioButton;
    private javax.swing.ButtonGroup pelaksana_kemitraanGroup;
    private javax.swing.JRadioButton pmaRadioButton;
    private javax.swing.JRadioButton pmdnRadioButton;
    private javax.swing.JTextField produk_UtamaTextField;
    private javax.swing.ButtonGroup status_pemodalanbuttonGroup;
    private javax.swing.JTextField tahun_berdiri_perusahaanTextField;
    private javax.swing.JRadioButton tidak_kebun_plasma_belum_dikonversiRadioButton;
    private javax.swing.JRadioButton tidak_pelaksana_kemitraanRadioButton;
    private javax.swing.JRadioButton tidak_unit_pengolahan_produksiRadioButton;
    private javax.swing.ButtonGroup unit_pengolahanbuttonGroup;
    private javax.swing.JRadioButton ya_kebun_plasma_belum_dikonversiRadioButton;
    private javax.swing.JRadioButton ya_pelaksana_kemitraanRadioButton;
    private javax.swing.JRadioButton ya_unit_pengolahan_produksiRadioButton;
    // End of variables declaration//GEN-END:variables
}
