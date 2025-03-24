package exam.gb.oop.calculator.view.command;

import exam.gb.oop.calculator.view.ConsoleUI;

public class SubtractionCommand extends Command {

    public SubtractionCommand(ConsoleUI consoleUI) {
        super("Вычитание.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().subtraction();
    }

}
