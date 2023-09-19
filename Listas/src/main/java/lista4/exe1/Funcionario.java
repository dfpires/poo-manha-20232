package lista4.exe1;
// classe abstrata não pode ser instanciada
// classe abstrata pode ter métodos abstratos, que não são implementados na classe
// mas devem ser implementados nas classes filhas
// classe abstrata é sempre uma classe pai ou superclasse
public abstract class Funcionario {
    protected String nome, endereco, cpf;
    protected float salario;

    public Funcionario() {
    }
    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setCpf(cpf);
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public final void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
    public abstract float calculaSalario();
    
}
