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

    public static void exibeResultado(Funcionario func){
        /* func é um objeto da superclasse que tem comportamento polimórfico
         func pode executar os métodos toString() e calculaSalario() das classes
         Assistente, Gerente ou Diretor 
         Sendo assim, func vai executar os métodos de qual classe? 
         depende de qual objeto está sendo passado na chamada do método
        */
        System.out.println(func.toString());
        System.out.println(func.calculaSalario());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Assistente objAssistente = new Assistente(2, "Fulano", 
                "Franca", "123", 3000);
        exibeResultado(objAssistente);
        
        Gerente objGerente = new Gerente(1000, "Beltrano", "Franca", 
                "456", 4000);
        exibeResultado(objGerente);
        
        Diretor objDiretor = new Diretor(20000, "Ciclano",
                "Franca", "789", 5000);
        exibeResultado(objDiretor);
    }
    
}
