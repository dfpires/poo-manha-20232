/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista4.exe2;

/**
 *
 * @author danie
 */
public abstract class Animal {
    protected String name;
    protected int age;
    
    public Animal() {
    }
    public Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }
    
    public String getName() {
        return name;
    }
    public final void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public final void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + '}';
    }
    
    public abstract String move(); // será implementado nas filhas
}
