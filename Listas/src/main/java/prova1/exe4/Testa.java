/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova1.exe4;

/**
 *
 * @author danie
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Livro obj1 = new Livro("Java", "Casa do código", "Fulano");
         Livro obj2 = new Livro("API", "Casa do código", "Beltrano");
         Biblioteca obj3 = new Biblioteca();
         obj3.setEndereco("Franca");
         obj3.setNome("Central");
         obj3.addLivro(obj1);
         obj3.addLivro(obj2);
         System.out.println(obj3.toString());
    }
    
}
