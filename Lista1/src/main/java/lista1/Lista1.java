/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lista1;

/**
 *
 * @author danie
 */
public class Lista1 {

    public static void main(String[] args) {
       // instanciar obj1
       Produto obj1 = new Produto();
       // instanciar obj2
       Produto obj2 = new Produto();
       
       // adiciona valores para obj1
	obj1.codigo = 1;
	obj1.nome = "Sabonete";
	obj1.descricao = "Dove Creme";
	obj1.qtde = 10;
	obj1.preco = 1.8f;
       // adiciona valores para obj2
       obj2.codigo = 2;
       obj2.nome = "Sabão";
       obj2.descricao = "Neutro";
       obj2.qtde = 20;
       obj2.preco = 1.2f;
       
       // exibir os dados de obj1
       System.out.println("Código " + obj1.codigo + " Nome " + obj1.nome + 
               " Descrição " + obj1.descricao + " Qtde " + obj1.qtde + " Preço " + 
               obj1.preco);
       
       // exibir os dados de obj2
       System.out.println("Código " + obj2.codigo + " Nome " + obj2.nome + 
               " Descrição " + obj2.descricao + " Qtde " + obj2.qtde + " Preço " + 
               obj2.preco);
    }
}
