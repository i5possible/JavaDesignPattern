package memento;

import java.util.Arrays;

public class GameRole {
    private String name;
    private Integer attack;
    private Integer defense;
    private Integer speed;

    public GameRole() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public RoleStateMemento saveRoleState() {
        return new RoleStateMemento(attack, defense, speed);
    }

    public void recoveryRoleState(RoleStateMemento roleStateMemento) {
        this.attack = roleStateMemento.getAttack();
        this.defense = roleStateMemento.getDefense();
        this.speed = roleStateMemento.getSpeed();
    }

    public void fight() {
        this.attack = 1;
        this.defense = 1;
        this.speed = 1;
    }

    @Override
    public String toString() {
        return Arrays.asList(attack, defense, speed).toString();
    }
}
