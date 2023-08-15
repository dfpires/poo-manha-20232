/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista1;

/**
 *
 * @author danie
 */
public class Lista1 {

    public static void main(String[] args) {
       // instanciar obj1
       Produto obj1 = new Produto(1, "Sabonete", 
               "Dove Creme", 10, 1.8f);
        
       Produto obj2 = new Produto(2, "Sabão", "Neutro", 
                20, 1.2f);
       
      // exibe os dados de obj1
      obj1.exibeDados();
      
      // exibe os dados de obj2
      obj2.exibeDados();
      
      obj1.comprar(5);
      obj2.comprar(8);
      
      obj1.exibeDados();
      obj2.exibeDados();
      
      obj1.vender(2);
      obj2.vender(5);
      
      obj1.exibeDados();
      obj2.exibeDados();
      
      
    }
}
