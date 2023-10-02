/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1.exe4;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public class Biblioteca {
    private ArrayList<Livro> livros;
    private String nome, endereco;
    public Biblioteca(){
        
    }
    public Biblioteca(ArrayList<Livro> livros, String nome, 
            String endereco) {
        this.livros = livros;
        this.nome = nome;
        this.endereco = endereco;
    }
    public void addLivro(Livro livro){
        this.livros.add(livro);
    }
    public boolean removeLivro(Livro livro){
        return this.livros.remove(livro);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "livros=" + livros + ", nome=" + nome + ", endereco=" + endereco + '}';
    }
    
    
    
}
