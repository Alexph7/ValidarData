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

    private String nomeProduto, idProduto;
    private int quantidadeProduto;
    private double altura, largura, precoProduto, precoTotalProduto;
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

    public PrecificacaoDTO(String nomeProduto, int quantidadeProduto, double altura, double largura, double precoProduto) {

        if (quantidadeProduto < 0) {
            throw new IllegalArgumentException("Quantidade Não Pode Ser Menor Que Zero");
        } else if (altura <= 0) {
            throw new IllegalArgumentException("Largura Do Produto Não Pode Ser Menor ou Igual a Zero");
        } else if (largura <= 0) {
            throw new IllegalArgumentException("Altura Do Produto Não Pode Ser Menor ou Igual a Zero");
        } else if (precoProduto < 0) {
            throw new IllegalArgumentException("Preço Do Produto Não Pode Ser Menor Que Zero");
        }

        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.altura = altura;
        this.largura = largura;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura Do Produto Não Pode Ser Menor ou Igual a Zero");
        }
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double Largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("Largura Do Produto Não Pode Ser Menor ou Igual a Zero");
        }
        this.largura = Largura;
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
