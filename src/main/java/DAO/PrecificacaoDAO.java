package DAO;

import DTO.PrecificacaoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class PrecificacaoDAO {

    Connection conexao;
    PreparedStatement pstm;

    /**
     * Classe operação de CRUD "Cadastrar", pega informações do objeto
     * relacionado e cadastra no Banco de Dados.
     * @objPrecificacaoDTO passa um objeto preenchido do formulario com valores
     * passado pelo usuario
     */
    public void cadastrarProduto(PrecificacaoDTO objPrecificacaoDTO) {
        String sql = "insert into tbprodutos(nome,dimensoes,quantidade,preco,total,data_produto) values(?,?,?,?,?,?);";
        conexao = new ConexaoDAO().conexaoBD();

        try {
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objPrecificacaoDTO.getNomeProduto());
            pstm.setString(2, objPrecificacaoDTO.getDimensoesProduto());
            pstm.setString(3, String.valueOf(objPrecificacaoDTO.getQuantidadeProduto()));
            pstm.setString(4, String.valueOf(objPrecificacaoDTO.getPrecoProduto()));
            pstm.setString(5, String.valueOf(objPrecificacaoDTO.getPrecoTotalProduto()));

            pstm.setDate(6, objPrecificacaoDTO.getDataProduto());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Produto Inserido Com Sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Classe PrecificacaoDao, Metodo Cadastrar Produto" + e.getMessage());
        }
    }

}
