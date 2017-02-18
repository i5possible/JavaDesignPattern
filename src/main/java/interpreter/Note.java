package interpreter;

enum Note implements Musical {
    C(1),
    D(2),
    E(3),
    F(4),
    G(5),
    A(6),
    B(7),
    P(8);
    private int playValue;

    Note(int playValue) {
        this.playValue = playValue;
    }

    @Override
    public String play(Double value) {
        if (!this.equals(P)) {
            return this.name();
        } else return "";
    }
}
