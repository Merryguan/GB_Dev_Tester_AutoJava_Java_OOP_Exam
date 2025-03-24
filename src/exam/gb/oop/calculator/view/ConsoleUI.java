package exam.gb.oop.calculator.view;

import exam.gb.oop.calculator.controller.Controller;

import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements View {

    private Controller controller;
    private Scanner scanner;
    private MainMenu mainMenu;
    private boolean work;

    public ConsoleUI(Controller controller) {

        this.controller = controller;
        scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this);
        work = true;

    }

    @Override
    public void start() {

        int menuPoint;
        while (work) {
            System.out.println(mainMenu.menu());
            menuPoint = scanner.nextInt();
            scanner.nextLine();
            if (menuPoint > mainMenu.size()) {
                System.out.println("Введено неверное значение.\n");
                continue;
            }
            mainMenu.execute(menuPoint);
        }

    }

    @Override
    public void printResult(String result) {

        System.out.println(result);

    }

    public void addition() {

        System.out.println("Введите действительную часть первого числа: ");
        int real1 = scanner.nextInt();
        System.out.println("Введите мнимую часть первого числа: ");
        int imagine1 = scanner.nextInt();
        System.out.println("Введите действительную часть второго числа: ");
        int real2 = scanner.nextInt();
        System.out.println("Введите мнимую часть второго числа: ");
        int imagine2 = scanner.nextInt();
        List<String> result = controller.addition(real1, imagine1, real2, imagine2);
        printResult(String.format("Ответ: %s\n", result.getLast()));
        StringBuilder sb = new StringBuilder();
        for (String item : result) {
            sb.append(item).append("\n");
        }
        printResult(String.format("История:\n%s", sb));

    }

    public void subtraction() {

        System.out.println("Введите действительную часть первого числа: ");
        int real1 = scanner.nextInt();
        System.out.println("Введите мнимую часть первого числа: ");
        int imagine1 = scanner.nextInt();
        System.out.println("Введите действительную часть второго числа: ");
        int real2 = scanner.nextInt();
        System.out.println("Введите мнимую часть второго числа: ");
        int imagine2 = scanner.nextInt();
        List<String> result = controller.subtraction(real1, imagine1, real2, imagine2);
        printResult(String.format("Ответ: %s\n", result.getLast()));
        StringBuilder sb = new StringBuilder();
        for (String item : result) {
            sb.append(item).append("\n");
        }
        printResult(String.format("История:\n%s", sb));

    }

    public void multiplication() {

        System.out.println("Введите действительную часть первого числа: ");
        int real1 = scanner.nextInt();
        System.out.println("Введите мнимую часть первого числа: ");
        int imagine1 = scanner.nextInt();
        System.out.println("Введите действительную часть второго числа: ");
        int real2 = scanner.nextInt();
        System.out.println("Введите мнимую часть второго числа: ");
        int imagine2 = scanner.nextInt();
        List<String> result = controller.multiplication(real1, imagine1, real2, imagine2);
        printResult(String.format("Ответ: %s\n", result.getLast()));
        StringBuilder sb = new StringBuilder();
        for (String item : result) {
            sb.append(item).append("\n");
        }
        printResult(String.format("История:\n%s", sb));

    }

    public void division() {

        System.out.println("Введите действительную часть первого числа: ");
        int real1 = scanner.nextInt();
        System.out.println("Введите мнимую часть первого числа: ");
        int imagine1 = scanner.nextInt();
        System.out.println("Введите действительную часть второго числа: ");
        int real2 = scanner.nextInt();
        System.out.println("Введите мнимую часть второго числа: ");
        int imagine2 = scanner.nextInt();
        List<String> result = controller.division(real1, imagine1, real2, imagine2);
        printResult(String.format("Ответ: %s\n", result.getLast()));
        StringBuilder sb = new StringBuilder();
        for (String item : result) {
            sb.append(item).append("\n");
        }
        printResult(String.format("История:\n%s", sb));

    }

    public void revert() {

        List<String> result = controller.revert();
        printResult(String.format("Действие %s отменено.\n", result.getLast()));
        StringBuilder sb = new StringBuilder();
        for (String item : result) {
            sb.append(item).append("\n");
        }
        printResult(String.format("История:\n%s", sb));

    }

    public void stop() {

        work = false;

    }
}
