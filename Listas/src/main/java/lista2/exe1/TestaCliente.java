/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2.exe1;

/**
 *
 * @author danie
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente obj1 = new Cliente("123456-7", "1234-5", "Fulano", 0);
        obj1.depositar(1000);
        obj1.sacar(500);
        System.out.println(obj1.toString());
        
        
         // TODO code application logic here
        Cliente obj2 = new Cliente("123456-78", "124-5", "Beltrano", 0);
        obj2.depositar(1000);
        obj2.sacar(1500);
        System.out.println(obj2.toString());
        
    }
    
}
