package prototype;

public class StuffInPrototype {
    String name = "no body";

    public StuffInPrototype() {
    }

    public StuffInPrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
