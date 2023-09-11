/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista3.exe0;

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
        // cria um objeto da classe endereço
        Endereco objEndereco = new Endereco(1, 900, "Rua das Acácias", 
                "Centro", "14400-000", "Franca", "Brasil");
        
        // cria um objeto da classe Cliente
        Cliente objCliente = new Cliente(1, "Pedro", "123", "987",
                objEndereco);
        
        System.out.println(objCliente.toString());
        
        Endereco objEndereco2 = new Endereco(2, 450, "Rua Major Nicácio",
                "Santa Cruz","14402-053", "Franca", "Brasil");
        
        Fornecedor objFornecedor = new Fornecedor(1, "Placas Mercosul",
                "Placas", "987", objEndereco2);
        System.out.println(objFornecedor.toString());
    }
    
}
