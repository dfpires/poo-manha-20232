package lista4.exe1;
public class Funcionario {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
    public float calculaSalario(){
        return this.salario;
    }
}
