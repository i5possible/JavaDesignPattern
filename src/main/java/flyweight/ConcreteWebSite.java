package flyweight;

public class ConcreteWebSite extends WebSite {
    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    void use(User user) {
        System.out.println();
    }
}
