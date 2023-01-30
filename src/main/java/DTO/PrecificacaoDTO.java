package DTO;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ph757
 */
public class PrecificacaoDTO {

    private String nomeProduto, dimensoesProduto, idProduto;
    private int quantidadeProduto;
    private double precoProduto, precoTotalProduto;
    private Date dataProduto;

    public PrecificacaoDTO(String nomeProduto, int quantidadeProduto, double precoProduto) {

        if (quantidadeProduto < 0) {
            throw new IllegalArgumentException("Quantidade Não Pode Ser Menor Que Zero");
        } else if (precoProduto < 0) {
            throw new IllegalArgumentException("Preço Do Produto Não Pode Ser Menor Que Zero");
        }

        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDimensoesProduto() {
        return dimensoesProduto;
    }

    public void setDimensoesProduto(String dimensoesProduto) {
        this.dimensoesProduto = dimensoesProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public Date getDataProduto() {
        return dataProduto;
    }

    public void setDataProduto(Date dataProduto) {
        this.dataProduto = dataProduto;
    }

    public BigDecimal getPrecoTotalProduto() {

        BigDecimal precoUnProduto = new BigDecimal(String.valueOf(this.precoProduto)).setScale(4, RoundingMode.HALF_EVEN);
        BigDecimal precoTotalProduto = new BigDecimal(String.valueOf(this.precoTotalProduto)).setScale(4, RoundingMode.HALF_EVEN);
        BigDecimal quantidadeProduto = new BigDecimal(String.valueOf(this.quantidadeProduto));
        try {
            precoTotalProduto = precoUnProduto.multiply(quantidadeProduto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Classe PrecificaçãoDTO MEtodo getPreçoTotalProduto " + e);
        }
        return precoTotalProduto.setScale(2, RoundingMode.HALF_EVEN);
    }

}
