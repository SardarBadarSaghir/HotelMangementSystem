/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotema.views;

/**
 *
 * @author badar
 */
public class FinanceUI extends javax.swing.JFrame {

    /**
     * Creates new form FinanceUI
     */
    public FinanceUI() {
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

        parent = new javax.swing.JPanel();
        appbar = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        monthlyTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        dailyTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        annualTable = new javax.swing.JTable();
        monthlyFinance = new javax.swing.JLabel();
        annualFinance = new javax.swing.JLabel();
        dailyFinance = new javax.swing.JLabel();
        dailyTotalValue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        monthlyTotalValue = new javax.swing.JLabel();
        annualTotalValue = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parent.setBackground(new java.awt.Color(185, 168, 168));

        appbar.setBackground(new java.awt.Color(0, 88, 122));

        title.setBackground(new java.awt.Color(231, 231, 22));
        title.setFont(new java.awt.Font("URW Chancery L", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(231, 231, 222));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Hotema Finance");
        title.setPreferredSize(new java.awt.Dimension(98, 16));

        back.setBackground(new java.awt.Color(231, 231, 222));
        back.setText("Back");
        back.setToolTipText("");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout appbarLayout = new javax.swing.GroupLayout(appbar);
        appbar.setLayout(appbarLayout);
        appbarLayout.setHorizontalGroup(
            appbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(244, 244, 244))
        );
        appbarLayout.setVerticalGroup(
            appbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(back))
                .addContainerGap())
        );

        background.setBackground(new java.awt.Color(15, 48, 87));

        monthlyTable.setAutoCreateRowSorter(true);
        monthlyTable.setBackground(new java.awt.Color(0, 88, 122));
        monthlyTable.setForeground(new java.awt.Color(231, 231, 222));
        monthlyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Current Price", "Revenu", "Highest Price", "Bookings"
            }
        ));
        jScrollPane1.setViewportView(monthlyTable);

        dailyTable.setAutoCreateRowSorter(true);
        dailyTable.setBackground(new java.awt.Color(0, 88, 122));
        dailyTable.setForeground(new java.awt.Color(231, 231, 222));
        dailyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Current Price", "Revenu", "Highest Price", "Bookings"
            }
        ));
        jScrollPane2.setViewportView(dailyTable);

        annualTable.setAutoCreateRowSorter(true);
        annualTable.setBackground(new java.awt.Color(0, 88, 122));
        annualTable.setForeground(new java.awt.Color(231, 231, 222));
        annualTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Current Price", "Revenu", "Highest Price", "Bookings"
            }
        ));
        jScrollPane3.setViewportView(annualTable);

        monthlyFinance.setFont(new java.awt.Font("Waree", 1, 36)); // NOI18N
        monthlyFinance.setForeground(java.awt.Color.white);
        monthlyFinance.setText("MONTLY FINANCE");

        annualFinance.setFont(new java.awt.Font("Waree", 1, 36)); // NOI18N
        annualFinance.setForeground(java.awt.Color.white);
        annualFinance.setText("Annual FINANCE");

        dailyFinance.setFont(new java.awt.Font("Waree", 1, 36)); // NOI18N
        dailyFinance.setForeground(java.awt.Color.white);
        dailyFinance.setText("DAILY FINANCE");

        dailyTotalValue.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        dailyTotalValue.setForeground(new java.awt.Color(231, 231, 222));
        dailyTotalValue.setText("4");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(231, 231, 222));
        jLabel5.setText("Total Revenu:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(231, 231, 222));
        jLabel6.setText("Total Revenu:");

        monthlyTotalValue.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        monthlyTotalValue.setForeground(new java.awt.Color(231, 231, 222));
        monthlyTotalValue.setText("4");

        annualTotalValue.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        annualTotalValue.setForeground(new java.awt.Color(231, 231, 222));
        annualTotalValue.setText("4");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(231, 231, 222));
        jLabel10.setText("Total Revenu:");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(monthlyFinance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(41, 41, 41))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53)
                        .addComponent(monthlyTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addGap(144, 144, 144)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(13, 13, 13))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel5)
                                .addGap(44, 44, 44)
                                .addComponent(dailyTotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dailyFinance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(75, 75, 75)
                                .addComponent(annualTotalValue)
                                .addGap(133, 133, 133))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(annualFinance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(168, 168, 168))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(dailyTotalValue))
                        .addGap(5, 5, 5)
                        .addComponent(dailyFinance, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(annualTotalValue)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(annualFinance, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(43, 43, 43)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(monthlyTotalValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthlyFinance)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout parentLayout = new javax.swing.GroupLayout(parent);
        parent.setLayout(parentLayout);
        parentLayout.setHorizontalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        parentLayout.setVerticalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, parentLayout.createSequentialGroup()
                .addComponent(appbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(FinanceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinanceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinanceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinanceUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinanceUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel annualFinance;
    private javax.swing.JTable annualTable;
    private javax.swing.JLabel annualTotalValue;
    private javax.swing.JPanel appbar;
    private javax.swing.JButton back;
    private javax.swing.JPanel background;
    private javax.swing.JLabel dailyFinance;
    private javax.swing.JTable dailyTable;
    private javax.swing.JLabel dailyTotalValue;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel monthlyFinance;
    private javax.swing.JTable monthlyTable;
    private javax.swing.JLabel monthlyTotalValue;
    private javax.swing.JPanel parent;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
