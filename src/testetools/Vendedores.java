/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetools;

/**
 *
 * @author user
 */
public class Vendedores {

    private String nome;
    private String cpf;
    private Double salario;

    public Vendedores() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Vendedores(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

}
