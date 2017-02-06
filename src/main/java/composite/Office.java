package composite;

public class Office extends ConcreteCompany{
    public Office(String name) {
        super(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "carry out Office duty!");
        super.lineOfDuty();
    }
}
