package testetools;

/**
 *
 * @mariana santos
 */
public class Clientes {

    //CNPJ;nome;ramo de atividade
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

    public Clientes(String CNPJ, String nome, String ramo) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.ramo = ramo;
    }

}
