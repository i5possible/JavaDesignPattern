package proxy;

public class PursuitProxy implements Pursuit {
    private Pursuer gg;

    public PursuitProxy(String gg, String mm) {
        this.gg = new Pursuer(gg, mm);
    }

    @Override
    public void giveDolls() {
        gg.giveDolls();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        gg.giveChocolate();
    }
}
