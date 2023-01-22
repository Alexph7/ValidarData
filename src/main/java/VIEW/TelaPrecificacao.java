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
        LocalDate objLocalDate = LocalDate.now();

        txtDataProduto.setText(String.valueOf(objLocalDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
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
        txtPesquisaProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrarProduto1 = new javax.swing.JButton();
        btnCadastrarProduto2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDataProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

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
        panelPrincipal.add(txtQuantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 101, 33));

        txtNomeProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        panelPrincipal.add(txtNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 396, 33));

        lblNomeProduto2.setText("(*) Campos Obrigatórios");
        panelPrincipal.add(lblNomeProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 137, -1));

        lblPrecoUnProduto.setText("*Preço/un");
        panelPrincipal.add(lblPrecoUnProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        txtPrecoUnProduto.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
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
        panelPrincipal.add(txtPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 650, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Pesquisar");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        btnCadastrarProduto1.setText("Alterar");
        btnCadastrarProduto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProduto1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCadastrarProduto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 130, 40));

        btnCadastrarProduto2.setText("Deletar");
        btnCadastrarProduto2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarProduto2.setFocusTraversalPolicyProvider(true);
        btnCadastrarProduto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProduto2ActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCadastrarProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 130, 40));

        jLabel2.setText("Data");
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));
        panelPrincipal.add(txtDataProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 150, 30));

        jLabel3.setText("ICon Home");
        panelPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 30));

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

    private void btnCadastrarProduto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProduto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarProduto2ActionPerformed

    private void btnCadastrarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProduto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarProduto1ActionPerformed

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
        limparCampos();
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

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
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnCadastrarProduto1;
    private javax.swing.JButton btnCadastrarProduto2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDimensaoProduto;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblNomeProduto2;
    private javax.swing.JLabel lblPrecoUnProduto;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtDataProduto;
    private javax.swing.JTextField txtDimensaoProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisaProduto;
    private javax.swing.JTextField txtPrecoUnProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
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
        }
        txtPrecoUnProduto.requestFocus();

        String nomeProduto = txtNomeProduto.getText();
        String dimensoes = txtDimensaoProduto.getText();
        int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());
        double precoProduto = Double.parseDouble(txtPrecoUnProduto.getText());

        try {
            //Objeto que Converte valor da data no Formato especificado.
            LocalDate stringParaData = LocalDate.parse(txtDataProduto.getText(), DateTimeFormatter.ofPattern("dd/MM/uuuu"));

            //Pega o Valor da Data Formatado e Passa Para Tipo Date.Sql que é o Que esta definido Na ClasseDTO.
            Date dataProduto = Date.valueOf(stringParaData);

            //Passa Todos os Valores Obtidos Do Usuario Para a ClasseDTO Para Encapsulamento.
            PrecificacaoDTO objPrecificacaoDTO = new PrecificacaoDTO(nomeProduto, dimensoes, quantidade, precoProduto, dataProduto);

            //Passa Todos Valores do ObjetoDTO Para ClasseDAO Para Conectar Com Banco de Dados.
            PrecificacaoDAO objPrecificacaoDAO = new PrecificacaoDAO();
            objPrecificacaoDAO.cadastrarProduto(objPrecificacaoDTO);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Errada, Favor Inserir Data Correta.");
        }
    }

    private void limparCampos() {

        txtPesquisaProduto.setText(null);
        //tblProdutos.set
        ((DefaultTableModel) tblProdutos.getModel()).setRowCount(0);
        txtNomeProduto.setText(null);
        txtDimensaoProduto.setText(null);
        txtQuantidadeProduto.setText(null);
        txtPrecoUnProduto.setText(null);

    }

}
