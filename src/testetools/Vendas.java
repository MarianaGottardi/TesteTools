package testetools;

/**
 *
 * @mariana santos
 */
public class Vendas {

    //;ID da venda;ID do item;qtde do item;preço do item;Nome do Vendedor
    private Integer idvenda;
    private Long idItem;
    private Integer qtdItem;
    private Double precoItem;
    private String nomeVendedor;

    public Vendas() {
    }

    public Integer getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(Integer idvenda) {
        this.idvenda = idvenda;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Integer getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(Integer qtdItem) {
        this.qtdItem = qtdItem;
    }

    public Double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(Double precoItem) {
        this.precoItem = precoItem;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Vendas(Integer idvenda, Long idItem, Integer qtdItem, Double precoItem, String nomeVendedor) {
        this.idvenda = idvenda;
        this.idItem = idItem;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
        this.nomeVendedor = nomeVendedor;
    }

}
