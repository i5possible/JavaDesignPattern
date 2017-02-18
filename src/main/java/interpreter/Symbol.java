package interpreter;

public class Symbol {
    private Musical musical;
    private Double value;

    public Symbol() {
    }

    public Symbol(Musical musical, Double value) {
        this.musical = musical;
        this.value = value;
    }

    public Musical getMusical() {
        return musical;
    }

    public void setMusical(Musical musical) {
        this.musical = musical;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String play() {
        return musical.play(value);
    }
}
