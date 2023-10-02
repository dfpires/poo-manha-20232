/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova1.exe3;

/**
 *
 * @author danie
 */
public class Testa {

    public static void mostra(Imovel imovel){
        System.out.println(imovel.toString());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Casa objCasa = new Casa("branco", "franca");
        mostra(objCasa);
        
        Apto objApto = new Apto(12, "Zeca", "Franca");
        mostra(objApto);
    }
    
}
