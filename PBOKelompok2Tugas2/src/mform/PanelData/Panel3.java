/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mform.PanelData;

import mform.PemeriksaPanel;
import mform.entity.Kebun;

/**
 *
 * @author fatih
 */
public class Panel3 extends javax.swing.JPanel {
    public static Kebun kebun = PemeriksaPanel.dataPerkebunan.getKebun(0);

    /**
     * Creates new form Panel3
     */
    public Panel3() {
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

        jLabel6 = new javax.swing.JLabel();
        jenisKebunComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        kabKotaTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        provTextField = new javax.swing.JTextField();
        tebuTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        gkpTextField = new javax.swing.JTextField();
        luasTanamTextField = new javax.swing.JTextField();
        tetesTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hablurTextField = new javax.swing.JTextField();
        panel3SaveButton = new javax.swing.JToggleButton();
        luasTebangTextField = new javax.swing.JTextField();
        rendemenHablurTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("Tebu:");

        jenisKebunComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tebu Sendiri", "Tebu Rakyat", "Pembelian dari Pihak Ketiga" }));

        jLabel7.setText("GKP:");

        jLabel9.setText("Provinsi:");

        jLabel8.setText("Tetes: ");

        jLabel10.setText("Kabupaten/Kota:");

        jLabel11.setText("Hablur: ");

        jLabel12.setText("Rendemen Hablur (%): ");

        jLabel3.setText("Luas Areal Tanam (Ha): ");

        jLabel4.setText("Luas Areal Tebang (Ha): ");

        panel3SaveButton.setText("SAVE CHANGE");
        panel3SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panel3SaveButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LUAS TANAMAN DAN PRODUKSI");

        jLabel5.setText("Produksi (Ton):");

        jLabel1.setText("Jenis Kebun:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(luasTanamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(luasTebangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tebuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gkpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tetesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hablurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rendemenHablurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jenisKebunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kabKotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panel3SaveButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jenisKebunComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(provTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kabKotaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(luasTanamTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(luasTebangTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tebuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gkpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tetesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(hablurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rendemenHablurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel3SaveButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panel3SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panel3SaveButtonActionPerformed
        save();
    }//GEN-LAST:event_panel3SaveButtonActionPerformed

    private void setField(){
        //Jenis kebun
        switch (kebun.getJenisKebun().toLowerCase()) {
            case "tebu sendiri" -> jenisKebunComboBox.setSelectedIndex(0);
            case "tebu rakyat" -> jenisKebunComboBox.setSelectedIndex(1);
            case "pembelian dari pihak ketiga" -> jenisKebunComboBox.setSelectedIndex(2);
            default -> jenisKebunComboBox.setSelectedIndex(0);
        }
        
        //Letak: provinsi, kab/kota
        provTextField.setText(kebun.getLetak().getProv());
        kabKotaTextField.setText(kebun.getLetak().getKabKota());
        
        //Luas
        luasTanamTextField.setText(Double.toString(kebun.getLuasArealTanam()));
        luasTebangTextField.setText(Double.toString(kebun.getProduksi().getLuasArealTebang()));

        //Produksi
        tebuTextField.setText(Double.toString(kebun.getProduksi().getProduksiTebu()));
        gkpTextField.setText(Double.toString(kebun.getProduksi().getProduksiTetes()));
        tetesTextField.setText(Double.toString(kebun.getProduksi().getProduksiTetes()));
        hablurTextField.setText(Double.toString(kebun.getProduksi().getProduksiHablur()));
        rendemenHablurTextField.setText(Double.toString(kebun.getProduksi().getRendemenHablur()));
    }

    private void save() {
        // Jenis kebun
        switch (jenisKebunComboBox.getSelectedIndex()) {
            case 0 -> kebun.setJenisKebun("Tebu Sendiri");
            case 1 -> kebun.setJenisKebun("Tebu Rakyat");
            case 2 -> kebun.setJenisKebun("Pembelian dari Pihak Ketiga");
            default -> kebun.setJenisKebun("");
        }
    
        // Letak: provinsi, kab/kota
        kebun.getLetak().setProv(provTextField.getText());
        kebun.getLetak().setKabKota(kabKotaTextField.getText());
    
        // Luas
        try {
            kebun.setLuasArealTanam(Double.parseDouble(luasTanamTextField.getText()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        try {
            kebun.getProduksi().setLuasArealTebang(Double.parseDouble(luasTebangTextField.getText()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        // Produksi
        try {
            kebun.getProduksi().setProduksiTebu(Double.parseDouble(tebuTextField.getText()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        try {
            kebun.getProduksi().setProduksiGKP(Double.parseDouble(gkpTextField.getText()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        try {
            kebun.getProduksi().setProduksiTetes(Double.parseDouble(tetesTextField.getText()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        try {
            kebun.getProduksi().setProduksiHablur(Double.parseDouble(hablurTextField.getText()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    
        try {
            kebun.getProduksi().setRendemenHablur(Double.parseDouble(rendemenHablurTextField.getText()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gkpTextField;
    private javax.swing.JTextField hablurTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jenisKebunComboBox;
    private javax.swing.JTextField kabKotaTextField;
    private javax.swing.JTextField luasTanamTextField;
    private javax.swing.JTextField luasTebangTextField;
    public static javax.swing.JToggleButton panel3SaveButton;
    private javax.swing.JTextField provTextField;
    private javax.swing.JTextField rendemenHablurTextField;
    private javax.swing.JTextField tebuTextField;
    private javax.swing.JTextField tetesTextField;
    // End of variables declaration//GEN-END:variables
}