package composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company {
    public ConcreteCompany(String name) {
        super(name);
    }
    private List<Company> children = new ArrayList<>();

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

   @Override
    public void display(Integer depth) {
       System.out.println(new String(new char[depth]).replace("\0", "-") + name);
       children.forEach(c -> c.display(depth+2));
    }

    @Override
    public void lineOfDuty() {
        children.forEach(c -> c.lineOfDuty());
    }
}
