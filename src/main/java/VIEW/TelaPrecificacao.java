/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
        jLabel1 = new javax.swing.JLabel();
        btnAlterarProduto = new javax.swing.JButton();
        btnDeletarProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtResetData = new javax.swing.JLabel();
        txtAnoData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMesData = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Precificação Produtos");
        setMinimumSize(new java.awt.Dimension(813, 609));
        setName("framePrecificação"); // NOI18N
        setPreferredSize(new java.awt.Dimension(813, 1000));
        setSize(new java.awt.Dimension(813, 1000));

        panelPrincipal.setMinimumSize(new java.awt.Dimension(7, 7));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(813, 609));
        panelPrincipal.setRequestFocusEnabled(false);
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tblProdutos);

        panelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 780, 210));

        lblQuantidadeProduto.setText("*Quantidade");
        panelPrincipal.add(lblQuantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        txtQuantidadeProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtQuantidadeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantidadeProdutoKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtQuantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 101, 33));

        txtNomeProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        panelPrincipal.add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 396, 33));

        lblNomeProduto2.setText("(*) Campos Obrigatórios");
        panelPrincipal.add(lblNomeProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 137, -1));

        lblPrecoUnProduto.setText("*Preço/un");
        panelPrincipal.add(lblPrecoUnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        txtPrecoUnProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        txtPrecoUnProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecoUnProdutoKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtPrecoUnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 170, 33));

        lblDimensaoProduto.setText("Dimensoes");
        panelPrincipal.add(lblDimensaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        txtDimensaoProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        panelPrincipal.add(txtDimensaoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 173, 33));

        lblNomeProduto.setText("*Nome/Produto");
        panelPrincipal.add(lblNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        btnCadastrarProduto.setText("Cadastrar");
        btnCadastrarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 130, 40));

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
        panelPrincipal.add(txtPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 540, 30));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Icone Pesquisar");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 30));

        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnAlterarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 130, 40));

        btnDeletarProduto.setText("Deletar");
        btnDeletarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletarProduto.setFocusTraversalPolicyProvider(true);
        btnDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProdutoActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnDeletarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 130, 40));

        jLabel2.setText("Data");
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));

        jLabel3.setText("ICon Home");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 30));

        txtResetData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtResetData.setText("icon Reset data");
        txtResetData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtResetData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtResetDataMouseClicked(evt);
            }
        });
        panelPrincipal.add(txtResetData, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, -1));

        txtAnoData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAnoData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAnoDataKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtAnoData, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 40, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("/");
        panelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, 20, -1));

        txtDiaData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiaDataKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtDiaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 40, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("/");
        panelPrincipal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 20, -1));

        txtMesData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMesData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMesDataKeyReleased(evt);
            }
        });
        panelPrincipal.add(txtMesData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(823, 587));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarProdutoActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed

    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    /**
     * Metodo Que Cadastra Produtos ao clica no Botao Adicionar
     *
     * 1. Captura oque o usuario digitou nos Campos do Form e Aramazena em
     * variaveis locais
     * 2. Criar Objeto DTO e Passa as Variaveis Locais Para Encapsular
     * 3. Cria Objeto DAO e executa um metodo dessa classe que pega as
     * Informações do Objeto DTO.
     *
     * @param evt
     */
    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        cadastrarProduto();
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void txtQuantidadeProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoKeyReleased
        aceitarSoNumeros(txtQuantidadeProduto);
    }//GEN-LAST:event_txtQuantidadeProdutoKeyReleased

    private void txtPrecoUnProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoUnProdutoKeyReleased
        txtPrecoUnProduto.setText(txtPrecoUnProduto.getText().replaceAll("[^0-9,]", ""));
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDimensaoProduto;
    private javax.swing.JLabel lblLimparCampoPesquisa;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblNomeProduto2;
    private javax.swing.JLabel lblPrecoUnProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JPanel panelPrincipal;
    public static javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtAnoData;
    private javax.swing.JTextField txtDiaData;
    private javax.swing.JTextField txtDimensaoProduto;
    private javax.swing.JTextField txtMesData;
    private javax.swing.JTextField txtNomeProduto;
    public static javax.swing.JTextField txtPesquisaProduto;
    private javax.swing.JTextField txtPrecoUnProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JLabel txtResetData;
    // End of variables declaration//GEN-END:variables

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

                PrecificacaoDTO objPrecificacaoDTO = new PrecificacaoDTO(nomeProduto, dimensoes, quantidade, precoProduto, dataProduto);

                PrecificacaoDAO objPrecificacaoDAO = new PrecificacaoDAO();
                objPrecificacaoDAO.cadastrarProduto(objPrecificacaoDTO);
                limparCampos();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro Ao Cadastrar Verifique os Dados.");
            }
        }

    }

    public void limparCampos() {

        txtPesquisaProduto.setText(null);
        ((DefaultTableModel) tblProdutos.getModel()).setRowCount(0);
        txtNomeProduto.setText(null);
        txtDimensaoProduto.setText(null);
        txtQuantidadeProduto.setText(null);
        txtPrecoUnProduto.setText(null);
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
            JOptionPane.showMessageDialog(null, "Mês Fora do Intervalo 1-12");
        }
        if ((diaInteiro == 29 && mesInteiro == 02) && !(anoInteiro % 400 == 0 || anoInteiro % 4 == 0 && anoInteiro % 100 != 0)) {
            JOptionPane.showMessageDialog(null, "Data Inválida Para Ano Não Bissexto.");
        } else if (diaInteiro <= 0 || diaInteiro > limiteDiasNoMes[mesInteiro]) {
            JOptionPane.showMessageDialog(null, "Dia Inválido Para Este Mês.");
        } else {
            dataValida = "20" + ano + "-" + mes + "-" + dia;
        }

        return dataValida;
    }

}
