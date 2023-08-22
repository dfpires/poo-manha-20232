/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista1.exe2;

/**
 *
 * @author danie
 */
public class Cliente {
        public int nroConta, nroAgencia;
        public String nome;
        public float saldo;
        
        public Cliente(){
            
        }
        public Cliente(int nroConta, int nroAgencia, String nome, float saldo){
            this.nroConta = nroConta;
            this.nroAgencia = nroAgencia;
            this.nome = nome;
            this.saldo = saldo;
        }
        public void depositar(float valor){
            this.saldo += valor; // this.saldo = this.saldo + valor
            System.out.println("Depósito realizado com sucesso");
        }
        public void sacar(float valor){
            if (valor <= this.saldo){
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso");
            }
            else {
                System.out.println("Saldo não pde ficar negativo");
            }
        }
        public String mostra(){
            return "Nro conta: " + this.nroConta + " Nro agência " + this.nroAgencia +
                    " Nome " + this.nome + " Saldo " + this.saldo;
        }
}
