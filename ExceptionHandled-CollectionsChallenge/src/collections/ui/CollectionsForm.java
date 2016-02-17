/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections.ui;

import collections.data.Stock;
import collections.io.StockDataFile;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JTextArea;

/**
 *
 * @author John
 */
public class CollectionsForm extends javax.swing.JFrame {

    // Object fields
    private final ArrayList<Stock> stockData;
    private LinkedList<Stock> queue;
    private HashMap<String, String> hashMap;
    private TreeMap<String, String> treeMap;

    /**
     * Creates new form CollectionsFrame
     */
    public CollectionsForm() {
        initComponents();

        // Load data from stock file.
        stockData = StockDataFile.getData();
        if (stockData == null) {
            System.exit(0);
        } else {
            reload();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        queueTextArea = new javax.swing.JTextArea();
        queueAddButton = new javax.swing.JButton();
        queueRemoveButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        hashAddButton = new javax.swing.JButton();
        hashDeleteButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hashMapTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        treeAddButton = new javax.swing.JButton();
        javax.swing.JButton treeDeleteButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        treeMapTextArea = new javax.swing.JTextArea();
        resetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tickerField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Queue (Linked List)"));

        queueTextArea.setEditable(false);
        queueTextArea.setColumns(15);
        queueTextArea.setRows(5);
        jScrollPane1.setViewportView(queueTextArea);

        queueAddButton.setText("Add (to Tail)");
        queueAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queueAddButtonActionPerformed(evt);
            }
        });

        queueRemoveButton.setText("Remove (from Head)");
        queueRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queueRemoveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(queueAddButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(queueRemoveButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(queueAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(queueRemoveButton)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Hash Map"));

        hashAddButton.setText("Add / Update");
        hashAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashAddButtonActionPerformed(evt);
            }
        });

        hashDeleteButton.setText("Delete");
        hashDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hashDeleteButtonActionPerformed(evt);
            }
        });

        hashMapTextArea.setEditable(false);
        hashMapTextArea.setColumns(15);
        hashMapTextArea.setRows(5);
        jScrollPane2.setViewportView(hashMapTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hashAddButton)
                    .addComponent(hashDeleteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hashAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hashDeleteButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tree Map"));

        treeAddButton.setText("Add / Update");
        treeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treeAddButtonActionPerformed(evt);
            }
        });

        treeDeleteButton.setText("Delete");
        treeDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treeDeleteButtonActionPerformed(evt);
            }
        });

        treeMapTextArea.setEditable(false);
        treeMapTextArea.setColumns(15);
        treeMapTextArea.setRows(5);
        jScrollPane3.setViewportView(treeMapTextArea);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(treeAddButton)
                    .addComponent(treeDeleteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(treeAddButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(treeDeleteButton)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("CIS 304 Collections Application Challenge");

        tickerField.setColumns(8);

        priceField.setColumns(8);

        jLabel2.setText("Ticker");

        jLabel3.setText("Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resetButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tickerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tickerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void queueAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queueAddButtonActionPerformed
        if (isValidData()) {
            Stock newStock = new Stock(tickerField.getText(), priceField.getText());
            queue.add(newStock);
            displayQueue();
        }

    }//GEN-LAST:event_queueAddButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        reload();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void queueRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queueRemoveButtonActionPerformed
        queue.poll();
        displayQueue();
    }//GEN-LAST:event_queueRemoveButtonActionPerformed

    private void hashAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashAddButtonActionPerformed
        if (isValidData()) {
            Stock newStock = new Stock(tickerField.getText(), priceField.getText());
            hashMap.put(newStock.ticker, newStock.price);
            displayMaps(hashMap, hashMapTextArea);
        }
    }//GEN-LAST:event_hashAddButtonActionPerformed

    private void hashDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hashDeleteButtonActionPerformed
        if (isDeleteValid(hashMap)) {
            hashMap.remove(tickerField.getText().toUpperCase());
            displayMaps(hashMap, hashMapTextArea);
        }
    }//GEN-LAST:event_hashDeleteButtonActionPerformed

    private void treeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treeAddButtonActionPerformed
        if (isValidData()) {
            Stock newStock = new Stock(tickerField.getText(), priceField.getText());
            treeMap.put(newStock.ticker, newStock.price);
            displayMaps(treeMap, treeMapTextArea);
        }
    }//GEN-LAST:event_treeAddButtonActionPerformed

    private void treeDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_treeDeleteButtonActionPerformed
        if (isDeleteValid(treeMap)) {
            treeMap.remove(tickerField.getText().toUpperCase());
            displayMaps(treeMap, treeMapTextArea);
        }
    }//GEN-LAST:event_treeDeleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    private void reload() {
        //Display original data on the GUI 
        queue = new LinkedList<>(stockData);
        displayQueue();

        hashMap = new HashMap<>();
        treeMap = new TreeMap<>();
        for (Stock s : stockData) {
            hashMap.put(s.ticker, s.price);
            treeMap.put(s.ticker, s.price);
        }

        for (Stock s : stockData) {
            hashMap.put(s.ticker, s.price);
        }
        displayMaps(hashMap, hashMapTextArea);
        displayMaps(treeMap, treeMapTextArea);
    }

    private void displayQueue() {
        // String outString = "Ticker\tPrice\n";
        StringBuilder display = new StringBuilder();
        if (queue.isEmpty()) {
            display.append("Empty");
        } else {
            display.append("Ticker\tPrice\n");

            for (Stock s : queue) {
                //outString += s.ticker +"\t" + s.price + "\n"; 
                display.append(s.ticker).append(("\t")).append(s.price).append("\n");
            }

            //This code is considered inefficient as it it creates and destroys objects more than needed 
            //queueTextArea.setText(outString);
        }
        queueTextArea.setText(display.toString());

        //Scroll text area back up to the top of the list 
        queueTextArea.setCaretPosition(0);
    }

    private void displayMaps(Map<String, String> map, JTextArea mapTextArea) {
        StringBuilder display = new StringBuilder();
        if (map.isEmpty()) {
            display.append("Empty");
        } else {
            display.append("Ticker\tPrice\n");

            for (Map.Entry s : map.entrySet()) {
                //outString += s.ticker +"\t" + s.price + "\n"; 
                display.append(s.getKey()).append(("\t")).append(s.getValue()).append("\n");
            }

        }
        mapTextArea.setText(display.toString());
        //Scroll text area back up to the top of the list 
        mapTextArea.setCaretPosition(0);
    }

    private boolean isValidData() {
        SwingValidator sv = new SwingValidator();
        return sv.isPresent(tickerField, tickerField.getText())
                && sv.isPresent(priceField, tickerField.getText())
                && sv.isDoublePositive(priceField, priceField.getText())
                && sv.isTickerValid(tickerField, tickerField.getText());

    }

    private boolean isDeleteValid(Map<String,String> map) {
        //check values before allowing delete button to work 
        SwingValidator sv = new SwingValidator();
        return sv.isPresent(tickerField, jLabel2.getText())
                && sv.isTickerValid(tickerField, tickerField.getText())
                && sv.isTickerInMap(map, tickerField); 

    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CollectionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CollectionsForm form = new CollectionsForm();
                form.setVisible(true);
                form.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hashAddButton;
    private javax.swing.JButton hashDeleteButton;
    private javax.swing.JTextArea hashMapTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton queueAddButton;
    private javax.swing.JButton queueRemoveButton;
    private javax.swing.JTextArea queueTextArea;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField tickerField;
    private javax.swing.JButton treeAddButton;
    private javax.swing.JTextArea treeMapTextArea;
    // End of variables declaration//GEN-END:variables
}
