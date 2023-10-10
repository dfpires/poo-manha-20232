/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2.exe0;

/**
 *
 * @author danie
 */
public class TestaPc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pc obj1 = new Pc();
        obj1.setMarca("Lenovo");
        obj1.setModelo("IdeaPad 3");
        obj1.setRam(16);
        System.out.println("Ram " + obj1.getRam());
        
        Pc obj2 = new Pc("Dell", "Vosto 15", "i5",
                32, 512);
        System.out.println(obj2.toString());
        Pc obj3 =  new Pc("Dell", "Vosto 15",
                "i5", 19, 200);
        System.out.println(obj3.toString());
        
    }
    
}
