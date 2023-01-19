package DTO;

/**
 *
 * @author ph757
 */
public class PrecificacaoDTO {

    private String nomeProduto, dimensoesProduto;
    private int idProduto, quantidadeProduto;
    private double precoProduto, precoTotalProduto;

    public PrecificacaoDTO(String nomeProduto, String dimensoesProduto, int quantidadeProduto, double precoProduto) {

        if (quantidadeProduto < 0) {
            throw new IllegalArgumentException("Quantidade Não Pode Ser Menor Que Zero");
        }
        if (precoProduto < 0) {
            throw new IllegalArgumentException("Preço Do Produto Não Pode Ser Menor Que Zero");
        }

        this.nomeProduto = nomeProduto;
        this.dimensoesProduto = dimensoesProduto;
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

    public int getIdProduto() {
        return idProduto;
    }

    public double getPrecoTotalProduto() {
        this.precoTotalProduto = this.quantidadeProduto * this.precoProduto;
        return precoTotalProduto;
    }

}
