/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.exe1;

/**
 *
 * @author danie
 */
// classe interface, herda-se comportamento (métodos), mas não código
public class JogadorBasquete implements IBasquete{

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
        System.out.println("Deu toco");
    }
}
