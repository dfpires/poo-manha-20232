/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista3.exe1;

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
        
        Product objProd = new Product("Bola de basquete", 400);
        
        CarItem objCI1 = new CarItem(10, objProd);
        
        CarItem objCI2 = new CarItem(20, objProd);
        
        ShoppingCart objSC = new ShoppingCart();
        objSC.addCarItem(objCI1);
        objSC.addCarItem(objCI2);
        
        System.out.println(objSC.toString());
    }
    
}
