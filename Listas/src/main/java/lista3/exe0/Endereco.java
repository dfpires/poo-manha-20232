/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.exe0;

/**
 *
 * @author danie
 */
public class Endereco {
    private int id, numero;
    private String nome, bairro, cep, cidade, pais;

    public Endereco(int id, int numero, String nome, String bairro, String cep, String cidade, String pais) {
        this.id = id;
        this.numero = numero;
        this.nome = nome;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.pais = pais;
    }
 
    public Endereco() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    
    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public final void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public final void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public final void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public final void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Endereco{" + "id=" + id + ", numero=" + numero + ", nome=" + nome + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", pais=" + pais + '}';
    }

   
}
