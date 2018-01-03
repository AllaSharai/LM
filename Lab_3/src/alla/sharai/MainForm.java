/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alla.sharai;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alla
 */
public class MainForm extends javax.swing.JFrame {

    String[] numbersArray;
    int currentNumber = 0;
    String number = null;
    int currentState = 0;
    int position = 0;

    Map<Character, Integer> mapping = new HashMap<>();

    String[][] table
            = {
                {"-,1,-", "-,2,-", "-,2,-", "-,2,-"}, //q0
                {"-,1,-", "-,1,-", "-,1,-", "-,1,-"}, //q1
                {"-,1,-", "3,1,-", "-7,3,L", "-7,3,L"},//q2
                {"1,1,-", "-,4,-", "-,4,-", "-,4,-"}, //q3
                {"-,1,-", "1,1,-", "1,1,-", "-9,3,L"} //q4
            };

    public MainForm() {
        initComponents();
        initMapping();
        String content = "";
        try {
            content = new Scanner(new File("/home/alla/NetBeansProjects/LM/Lab_3/test.txt")).next();
        } catch (FileNotFoundException ex) {
            fileContentLabel.setText("File not found");
        }

        fileContentLabel.setText(content);
        numbersArray = content.split("#");
        rowLabel.setText(numbersArray[currentNumber]);
        number = numbersArray[currentNumber];
        initFields();
        showNumber();
    }

    private void initFields() {
        currentState = 0;
        finishLabel.setVisible(false);
        position = number.length() - 1;
    }

    private void initMapping() {
        mapping.put(' ', 0);
        mapping.put('0', 1);
        mapping.put('1', 1);
        mapping.put('2', 1);
        mapping.put('3', 1);
        mapping.put('4', 1);
        mapping.put('5', 1);
        mapping.put('6', 1);
        mapping.put('7', 2);
        mapping.put('8', 2);
        mapping.put('9', 3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileContentLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        stanLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rowLabel = new javax.swing.JLabel();
        nextNumberButton = new javax.swing.JButton();
        nextSymbolButton = new javax.swing.JButton();
        finishLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileContentLabel.setText("Content");

        jLabel2.setText("Stan");

        stanLabel.setText("q0");

        jLabel3.setText("Ciąg");

        rowLabel.setText("12345");

        nextNumberButton.setText("Następny ciąg");
        nextNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextNumberButtonActionPerformed(evt);
            }
        });

        nextSymbolButton.setText("Dalej");
        nextSymbolButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextSymbolButtonActionPerformed(evt);
            }
        });

        finishLabel.setText("Ok");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileContentLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rowLabel)
                            .addComponent(stanLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nextSymbolButton)
                                .addGap(18, 18, 18)
                                .addComponent(finishLabel))
                            .addComponent(nextNumberButton))))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fileContentLabel)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(stanLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rowLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextSymbolButton)
                    .addComponent(finishLabel))
                .addGap(4, 4, 4)
                .addComponent(nextNumberButton)
                .addContainerGap(31, Short.MAX_VALUE))
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
            initFields();
            showNumber();
        }
    }//GEN-LAST:event_nextNumberButtonActionPerformed

    private void showNumber() {
        StringBuilder numberText = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (i != position) {
                numberText.append(number.charAt(i));
            } else {
                numberText.append("[")
                            .append(number.charAt(i))
                            .append("]");
            }
        }
        rowLabel.setText(numberText.toString());
    }


    private void nextSymbolButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextSymbolButtonActionPerformed
        if (finishLabel.isVisible()) {
            return;
        }

        List<Character> numberChars = new LinkedList();

        char[] chars = number.toCharArray();
        for (int i = 0; i < chars.length; ++i) {
            numberChars.add(chars[i]);
        }

        String[] actions = table[currentState][mapping.get(numberChars.get(position))].split(",");

        if (!actions[0].equals("-")) {
            int num = Integer.parseInt(numberChars.get(position) + "");
            num += Integer.parseInt(actions[0]);
            numberChars.set(position, Character.forDigit(num, 10));
        }

        currentState = Integer.parseInt(actions[1]);

        if (actions[2].equals("L")) {
            position--;
            if (position < 0) {
                numberChars.add(0, '0');
                position = 0;
            }
        }

        if (currentState == 1) {
            finishLabel.setVisible(true);
        }

        StringBuilder builder = new StringBuilder();
        for (Character ch : numberChars) {
            builder.append(ch);
        }
        number = builder.toString();

        stanLabel.setText("q" + currentState);

        showNumber();
    }//GEN-LAST:event_nextSymbolButtonActionPerformed

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
    private javax.swing.JLabel finishLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton nextNumberButton;
    private javax.swing.JButton nextSymbolButton;
    private javax.swing.JLabel rowLabel;
    private javax.swing.JLabel stanLabel;
    // End of variables declaration//GEN-END:variables
}
