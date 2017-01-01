package decorator;

public class Pants extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("Wear Pants!");
    }
}
