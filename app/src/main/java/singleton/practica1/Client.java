package singleton.practica1;

public class Client {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Client(String name) {
        this.name = name;
    }
    
}
