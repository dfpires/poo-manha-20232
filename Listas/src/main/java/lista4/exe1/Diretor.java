package lista4.exe1;
public class Diretor extends Funcionario{
    private float acoesEmpresa; // qtde de ações
    public Diretor(){
        super();
    }

    public Diretor(float acoesEmpresa, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario);
        this.setAcoesEmpresa(acoesEmpresa);
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public final void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "Diretor{" + "acoesEmpresa=" + acoesEmpresa + super.toString() + '}';
    }
    
    @Override
    public float calculaSalario(){
        return this.salario + (8 * this.acoesEmpresa) / 12;
    }
}
