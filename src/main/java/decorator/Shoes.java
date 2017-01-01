package decorator;

public class Shoes extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("Wear Shoes!");
    }
}
