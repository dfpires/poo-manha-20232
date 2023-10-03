package lista5.exe1;
public class JogadorBasqueteFutebol implements IBasquete, IFutebol{
    @Override
    public void arremessar() {
        System.out.println("Arremessou ...");
    }
    @Override
    public void pegarRebote() {
        System.out.println("Pegou rebote ...");
    }
    @Override
    public void fazerBloqueio() {
        System.out.println("Fez bloqueio ...");
    }
    @Override
    public void darToco() {
        System.out.println("Deu toco ...");
    }
    @Override
    public void chutar() {
        System.out.println("Chutou ...");
    }
    @Override
    public void cobrarEscanteio() {
        System.out.println("Cobrou escanteio ...");
    }
    @Override
    public void cobrarPenalti() {
        System.out.println("Cobrou pênalti ...");
    }
    @Override
    public void cabecear() {
        System.out.println("Cabeceou");
    }  
}
