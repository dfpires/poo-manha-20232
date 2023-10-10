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
    public Assistente(){
        super(); // chama construtor sem parâmetro do pai
    }

    public Assistente(float horaExtra, String nome, String endereco, 
            String cpf, float salario) {
        // chama construtor com parâmetro do pai
       super(nome, endereco, cpf, salario);
       this.setHoraExtra(horaExtra); 
    }

    public float getHoraExtra() {
        return horaExtra;
    }

    public final void setHoraExtra(float horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override // anula toString() da classe Funcionário
    public String toString() {
        return "Assistente{" + "horaExtra=" + horaExtra + 
                super.toString() + '}';
    }
    @Override
    public float calculaSalario(){
        return this.salario + (this.horaExtra * 30);
    }
    
}
