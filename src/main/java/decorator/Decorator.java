package decorator;

public class Decorator {
    /**
     * Decoration pattern is used to add additional function to the base component.
     */
    public static void main(String[] args) {
        Person person = new Person("person");

        Pants pants = new Pants();
        Tshirts tshirts = new Tshirts();
        Shoes shoes = new Shoes();

        pants.decorator(person);
        tshirts.decorator(pants);
        shoes.decorator(tshirts);

        shoes.show();
    }
}
