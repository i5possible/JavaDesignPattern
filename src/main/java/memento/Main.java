package memento;

public class Main {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setName("001");
        gameRole.setAttack(18);
        gameRole.setDefense(20);
        gameRole.setSpeed(17);

        System.out.println(gameRole.toString());

        RoleStatusCaretaker roleStatusCaretaker = new RoleStatusCaretaker();
        roleStatusCaretaker.setRoleStateMemento(gameRole.saveRoleState());

        gameRole.fight();
        System.out.println(gameRole.toString());

        gameRole.recoveryRoleState(roleStatusCaretaker.getRoleStateMemento());
        System.out.println(gameRole.toString());
    }
}
