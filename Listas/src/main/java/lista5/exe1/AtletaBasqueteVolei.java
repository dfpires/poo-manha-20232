/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.exe1;

/**
 *
 * @author danie
 */
public class AtletaBasqueteVolei implements JogadorBasquete, JogadorVolei{

    @Override
    public void arremessar() {
        System.out.println("Atleta arremessando");
    }

    @Override
    public void fazerBandeja() {
        System.out.println("Atleta fazendo bandeja");
    }

    @Override
    public void enterrar() {
        System.out.println("Atleta enterrando");
    }

    @Override
    public void sacar() {
        System.out.println("Atleta sacando");
    }

    @Override
    public void rodizio() {
        System.out.println("Atleta fazendo rodízio");
    }

    @Override
    public void cortar() {
        System.out.println("Atleta cortando ");
    }
    
}
