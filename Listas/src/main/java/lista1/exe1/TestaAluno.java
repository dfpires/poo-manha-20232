/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1.exe1;

/**
 *
 * @author danie
 */
public class TestaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Aluno obj1 = new Aluno(123, "Fulano", 19, 6.5f, 7.0f);
        System.out.println(obj1.dadosAluno());
        obj1.passou();
        
        Aluno obj2 = new Aluno(456, "Beltrano", 18, 4.7f, 9.2f);
        System.out.println(obj2.dadosAluno());
        obj2.passou();
        
        
    }
    
}
