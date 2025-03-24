package exam.gb.oop.calculator.view.command;

import exam.gb.oop.calculator.view.ConsoleUI;

public class MultiplicationCommand extends Command {

    public MultiplicationCommand(ConsoleUI consoleUI) {
        super("Умножение.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().multiplication();
    }

}
