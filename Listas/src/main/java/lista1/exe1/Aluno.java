/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.exe1;

/**
 *
 * @author danie
 */
public class Aluno {
    public int numero, idade;
    public String nome;
    public float p1, p2;
    // construtores
    public Aluno(){
        
    }
    public Aluno(int numero, int idade, 
      String nome, float p1, float p2){
        this.numero = numero;
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public String dadosAluno(){
        return "Número: " + this.numero +
                "\n Nome: " + this.nome +
                "\n Idade: " + this.idade +
                "\n Média: " + this.notaFinal()+ 
                "\n foi " + this.passou();
    }
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public String passou(){
        return (this.notaFinal() >= 6) ? 
                "Aprovado" : "Reprovado";
    }
}
