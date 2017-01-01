package decorator;

public class Tshirts extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.println("Wear Tshirts!");
    }
}
