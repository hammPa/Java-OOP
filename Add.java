/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.JDialog;

import Items.*;

public class Add extends javax.swing.JDialog {
    private LibraryItem newItem;
    static int type = 1;
    private boolean confirm = false;
    private String selectedOption = null;
    /**
     * Creates new form Add
     */
    public Add() {
        super((java.awt.Frame) null, true);  // Make dialog modal
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        initComponents();
        setTitle("Add New Item");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        type_group = new javax.swing.ButtonGroup();
        judul = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        author_or_director_or_publisher = new javax.swing.JLabel();
        pages_or_duration_or_date = new javax.swing.JLabel();
        txt_judul = new javax.swing.JTextField();
        txt_page_or_duration_or_date = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_author_or_director_or_publisher = new javax.swing.JTextField();
        btm_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbl_book = new javax.swing.JRadioButton();
        lbl_dvd = new javax.swing.JRadioButton();
        lbl_magazine = new javax.swing.JRadioButton();

        judul.setText("Judul :");

        id.setText("ID : ");

        author_or_director_or_publisher.setText("Author : ");

        pages_or_duration_or_date.setText("Pages : ");

        txt_page_or_duration_or_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_page_or_duration_or_dateActionPerformed(evt);
            }
        });

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_author_or_director_or_publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_author_or_director_or_publisherActionPerformed(evt);
            }
        });

        btm_simpan.setText("Simpan");
        btm_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_simpanActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jLabel1.setText("Masukkan Data");

        amount.setText("Amount: ");

        txt_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_amountActionPerformed(evt);
            }
        });

        jLabel2.setText("Type");

        type_group.add(lbl_book);
        lbl_book.setText("Book");
        lbl_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_bookActionPerformed(evt);
            }
        });

        type_group.add(lbl_dvd);
        lbl_dvd.setText("DVD");
        lbl_dvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_dvdActionPerformed(evt);
            }
        });

        type_group.add(lbl_magazine);
        lbl_magazine.setText("Magazine");
        lbl_magazine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbl_magazineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btm_simpan)
                        .addGap(37, 37, 37)
                        .addComponent(btn_reset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_book)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_dvd, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(lbl_magazine, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pages_or_duration_or_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(author_or_director_or_publisher, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(amount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_author_or_director_or_publisher, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                        .addComponent(txt_id)
                                        .addComponent(txt_judul)
                                        .addComponent(txt_page_or_duration_or_date)))))))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judul)
                    .addComponent(txt_judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(author_or_director_or_publisher)
                    .addComponent(txt_author_or_director_or_publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pages_or_duration_or_date)
                    .addComponent(txt_page_or_duration_or_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_book)
                            .addComponent(lbl_dvd)
                            .addComponent(lbl_magazine))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_reset)
                            .addComponent(btm_simpan))
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_author_or_director_or_publisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_author_or_director_or_publisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_author_or_director_or_publisherActionPerformed

    private void txt_page_or_duration_or_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_page_or_duration_or_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_page_or_duration_or_dateActionPerformed

    private void btm_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_simpanActionPerformed
        String title = txt_judul.getText();
        String id = txt_id.getText();
        int amount = Integer.parseInt(txt_amount.getText());
        String human =  txt_author_or_director_or_publisher.getText();
        String page_or_duration_or_date = txt_page_or_duration_or_date.getText();
        switch (selectedOption) {
            case "book":
                int pages = Integer.parseInt(page_or_duration_or_date);
                newItem = new Book(title, id, amount, human, pages);
                break;
            case "dvd":
                int duration = Integer.parseInt(page_or_duration_or_date);
                newItem = new DVD(title, id, amount, human, duration);
                break;
            case "magazine":
                String date = page_or_duration_or_date;
                newItem = new Magazine(title, id, amount, human, date);
                break;
            default: System.out.println("Invalid type.");
        }

        confirm = true;
//        System.out.println("berhasil di buat di add.jawa");
        this.dispose();
    }//GEN-LAST:event_btm_simpanActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_judul.setText("");
        txt_id.setText("");
        txt_amount.setText("");
        txt_author_or_director_or_publisher.setText("");
        txt_page_or_duration_or_date.setText("");
        type_group.clearSelection();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_amountActionPerformed
        
    }//GEN-LAST:event_txt_amountActionPerformed

    private void lbl_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_bookActionPerformed
        if(lbl_book.isSelected()){
            selectedOption = "book";
        }
        pages_or_duration_or_date.setText("Pages");
        author_or_director_or_publisher.setText("Author");
    }//GEN-LAST:event_lbl_bookActionPerformed

    private void lbl_dvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_dvdActionPerformed
        if(lbl_dvd.isSelected()){
            selectedOption = "dvd";
        }
        pages_or_duration_or_date.setText("Duration");
        author_or_director_or_publisher.setText("Director");
    }//GEN-LAST:event_lbl_dvdActionPerformed

    private void lbl_magazineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbl_magazineActionPerformed
        if(lbl_magazine.isSelected()){
            selectedOption = "magazine";
        }
        pages_or_duration_or_date.setText("Date");
        author_or_director_or_publisher.setText("Publisher");
    }//GEN-LAST:event_lbl_magazineActionPerformed

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }
    
    public LibraryItem getNewItem() {
//        System.out.println("Mengambil : ");
//        newItem.displayInfo();
        return newItem;
    }
    
    public boolean isConfirmed(){
        return confirm;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amount;
    private javax.swing.JLabel author_or_director_or_publisher;
    private javax.swing.JButton btm_simpan;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel judul;
    private javax.swing.JRadioButton lbl_book;
    private javax.swing.JRadioButton lbl_dvd;
    private javax.swing.JRadioButton lbl_magazine;
    private javax.swing.JLabel pages_or_duration_or_date;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_author_or_director_or_publisher;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_judul;
    private javax.swing.JTextField txt_page_or_duration_or_date;
    private javax.swing.ButtonGroup type_group;
    // End of variables declaration//GEN-END:variables
}
