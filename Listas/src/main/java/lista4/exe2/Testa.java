/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista4.exe2;

/**
 *
 * @author danie
 */
public class Testa {

    
    public static void show(Animal animal){
        System.out.println(animal.move());
        System.out.println(animal.toString());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Horse objHorse = new Horse(true, "Pé de pano",
                6);
        show(objHorse);
        Snake objSnake = new Snake(true, false, 
            "Naja", 3);
        show(objSnake);
        
    }
    
}
