/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author ph757
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        estilosDasFontes();

    }

    private void estilosDasFontes() {
        lblNomeEmpresa.putClientProperty("FlatLaf.style", "font: 200% $light.font");
        lblData.putClientProperty("FlatLaf.style", "font: 200% $light.font");
        lblHora.putClientProperty("FlatLaf.style", "font: 200% $light.font");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelNomeEmpresa = new javax.swing.JPanel();
        lblNomeEmpresa = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnPrecificacao = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNomeEmpresa.setBackground(new java.awt.Color(51, 51, 255));
        panelNomeEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeEmpresa.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblNomeEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeEmpresa.setText("MARCENARIA MAIS CRIATIVA");
        lblNomeEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNomeEmpresa.add(lblNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        lblData.setForeground(new java.awt.Color(255, 255, 255));
        lblData.setText("Data");
        panelNomeEmpresa.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, -1));

        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("Hora");
        panelNomeEmpresa.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, -1));
        panelNomeEmpresa.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 340, 10));

        panelPrincipal.add(panelNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 80));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrecificacao.setText("Precificação");
        btnPrecificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecificacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrecificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 60));

        jButton3.setText("Orçamento");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 190, 60));

        jButton6.setText("Relatório");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 190, 60));

        jButton5.setText("Estoque");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 190, 60));

        jButton1.setText("Sobre");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 190, 60));

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, 410));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGOMAKER");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 510, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(714, 498));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrecificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecificacaoActionPerformed
        TelaPrecificacao objTelaPrecificacao = new TelaPrecificacao();
        objTelaPrecificacao.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPrecificacaoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        FlatLightLaf.setup();
        UIManager.put("Button.arc", 999);
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Menu().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrecificacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JPanel panelNomeEmpresa;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

}
