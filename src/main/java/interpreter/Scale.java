package interpreter;

enum Scale implements Musical {
    O;

    @Override
    public String play(Double value) {
        if (value == 1) {
            return "low_tune";
        } else if (value == 2) {
            return "medium_tune";
        } else if (value == 3) {
            return "high_tune";
        } else {
            throw new IllegalArgumentException();
        }
    }
}
