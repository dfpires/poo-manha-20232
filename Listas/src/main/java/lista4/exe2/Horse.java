/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.exe2;

/**
 *
 * @author danie
 */
public class Horse extends Animal{
    private boolean competitor;
    public Horse(){
        super();
    }

    public Horse(boolean competitor, String name, int age) {
        super(name, age);
        this.competitor = competitor;
    }

    public boolean isCompetitor() {
        return competitor;
    }

    public void setCompetitor(boolean competitor) {
        this.competitor = competitor;
    }

    @Override
    public String toString() {
        return "Horse{" + "competitor=" + competitor + 
                super.toString() + '}';
    }
    
    
    @Override
    public String move(){
        return "Trots";
    }
    
}
