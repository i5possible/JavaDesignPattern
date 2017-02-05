package memento;

public class RoleStateMemento {
    private Integer attack;
    private Integer defense;

    private Integer speed;

    public RoleStateMemento(Integer attack, Integer defense, Integer speed) {
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getSpeed() {
        return speed;
    }
}
