package model;

public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void TemplateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("This is the model method.");
    }

    public static void main(String[] args) {
        ConcreteClassA concreteClassA = new ConcreteClassA();
        concreteClassA.TemplateMethod();

        ConcreteClassB concreteClassB = new ConcreteClassB();
        concreteClassB.TemplateMethod();
    }
}
