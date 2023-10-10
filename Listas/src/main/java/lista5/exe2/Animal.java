package lista5.exe2;

public abstract class Animal {
    protected boolean comeu, respirou;
    public void come(){
        this.comeu = true;
        System.out.println("Animal comendo ...");
    }
    public void respira(){
        this.respirou = true;
        System.out.println("Animal respirando ...");
    }
}
