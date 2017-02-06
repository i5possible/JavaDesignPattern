package composite;

public class HRBP extends ConcreteCompany{
    public HRBP(String name) {
        super(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + "carry out HRBP duty.");
        super.lineOfDuty();
    }
}
