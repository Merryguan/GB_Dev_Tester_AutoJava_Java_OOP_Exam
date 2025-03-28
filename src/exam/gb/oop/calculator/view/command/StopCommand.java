package exam.gb.oop.calculator.view.command;

import exam.gb.oop.calculator.view.ConsoleUI;

public class StopCommand extends Command{
    public StopCommand(ConsoleUI consoleUI) {
        super("Выход.", consoleUI);
    }

    @Override
    public void execute() {
        getConsoleUI().stop();
    }
}
