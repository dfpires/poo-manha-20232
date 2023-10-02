/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova1.exe3;

/**
 *
 * @author danie
 */
public class Casa extends Imovel{
    private String corMuro;
    public Casa(){
        super();
    }

    public Casa(String corMuro, String endereco) {
        super(endereco);
        this.corMuro = corMuro;
    }

    public String getCorMuro() {
        return corMuro;
    }

    public void setCorMuro(String corMuro) {
        this.corMuro = corMuro;
    }

    @Override
    public String toString() {
        return "Casa{" + "corMuro=" + 
         corMuro + super.toString() + '}';
    }
    
    
}
