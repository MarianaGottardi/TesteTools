package testetools;

/**
 *
 * @mariana santos
 */
public class Clientes {

   
    private String numero;
    private String CNPJ;
    private String nome;
    private String ramo;

    public Clientes() {
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Clientes(String numero, String CNPJ, String nome, String ramo) {
        this.numero = numero;
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.ramo = ramo;
    }

  

}
