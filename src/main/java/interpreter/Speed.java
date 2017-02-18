package interpreter;

enum Speed implements Musical {
    T;

    @Override
    public String play(Double value) {
        if (value < 500) {
            return "slow";
        } else if (value >= 1000) {
            return "fast";
        } else {
            return "medium";
        }
    }
}
