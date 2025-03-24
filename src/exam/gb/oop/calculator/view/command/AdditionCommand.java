package exam.gb.oop.calculator.view.command;

import exam.gb.oop.calculator.view.ConsoleUI;

public class AdditionCommand extends Command {

    public AdditionCommand(ConsoleUI consoleUI) {
        super("Сложение.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().addition();
    }

}
