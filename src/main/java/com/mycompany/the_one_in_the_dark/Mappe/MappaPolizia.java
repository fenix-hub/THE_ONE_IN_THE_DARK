package com.mycompany.the_one_in_the_dark.Mappe;

/**
 * Classe che permette di creare una finestra la quale contiene la mappa della Stazione di Polizia.
 * @author Angela Mileti
 */
public class MappaPolizia extends javax.swing.JFrame {

    /**
     * Creates new form Mappa
     */
    public MappaPolizia() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        Label = new javax.swing.JLabel();

        jInternalFrame1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.gray, java.awt.Color.darkGray, null, null));
        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 186, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("STAZIONE DI POLIZIA");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        setFont(new java.awt.Font("AnjaliOldLipi", 0, 14)); // NOI18N
        setForeground(java.awt.Color.darkGray);
        setIconImage(getIconImage());
        setName("Mappa Stazione di Polizia"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(300, 300));
        setType(java.awt.Window.Type.UTILITY);

        Label.setIcon(new javax.swing.ImageIcon("/home/angela/Scrivania/THE_ONE_IN_THE_DARK/src/img/Stazione di Polizia.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("Mappa della stazione di polizia");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void stampaFrame(){
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MappaPolizia().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JInternalFrame jInternalFrame1;
    // End of variables declaration//GEN-END:variables
}
