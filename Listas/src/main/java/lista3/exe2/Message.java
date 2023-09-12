/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.exe2;

/**
 *
 * @author danie
 */
public class Message {
    private String text;
    private Person person;
    public Message() {
    }
    public Message(String text, Person person) {
        this.text = text;
        this.person = person;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    @Override
    public String toString() {
        return "\n Message{" + "text=" + text + 
                ", person=" + person.toString() + '}';
    }
}
