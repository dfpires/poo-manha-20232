/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista3.exe2;

import java.util.ArrayList;

public class Forum {
    private String name, url;
    private ArrayList<Message> messages;
    
    public Forum(){
        this.messages = new ArrayList();
    }
    public Forum(String name, String url, ArrayList<Message> messages) {
        this.name = name;
        this.url = url;
        this.messages = messages;
    }
    public Forum(String name, String url) {
        this.setName(name);
        this.setUrl(url);
        this.messages = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public final void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Forum{" + "name=" + name + ", url=" + url + 
                ", messages=" + messages + '}';
    }
    
    public void addMessage(Message message){
        this.messages.add(message);
    }
    public boolean removeMessage(Message message){
        return this.messages.remove(message);
    }
}
