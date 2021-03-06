/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alla.sharai;

/**
 *
 * @author alla
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        init();
        pathLabel1.setText(path);
        teaImage.setVisible(false);
        coffeeImage.setVisible(false);
    }

    void init() {
        kawaButton.setEnabled(false);
        herbataButton.setEnabled(false);
        sum = 0;
        current = 0;
        summaLabel1.setText("" + sum);
        stanLabel1.setText("q" + current);

    }

    private int current = 0;
    private int sum = 0;
    private String path = "q0";

    private int[][] table
            = {
                {1, 2, 5}, // q0
                {2, 3, 6}, // q1
                {3, 4, 7}, // q2
                {4, 5, 8}, // q3
                {5, 6, 8}, // q4
                {6, 7, 8}, // q5
                {7, 8, 8}, // q6
                {8, 8, 8}, // q7
                {8, 8, 8}, // g8
            };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        zl1Button = new javax.swing.JButton();
        zl2Button = new javax.swing.JButton();
        zl5Button = new javax.swing.JButton();
        stanLabel1 = new javax.swing.JLabel();
        kawaButton = new javax.swing.JButton();
        herbataButton = new javax.swing.JButton();
        summaLabel1 = new javax.swing.JLabel();
        restLabel1 = new javax.swing.JLabel();
        summaLabel = new javax.swing.JLabel();
        stanLabel = new javax.swing.JLabel();
        restLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pathLabel1 = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        coffeeImage = new javax.swing.JLabel();
        teaImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        zl1Button.setForeground(java.awt.Color.black);
        zl1Button.setText("1 zł");
        zl1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zl1ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(zl1Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 31, -1, -1));

        zl2Button.setText("2 zł");
        zl2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zl2ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(zl2Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 84, -1, -1));

        zl5Button.setText("5 zł");
        zl5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zl5ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(zl5Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 137, -1, -1));

        stanLabel1.setText("q0");
        getContentPane().add(stanLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, -1));

        kawaButton.setText("Kawa");
        kawaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kawaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(kawaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 190, -1, -1));

        herbataButton.setText("Herbata");
        herbataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herbataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(herbataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        summaLabel1.setText("0");
        getContentPane().add(summaLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 31, -1));

        restLabel1.setText("0");
        getContentPane().add(restLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        summaLabel.setText("Summa");
        getContentPane().add(summaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        stanLabel.setText("Stan");
        getContentPane().add(stanLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 53, -1));

        restLabel.setText("Rest");
        getContentPane().add(restLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 53, -1));

        jLabel1.setText("Ścieżka");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, 30));
        getContentPane().add(pathLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 260, 30));

        resultLabel.setText(" ");
        getContentPane().add(resultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 190, -1));

        coffeeImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alla/sharai/if_coffee-cup-2_430091.png"))); // NOI18N
        coffeeImage.setText("jLabel2");
        getContentPane().add(coffeeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 120, 110));

        teaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alla/sharai/if_tea_1642858.png"))); // NOI18N
        teaImage.setText("jLabel2");
        getContentPane().add(teaImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 130, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zl1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zl1ButtonActionPerformed
        addCoin(1, 0);
    }//GEN-LAST:event_zl1ButtonActionPerformed

    private void zl2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zl2ButtonActionPerformed
        addCoin(2, 1);
    }//GEN-LAST:event_zl2ButtonActionPerformed

    private void zl5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zl5ButtonActionPerformed
        addCoin(5, 2);
    }//GEN-LAST:event_zl5ButtonActionPerformed


    private void kawaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kawaButtonActionPerformed
        if (sum >= 7) {
            int rest = sum - 7;
            restLabel1.setText(" " + rest);
            resultLabel.setText("Weź kawę");
            kawaButton.setEnabled(true);
            init();
            coffeeImage.setVisible(true);

        }
    }//GEN-LAST:event_kawaButtonActionPerformed

    private void herbataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herbataButtonActionPerformed
        if (sum >= 5) {
            int rest = sum - 5;
            restLabel1.setText(" " + rest);
            resultLabel.setText("Weź Herbatę");
            init();
            teaImage.setVisible(true);

        }
    }//GEN-LAST:event_herbataButtonActionPerformed

    void addCoin(int val, int stateIndex) {
        if (current == 0) {
            path = "q0";
            int rest = 0;
            restLabel1.setText("");
            resultLabel.setText("");
            teaImage.setVisible(false);
            coffeeImage.setVisible(false);
        }
        current = table[current][stateIndex];
        sum = sum + val;
        summaLabel1.setText(" " + sum);
        stanLabel1.setText("q" + current);
        path = path + " q" + current;
        pathLabel1.setText(path);

        if (sum >= 5) {
            herbataButton.setEnabled(true);
        }

        if (sum >= 7) {
            kawaButton.setEnabled(true);
        }

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
    private javax.swing.JLabel coffeeImage;
    private javax.swing.JButton herbataButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kawaButton;
    private javax.swing.JLabel pathLabel1;
    private javax.swing.JLabel restLabel;
    private javax.swing.JLabel restLabel1;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel stanLabel;
    private javax.swing.JLabel stanLabel1;
    private javax.swing.JLabel summaLabel;
    private javax.swing.JLabel summaLabel1;
    private javax.swing.JLabel teaImage;
    private javax.swing.JButton zl1Button;
    private javax.swing.JButton zl2Button;
    private javax.swing.JButton zl5Button;
    // End of variables declaration//GEN-END:variables
}
