/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.exe0;

/**
 *
 * @author danie
 */
public class Cliente {
    private int id;
    private String nome, rg, cpf;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(int id, String nome, String rg, String cpf, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + 
                ", nome=" + nome + ", rg=" + rg + 
                ", cpf=" + cpf + ", endereco=" + 
                endereco.toString() + '}';
    }
    
    
}
