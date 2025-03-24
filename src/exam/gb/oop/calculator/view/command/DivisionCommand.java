package exam.gb.oop.calculator.view.command;

import exam.gb.oop.calculator.view.ConsoleUI;

public class DivisionCommand extends Command {

    public DivisionCommand(ConsoleUI consoleUI) {
        super("Деление.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().division();
    }

}
