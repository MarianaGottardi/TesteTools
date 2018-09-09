package testetools;

/**
 *
 * @mariana santos
 */
public class Vendas {

     private String numero;
	private String idVenda;
	private String idItem;
	private String qntItem;
	private Double precoItem;
	private String nomeVendedor;


    public Vendas() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public String getQntItem() {
        return qntItem;
    }

    public void setQntItem(String qntItem) {
        this.qntItem = qntItem;
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

    public Vendas(String numero, String idVenda, String idItem, String qntItem, Double precoItem, String nomeVendedor) {
        this.numero = numero;
        this.idVenda = idVenda;
        this.idItem = idItem;
        this.qntItem = qntItem;
        this.precoItem = precoItem;
        this.nomeVendedor = nomeVendedor;
    }

    

}
