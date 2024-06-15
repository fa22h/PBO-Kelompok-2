/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mform;

import java.util.List;

import javax.swing.JOptionPane;

import database.DataInserter;
import database.DataUpdater;
import mform.PanelData.*;
import mform.entity.*;
import mform.form.Form;
import mform.form.FormDataPerkebunan;

/**
 *
 * @author fatih
 */
public class DataKuesioner extends javax.swing.JFrame {
    private DataPerkebunan dp = PemeriksaPanel.dataPerkebunan;
    private DataUpdater du = new DataUpdater();
    private int idPerusahaan;
    
    private HomePanel home = new HomePanel();
    private Panel1 panel1 = new Panel1();
    private Panel1b panel1b = new Panel1b();
    private Panel1c panel1c = new Panel1c();
    private Panel2 panel2 = new Panel2();
    private Panel3 panel3 = new Panel3();
    private Panel3duplikat[] panel3duplikat;
    private Panel4 panel4 = new Panel4();
    
    //Index buat panel3duplikat
    public static int indexPanel = 0;

    /**
     * Creates new form DataKuesioner
     */
    public DataKuesioner() {
        initComponents();
        panel3duplikat = initPanel();
        idPerusahaan = du.getIdPerusahaan(dp.getPerusahaan().getNama());
        jScrollPane1.setViewportView(home);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        simpanGlobalButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(520, 625));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(520, 625));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(520, 625));

        jLabel1.setText("Nama petugas: " + MainFrame_Login.namaPemeriksa);

        simpanGlobalButton.setText("Simpan ke Database");
        simpanGlobalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanGlobalButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("Kuesioner");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("perusahaan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("kantor pusat");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("grup perusahaan");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("kantor administratur");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("kebun pertama");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("semua kebun");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("stok gkp");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simpanGlobalButton)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(simpanGlobalButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jScrollPane1.setViewportView(panel1);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jScrollPane1.setViewportView(panel1b);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jScrollPane1.setViewportView(panel1c);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jScrollPane1.setViewportView(panel2);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jScrollPane1.setViewportView(panel3);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jScrollPane1.setViewportView(panel3duplikat[0]);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        jScrollPane1.setViewportView(panel4);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void simpanGlobalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanGlobalButtonActionPerformed
        
        //Masukkan data perusahaan ke variabel dp
        Panel1.panel1SaveButton.doClick();
        dp.setPerusahaan(Panel1.perusahaan);

        //Masukkan data Kantor Pusat ke variabel dp
        Panel1b.panel1bSaveButton.doClick();
        dp.setKantorPusat(Panel1b.kp);

        //Masukkan data Group Perusahaan ke variabel dp
        Panel1c.panel1cSaveButton.doClick();
        dp.setGroupPerusahaan(Panel1c.gp);
        
        //Masukkan data Keterangan Perusahaan, jumlah kebun, produk utama, 
        //kode kbki ke variabel dp
        Panel2.panel2SaveButton.doClick();
        dp.getPerusahaan().getKeteranganPerusahaan().setBentukBadanHukum(Panel2.keteranganPerusahaan.getBentukBadanHukum());
        dp.getPerusahaan().getKeteranganPerusahaan().setJenisPerusahaanTebu(Panel2.keteranganPerusahaan.getJenisPerusahaanTebu());
        dp.getPerusahaan().getKeteranganPerusahaan().setKebunPlasmaKonversi(Panel2.keteranganPerusahaan.getKebunPlasmaKonversi());
        dp.getPerusahaan().getKeteranganPerusahaan().setPelaksanaanKemitraan(Panel2.keteranganPerusahaan.getPelaksanaanKemitraan());
        dp.getPerusahaan().getKeteranganPerusahaan().setStatusPemodalan(Panel2.keteranganPerusahaan.getStatusPemodalan());
        dp.getPerusahaan().getKeteranganPerusahaan().setTahunBerdiri(Panel2.keteranganPerusahaan.getTahunBerdiri());
        dp.getPerusahaan().getKeteranganPerusahaan().setUnitPengolahanProduksi(Panel2.keteranganPerusahaan.getUnitPengolahanProduksi());
        dp.setKBKI(Panel2.kbki);
        dp.setProdukUtama(Panel2.produkUtama);
        
        //Reset data kebun
        dp.resetKebun();
        //Masukkan data kebun pertama
        Panel3.panel3SaveButton.doClick();
        dp.setKebun(Panel3.kebun);

        //Masukkan data kebun lain kalau ada
        for(int i = 1; i < dp.getJumlahKebun(); i++){
            panel3duplikat[i].panel3SaveButton.doClick();
            dp.setKebun(Panel3duplikat.kebuns[i]);
        }

        //Masukkan stok gkp
        Panel4.panel4SaveButton.doClick();
        dp.setStokGKP(Panel4.stokGKP);
        
        //Validasi & upload data ke database
        boolean isUpdated = false;
        FormDataPerkebunan form = new FormDataPerkebunan(dp);
        form.validate();
        if(form.getErrorMessages().isEmpty()){
            //Set keterangan petugas
            dp.getKeteranganPetugas().setNamaPemeriksa(MainFrame_Login.namaPemeriksa);
            
            //Save ke database
            int idGP = du.getIdGroupPerusahaan(dp.getGroupPerusahaan().getNama());
            int idKP = du.getIdKantorPusat(dp.getKantorPusat().getNama());
            isUpdated = du.updateData(dp, idPerusahaan, idGP, idKP);
        }
        else{
            List<String> errorMessages = form.getErrorMessages();
            String message = "Data Tidak Valid. Perbaiki error berikut:\n";
            for (String string : errorMessages) {
                message += (string + "\n");
            }
            JOptionPane.showMessageDialog(this, message);
        }
/*
        //TODO: Kalo udah selesai tes dihapus
        dp.getKeteranganPetugas().setNamaPemeriksa(MainFrame_Login.namaPemeriksa);
        int idGP = du.getIdGroupPerusahaan(dp.getGroupPerusahaan().getNama());
        int idKP = du.getIdKantorPusat(dp.getKantorPusat().getNama());
        boolean isUpdated = du.updateData(dp, idPerusahaan, idGP, idKP);
*/
        //Kalau update berhasil tampilkan dialog berhasil disimpan
        if(isUpdated){
            JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");

            //Balik ke login
            this.setVisible(false);
            new MainFrame_Login().setVisible(true);
            revalidate();
            repaint();
        }
        else{
            JOptionPane.showMessageDialog(this, "Gagal Menyimpan Data");
        }
        
    }//GEN-LAST:event_simpanGlobalButtonActionPerformed

    //Bikin Panel3 sebanyak jumlah kebun
    //Ini habis 3 jam sendiri :)
    private Panel3duplikat[] initPanel(){
        Panel3duplikat[] panel3s = new Panel3duplikat[dp.getJumlahKebun()];
        //inisiasi
        for(int i = 0; i < dp.getJumlahKebun() ; i++){
            panel3s[i] = new Panel3duplikat(jScrollPane1);
            indexPanel++;
        }
        //Masukkan array panel3s ke semua panel
        //Array ini dipakai buat pindah2 view
        for(int i = 0; i < dp.getJumlahKebun() ; i++){
            panel3s[i].setPanel3duplikat(panel3s);
        }

        indexPanel = 0;
        return panel3s;
    }


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
            java.util.logging.Logger.getLogger(DataKuesioner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataKuesioner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataKuesioner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataKuesioner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataKuesioner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton simpanGlobalButton;
    // End of variables declaration//GEN-END:variables
}
