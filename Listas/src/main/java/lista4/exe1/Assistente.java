/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.exe1;

/**
 *
 * @author danie
 */
public class Assistente extends Funcionario{
    private float horaExtra;

    public Assistente() {
        super(); // chama construtor da superclasse sem parâmetros
    }

    public Assistente(float horaExtra, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario); // chama construtor da superclasse com 4 parâmetros
        this.setHoraExtra(horaExtra);
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public final void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override // indica a anulação
    public String toString() {
        return "Assistente{" + "horaExtra=" + horaExtra + 
                super.toString() + '}';
    }
    // precisamos anular o método herdado calculaSalario()
    @Override // indica a anulação
    public float calculaSalario(){
       return this.salario + (this.horaExtra * 30);
    }
    
    
}
