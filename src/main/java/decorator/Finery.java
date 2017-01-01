package decorator;

public class Finery extends Person {
    protected Person person;

    public void decorator(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
