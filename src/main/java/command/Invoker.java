package command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<Command> commands = new ArrayList<>();

    public List<Command> getCommands() {
        return commands;
    }

    public void setCommands(List<Command> commands) {
        this.commands = commands;
    }

    public void addCommand(Command command) {
        this.commands.add(command);
    }

    public void deleteCommands(Command commandToDelete) {
        commands.remove(commandToDelete);
    }

    public void notifyReceiver() {
        System.out.println("Execute!");
        commands.forEach(command -> command.execute());
        commands.clear();
        System.out.println();
    }

    public void displayCommands(){
        System.out.println("now commands : ");
        commands.forEach(command -> command.showReceiver());
        System.out.println();
    }
}
