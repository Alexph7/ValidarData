package VIEW;

import DAO.PrecificacaoDAO;
import DTO.PrecificacaoDTO;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alexph7
 */
public class TelaPrecificacao extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrecificacao
     */
    public TelaPrecificacao() {

        initComponents();
        txtDiaData.setText(String.valueOf(LocalDate.now().getDayOfMonth()));
        txtMesData.setText(String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("MM"))));
        txtAnoData.setText(String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("yy"))));
        btnDeletarProduto.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipalProdutos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblQuantidadeProduto = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        lblNomeProduto2 = new javax.swing.JLabel();
        lblPrecoUnProduto = new javax.swing.JLabel();
        txtPrecoUnProduto = new javax.swing.JTextField();
        lblAlturaProduto = new javax.swing.JLabel();
        txtAlturaProduto = new javax.swing.JTextField();
        lblNomeProduto = new javax.swing.JLabel();
        btnCadastrarProduto = new javax.swing.JButton();
        lblLimparCampoPesquisa = new javax.swing.JLabel();
        txtPesquisaProduto = new javax.swing.JTextField();
        lblIconPesquisar = new javax.swing.JLabel();
        btnAlterarProduto = new javax.swing.JButton();
        btnDeletarProduto = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        txtResetData = new javax.swing.JLabel();
        txtAnoData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMesData = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        lbl$ = new javax.swing.JLabel();
        lblLimparTudo = new javax.swing.JLabel();
        txtPrecoTotalProduto = new javax.swing.JTextField();
        lblTotalUnProduto = new javax.swing.JLabel();
        lbl$2 = new javax.swing.JLabel();
        lblLarguraProduto = new javax.swing.JLabel();
        txtLarguraProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerencia de Produtos");
        setMinimumSize(new java.awt.Dimension(813, 609));
        setName("framePrecificacao"); // NOI18N
        setSize(new java.awt.Dimension(800, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipalProdutos.setMinimumSize(new java.awt.Dimension(800, 560));
        panelPrincipalProdutos.setPreferredSize(new java.awt.Dimension(813, 609));
        panelPrincipalProdutos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblProdutos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade", "Altura", "Largura", "Preço/Chapa", "Preço Total", "Data"
            }
        ));
        tblProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblProdutos.setDoubleBuffered(true);
        tblProdutos.setFocusable(false);
        tblProdutos.setShowGrid(false);
        tblProdutos.getTableHeader().setReorderingAllowed(false);
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblProdutos.getColumnModel().getColumn(0).setMaxWidth(40);
            tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblProdutos.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        panelPrincipalProdutos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 770, 220));

        lblQuantidadeProduto.setText("*Quantidade");
        panelPrincipalProdutos.add(lblQuantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        txtQuantidadeProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtQuantidadeProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantidadeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantidadeProdutoKeyReleased(evt);
            }
        });
        panelPrincipalProdutos.add(txtQuantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, 33));

        txtNomeProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        panelPrincipalProdutos.add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 450, 33));

        lblNomeProduto2.setText("(*) Campos Obrigatórios");
        panelPrincipalProdutos.add(lblNomeProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 130, -1));

        lblPrecoUnProduto.setText("*Preço/Un");
        panelPrincipalProdutos.add(lblPrecoUnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        txtPrecoUnProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtPrecoUnProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecoUnProdutoKeyReleased(evt);
            }
        });
        panelPrincipalProdutos.add(txtPrecoUnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 100, 33));

        lblAlturaProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlturaProduto.setText("*Altura");
        panelPrincipalProdutos.add(lblAlturaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 40, -1));

        txtAlturaProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtAlturaProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPrincipalProdutos.add(txtAlturaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 60, 33));

        lblNomeProduto.setText("*Nome/Produto");
        panelPrincipalProdutos.add(lblNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        btnCadastrarProduto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        panelPrincipalProdutos.add(btnCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 130, 40));

        lblLimparCampoPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        lblLimparCampoPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLimparCampoPesquisa.setForeground(new java.awt.Color(204, 204, 204));
        lblLimparCampoPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimparCampoPesquisa.setText("x");
        lblLimparCampoPesquisa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblLimparCampoPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLimparCampoPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimparCampoPesquisaMouseClicked(evt);
            }
        });
        panelPrincipalProdutos.add(lblLimparCampoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 30, 30));

        txtPesquisaProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtPesquisaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaProdutoKeyReleased(evt);
            }
        });
        panelPrincipalProdutos.add(txtPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 480, 30));

        lblIconPesquisar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblIconPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-icon36x36.png"))); // NOI18N
        panelPrincipalProdutos.add(lblIconPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 40, 40));

        btnAlterarProduto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });
        panelPrincipalProdutos.add(btnAlterarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 130, 40));

        btnDeletarProduto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDeletarProduto.setText("Deletar");
        btnDeletarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletarProduto.setFocusTraversalPolicyProvider(true);
        btnDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProdutoActionPerformed(evt);
            }
        });
        panelPrincipalProdutos.add(btnDeletarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 130, 40));

        lblData.setText("Data");
        panelPrincipalProdutos.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home-icon.png"))); // NOI18N
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        panelPrincipalProdutos.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        txtResetData.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        txtResetData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResetData.setText("icon Reset data");
        txtResetData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtResetData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResetDataMouseClicked(evt);
            }
        });
        panelPrincipalProdutos.add(txtResetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 40, 20));

        txtAnoData.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtAnoData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnoData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnoDataKeyReleased(evt);
            }
        });
        panelPrincipalProdutos.add(txtAnoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 40, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("/");
        panelPrincipalProdutos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 20, -1));

        txtDiaData.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtDiaData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiaDataKeyReleased(evt);
            }
        });
        panelPrincipalProdutos.add(txtDiaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 40, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("/");
        panelPrincipalProdutos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 20, -1));

        txtMesData.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtMesData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMesData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMesDataKeyReleased(evt);
            }
        });
        panelPrincipalProdutos.add(txtMesData, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 40, 30));

        lblId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblId.setText("ID");
        panelPrincipalProdutos.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 20, 20));

        txtIdProduto.setEditable(false);
        txtIdProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtIdProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdProduto.setFocusable(false);
        panelPrincipalProdutos.add(txtIdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 60, 33));

        lbl$.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl$.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl$.setText("R$");
        lbl$.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelPrincipalProdutos.add(lbl$, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 30, 30));

        lblLimparTudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimparTudo.setText("Icon Limpar Tudo");
        lblLimparTudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLimparTudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimparTudoMouseClicked(evt);
            }
        });
        panelPrincipalProdutos.add(lblLimparTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 100, 30));

        txtPrecoTotalProduto.setEditable(false);
        txtPrecoTotalProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        panelPrincipalProdutos.add(txtPrecoTotalProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 100, 33));

        lblTotalUnProduto.setText("Preço Total");
        panelPrincipalProdutos.add(lblTotalUnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, -1, -1));

        lbl$2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl$2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl$2.setText("R$");
        lbl$2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        panelPrincipalProdutos.add(lbl$2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 30, 30));

        lblLarguraProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLarguraProduto.setText("*Largura");
        panelPrincipalProdutos.add(lblLarguraProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 50, -1));

        txtLarguraProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtLarguraProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPrincipalProdutos.add(txtLarguraProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 60, 33));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        panelPrincipalProdutos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 10, 10));

        getContentPane().add(panelPrincipalProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 560));

        setSize(new java.awt.Dimension(816, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarProdutoActionPerformed
        excluirProduto();
    }//GEN-LAST:event_btnDeletarProdutoActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        alterarProduto();
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        cadastrarProduto();
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void txtQuantidadeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoKeyReleased
        aceitarSoNumerosNosCampos(txtQuantidadeProduto);
        setarPrecoTotal();
    }//GEN-LAST:event_txtQuantidadeProdutoKeyReleased

    private void txtPrecoUnProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoUnProdutoKeyReleased
        txtPrecoUnProduto.setText(txtPrecoUnProduto.getText().replaceAll("[^0-9,]", ""));

        setarPrecoTotal();

    }//GEN-LAST:event_txtPrecoUnProdutoKeyReleased

    private void txtResetDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtResetDataMouseClicked
        txtDiaData.setText(String.valueOf(LocalDate.now().getDayOfMonth()));
        txtMesData.setText(String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("MM"))));
        txtAnoData.setText(String.valueOf(LocalDate.now().format(DateTimeFormatter.ofPattern("yy"))));
    }//GEN-LAST:event_txtResetDataMouseClicked

    private void txtPesquisaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaProdutoKeyReleased
        new PrecificacaoDAO().pesquisarProduto();
        personalizarTabela();
    }//GEN-LAST:event_txtPesquisaProdutoKeyReleased

    private void txtDiaDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaDataKeyReleased
        aceitarSoNumerosNosCampos(txtDiaData);
    }//GEN-LAST:event_txtDiaDataKeyReleased

    private void txtMesDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesDataKeyReleased
        aceitarSoNumerosNosCampos(txtMesData);
    }//GEN-LAST:event_txtMesDataKeyReleased

    private void txtAnoDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoDataKeyReleased
        aceitarSoNumerosNosCampos(txtAnoData);
    }//GEN-LAST:event_txtAnoDataKeyReleased

    private void lblLimparCampoPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimparCampoPesquisaMouseClicked
        txtPesquisaProduto.setText(null);
    }//GEN-LAST:event_lblLimparCampoPesquisaMouseClicked

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        try {
            setarDadosDaTabelaNoForm();
            if (tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 1).equals(txtNomeProduto.getText())) {
                btnCadastrarProduto.setEnabled(false);
                btnDeletarProduto.setEnabled(true);
            }
        } catch (NullPointerException e) {

        }

    }//GEN-LAST:event_tblProdutosMouseClicked

    private void lblLimparTudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimparTudoMouseClicked
        limparCampos();
        btnCadastrarProduto.setEnabled(true);
    }//GEN-LAST:event_lblLimparTudoMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        new Menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblHomeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /**
         * Set a Look and Feel
         */
        FlatMacLightLaf.setup();
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TelaPrecificacao().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnDeletarProduto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl$;
    private javax.swing.JLabel lbl$2;
    private javax.swing.JLabel lblAlturaProduto;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblIconPesquisar;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLarguraProduto;
    private javax.swing.JLabel lblLimparCampoPesquisa;
    private javax.swing.JLabel lblLimparTudo;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblNomeProduto2;
    private javax.swing.JLabel lblPrecoUnProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JLabel lblTotalUnProduto;
    private javax.swing.JPanel panelPrincipalProdutos;
    public static javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtAlturaProduto;
    private javax.swing.JTextField txtAnoData;
    private javax.swing.JTextField txtDiaData;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtLarguraProduto;
    private javax.swing.JTextField txtMesData;
    private javax.swing.JTextField txtNomeProduto;
    public static javax.swing.JTextField txtPesquisaProduto;
    private javax.swing.JTextField txtPrecoTotalProduto;
    private javax.swing.JTextField txtPrecoUnProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JLabel txtResetData;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo Que Realiza a Verificação dos Campos Vazios e Retorna True se
     * Todos os Campos Exigidos não estiverem Vazios
     * @return true se os campos não estiverem Vazios
     */
    private boolean validarDados() {
        try {
            if (txtNomeProduto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o Nome Do Produto.");
                txtNomeProduto.requestFocus();
            } else if (txtAlturaProduto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe a altura do Produto.");
                txtAlturaProduto.requestFocus();
            } else if (txtLarguraProduto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe a Largura do Produto.");
                txtLarguraProduto.requestFocus();
            } else if (txtQuantidadeProduto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe a Quantidade do Produto.");
                txtQuantidadeProduto.requestFocus();
            } else if (txtPrecoUnProduto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe o Preço Do Produto.");
                txtPrecoUnProduto.requestFocus();
            } else if (txtDiaData.getText().isEmpty() || txtMesData.getText().isEmpty() || txtAnoData.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Informe a Data.");
                txtDiaData.requestFocus();
            }
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return true;
        }
    }

    /**
     * Metodo Que Cadastra Produtos ao clica no Botao Adicionar
     *
     * 1. Captura oque o usuario digitou nos Campos do Form e Aramazena em
     * variaveis locais
     * 2. Criar Objeto DTO e Passa as Variaveis Locais Para Encapsular
     * 3. Cria Objeto DAO e executa um metodo dessa classe que pega as
     * Informações do Objeto DTO.
     */
    private void cadastrarProduto() {

        boolean dadosValidados = validarDados();
        if (dadosValidados == true) {

        } else {
            String nomeProduto = txtNomeProduto.getText();
            double altura = Double.parseDouble(txtAlturaProduto.getText().replace(",", "."));
            double largura = Double.parseDouble(txtLarguraProduto.getText().replace(",", "."));
            int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
            double precoProduto = Double.parseDouble(txtPrecoUnProduto.getText().replace(",", "."));

            Date dataProduto = Date.valueOf(validarData(txtDiaData.getText(), txtMesData.getText(), txtAnoData.getText()));

            var objPrecificacaoDTO = new PrecificacaoDTO(nomeProduto, quantidade, altura, largura, precoProduto);
            objPrecificacaoDTO.setDataProduto(dataProduto);

            var objPrecificacaoDAO = new PrecificacaoDAO();
            objPrecificacaoDAO.cadastrarProduto(objPrecificacaoDTO);
            limparCampos();

        }
    }

    private void alterarProduto() {

        boolean dadosValidados = validarDados();
        if (dadosValidados == true) {

        } else {
            String nomeProduto = txtNomeProduto.getText();
            int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
            double altura = Double.parseDouble(txtAlturaProduto.getText().replace(",", "."));
            double largura = Double.parseDouble(txtAlturaProduto.getText().replace(",", "."));
            double precoProduto = Double.parseDouble(txtPrecoUnProduto.getText().replace(",", "."));
            try {
                Date dataProduto = Date.valueOf(validarData(txtDiaData.getText(), txtMesData.getText(), txtAnoData.getText()));

                var objPrecificacaoDTO = new PrecificacaoDTO(nomeProduto, quantidade, altura, largura, precoProduto);
                objPrecificacaoDTO.setIdProduto(txtIdProduto.getText());
                objPrecificacaoDTO.setDataProduto(dataProduto);

                new PrecificacaoDAO().alterarProduto(objPrecificacaoDTO);

                btnCadastrarProduto.setEnabled(true);
                txtNomeProduto.requestFocus();
                limparCampos();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }

    private void excluirProduto() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem Certeza que Deseja Excluir Este Item?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);

        if (confirma == 0) {
            var objPrecificacaoDTO = new PrecificacaoDTO(txtNomeProduto.getText(), Integer.parseInt(txtQuantidadeProduto.getText()), Double.parseDouble(txtPrecoUnProduto.getText().replace(",", ".")));

            objPrecificacaoDTO.setIdProduto(txtIdProduto.getText());

            new PrecificacaoDAO().excluirProduto(objPrecificacaoDTO);
            limparCampos();
            btnCadastrarProduto.setEnabled(true);
        }
    }

    private void limparCampos() {

        txtPesquisaProduto.setText(null);
        ((DefaultTableModel) tblProdutos.getModel()).setRowCount(0);
        txtNomeProduto.setText(null);
        txtAlturaProduto.setText(null);
        txtLarguraProduto.setText(null);
        txtIdProduto.setText(null);
        txtQuantidadeProduto.setText(null);
        txtPrecoUnProduto.setText(null);
        txtPrecoTotalProduto.setText(null);
    }

    public void aceitarSoNumerosNosCampos(JTextField jtextfield) {

        jtextfield.setText(jtextfield.getText().replaceAll("[^0-9]", ""));
    }

    /**
     * Faz Verificação de Ano Bissexto, Meses Com 30 e 31 dias
     * @param dia
     * @param mes
     * @param ano
     *
     * @return Data Concatenada e Verificada
     */
    public String validarData(String dia, String mes, String ano) {

        int[] limiteDiasNoMes = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String dataValida = null;

        int anoInteiro = Integer.parseInt(ano);
        int mesInteiro = Integer.parseInt(mes);
        int diaInteiro = Integer.parseInt(dia);

        if (mesInteiro <= 0 || mesInteiro > 12) {
            throw new IllegalArgumentException("Mês Fora do Intervalo 1-12");
        }
        if ((diaInteiro == 29 && mesInteiro == 02) && !(anoInteiro % 400 == 0 || anoInteiro % 4 == 0 && anoInteiro % 100 != 0)) {
            throw new IllegalArgumentException("Data Inválida Para Ano Não Bissexto.");
        } else if (diaInteiro <= 0 || diaInteiro > limiteDiasNoMes[mesInteiro]) {
            throw new IllegalArgumentException("Dia Inválido Para Este Mês.");
        } else {
            dataValida = "20" + ano + "-" + mes + "-" + dia;
        }

        return dataValida;
    }

    /**
     * Método Responsavel por Tirar Informações da Tabela e inserir em Seus
     * respectivos Campos, no caso da Data foi preciso extrair a String e
     * dividir com o metodo split em 3 partes separadas, dia, mês e ano, para
     * setar no form que também é divido em 3 partes, 3 JTextFields.
     */
    private void setarDadosDaTabelaNoForm() {

        int setar = tblProdutos.getSelectedRow();

        txtIdProduto.setText(tblProdutos.getModel().getValueAt(setar, 0).toString());
        txtNomeProduto.setText(tblProdutos.getModel().getValueAt(setar, 1).toString());

        txtQuantidadeProduto.setText(tblProdutos.getModel().getValueAt(setar, 2).toString());
        txtAlturaProduto.setText(tblProdutos.getModel().getValueAt(setar, 3).toString());
        txtLarguraProduto.setText(tblProdutos.getModel().getValueAt(setar, 4).toString());

        txtPrecoUnProduto.setText(tblProdutos.getModel().getValueAt(setar, 5).toString().replace(".", ",")
        );
        txtPrecoTotalProduto.setText(tblProdutos.getModel().getValueAt(setar, 6).toString().replace(".", ",")
        );

        String diaTabela = tblProdutos.getModel().getValueAt(setar, 7).toString();
        String[] diaParaForm = diaTabela.split("-"); //Pega o dia da Tabela no Formato aaaa/MM/dd e Separa em 3 partes em um array partes dia, mes e ano

        String[] anoDuaPosicoes = diaParaForm[0].split("");//pega as ultima dua posições do ano para setar no campo data
        txtAnoData.setText(anoDuaPosicoes[2] + anoDuaPosicoes[3]);
        txtMesData.setText(diaParaForm[1]);
        txtDiaData.setText(diaParaForm[2]);

    }

    /**
     * Método Chama o Calculo da Quantidade de Produtos x o Preço do Produto da
     * Classe DTO para passar o total para o Form
     */
    private void setarPrecoTotal() {

        String nome = txtNomeProduto.getText();
        int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
        double precoChapa = Double.parseDouble(txtPrecoUnProduto.getText().replace(",", "."));

        var objPrecificacaoDTO = new PrecificacaoDTO(nome, quantidade, precoChapa);

        try {
            BigDecimal total = objPrecificacaoDTO.getPrecoTotalProduto().setScale(2, RoundingMode.HALF_EVEN);

            txtPrecoTotalProduto.setText(String.valueOf(total).replace(".", ","));
        } catch (NumberFormatException e) {
            txtPrecoTotalProduto.setText(null);
        }
    }

    private void personalizarTabela() {
        tblProdutos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(40);
        tblProdutos.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(80);
    }

}
