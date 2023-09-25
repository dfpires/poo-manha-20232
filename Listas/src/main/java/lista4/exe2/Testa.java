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
    public static void show(Animal camaleao){
        System.out.println(camaleao.toString());
        System.out.println(camaleao.move());
    }
        
    public static void main(String[] args) {
        Snake objSnake = new Snake(true,
                false, "víbora", 3);
        show(objSnake);
        Horse objHorse = new Horse(true, 
                "Pé de pano", 5);
        show(objHorse);
    }
    
}
