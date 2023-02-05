package DTO;

import java.sql.Date;

/**
 *
 * @author ph757
 */
public class PrecificacaoDTO {

    private String nomeProduto, idProduto;
    private int quantidadeProduto;
    private double precoProduto;
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

}
