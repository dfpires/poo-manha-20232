/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista1.exe3;

/**
 *
 * @author danie
 */
public class TestaProduto {

    public static void main(String[] args) {
       // instanciar obj1
       Produto obj1 = new Produto(1, "Sabonete", 
               "Dove Creme", 10, 1.8f);
       Produto obj2 = new Produto(2, "Sabão", 
               "Neutro", 20, 1.2f);
      // exibe os dados de obj1
      obj1.exibeDados();
      // exibe os dados de obj2
      obj2.exibeDados();
      System.out.println("Comprando ...");
      obj1.comprar(5);
      obj2.comprar(8);
      obj1.exibeDados();
      obj2.exibeDados();
      System.out.println("Vendendo ...");
      obj1.vender(2);
      obj2.vender(5);
      obj1.exibeDados();
      obj2.exibeDados();
      System.out.println("Aumentando preço ...");
      obj1.aumentarPreco(0.5f);
      obj2.aumentarPreco(0.9f);
      obj1.exibeDados();
      obj2.exibeDados();
      System.out.println("Diminuindo preço ...");
      obj1.diminuirPreco(0.2f);
      obj2.diminuirPreco(0.3f);
      obj1.exibeDados();
      obj2.exibeDados();
      
      Produto obj3 = new Produto();
      
      
    }
}
