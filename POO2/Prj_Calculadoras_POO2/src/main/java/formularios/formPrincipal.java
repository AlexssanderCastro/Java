/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

/**
 *
 * @author Alexssander
 */
public class formPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form formPrincipal
     */
    public formPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniCalcComum = new javax.swing.JMenuItem();
        mniEqCalcSegundoGrau = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Calculadoras");

        mniCalcComum.setText("Calculadora Comum");
        mniCalcComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCalcComumActionPerformed(evt);
            }
        });
        jMenu1.add(mniCalcComum);

        mniEqCalcSegundoGrau.setText("Calculadora Segundo Grau");
        mniEqCalcSegundoGrau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEqCalcSegundoGrauActionPerformed(evt);
            }
        });
        jMenu1.add(mniEqCalcSegundoGrau);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opções");

        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        jMenu2.add(mniSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniCalcComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCalcComumActionPerformed
        new formCalcComum().setVisible(true);
    }//GEN-LAST:event_mniCalcComumActionPerformed

    private void mniEqCalcSegundoGrauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEqCalcSegundoGrauActionPerformed
        new formCalcEqSegGrau().setVisible(true);
    }//GEN-LAST:event_mniEqCalcSegundoGrauActionPerformed

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniCalcComum;
    private javax.swing.JMenuItem mniEqCalcSegundoGrau;
    private javax.swing.JMenuItem mniSair;
    // End of variables declaration//GEN-END:variables
}
