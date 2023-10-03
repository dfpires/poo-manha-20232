/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.exe1;

/**
 *
 * @author danie
 */

// Classe interface, assim como classes abstratas, não pode ser instanciado
public class JogadorBasqueteFutebolVolei implements IBasquete, IFutebol, IVolei {

    @Override
    public void arremessar() {
        System.out.println("Arremessou ...");
    }
    @Override
    public void pegarRebote() {
        System.out.println("Pegou rebote ...");
    }
    @Override
    public void fazerBloqueio() {
        System.out.println("Fez bloqueio ...");
    }
    @Override
    public void darToco() {
        System.out.println("Deu toco ...");
    }
    @Override
    public void chutar() {
        System.out.println("Chutou ...");
    }
    @Override
    public void cobrarEscanteio() {
        System.out.println("Cobrou escanteio ...");
    }
    @Override
    public void cobrarPenalti() {
        System.out.println("Cobrou pênalti ...");
    }
    @Override
    public void cabecear() {
        System.out.println("Cabeceou");
    }  

    @Override
    public void sacar() {
        System.out.println("Sacou ...");
    }

    @Override
    public void bloquear() {
        System.out.println("Bloqueou ...");
    }

    @Override
    public void recepcionar() {
        System.out.println("Recepcionou ...");
    }

    @Override
    public void atacar() {
        System.out.println("Atacou ...");
    }
    
    
    
}
