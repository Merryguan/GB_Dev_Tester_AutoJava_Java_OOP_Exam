package exam.gb.oop.calculator.view.command;

import exam.gb.oop.calculator.view.ConsoleUI;

public class RevertCommand extends Command {

    public RevertCommand(ConsoleUI consoleUI) {
        super("Отмена.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().revert();
    }

}
