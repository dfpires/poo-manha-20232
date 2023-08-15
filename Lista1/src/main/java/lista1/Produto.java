
package lista1;

public class Produto {
    // Java é tipado, variáveis possuem tipo de dados
    // tipos de dados primitivos (int, float, double, boolean)
    // tipos de dados de classe (String, Float, Integer, Double)
    public int codigo;
    public String nome;
    public String descricao;
    public int qtde;
    public float preco;
    
    // método construtor, tem o mesmo nome da classe
    public Produto(int codigo, String nome, String descricao, 
            int qtde, float preco){
        // this.codigo representa o código do obj que chama construtor
        // codigo representa o valor informado pelo usuário
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    // comprar produtos
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    
    // vender produto
    public void vender(int x){
        if (x <= this.qtde){
            this.qtde = this.qtde - x;
        }
        else {
            System.out.println("Estoque insuficiente");
        }
    }
    public void exibeDados(){
         // exibir os dados do objeto que chama o método
       System.out.println("Código " + this.codigo + " Nome " + this.nome + 
               " Descrição " + this.descricao + " Qtde " + this.qtde + " Preço " + 
               this.preco);
    }
}
