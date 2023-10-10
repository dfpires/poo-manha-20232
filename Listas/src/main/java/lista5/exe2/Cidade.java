/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista5.exe2;

/**
 *
 * @author danie
 */
public class Cidade {
    
    // método que contrata um professor, e então este ensina e trabalha
    public void contrata(Professor p){
	p.ensina();
	p.trabalha();
    }
    // método que contrata um empregado, e então este trabalha
    // dois métodos de mesmo nome, com parâmetros diferentes
    // isso se chama sobrecarga de métodos
    public void contrata(Empregado e){
	e.trabalha();
    }
    // método que cobra do contribuinte, que então paga IR
    public void cobraDe(Contribuinte c) {
        c.tiraCpf();
	c.pagaIR();
    }
    // método que registra um cidadão, que tira o RG
    public void registra(Cidadao c) {
	c.tiraRg();
    }
    // método que alimenta o animal, que come
    public void alimenta(Animal a ){
	a.come();
}


}
