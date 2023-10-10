/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista1.exe1;

/**
 *
 * @author danie
 */
public class TestaAluno {

    public static void main(String[] args) {
        // instanciar um aluno sem valor inicial
        Aluno obj1 = new Aluno();
        // instanciar um aluno com valores
        Aluno obj2 = new Aluno(123, 18, "Pedro", 6, 8.5f);    
        // mostra os dados dos objetos
        System.out.println(obj1.dadosAluno());
        System.out.println(obj2.dadosAluno());
    }
}
