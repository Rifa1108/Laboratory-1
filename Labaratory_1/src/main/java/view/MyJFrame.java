/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.Coordination;
import javax.swing.JOptionPane;

/**
 *
 * @author rifa1
 */
public class MyJFrame extends javax.swing.JFrame {

    private Coordination coordination;

    /**
     * Creates new form MyJFrame
     */
    public MyJFrame() {
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

        importDialog = new javax.swing.JDialog();
        importPanel = new javax.swing.JPanel();
        pathToImport = new javax.swing.JTextField();
        path = new javax.swing.JLabel();
        listNumber = new javax.swing.JTextField();
        numberList = new javax.swing.JLabel();
        continueImportButton = new javax.swing.JButton();
        calculateDialog = new javax.swing.JDialog();
        calculatePanel = new javax.swing.JPanel();
        accuracy = new javax.swing.JLabel();
        accuracyTrustInterval = new javax.swing.JTextField();
        continueCalculateButton = new javax.swing.JButton();
        exportDialog = new javax.swing.JDialog();
        exportPanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        nameNewFile = new javax.swing.JTextField();
        continueExportButton = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        importButton = new javax.swing.JButton();
        calculateButton = new javax.swing.JButton();

        pathToImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathToImportActionPerformed(evt);
            }
        });

        path.setText("������� ���� � �����");

        listNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listNumberActionPerformed(evt);
            }
        });

        numberList.setText("������� ����� �����");

        continueImportButton.setText("�����");
        continueImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueImportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout importPanelLayout = new javax.swing.GroupLayout(importPanel);
        importPanel.setLayout(importPanelLayout);
        importPanelLayout.setHorizontalGroup(
            importPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, importPanelLayout.createSequentialGroup()
                .addGroup(importPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(importPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(continueImportButton))
                    .addGroup(importPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(importPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(path)
                            .addComponent(numberList, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(importPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pathToImport, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(listNumber))))
                .addGap(40, 40, 40))
        );
        importPanelLayout.setVerticalGroup(
            importPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(importPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(importPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(path)
                    .addComponent(pathToImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(importPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(continueImportButton)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout importDialogLayout = new javax.swing.GroupLayout(importDialog.getContentPane());
        importDialog.getContentPane().setLayout(importDialogLayout);
        importDialogLayout.setHorizontalGroup(
            importDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, importDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(importPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        importDialogLayout.setVerticalGroup(
            importDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(importPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        accuracy.setText("������� � ����� ��������� ������������ ������������� ��������");

        continueCalculateButton.setText("�����");
        continueCalculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueCalculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calculatePanelLayout = new javax.swing.GroupLayout(calculatePanel);
        calculatePanel.setLayout(calculatePanelLayout);
        calculatePanelLayout.setHorizontalGroup(
            calculatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, calculatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueCalculateButton)
                .addGap(78, 78, 78))
            .addGroup(calculatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(calculatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accuracy)
                    .addComponent(accuracyTrustInterval, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        calculatePanelLayout.setVerticalGroup(
            calculatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calculatePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(accuracy)
                .addGap(27, 27, 27)
                .addComponent(accuracyTrustInterval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(continueCalculateButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout calculateDialogLayout = new javax.swing.GroupLayout(calculateDialog.getContentPane());
        calculateDialog.getContentPane().setLayout(calculateDialogLayout);
        calculateDialogLayout.setHorizontalGroup(
            calculateDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        calculateDialogLayout.setVerticalGroup(
            calculateDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calculatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        name.setText("������� �������� ������ �����");

        nameNewFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameNewFileActionPerformed(evt);
            }
        });

        continueExportButton.setText("�����");
        continueExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueExportButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exportPanelLayout = new javax.swing.GroupLayout(exportPanel);
        exportPanel.setLayout(exportPanelLayout);
        exportPanelLayout.setHorizontalGroup(
            exportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(exportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameNewFile, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exportPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continueExportButton)
                .addGap(27, 27, 27))
        );
        exportPanelLayout.setVerticalGroup(
            exportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(name)
                .addGap(18, 18, 18)
                .addComponent(nameNewFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(continueExportButton)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout exportDialogLayout = new javax.swing.GroupLayout(exportDialog.getContentPane());
        exportDialog.getContentPane().setLayout(exportDialogLayout);
        exportDialogLayout.setHorizontalGroup(
            exportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exportPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exportDialogLayout.setVerticalGroup(
            exportDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        exportButton.setText("Export");
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });

        importButton.setText("Import");
        importButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importButtonActionPerformed(evt);
            }
        });

        calculateButton.setText("��������� ����������� �������������� ����������");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(importButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exportButton)
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(calculateButton)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addGap(37, 37, 37))))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportButton)
                    .addComponent(importButton))
                .addGap(53, 53, 53)
                .addComponent(calculateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importButtonActionPerformed
        // TODO add your handling code here:
        coordination = new Coordination();
        importDialog.setVisible(rootPaneCheckingEnabled);
        importDialog.setSize(700, 400);


    }//GEN-LAST:event_importButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void continueImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueImportButtonActionPerformed
        // TODO add your handling code here:
        try {
            int list = Integer.parseInt(listNumber.getText());
            String res = coordination.data_import(pathToImport.getText(), list);
            if (res == "No") {
                JOptionPane.showMessageDialog(null, "�� ������� ������������� ������", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "������ �������������", "������", JOptionPane.INFORMATION_MESSAGE);
                pathToImport.setText("");
                listNumber.setText("");
                importDialog.dispose();
            }
        } catch (NumberFormatException mismatch) {
            JOptionPane.showMessageDialog(null, "������� ���������� ������!", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_continueImportButtonActionPerformed

    private void pathToImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathToImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathToImportActionPerformed

    private void listNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listNumberActionPerformed

    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        // TODO add your handling code here:
        calculateDialog.setVisible(rootPaneCheckingEnabled);
        calculateDialog.setSize(500, 300);

    }//GEN-LAST:event_calculateButtonActionPerformed

    private void continueCalculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueCalculateButtonActionPerformed
        // TODO add your handling code here:
        try {
            double y = Double.parseDouble(accuracyTrustInterval.getText());
            if (y > 1 | y < 0) {
                throw new NumberFormatException();
            } else {
                boolean res = coordination.calculation(y);
                if (res) {
                    JOptionPane.showMessageDialog(null, "������ ����������� �������������� ����������� ���������", "������", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "�� ������� ���������� ������ ����������� �������������� �����������", "������", JOptionPane.ERROR_MESSAGE);
                }
                calculateDialog.dispose();
                accuracyTrustInterval.setText("");

            }
        } catch (NumberFormatException mismatch) {
            JOptionPane.showMessageDialog(null, "������� ���������� ������!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (java.lang.NullPointerException nul) {
            JOptionPane.showMessageDialog(null, "�� �� ������������� ������!", "Error", JOptionPane.ERROR_MESSAGE);
            accuracyTrustInterval.setText("");
            calculateDialog.dispose();
        }
    }//GEN-LAST:event_continueCalculateButtonActionPerformed

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        // TODO add your handling code here:
        exportDialog.setVisible(rootPaneCheckingEnabled);
        exportDialog.setSize(500, 300);


    }//GEN-LAST:event_exportButtonActionPerformed

    private void continueExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueExportButtonActionPerformed
        // TODO add your handling code here:

        try {
            String res = coordination.data_export(nameNewFile.getText());
            if (res == "Error") {
                JOptionPane.showMessageDialog(null, "�� ������� �������������� ������", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "������ ��������������", "�������", JOptionPane.INFORMATION_MESSAGE);
                nameNewFile.setText("");
                exportDialog.dispose();
            }
        } catch (java.lang.NullPointerException nul) {
            JOptionPane.showMessageDialog(null, "�� �� ������������� ������!", "Error", JOptionPane.ERROR_MESSAGE);
            nameNewFile.setText("");
            exportDialog.dispose();
        }
    }//GEN-LAST:event_continueExportButtonActionPerformed

    private void nameNewFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameNewFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameNewFileActionPerformed

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
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accuracy;
    private javax.swing.JTextField accuracyTrustInterval;
    private javax.swing.JButton calculateButton;
    private javax.swing.JDialog calculateDialog;
    private javax.swing.JPanel calculatePanel;
    private javax.swing.JButton continueCalculateButton;
    private javax.swing.JButton continueExportButton;
    private javax.swing.JButton continueImportButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JDialog exportDialog;
    private javax.swing.JPanel exportPanel;
    private javax.swing.JButton importButton;
    private javax.swing.JDialog importDialog;
    private javax.swing.JPanel importPanel;
    private javax.swing.JTextField listNumber;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameNewFile;
    private javax.swing.JLabel numberList;
    private javax.swing.JLabel path;
    private javax.swing.JTextField pathToImport;
    // End of variables declaration//GEN-END:variables
}
