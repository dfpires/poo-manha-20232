package lista4.exe2;
public class Horse extends Animal{
    private boolean competitor;
    public Horse(){
        super();
    }
    public Horse(boolean competitor, String name, int age) {
        super(name, age);
        this.setCompetitor(competitor);
    }
    public boolean isCompetitor() {
        return competitor;
    }
    public final void setCompetitor(boolean competitor) {
        this.competitor = competitor;
    }

    @Override
    public String toString() {
        return "Horse{" + "competitor=" + competitor + 
                super.toString() + '}';
    }
    
    @Override
    public String move(){
        return "Troting";
    }
    
}
