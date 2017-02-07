package singleton;

public final class SingletonClass {
    private String name;
    private static SingletonClass instance;
    private static final Object syncRoot = new Object();

    private SingletonClass() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
            instance.setName("default");
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonClass instance = SingletonClass.getInstance();
        SingletonClass instance2 = SingletonClass.getInstance();
        System.out.println(instance == instance2);
    }
}
