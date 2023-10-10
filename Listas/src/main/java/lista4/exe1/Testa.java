/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista4.exe1;

/**
 *
 * @author danie
 */
public class Testa {

    public static void mostra(Funcionario objeto){
        System.out.println(objeto.toString());
        System.out.println(objeto.calculaSalario());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Assistente objAss = new Assistente(3, "Fulano", 
                "Franca", "123", 3000);
      mostra(objAss);
        
        Gerente objGer = new Gerente(1000, "Beltrano", 
                "Franca", "456", 4000);
        mostra(objGer);
        Diretor objDir = new Diretor(1000, "Ciclano",
                "Franca", "789", 6000);
       mostra(objDir);
       
    }
    
}
