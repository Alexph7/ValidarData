package VIEW;

import com.formdev.flatlaf.FlatLightLaf;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Alexph7
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();

        DateTimeFormatter objDateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        LocalDateTime objLocalDateTime = LocalDateTime.now();

        String saidaDataHora = objDateTimeFormatter.format(objLocalDateTime);
        lblDataAgora.setText(saidaDataHora);

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
        jSeparator1 = new javax.swing.JSeparator();
        lblDataAgora = new javax.swing.JLabel();
        panelMenuLateral = new javax.swing.JPanel();
        btnMenuPrecificacao = new javax.swing.JButton();
        btnMenuOrcamento = new javax.swing.JButton();
        btnMenuRelatorio = new javax.swing.JButton();
        btnMenuEstoque = new javax.swing.JButton();
        btnMenuSobre = new javax.swing.JButton();
        btnMenuEstoque1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(695, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelNomeEmpresa.setBackground(new java.awt.Color(88, 0, 113));
        panelNomeEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeEmpresa.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        lblNomeEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeEmpresa.setText("MARCENARIA MAIS CRIATIVA");
        lblNomeEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelNomeEmpresa.add(lblNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 60));
        panelNomeEmpresa.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 480, 10));

        lblDataAgora.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDataAgora.setForeground(new java.awt.Color(255, 255, 255));
        lblDataAgora.setText("Data Aparecer?? Aqui");
        panelNomeEmpresa.add(lblDataAgora, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 280, 30));

        panelPrincipal.add(panelNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 120));

        panelMenuLateral.setBackground(new java.awt.Color(88, 0, 113));
        panelMenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenuPrecificacao.setText("Precifica????o");
        btnMenuPrecificacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPrecificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrecificacaoActionPerformed(evt);
            }
        });
        panelMenuLateral.add(btnMenuPrecificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 10, 180, 50));

        btnMenuOrcamento.setText("Or??amento");
        btnMenuOrcamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuOrcamentoActionPerformed(evt);
            }
        });
        panelMenuLateral.add(btnMenuOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 70, 180, 50));

        btnMenuRelatorio.setText("Relat??rio");
        btnMenuRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuRelatorioActionPerformed(evt);
            }
        });
        panelMenuLateral.add(btnMenuRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 130, 180, 50));

        btnMenuEstoque.setText("Recibo");
        btnMenuEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuEstoqueActionPerformed(evt);
            }
        });
        panelMenuLateral.add(btnMenuEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 190, 180, 50));

        btnMenuSobre.setText("Sobre");
        btnMenuSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuSobreActionPerformed(evt);
            }
        });
        panelMenuLateral.add(btnMenuSobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 310, 180, 50));

        btnMenuEstoque1.setText("Estoque");
        btnMenuEstoque1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelMenuLateral.add(btnMenuEstoque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 250, 180, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("icon config");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelMenuLateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        panelPrincipal.add(panelMenuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 210, 400));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrecificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrecificacaoActionPerformed
        TelaPrecificacao objTelaPrecificacao = new TelaPrecificacao();
        objTelaPrecificacao.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuPrecificacaoActionPerformed

    private void btnMenuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuRelatorioActionPerformed
        new TelaRelatorio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuRelatorioActionPerformed

    private void btnMenuOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuOrcamentoActionPerformed
        new TelaOrcamento().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuOrcamentoActionPerformed

    private void btnMenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSobreActionPerformed
        new TelaSobre().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuSobreActionPerformed

    private void btnMenuEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuEstoqueActionPerformed
        new TelaRecibo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuEstoqueActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new TelaMenuConfig().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        FlatLightLaf.setup();

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
    private javax.swing.JButton btnMenuEstoque;
    private javax.swing.JButton btnMenuEstoque1;
    private javax.swing.JButton btnMenuOrcamento;
    private javax.swing.JButton btnMenuPrecificacao;
    private javax.swing.JButton btnMenuRelatorio;
    private javax.swing.JButton btnMenuSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDataAgora;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JPanel panelMenuLateral;
    private javax.swing.JPanel panelNomeEmpresa;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables

}
