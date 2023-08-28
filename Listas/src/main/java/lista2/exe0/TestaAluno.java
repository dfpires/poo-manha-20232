/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista2.exe0;

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
        
        Aluno obj1 = new Aluno();
        obj1.setIdade(-18);
        obj1.setRa(43534534);
        obj1.setP1(-4);
        obj1.setP2(-5);
        
        Aluno obj2 = new Aluno();
        obj2.setIdade(18);
        obj2.setRa(1212121212121l);
        obj2.setP1(6.5f);
        obj2.setP2(8.5f);
        
        System.out.println(obj1.mostra());
        System.out.println(obj1.getRa());
        System.out.println(obj2.mostra());
        System.out.println(obj2.getIdade());
    }
    
}
