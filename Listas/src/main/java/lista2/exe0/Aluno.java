/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista2.exe0;

/**
 *
 * @author danie
 */
public class Aluno {
    private long ra;
    private int idade;
    private float p1;
    private float p2;
    
    public Aluno(){
        
    }
    public Aluno(int idade, long ra, float p1, float p2){
        this.setIdade(idade);
        this.setRa(ra);
        this.setP1(p1);
        this.setP2(p2);
    }
    // definição dos métodos setters
    // final => método não pode ser alterado pelas classes filhas
    public final void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else {
            this.idade = 0;
            System.out.println("Idade inválida, foi atribuido 0");
        }
    }
    public final void setRa(long ra){
        // vamos criar um string de ra convertendo long em String
        String raString = String.valueOf(ra);
        
        if (ra > 0 && raString.length() == 13){
            this.ra = ra;
        }
        else {
            this.ra = 0;
            System.out.println("Ra inválido, foi atribuído 0");
        }
    }
    public final void setP1(float p1){
        if (p1 >=0 && p1 <= 10){
            this.p1 = p1;
        }
        else {
            this.p1 = 0;
            System.out.println("P1 inválida, foi atribuida 0");
        }
    }
    public final void setP2(float p2){
        if (p2 >=0 && p2 <= 10){
            this.p2 = p2;
        }
        else {
            this.p2 = 0;
            System.out.println("P2 inválida, foi atribuida 0");
        }
    }
    // definição dos métodos getters
    public long getRa(){
        return this.ra;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getP1(){
        return this.p1;
    }
    public float getP2(){
        return this.p2;
    }
    
    public String mostra(){
        return "Idade: " + this.idade + " Ra: " + this.ra +
                " P1: " + this.p1 + " P2:" + this.p2;
    }
}
