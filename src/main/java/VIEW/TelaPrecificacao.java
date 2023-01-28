package VIEW;

import DAO.PrecificacaoDAO;
import DTO.PrecificacaoDTO;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblQuantidadeProduto = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        lblNomeProduto2 = new javax.swing.JLabel();
        lblPrecoUnProduto = new javax.swing.JLabel();
        txtPrecoUnProduto = new javax.swing.JTextField();
        lblDimensaoProduto = new javax.swing.JLabel();
        txtDimensaoProduto = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Precificação Produtos");
        setMinimumSize(new java.awt.Dimension(813, 609));
        setName("framePrecificação"); // NOI18N
        setSize(new java.awt.Dimension(800, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setMinimumSize(new java.awt.Dimension(7, 7));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(813, 609));
        panelPrincipal.setRequestFocusEnabled(false);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        panelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 770, 210));

        lblQuantidadeProduto.setText("*Quantidade");
        panelPrincipal.add(lblQuantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        txtQuantidadeProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtQuantidadeProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtQuantidadeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantidadeProdutoKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtQuantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, 33));

        txtNomeProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        panelPrincipal.add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 396, 33));

        lblNomeProduto2.setText("(*) Campos Obrigatórios");
        panelPrincipal.add(lblNomeProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 137, -1));

        lblPrecoUnProduto.setText("*Preço/un");
        panelPrincipal.add(lblPrecoUnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        txtPrecoUnProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtPrecoUnProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecoUnProdutoKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtPrecoUnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 100, 33));

        lblDimensaoProduto.setText("Dimensoes");
        panelPrincipal.add(lblDimensaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        txtDimensaoProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtDimensaoProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelPrincipal.add(txtDimensaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 160, 33));

        lblNomeProduto.setText("*Nome/Produto");
        panelPrincipal.add(lblNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        btnCadastrarProduto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 130, 40));

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
        panelPrincipal.add(lblLimparCampoPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 30, 30));

        txtPesquisaProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtPesquisaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaProdutoKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 490, 30));

        lblIconPesquisar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblIconPesquisar.setText("Icone Pesquisar");
        panelPrincipal.add(lblIconPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 30));

        btnAlterarProduto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnAlterarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, 130, 40));

        btnDeletarProduto.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btnDeletarProduto.setText("Deletar");
        btnDeletarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletarProduto.setFocusTraversalPolicyProvider(true);
        btnDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProdutoActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnDeletarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 130, 40));

        lblData.setText("Data");
        panelPrincipal.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        lblHome.setText("ICon Home");
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
        });
        panelPrincipal.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 30));

        txtResetData.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        txtResetData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResetData.setText("icon Reset data");
        txtResetData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtResetData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResetDataMouseClicked(evt);
            }
        });
        panelPrincipal.add(txtResetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 70, -1));

        txtAnoData.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtAnoData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnoData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnoDataKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtAnoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 40, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("/");
        panelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 20, -1));

        txtDiaData.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtDiaData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiaDataKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtDiaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 40, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("/");
        panelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 20, -1));

        txtMesData.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtMesData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMesData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMesDataKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtMesData, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 40, 30));

        lblId.setText("ID");
        panelPrincipal.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        txtIdProduto.setEditable(false);
        txtIdProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtIdProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdProduto.setFocusable(false);
        panelPrincipal.add(txtIdProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 60, 33));

        lbl$.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl$.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl$.setText("R$");
        panelPrincipal.add(lbl$, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 30, 30));

        lblLimparTudo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLimparTudo.setText("Icon Limpar Tudo");
        lblLimparTudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLimparTudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLimparTudoMouseClicked(evt);
            }
        });
        panelPrincipal.add(lblLimparTudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 100, 30));

        txtPrecoTotalProduto.setEditable(false);
        txtPrecoTotalProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        panelPrincipal.add(txtPrecoTotalProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 100, 33));

        lblTotalUnProduto.setText("Preço Total");
        panelPrincipal.add(lblTotalUnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        lbl$2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl$2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lbl$2.setText("R$");
        panelPrincipal.add(lbl$2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 30, 30));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 560));

        setSize(new java.awt.Dimension(816, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarProdutoActionPerformed
        btnCadastrarProduto.setEnabled(true);
    }//GEN-LAST:event_btnDeletarProdutoActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        alterarProduto();
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        cadastrarProduto();
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void txtQuantidadeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoKeyReleased
        aceitarSoNumeros(txtQuantidadeProduto);
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

    }//GEN-LAST:event_txtPesquisaProdutoKeyReleased

    private void txtDiaDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaDataKeyReleased
        aceitarSoNumeros(txtDiaData);
    }//GEN-LAST:event_txtDiaDataKeyReleased

    private void txtMesDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesDataKeyReleased
        aceitarSoNumeros(txtMesData);
    }//GEN-LAST:event_txtMesDataKeyReleased

    private void txtAnoDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoDataKeyReleased
        aceitarSoNumeros(txtAnoData);
    }//GEN-LAST:event_txtAnoDataKeyReleased

    private void lblLimparCampoPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLimparCampoPesquisaMouseClicked
        txtPesquisaProduto.setText(null);
    }//GEN-LAST:event_lblLimparCampoPesquisaMouseClicked

    private void tblProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseClicked
        try {
            setarCamposDaTabela();
            if (tblProdutos.getModel().getValueAt(tblProdutos.getSelectedRow(), 1).equals(txtNomeProduto.getText())) {
                btnCadastrarProduto.setEnabled(false);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl$;
    private javax.swing.JLabel lbl$2;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDimensaoProduto;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblIconPesquisar;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLimparCampoPesquisa;
    private javax.swing.JLabel lblLimparTudo;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblNomeProduto2;
    private javax.swing.JLabel lblPrecoUnProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JLabel lblTotalUnProduto;
    private javax.swing.JPanel panelPrincipal;
    public static javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtAnoData;
    private javax.swing.JTextField txtDiaData;
    private javax.swing.JTextField txtDimensaoProduto;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtMesData;
    private javax.swing.JTextField txtNomeProduto;
    public static javax.swing.JTextField txtPesquisaProduto;
    private javax.swing.JTextField txtPrecoTotalProduto;
    private javax.swing.JTextField txtPrecoUnProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JLabel txtResetData;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo Que Cadastra Produtos ao clica no Botao Adicionar
     *
     * 1. Captura oque o usuario digitou nos Campos do Form e Aramazena em
     * variaveis locais
     * 2. Criar Objeto DTO e Passa as Variaveis Locais Para Encapsular
     * 3. Cria Objeto DAO e executa um metodo dessa classe que pega as
     * Informações do Objeto DTO.
     */
    public void cadastrarProduto() {

        if (txtNomeProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Nome Do Produto.");
            txtNomeProduto.requestFocus();
        } else if (txtQuantidadeProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Quantidade do Produto.");
            txtQuantidadeProduto.requestFocus();
        } else if (txtPrecoUnProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Preço Do Produto.");
            txtPrecoUnProduto.requestFocus();
        } else {
            String nomeProduto = txtNomeProduto.getText();
            String dimensoes = txtDimensaoProduto.getText();
            int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
            double precoProduto = Double.parseDouble(txtPrecoUnProduto.getText().replace(",", "."));
            try {

                Date dataProduto = Date.valueOf(validarData(txtDiaData.getText(), txtMesData.getText(), txtAnoData.getText()));

                PrecificacaoDTO objPrecificacaoDTO = new PrecificacaoDTO(nomeProduto, quantidade, precoProduto);
                objPrecificacaoDTO.setDimensoesProduto(dimensoes);
                objPrecificacaoDTO.setDataProduto(dataProduto);

                PrecificacaoDAO objPrecificacaoDAO = new PrecificacaoDAO();
                objPrecificacaoDAO.cadastrarProduto(objPrecificacaoDTO);
                limparCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

    }

    public void limparCampos() {

        txtPesquisaProduto.setText(null);
        ((DefaultTableModel) tblProdutos.getModel()).setRowCount(0);
        txtNomeProduto.setText(null);
        txtDimensaoProduto.setText(null);
        txtIdProduto.setText(null);
        txtQuantidadeProduto.setText(null);
        txtPrecoUnProduto.setText(null);
        txtPrecoTotalProduto.setText(null);
    }

    public void aceitarSoNumeros(JTextField jtextfield) {

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
    private void setarCamposDaTabela() {

        int setar = tblProdutos.getSelectedRow();

        txtIdProduto.setText(tblProdutos.getModel().getValueAt(setar, 0).toString());
        txtNomeProduto.setText(tblProdutos.getModel().getValueAt(setar, 1).toString());
        txtDimensaoProduto.setText(tblProdutos.getModel().getValueAt(setar, 2).toString());
        txtQuantidadeProduto.setText(tblProdutos.getModel().getValueAt(setar, 3).toString());
        txtPrecoUnProduto.setText(tblProdutos.getModel().getValueAt(setar, 4).toString().replace(".", ",")
        );
        txtPrecoTotalProduto.setText(tblProdutos.getModel().getValueAt(setar, 5).toString().replace(".", ",")
        );

        String diaTabela = tblProdutos.getModel().getValueAt(setar, 6).toString();
        String[] diaParaForm = diaTabela.split("-");

        String[] anoDuaPosicoes = diaParaForm[0].split("");
        txtAnoData.setText(anoDuaPosicoes[2] + anoDuaPosicoes[3]);
        txtMesData.setText(diaParaForm[1]);
        txtDiaData.setText(diaParaForm[2]);

    }

    public void alterarProduto() {

        if (txtNomeProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Nome Do Produto.");
            txtNomeProduto.requestFocus();
        } else if (txtQuantidadeProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Quantidade do Produto.");
            txtQuantidadeProduto.requestFocus();
        } else if (txtPrecoUnProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o Preço Do Produto.");
            txtPrecoUnProduto.requestFocus();
        } else if (txtDiaData.getText().isEmpty() || txtMesData.getText().isEmpty() || txtAnoData.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe a Data.");
            txtDiaData.requestFocus();
        } else {
            String nomeProduto = txtNomeProduto.getText();
            String dimensoes = txtDimensaoProduto.getText();
            int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
            double precoProduto = Double.parseDouble(txtPrecoUnProduto.getText().replace(",", "."));
            try {
                Date dataProduto = Date.valueOf(validarData(txtDiaData.getText(), txtMesData.getText(), txtAnoData.getText()));

                PrecificacaoDTO objPrecificacaoDTO = new PrecificacaoDTO(nomeProduto, quantidade, precoProduto);
                objPrecificacaoDTO.setIdProduto(txtIdProduto.getText());
                objPrecificacaoDTO.setDimensoesProduto(dimensoes);
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

    /**
     * Método Chama o Calculo da Quantidade de Produtos x O Preço do Produto da
     * Classe DTO
     */
    private void setarPrecoTotal() {

        try {
            int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
            double precoUn = Double.parseDouble(txtPrecoUnProduto.getText().replace(",", "."));

            PrecificacaoDTO objPrecificacaoDTO = new PrecificacaoDTO(txtNomeProduto.getText(), quantidade, precoUn);

            double total = objPrecificacaoDTO.getPrecoTotalProduto();

            txtPrecoTotalProduto.setText(String.valueOf(total).replace(".", ","));
        } catch (NumberFormatException e) {
            txtPrecoTotalProduto.setText(null);
        }
    }

    public void excluirProduto() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem Certeza que Deseja Excluir Este Item?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
        if (confirma == 0) {

            int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
            double precoUn = Double.parseDouble(txtPrecoUnProduto.getText().replace(",", "."));

            PrecificacaoDTO objPrecificacaoDTO = new PrecificacaoDTO(txtNomeProduto.getText(), quantidade, precoUn);
            objPrecificacaoDTO.getIdProduto();

            new PrecificacaoDAO().excluirProduto(objPrecificacaoDTO);
        }
    }

}
