package DAO;

import DTO.PrecificacaoDTO;
import VIEW.TelaPrecificacao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class PrecificacaoDAO {

    Connection conexao = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    /**
     * Classe operação de CRUD "Cadastrar", pega informações do objeto
     * relacionado e cadastra no Banco de Dados.
     * @param objPrecificacaoDTO passa um objeto preenchido do formulario com
     * valores passado pelo usuario de um objeto DTO
     */
    public void cadastrarProduto(PrecificacaoDTO objPrecificacaoDTO) {

        String sql = "insert into tbprodutos(nome,dimensoes,quantidade,preco,total,data_produto) values(?,?,?,?,?,?);";

        conexao = new ConexaoDAO().conexaoBD();

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objPrecificacaoDTO.getNomeProduto());
            pstm.setString(2, objPrecificacaoDTO.getDimensoesProduto());
            pstm.setString(3, String.valueOf(objPrecificacaoDTO.getQuantidadeProduto()));
            pstm.setString(4, String.valueOf(objPrecificacaoDTO.getPrecoProduto()).replace(".", ","));
            pstm.setString(5, String.valueOf(objPrecificacaoDTO.getPrecoTotalProduto()).replace(".", ","));

            pstm.setDate(6, objPrecificacaoDTO.getDataProduto());

            boolean cadastrado = pstm.execute();
            if (cadastrado == false) {
                JOptionPane.showMessageDialog(null, "Produto Inserido Com Sucesso");
            }
            pstm.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Classe PrecificacaoDao, Metodo Cadastrar Produto" + e.getMessage());
        }
    }

    public void pesquisarProduto() {

        String sql = "select idproduto as ID, nome as Nome, dimensoes as Dimensão, quantidade as Quantidade, preco as 'Preço/Un', total as 'Preço Total', data_produto as Data from tbprodutos where nome like ?";

        conexao = new ConexaoDAO().conexaoBD();

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, TelaPrecificacao.txtPesquisaProduto.getText() + "%");
            rs = pstm.executeQuery();

            TelaPrecificacao.tblProdutos.setModel(DbUtils.resultSetToTableModel(rs));
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Classe PrecificacaoDao, Metodo Pesquisar Produto" + e.getMessage());

        }
    }

    public void alterarProduto(PrecificacaoDTO objPrecificacaoDTO) {

        String sql = "update tbprodutos set nome=?,dimensoes=?,quantidade=?,preco=?,total=?,data_produto=? where idproduto=?";

        try {
            conexao = new ConexaoDAO().conexaoBD();
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objPrecificacaoDTO.getNomeProduto());
            pstm.setString(2, objPrecificacaoDTO.getDimensoesProduto());
            pstm.setString(3, String.valueOf(objPrecificacaoDTO.getQuantidadeProduto()));
            pstm.setString(4, String.valueOf(objPrecificacaoDTO.getPrecoProduto()).replace(".", ","));
            pstm.setString(5, String.valueOf(objPrecificacaoDTO.getPrecoTotalProduto()).replace(".", ","));
            pstm.setDate(6, objPrecificacaoDTO.getDataProduto());
            pstm.setString(7, objPrecificacaoDTO.getIdProduto());

            int confirmado = pstm.executeUpdate();
            if (confirmado > 0) {
                JOptionPane.showMessageDialog(null, "Produto Alterado Com Sucesso");
            }
            pstm.close();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Classe PrecificacaoDao, Metodo AlterarProduto" + e.getMessage());
        }
    }

    public void excluirProduto(PrecificacaoDTO objPrecificacaoDTO) {
        String sql = "delete from tbprodutos where idproduto=?";

        try {
            conexao = new ConexaoDAO().conexaoBD();
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objPrecificacaoDTO.getIdProduto());
            int apagado = pstm.executeUpdate();
            if (apagado > 0) {
                JOptionPane.showMessageDialog(null, "Produto Excluido Com Sucesso");
                pstm.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Classe PrecificacaoDao, Metodo ExcluirProduto" + e.getMessage());
        }
    }

}
