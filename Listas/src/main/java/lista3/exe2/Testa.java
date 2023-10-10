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
        Person objPerson = new Person("Fulano de tal", "fulano");
        Message objMessage1 = new Message("Olá", objPerson);
        Message objMessage2 = new Message("boa noite", objPerson);
        
        Forum objForum = new Forum("de esportes",
                "http://forumdeesportes.com");
        objForum.addMessage(objMessage1);
        objForum.addMessage(objMessage2);
        System.out.println(objForum.toString());
        objForum.removeMessage(objMessage1);
        System.out.println(objForum.toString());
    }
    
}
