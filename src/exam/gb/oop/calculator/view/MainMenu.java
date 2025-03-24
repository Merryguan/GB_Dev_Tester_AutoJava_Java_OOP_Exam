package exam.gb.oop.calculator.view;

import exam.gb.oop.calculator.view.command.*;
import exam.gb.oop.calculator.view.command.Command;
import exam.gb.oop.calculator.view.command.StopCommand;

import java.util.ArrayList;
import java.util.List;

public class MainMenu {
    private final List<Command> commands;

    public MainMenu(ConsoleUI consoleUI) {
        commands = new ArrayList<>();
        commands.add(new AdditionCommand(consoleUI));
        commands.add(new SubtractionCommand(consoleUI));
        commands.add(new MultiplicationCommand(consoleUI));
        commands.add(new DivisionCommand(consoleUI));
        commands.add(new RevertCommand(consoleUI));
        commands.add(new StopCommand(consoleUI));
    }

    public String menu() {
        StringBuilder result = new StringBuilder();
        result.append("Меню:\n");
        for (int i = 0; i < commands.size(); i++) {
            result.append(i + 1).append(". ");
            result.append(commands.get(i).getDescription())
                    .append("\n");
        }
        result.append("\n").append("Выберите пункт меню: ");
        return result.toString();
    }

    public void execute(int choice) {
        Command command = commands.get(choice - 1);
        command.execute();
    }

    public int size() {
        return commands.size();
    }

}
