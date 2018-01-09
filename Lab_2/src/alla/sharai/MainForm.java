/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alla.sharai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author alla
 */
public class MainForm extends javax.swing.JFrame {

    String[] numbersArray;
    int currentNumber = 0;
    String number = null;
    int currentSymbol = 0;
    int currentState = 0;
    String path = "q0";
    List<Integer> notAcceptable;

    String[][] table
            = {
                {"1", "1", "", "7", "8", "2"}, //q0
                {"", "", "", "2", "8", "2"}, //q1
                {"", "", "3", "", "", ""}, //q2
                {"", "", "", "4", "4", "4"}, //q3
                {"", "", "", "5", "5", "5"}, //q4
                {"", "", "", "6", "6", "6"}, //q5
                {"", "", "", "", "", ""}, //q6
                {"", "", "3", "", "", ""}, //q7
                {"", "", "3", "9", "", ""}, //q8
                {"", "", "10", "", "", ""}, //q9
                {"", "", "", "11", "", ""}, //q10
                {"", "", "", "12", "", ""}, //q11
                {"", "", "", "13", "", ""}, //q12
                {"", "", "", "", "", ""} //q13
            };

    Map<Character, Integer> indexes = new HashMap<>();

    public MainForm() {
        initComponents();
        initFields();
        
        Integer[] states = {0, 1, 3, 10};
        notAcceptable = Arrays.asList(states);
   
        String content = "";
        try {
            content = new Scanner(new File("/home/alla/NetBeansProjects/LM/Lab_2/numbers.txt")).next();
        } catch (FileNotFoundException ex) {
            fileContentLabel.setText("File not found");
        }
        fileContentLabel.setText(content);
        numbersArray = content.split("#");
        rowLabel.setText(numbersArray[currentNumber]);
        number = numbersArray[currentNumber];

        fillMap();
    }
    
    private void initFields(){
        currentState = 0;
        
        String currentStateLabel = "q" + currentState;
        
        currentSymbol = 0;
        resultLabel.setText("");
        pathLabel.setText(currentStateLabel);
        stateLabel.setText(currentStateLabel);
        symbolLabel.setText("");
        path = currentStateLabel;
    }

    private void fillMap() {
        indexes.put('+', 0);
        indexes.put('-', 1);
        indexes.put(',', 2);
        indexes.put('.', 2);
        indexes.put('0', 3);
        indexes.put('1', 4);
        indexes.put('2', 5);
        indexes.put('3', 5);
        indexes.put('4', 5);
        indexes.put('5', 5);
        indexes.put('6', 5);
        indexes.put('7', 5);
        indexes.put('8', 5);
        indexes.put('9', 5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pathLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rowLabel = new javax.swing.JLabel();
        fileContentLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        symbolLabel = new javax.swing.JLabel();
        nextNumberButton = new javax.swing.JButton();
        nextSymbolButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Stan");

        stateLabel.setText("q0");

        jLabel2.setText("Ścieżka");

        jLabel3.setText("Ciąg");

        rowLabel.setText("afasfafs");

        fileContentLabel.setText("fasddfas");

        jLabel4.setText("Symbol");

        nextNumberButton.setText("Następny ciąg");
        nextNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextNumberButtonActionPerformed(evt);
            }
        });

        nextSymbolButton.setText("Następny symbol");
        nextSymbolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextSymbolButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nextSymbolButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultLabel))
                            .addComponent(fileContentLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(pathLabel))
                            .addComponent(nextNumberButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(rowLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stateLabel)
                                    .addComponent(symbolLabel))))
                        .addGap(0, 398, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(fileContentLabel)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(symbolLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(stateLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextSymbolButton)
                    .addComponent(resultLabel))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rowLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pathLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextNumberButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextNumberButtonActionPerformed

        currentNumber++;
        if (currentNumber >= numbersArray.length) {
            rowLabel.setText("End");
            number = null;
        } else {
            number = numbersArray[currentNumber];
            rowLabel.setText(number);
        }
        initFields();
    }//GEN-LAST:event_nextNumberButtonActionPerformed

    private void nextSymbolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextSymbolButtonActionPerformed

        if (number == null) {
            return;
        }

        if (currentSymbol >= number.length()) {
            symbolLabel.setText("End");

            if (notAcceptable.contains(currentState)) {
                resultLabel.setText("Nie OK");
            } else {
                resultLabel.setText("OK");
            }

            return;
        }

        char s = number.charAt(currentSymbol);
        symbolLabel.setText(s + "");

        String newState = table[currentState][indexes.get(s)];

        if (newState.isEmpty()) {
            resultLabel.setText("Nie OK");
            return;
        }

        currentState = Integer.valueOf(newState);

        stateLabel.setText("q" + currentState);

        currentSymbol++;

        path = path + " q" + currentState;
        pathLabel.setText(path);
    }//GEN-LAST:event_nextSymbolButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fileContentLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton nextNumberButton;
    private javax.swing.JButton nextSymbolButton;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel rowLabel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel symbolLabel;
    // End of variables declaration//GEN-END:variables
}
