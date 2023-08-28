/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.exe4;

import java.text.DecimalFormat;

/**
 *
 * @author danie
 */
public class Rio {
    public float nivel;
    public boolean poluido;
    public String nome;
    
    public Rio(){
    }
    public Rio(String nome, float nivel, 
            boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void poluir(){
        this.poluido = true;
    }
    public void limpar(){
        this.poluido = false;
    }
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarar(float x){
        if (x <= this.nivel){
            this.nivel -= x;
        }
        else System.out.println("Nível não pode ser negativo");
    }
    public void mostra(){
        // criar um objeto da classe DecimaFormat
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Nome: " + this.nome + " Nível: " +
                df.format(this.nivel) + " Poluído: " + 
                (this.poluido ? "Sim": "Não"));
    }
}
    