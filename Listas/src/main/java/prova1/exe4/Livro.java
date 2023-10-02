/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1.exe4;
public class Livro {
    private String nome, editora, autor;
    public Livro(){
        
    }
    public Livro(String nome, String editora, String autor) {
        this.nome = nome;
        this.editora = editora;
        this.autor = autor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", editora=" + editora + ", autor=" + autor + '}';
    }
    
}
