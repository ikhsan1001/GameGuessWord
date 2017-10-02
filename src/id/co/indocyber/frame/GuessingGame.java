/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.frame;

import id.co.indocyber.frame.model.WordModel;
import id.co.indocyber.frame.model.WordQuestionGenerator;
import java.util.List;


/**
 *
 * @author user
 */
public class GuessingGame extends javax.swing.JFrame {
    WordModel modelWord;
    //String[] bankSoal = {"Semanggi", "Sudirman", "Tebet", "Cawang", "Manggarai"};
//    WordModel soal1 = new WordModel("Pondok Indah", "Daerah di Jakarta Selatan");
//    WordModel soal2 = new WordModel("Sudirman", "Jalan utama di Jakarta");
//    WordModel soal3 = new WordModel("Mega Kuningan", "The East Building");
//    WordModel soal4 = new WordModel("Grogol", "Trisakti");
//    WordModel[] bankSoal = {soal1, soal2, soal3, soal4};
    
    List<WordModel> bankSoal;

    
    /**
     * Creates new form GuessingGame
     */
    public GuessingGame() {
        bankSoal = WordQuestionGenerator.createQuestionInCollection();
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

        soalField = new javax.swing.JTextField();
        jawabanField = new javax.swing.JTextField();
        buttonGame = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jawabanLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        hintLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGame.setText("Finish");
        buttonGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGameActionPerformed(evt);
            }
        });

        jLabel1.setText("Jawaban");

        jawabanLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jawabanLabel.setText("Belum ada jawaban");

        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Hint");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(soalField, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jawabanField)
                    .addComponent(buttonGame)
                    .addComponent(jLabel1)
                    .addComponent(jawabanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(startButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hintLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(soalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jawabanField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(buttonGame)
                .addGap(18, 18, 18)
                .addComponent(jawabanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        int soalIndex = (int) Math.floor(Math.random() * bankSoal.size());
        modelWord = bankSoal.get(soalIndex);
        soalField.setText(modelWord.createSoal());
            
    }//GEN-LAST:event_startButtonActionPerformed

    private void buttonGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGameActionPerformed
        // TODO add your handling code here:
        String jawaban = jawabanField.getText().trim();
        modelWord.setJawaban(jawaban);
        if(modelWord.cekJawaban()){
            jawabanLabel.setText("Jenius");
        }else{
            jawabanLabel.setText("Gagal, Coba Lagi");
        }
    }//GEN-LAST:event_buttonGameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        hintLabel.setText(modelWord.getHint());
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGame;
    private javax.swing.JLabel hintLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jawabanField;
    private javax.swing.JLabel jawabanLabel;
    private javax.swing.JTextField soalField;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}