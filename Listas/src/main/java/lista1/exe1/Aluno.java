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
    public int nroAluno, idade;
    public String nome;
    public float p1, p2;
    
    public Aluno(){
        
    }
    public Aluno(int nroAluno, String nome, int idade, float p1, float p2){
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
    // calcula e retorna a média final
    public float notaFinal(){
        float media = (this.p1 + this.p2) / 2;
        return media;
    }   
    // verificar se o aluno passou
    public void passou(){
        if (this.notaFinal() >= 6){
            System.out.println("Estudante foi aprovado");
        }
        else {
            System.out.println("Estudante foi reprovado");
        }
    }
    // retorna os dados do aluno
    public String dadosAluno(){
        return "Número do aluno: " + this.nroAluno + 
                " Nome: " + this.nome +
                " Idade: " + this.idade + 
                " Média: " + this.notaFinal();
    }
}
