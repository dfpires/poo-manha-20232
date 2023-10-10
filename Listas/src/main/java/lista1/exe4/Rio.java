/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.exe4;

/**
 *
 * @author danie
 */
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;
    
    public Rio(){
        
    }
    public Rio(String nome, float nivel, boolean poluido){
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
        else this.nivel = 0;   
    }
    public String mostra(){
        return "Nome: " + this.nome + " Nível " + this.nivel +
                ((this.poluido) ? "Sim" : "Não");
    }
}
