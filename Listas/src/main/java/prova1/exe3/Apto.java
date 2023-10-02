/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1.exe3;

/**
 *
 * @author danie
 */
public class Apto extends Imovel{
    private int nro;
    private String sindico;
    public Apto(){
        super();
    }

    public Apto(int nro, String sindico, String endereco) {
        super(endereco);
        this.nro = nro;
        this.sindico = sindico;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getSindico() {
        return sindico;
    }

    public void setSindico(String sindico) {
        this.sindico = sindico;
    }

    @Override
    public String toString() {
        return "Apto{" + "nro=" + nro + 
     ", sindico=" + sindico + super.toString() +
                '}';
    }
    
}
