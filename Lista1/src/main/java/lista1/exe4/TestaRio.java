/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1.exe4;

/**
 *
 * @author danie
 */
public class TestaRio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rio obj1 = new Rio("Amazonas", 1.4f, false);
        Rio obj2 = new Rio("Tietê", 0.9f, true);
        
        obj1.ensolarar(0.3f);
        obj1.poluir();
        
        obj2.chover(0.4f);
        obj2.limpar();
        
        obj1.mostra();
        obj2.mostra();
    }
}
