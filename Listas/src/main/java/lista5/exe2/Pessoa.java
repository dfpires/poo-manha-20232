
package lista5.exe2;

public class Pessoa extends Animal implements Cidadao, Contribuinte, Professor {
    private boolean votou, pagou, ensinou, trabalhou;
    private int rg, cpf;
    // todo código escrito no Animal também estará aqui
   // precisamos implementar os métodos da interface Cidadao
    @Override
    public void vota() {
        this.votou = true;
        System.out.println("Pessoa votou ...");
    }

    @Override
    public void tiraRg() {
        this.rg = (int) (Math.random() * 10); // gera um número entre 0 e 9
        System.out.println("Pessoa tirou RG");
    }

    @Override
    public void pagaIR() {
        this.pagou = true;
        System.out.println("Pessoa pagou IR");
    }

    @Override
    public void tiraCpf() {
        this.cpf = (int) (Math.random() * 10); // gera um número entre 0 e 9
        System.out.println("Pessoa tirou CPF");
    }

    @Override
    public void ensina() {
        this.ensinou = true;
        System.out.println("Pessoa ensinou");
    }

    @Override
    public void trabalha() {
        this.trabalhou = true;
        System.out.println("Pessoa trabalhou");
    }
   
    
}
