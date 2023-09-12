/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista3.exe2;

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
        Person objPerson1 = new Person("João de Deus", "jdeus");
        
        Message objMessage1 = new Message("Pai nosso", objPerson1);
        
        Forum objForum1 = new Forum();
        objForum1.setName("Fórum de discussão religiosa");
        objForum1.setUrl("http://foruns.religiosos.com");
        // adiciona a mensagem no vetor
        objForum1.addMessage(objMessage1);
        
        Message objMessage2 = new Message("Que estais nos céus", objPerson1);
        objForum1.addMessage(objMessage2);
        
        Person objPerson2 = new Person("Pedro", "pedro");
        Message objMessage3 = new Message("santificado seja o vosso nome", objPerson2);
        objForum1.addMessage(objMessage3);
        
        System.out.println(objForum1.toString());
        
        
    }
    
}
