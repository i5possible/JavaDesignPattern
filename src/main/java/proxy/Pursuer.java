package proxy;

public class Pursuer implements Pursuit {
    String gg;
    String mm;

    public Pursuer(String gg, String mm) {
        this.gg = gg;
        this.mm = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println(mm + " : " + gg + " give you dolls.");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm + " : " + gg + " give you flowers.");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm + " : " + gg + " give you chocolate.");
    }
}
