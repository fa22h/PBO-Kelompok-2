/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mform.PanelData;

import javax.swing.JOptionPane;

import mform.PemeriksaPanel;
import mform.entity.DataPerkebunan;
import mform.entity.KeteranganPerusahaan;

/**
 * @author: Kelompok 2
 * 1. Alvin Jeremy Naiborhu
 * 2. Fstih Mudzaky
 * 3. Yedija Lewi Suryadi
 * 4. Zahra Mufidah
 */

public class Panel2 extends javax.swing.JPanel {
    public static KeteranganPerusahaan keteranganPerusahaan = PemeriksaPanel.dataPerkebunan.getPerusahaan().getKeteranganPerusahaan();
    public static String produkUtama = PemeriksaPanel.dataPerkebunan.getProdukUtama();
    public static String kbki = PemeriksaPanel.dataPerkebunan.getKBKI();

    /**
     * Creates new form Panel2
     */
    public Panel2() {
        initComponents();
        setField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        punyaUnitProduksiRadioButton = new javax.swing.JRadioButton();
        notPunyaUnitProduksiRadioButton = new javax.swing.JRadioButton();
        jLabel26 = new javax.swing.JLabel();
        kebunRadioButton = new javax.swing.JRadioButton();
        pabrikRadioButton = new javax.swing.JRadioButton();
        tahunBerdiriTextField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        kebunPabrikRadioButton = new javax.swing.JRadioButton();
        panel2SaveButton = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pmdnRadioButton = new javax.swing.JRadioButton();
        pmaRadioButton = new javax.swing.JRadioButton();
        statusComboBox = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pelaksanaKemitraanRadioButton = new javax.swing.JRadioButton();
        notPelaksanaKemitraanRadioButton = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        punyaKPBelumKonversiRadioButton = new javax.swing.JRadioButton();
        notPunyaKPBelumKonversiRadioButton = new javax.swing.JRadioButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        produkUtamaTextField = new javax.swing.JTextField();
        kbkiTextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jumlahKebunComboBox = new javax.swing.JComboBox<>();

        punyaUnitProduksiRadioButton.setText("Ya");

        notPunyaUnitProduksiRadioButton.setText("Tidak");

        jLabel26.setText("Tahun berdiri/operasional perusahaan");

        kebunRadioButton.setText("Kebun");

        pabrikRadioButton.setText("Pabrik");

        jLabel27.setText("Apakah mempunyai kebun/pabrik/kebun dan pabrik");

        kebunPabrikRadioButton.setText("Kebun dan Pabrik");

        panel2SaveButton.setText("SAVE CHANGE");
        panel2SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel2SaveButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Jumlah Kebun :");

        jLabel17.setText("Status Permodalan/Pemilikan:");

        pmdnRadioButton.setText("PMDN");

        pmaRadioButton.setText("PMA");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Persero/Perum", "Perusahaan Daerah (PD)/BUMD", "Perseroan Terbatas (PT)", "Koperasi/KUD", "Yayasan", "NV", "CV", "Firma", "Perwakilan Perusahaan/Lembaga Asing" }));

        jLabel18.setText("Bentuk Badan Hukum:");

        jLabel19.setText("Apakah sebagai Pelaksana Kemitraan?");

        pelaksanaKemitraanRadioButton.setText("Ya");

        notPelaksanaKemitraanRadioButton.setText("Tidak");

        jLabel24.setText("Apakah mempunyai Kebun Plasma yang belum dikonversi?");

        punyaKPBelumKonversiRadioButton.setText("Ya");

        notPunyaKPBelumKonversiRadioButton.setText("Tidak");

        jLabel25.setText("Apakah mempunyai unit pengolahan produksi?");

        jLabel2.setText("Nama Produk Utama yang dihasilkan:");

        jLabel3.setText("Kode KBKI:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("KETERANGAN PERUSAHAAN/KANTOR ADMINISTRATUR");

        jumlahKebunComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kbkiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahKebunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produkUtamaTextField)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panel2SaveButton)
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
                                        .addComponent(pelaksanaKemitraanRadioButton)
                                        .addComponent(punyaKPBelumKonversiRadioButton)
                                        .addComponent(punyaUnitProduksiRadioButton))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(notPelaksanaKemitraanRadioButton)
                                        .addComponent(notPunyaKPBelumKonversiRadioButton)
                                        .addComponent(notPunyaUnitProduksiRadioButton)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(kebunRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pabrikRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(kebunPabrikRadioButton))
                                .addComponent(tahunBerdiriTextField)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pmdnRadioButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pmaRadioButton))
                                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(statusComboBox)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(pelaksanaKemitraanRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(punyaKPBelumKonversiRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(punyaUnitProduksiRadioButton)
                                    .addComponent(jLabel25)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notPelaksanaKemitraanRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notPunyaKPBelumKonversiRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notPunyaUnitProduksiRadioButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(tahunBerdiriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(kebunPabrikRadioButton)
                    .addComponent(kebunRadioButton)
                    .addComponent(pabrikRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jumlahKebunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(produkUtamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kbkiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2SaveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panel2SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel2SaveButtonActionPerformed
        try {
            save();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal melakukan penyimpanan data Keterangan Perusahaan\n" + e.getMessage());
        }
    }//GEN-LAST:event_panel2SaveButtonActionPerformed
    
    private void setField(){
        //Status Permodalan/Pemilikan
        if(keteranganPerusahaan.getStatusPemodalan() == '1'){
            pmdnRadioButton.setSelected(true);
        }
        else{
            pmaRadioButton.setSelected(true);
        }

        //Status
        switch (keteranganPerusahaan.getBentukBadanHukum()) {
            case '1' -> statusComboBox.setSelectedIndex(0);
            case '2' -> statusComboBox.setSelectedIndex(1);
            case '3' -> statusComboBox.setSelectedIndex(2);
            case '4' -> statusComboBox.setSelectedIndex(3);
            case '5' -> statusComboBox.setSelectedIndex(4);
            case '6' -> statusComboBox.setSelectedIndex(5);
            case '7' -> statusComboBox.setSelectedIndex(6);
            case '8' -> statusComboBox.setSelectedIndex(7);
            default -> statusComboBox.setSelectedIndex(8);
        }

        //Pelaksana Kemitraan
        if(keteranganPerusahaan.getPelaksanaanKemitraan() == '1'){
            pelaksanaKemitraanRadioButton.setSelected(true);
        }
        else if(keteranganPerusahaan.getPelaksanaanKemitraan() == '2'){
            notPelaksanaKemitraanRadioButton.setSelected(true);
        }

        //Kebun plasma belum dikonversi
        if(keteranganPerusahaan.getKebunPlasmaKonversi() == '1'){
            punyaKPBelumKonversiRadioButton.setSelected(true);
        }
        else if(keteranganPerusahaan.getKebunPlasmaKonversi() == '2'){
            notPunyaKPBelumKonversiRadioButton.setSelected(true);
        }

        //Unit Pengolahan Produksi
        if(keteranganPerusahaan.getUnitPengolahanProduksi() == '1'){
            punyaUnitProduksiRadioButton.setSelected(true);
        }
        else if(keteranganPerusahaan.getUnitPengolahanProduksi() == '2'){
            notPunyaUnitProduksiRadioButton.setSelected(true);
        }

        //Tahun berdiri
        tahunBerdiriTextField.setText(Integer.toString(keteranganPerusahaan.getTahunBerdiri()));

        //Kebun / Pabrik / Kebun & Pabrik
        switch (keteranganPerusahaan.getJenisPerusahaanTebu()) {
            case '1' -> kebunRadioButton.setSelected(true);
            case '2' -> pabrikRadioButton.setSelected(true);
            case '3' -> kebunPabrikRadioButton.setSelected(true);
            default -> kebunRadioButton.setSelected(false);
        }

        //Jumlah kebun
        switch (PemeriksaPanel.dataPerkebunan.getJumlahKebun()) {
            case 1 -> jumlahKebunComboBox.setSelectedIndex(0);
            case 2 -> jumlahKebunComboBox.setSelectedIndex(1);
            case 3 -> jumlahKebunComboBox.setSelectedIndex(2);
            case 4 -> jumlahKebunComboBox.setSelectedIndex(3);
            case 5 -> jumlahKebunComboBox.setSelectedIndex(4);
            case 6 -> jumlahKebunComboBox.setSelectedIndex(5);
            case 7 -> jumlahKebunComboBox.setSelectedIndex(6);
            case 8 -> jumlahKebunComboBox.setSelectedIndex(7);
            case 9 -> jumlahKebunComboBox.setSelectedIndex(8);
            case 10 -> jumlahKebunComboBox.setSelectedIndex(9);
            default -> jumlahKebunComboBox.setSelectedIndex(0);
        }

        //Produk Utama
        produkUtamaTextField.setText(produkUtama);

        //Kode KBKI
        kbkiTextField.setText(kbki);

    }

    private void save() {
        //Status Permodalan/Pemilikan
        if (pmdnRadioButton.isSelected()) {
            keteranganPerusahaan.setStatusPemodalan('1');
        } else if (pmaRadioButton.isSelected()) {
            keteranganPerusahaan.setStatusPemodalan('2');
        }
    
        //Status
        int selectedStatusIndex = statusComboBox.getSelectedIndex();
        switch (selectedStatusIndex) {
            case 0 -> keteranganPerusahaan.setBentukBadanHukum('1');
            case 1 -> keteranganPerusahaan.setBentukBadanHukum('2');
            case 2 -> keteranganPerusahaan.setBentukBadanHukum('3');
            case 3 -> keteranganPerusahaan.setBentukBadanHukum('4');
            case 4 -> keteranganPerusahaan.setBentukBadanHukum('5');
            case 5 -> keteranganPerusahaan.setBentukBadanHukum('6');
            case 6 -> keteranganPerusahaan.setBentukBadanHukum('7');
            case 7 -> keteranganPerusahaan.setBentukBadanHukum('8');
            default -> keteranganPerusahaan.setBentukBadanHukum('9');
        }
    
        //Pelaksana Kemitraan
        if (pelaksanaKemitraanRadioButton.isSelected()) {
            keteranganPerusahaan.setPelaksanaanKemitraan('1');
        } else if (notPelaksanaKemitraanRadioButton.isSelected()) {
            keteranganPerusahaan.setPelaksanaanKemitraan('2');
        }
    
        //Kebun plasma belum dikonversi
        if (punyaKPBelumKonversiRadioButton.isSelected()) {
            keteranganPerusahaan.setKebunPlasmaKonversi('1');
        } else if (notPunyaKPBelumKonversiRadioButton.isSelected()) {
            keteranganPerusahaan.setKebunPlasmaKonversi('2');
        }
    
        //Unit Pengolahan Produksi
        if (punyaUnitProduksiRadioButton.isSelected()) {
            keteranganPerusahaan.setUnitPengolahanProduksi('1');
        } else if (notPunyaUnitProduksiRadioButton.isSelected()) {
            keteranganPerusahaan.setUnitPengolahanProduksi('2');
        }
    
        //Tahun berdiri
        try {
            int tahunBerdiri = Integer.parseInt(tahunBerdiriTextField.getText());
            keteranganPerusahaan.setTahunBerdiri(tahunBerdiri);
        } catch (NumberFormatException e) {
            // Handle invalid input if necessary
            e.printStackTrace();
        }
    
        //Kebun / Pabrik / Kebun & Pabrik
        if (kebunRadioButton.isSelected()) {
            keteranganPerusahaan.setJenisPerusahaanTebu('1');
        } else if (pabrikRadioButton.isSelected()) {
            keteranganPerusahaan.setJenisPerusahaanTebu('2');
        } else if (kebunPabrikRadioButton.isSelected()) {
            keteranganPerusahaan.setJenisPerusahaanTebu('3');
        } else {
            keteranganPerusahaan.setJenisPerusahaanTebu('0'); // Assuming '0' for default case
        }
    
        //Produk Utama
        produkUtama = produkUtamaTextField.getText();
    
        //Kode KBKI
        kbki = kbkiTextField.getText();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JComboBox<String> jumlahKebunComboBox;
    private javax.swing.JTextField kbkiTextField;
    private javax.swing.JRadioButton kebunPabrikRadioButton;
    private javax.swing.JRadioButton kebunRadioButton;
    private javax.swing.JRadioButton notPelaksanaKemitraanRadioButton;
    private javax.swing.JRadioButton notPunyaKPBelumKonversiRadioButton;
    private javax.swing.JRadioButton notPunyaUnitProduksiRadioButton;
    private javax.swing.JRadioButton pabrikRadioButton;
    public static javax.swing.JToggleButton panel2SaveButton;
    private javax.swing.JRadioButton pelaksanaKemitraanRadioButton;
    private javax.swing.JRadioButton pmaRadioButton;
    private javax.swing.JRadioButton pmdnRadioButton;
    private javax.swing.JTextField produkUtamaTextField;
    private javax.swing.JRadioButton punyaKPBelumKonversiRadioButton;
    private javax.swing.JRadioButton punyaUnitProduksiRadioButton;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField tahunBerdiriTextField;
    // End of variables declaration//GEN-END:variables
}
