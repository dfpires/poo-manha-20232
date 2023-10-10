package lista2.exe0;
public class Pc {
    private String marca, modelo, processador;
    private int ram, disco;
    
    public Pc(){
    }
    
    public Pc(String marca, String modelo, String processador, 
            int ram, int disco){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setProcessador(processador);
        this.setRam(ram);
        this.setDisco(disco);
    }
    
    // setters
    public final void setMarca(String marca){
        this.marca = marca;
    }
    public final void setModelo(String modelo){
        this.modelo = modelo;
    }
    public final void setRam(int ram){
        if ((ram > 0) && (ram % 2 == 0)){
            this.ram = ram;
        }
        else {
            System.out.println("Ram inválida. Valor 0 para ela");
            this.ram = 0;
        }
    }
    public final void setDisco(int disco){
        if (disco % 128 == 0){
            this.disco = disco;
        }
        else {
            this.disco = 0;
        }
    }
    public final void setProcessador(String processador){
        this.processador = processador;
    }
    // getters
    public int getRam(){
        return this.ram;
    }
    public int getDisco(){
        return this.disco;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getProcessador(){
        return this.processador;
    }
    
    @Override
    public String toString(){
        return "Marca: " + this.marca + " Modelo " + this.modelo +
                " Processador " + this.processador + " Ram " + 
                this.ram + " Disco " + this.disco;
    }
}
