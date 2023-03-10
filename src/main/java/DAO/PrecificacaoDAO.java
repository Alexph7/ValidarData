package DAO;

import DTO.PrecificacaoDTO;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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

        String sql = "insert into tbprodutos(nome,quantidade,preco,data_produto) values(?,?,?,?);";

        conexao = new ConexaoDAO().conexaoBD();

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objPrecificacaoDTO.getNomeProduto());
            pstm.setString(2, String.valueOf(objPrecificacaoDTO.getQuantidadeProduto()));
            pstm.setString(3, String.valueOf(objPrecificacaoDTO.getPrecoProduto()).replace(".", ","));

            pstm.setDate(4, objPrecificacaoDTO.getDataProduto());

            boolean cadastrado = pstm.execute();
            if (cadastrado == false) {
                JOptionPane.showMessageDialog(null, "Produto Inserido Com Sucesso");
            }
            pstm.close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Classe PrecificacaoDao, Metodo Cadastrar Produto" + e.getMessage());
        }
    }

    public void pesquisarProduto(JTextField textFieldPesquisa, JTable tabela) {

        String sql = "select idproduto as ID, nome as Nome, quantidade as Quantidade, preco as 'Preço/Un', data_produto as Data from tbprodutos where nome like ?";

        conexao = new ConexaoDAO().conexaoBD();

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, textFieldPesquisa.getText() + "%");
            rs = pstm.executeQuery();

            tabela.setModel(DbUtils.resultSetToTableModel(rs));
            pstm.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Classe PrecificacaoDao, Metodo Pesquisar Produto" + e.getMessage());

        }
    }

    public void alterarProduto(PrecificacaoDTO objPrecificacaoDTO) {

        String sql = "update tbprodutos set nome=?,quantidade=?,preco=?,data_produto=? where idproduto=?";

        try {
            conexao = new ConexaoDAO().conexaoBD();
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objPrecificacaoDTO.getNomeProduto());
            pstm.setString(2, String.valueOf(objPrecificacaoDTO.getQuantidadeProduto()));
            pstm.setString(3, String.valueOf(objPrecificacaoDTO.getPrecoProduto()).replace(".", ","));
            pstm.setDate(4, objPrecificacaoDTO.getDataProduto());
            pstm.setString(5, String.valueOf(objPrecificacaoDTO.getIdProduto()));

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
            pstm.setString(1, String.valueOf(objPrecificacaoDTO.getIdProduto()));
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
