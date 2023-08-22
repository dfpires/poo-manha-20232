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
    private int ra;
    private int idade;
    private float p1;
    private float p2;
    
    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
        else {
            System.out.println("Idade inválida");
        }
    }
}
