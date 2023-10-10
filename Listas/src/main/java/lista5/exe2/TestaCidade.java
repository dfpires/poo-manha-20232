/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista5.exe2;

/**
 *
 * @author danie
 */
public class TestaCidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa objPessoa = new Pessoa();
        Cidade objCidade = new Cidade();
        
        // dá certo pois pessoa é um animal
        objCidade.alimenta(objPessoa);
        // dá certo pois pessoa é um contribuinte
        objCidade.cobraDe(objPessoa);
        // dá certo pois pessoa é um professor
        objCidade.contrata(objPessoa);
        // dá certo pois pessoa está sendo convertida em empregado
        objCidade.contrata((Empregado)objPessoa);
        // dá certo pois pessoa é um cidadão
        objCidade.registra(objPessoa);
        
    }
    
}
