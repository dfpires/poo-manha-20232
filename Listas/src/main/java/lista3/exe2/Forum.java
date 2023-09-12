package lista3.exe2;
import java.util.ArrayList;

public class Forum {
    private String name, url;
    private ArrayList<Message> messages;

    public Forum() {
        this.messages = new ArrayList(); // aloca espaço na memória para vetor
    }
    public Forum(String name, String url, ArrayList<Message> messages) {
        this.name = name;
        this.url = url;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
    // adicionar uma mensagem ao fórum
    public void addMessage(Message message){
        this.messages.add(message);
    }
    // remove uma mensagem do fórum, e retorna se deu certo
    public boolean removeMessage(Message message){
        return this.messages.remove(message);
    }

    @Override
    public String toString() {
        // messages => percorre o vetor e executa toString() de cada message
        return "Forum{" + "name=" + name + ", url=" + url + 
                ", messages=" + messages + '}';
    }
    
}
