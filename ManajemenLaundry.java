package com.mycompany.cobacoba;

import javax.swing.JOptionPane;

public class ManajemenLaundry extends javax.swing.JFrame {
    public ManajemenLaundry() {
        initComponents();
    }
    private String layananSelected;
    private String setrikaSelected;
    private String antarSelected;
    

    private void hitungTotal() {
        
        try {
            double berat = Double.parseDouble(lblBerat.getText());

            // Harga per kg
            int hargaCuci = 5000;
            int hargaKering = 6000;
            int hargaSetrika = 2000;
            int hargaAntar = 1000;

            // Biaya layanan
            double biayaLayanan = 0;
            if (layananSelected.equals("cuci")) {
                biayaLayanan = berat * hargaCuci;
            } else if (layananSelected.equals("kering")) {
                biayaLayanan = berat * hargaKering;
            }
            // Biaya setrika
            double biayaSetrika = setrikaSelected.equals("ya") ? berat * hargaSetrika : 0;

            // Biaya antar
            double biayaAntar = antarSelected.equals("ya") ? berat * hargaAntar : 0;

            // Total biaya
            double total = biayaLayanan + biayaSetrika + biayaAntar;
            // Tampilkan hasil
            lblTotal.setText("Total: Rp " + String.format("%,.0f", total));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan berat dalam angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonGroupLayanan = new javax.swing.ButtonGroup();
        ButtonGroupSetrika = new javax.swing.ButtonGroup();
        ButtonGroupAntar = new javax.swing.ButtonGroup();
        txtJudul = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JLabel();
        txtNamaCustomer = new javax.swing.JLabel();
        txtTanggalMasuk = new javax.swing.JLabel();
        txtJamMasuk = new javax.swing.JLabel();
        txtNoHp = new javax.swing.JLabel();
        txtLayanan = new javax.swing.JLabel();
        txtBerat = new javax.swing.JLabel();
        txtTanggalAmbil = new javax.swing.JLabel();
        txtJamAmbil = new javax.swing.JLabel();
        txtDiSetrika = new javax.swing.JLabel();
        txtAntarKeAlamat = new javax.swing.JLabel();
        lblNama = new javax.swing.JTextField();
        lblTanggal = new javax.swing.JTextField();
        lblJam = new javax.swing.JTextField();
        lblTanggalA = new javax.swing.JTextField();
        lblJamA = new javax.swing.JTextField();
        lblNohp = new javax.swing.JTextField();
        lblBerat = new javax.swing.JTextField();
        lblCuci = new javax.swing.JRadioButton();
        lblKering = new javax.swing.JRadioButton();
        lblYaSetrika = new javax.swing.JRadioButton();
        lblTidakSetrika = new javax.swing.JRadioButton();
        lblYaAntar = new javax.swing.JRadioButton();
        lblTidakAntar = new javax.swing.JRadioButton();
        txtTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblTotal = new javax.swing.JTextArea();
        Reset = new javax.swing.JButton();
        Hitung = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        txtCatatan = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtJudul.setText("UNP LAUNDRY");

        txtAlamat.setText("JL. PROF. DR. HAMKA, AIR TAWAR BARAT, KEC. PADANG UTARA, KOTA PADANG");

        txtNamaCustomer.setText("Nama Customer");

        txtTanggalMasuk.setText("Tanggal Masuk");

        txtJamMasuk.setText("Jam Masuk");

        txtNoHp.setText("No. HP Customer");

        txtLayanan.setText("Layanan");

        txtBerat.setText("Berat (Kg)");

        txtTanggalAmbil.setText("Tanggal Ambil");

        txtJamAmbil.setText("Jam Ambil");

        txtDiSetrika.setText("Di Setrika");

        txtAntarKeAlamat.setText("Antar Ke Alamat");

        lblNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNamaActionPerformed(evt);
            }
        });

        lblTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTanggalActionPerformed(evt);
            }
        });

        lblJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblJamActionPerformed(evt);
            }
        });

        ButtonGroupLayanan.add(lblCuci);
        lblCuci.setText("Cuci");
        lblCuci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCuciActionPerformed(evt);
            }
        });

        ButtonGroupLayanan.add(lblKering);
        lblKering.setText("Kering");
        lblKering.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblKeringActionPerformed(evt);
            }
        });

        ButtonGroupSetrika.add(lblYaSetrika);
        lblYaSetrika.setText("Ya");
        lblYaSetrika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblYaSetrikaActionPerformed(evt);
            }
        });

        ButtonGroupSetrika.add(lblTidakSetrika);
        lblTidakSetrika.setText("Tidak");
        lblTidakSetrika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTidakSetrikaActionPerformed(evt);
            }
        });

        ButtonGroupAntar.add(lblYaAntar);
        lblYaAntar.setText("Ya");
        lblYaAntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblYaAntarActionPerformed(evt);
            }
        });

        ButtonGroupAntar.add(lblTidakAntar);
        lblTidakAntar.setText("Tidak");
        lblTidakAntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTidakAntarActionPerformed(evt);
            }
        });

        txtTotal.setText("Total");

        lblTotal.setColumns(20);
        lblTotal.setRows(5);
        jScrollPane1.setViewportView(lblTotal);

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        Kembali.setText("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        txtCatatan.setText("Catatan :");

        jLabel15.setText("- MOHON PERIKSA HASIL CUCIAN ANDA");

        jLabel16.setText("- HASIL CUCIAN YANG SUDAH DIBAWA PULANG DILUAR TANGGUNG JAWAB KAMI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtAntarKeAlamat))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtTotal)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Hitung)
                        .addGap(75, 75, 75)
                        .addComponent(Kembali)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtBerat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(lblBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamaCustomer)
                                    .addComponent(txtTanggalMasuk)
                                    .addComponent(txtJamMasuk)
                                    .addComponent(txtTanggalAmbil)
                                    .addComponent(txtJamAmbil)
                                    .addComponent(txtNoHp))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNohp)
                                    .addComponent(lblJamA)
                                    .addComponent(lblTanggalA)
                                    .addComponent(lblJam)
                                    .addComponent(lblTanggal)
                                    .addComponent(lblNama))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLayanan)
                            .addComponent(txtDiSetrika))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Reset)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblCuci, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblKering)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblYaSetrika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblYaAntar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTidakSetrika)
                                    .addComponent(lblTidakAntar))
                                .addGap(233, 233, 233))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCatatan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtJudul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlamat)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNamaCustomer)
                    .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTanggalMasuk)
                    .addComponent(lblTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJamMasuk)
                    .addComponent(lblJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTanggalAmbil)
                    .addComponent(lblTanggalA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJamAmbil)
                    .addComponent(lblJamA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoHp)
                    .addComponent(lblNohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBerat)
                    .addComponent(lblBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLayanan)
                    .addComponent(lblCuci)
                    .addComponent(lblKering))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiSetrika)
                    .addComponent(lblYaSetrika)
                    .addComponent(lblTidakSetrika))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAntarKeAlamat)
                    .addComponent(lblYaAntar)
                    .addComponent(lblTidakAntar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reset)
                    .addComponent(Hitung)
                    .addComponent(Kembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCatatan)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblKeringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblKeringActionPerformed
        layananSelected = "kering";
    }//GEN-LAST:event_lblKeringActionPerformed

    private void lblTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTanggalActionPerformed

    private void lblNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNamaActionPerformed

    private void lblJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblJamActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        lblBerat.setText(""); 
        lblJam.setText("");
        lblJamA.setText("");
        lblNama.setText("");
        lblNohp.setText("");
        lblTanggal.setText("");
        lblTanggalA.setText("");
        lblTotal.setText("");
        ButtonGroupLayanan.clearSelection();
        ButtonGroupSetrika.clearSelection();
        ButtonGroupAntar.clearSelection();
    }//GEN-LAST:event_ResetActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        hitungTotal();        
    }//GEN-LAST:event_HitungActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_KembaliActionPerformed

    private void lblCuciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCuciActionPerformed
        layananSelected = "cuci";
    }//GEN-LAST:event_lblCuciActionPerformed

    private void lblYaSetrikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblYaSetrikaActionPerformed
        setrikaSelected = "ya";
    }//GEN-LAST:event_lblYaSetrikaActionPerformed

    private void lblTidakSetrikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTidakSetrikaActionPerformed
        setrikaSelected = "tidak";
    }//GEN-LAST:event_lblTidakSetrikaActionPerformed

    private void lblYaAntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblYaAntarActionPerformed
        antarSelected = "ya";
    }//GEN-LAST:event_lblYaAntarActionPerformed

    private void lblTidakAntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTidakAntarActionPerformed
        antarSelected = "tidak";
    }//GEN-LAST:event_lblTidakAntarActionPerformed

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
            java.util.logging.Logger.getLogger(ManajemenLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManajemenLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManajemenLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManajemenLaundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManajemenLaundry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup ButtonGroupAntar;
    private javax.swing.ButtonGroup ButtonGroupLayanan;
    private javax.swing.ButtonGroup ButtonGroupSetrika;
    private javax.swing.JButton Hitung;
    private javax.swing.JButton Kembali;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblBerat;
    private javax.swing.JRadioButton lblCuci;
    private javax.swing.JTextField lblJam;
    private javax.swing.JTextField lblJamA;
    private javax.swing.JRadioButton lblKering;
    private javax.swing.JTextField lblNama;
    private javax.swing.JTextField lblNohp;
    private javax.swing.JTextField lblTanggal;
    private javax.swing.JTextField lblTanggalA;
    private javax.swing.JRadioButton lblTidakAntar;
    private javax.swing.JRadioButton lblTidakSetrika;
    private javax.swing.JTextArea lblTotal;
    private javax.swing.JRadioButton lblYaAntar;
    private javax.swing.JRadioButton lblYaSetrika;
    private javax.swing.JLabel txtAlamat;
    private javax.swing.JLabel txtAntarKeAlamat;
    private javax.swing.JLabel txtBerat;
    private javax.swing.JLabel txtCatatan;
    private javax.swing.JLabel txtDiSetrika;
    private javax.swing.JLabel txtJamAmbil;
    private javax.swing.JLabel txtJamMasuk;
    private javax.swing.JLabel txtJudul;
    private javax.swing.JLabel txtLayanan;
    private javax.swing.JLabel txtNamaCustomer;
    private javax.swing.JLabel txtNoHp;
    private javax.swing.JLabel txtTanggalAmbil;
    private javax.swing.JLabel txtTanggalMasuk;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables


}
