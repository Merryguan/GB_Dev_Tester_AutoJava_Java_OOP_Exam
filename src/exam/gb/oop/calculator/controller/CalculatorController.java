package exam.gb.oop.calculator.controller;

import exam.gb.oop.calculator.model.service.CalculatorOperations;
import exam.gb.oop.calculator.view.View;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CalculatorController<T extends CalculatorOperations> {

    private View view;
    private final T service;

    private final List<String> history;

    public CalculatorController(T model) {
        this.service = model;
        this.history = new ArrayList<>();
    }

    private String prepareResult(int real1, int imagine1, int real2, int imagine2, String result, char operation) {

        StringBuilder sb = new StringBuilder();
        sb.append(real1).append(imagine1 > 0 ? "+i" : "-i").append(imagine1 > 0 ? imagine1 : -imagine1)
                .append(' ').append(operation).append(' ')
                .append(real2).append(imagine2 > 0 ? "+i" : "-i").append(imagine2 > 0 ? imagine2 : -imagine2).append(" = ")
                .append(result);
        return sb.toString();

    }

    private void logResult(String result) {

        String filePath = "log.txt";
        File file = new File(filePath);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.append(result);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }

    }

    public List<String> addition(int real1, int imagine1, int real2, int imagine2) {

        String result = service.addition(real1, imagine1, real2, imagine2);
        history.add(prepareResult(real1, imagine1, real2, imagine2, result, '+'));
        logResult(prepareResult(real1, imagine1, real2, imagine2, result, '+'));
        return history;

    }

    public List<String> subtraction(int real1, int imagine1, int real2, int imagine2) {

        String result = service.subtraction(real1, imagine1, real2, imagine2);
        history.add(prepareResult(real1, imagine1, real2, imagine2, result, '-'));
        logResult(prepareResult(real1, imagine1, real2, imagine2, result, '-'));
        return history;

    }

    public List<String> multiplication(int real1, int imagine1, int real2, int imagine2) {

        String result = service.multiplication(real1, imagine1, real2, imagine2);
        history.add(prepareResult(real1, imagine1, real2, imagine2, result, '*'));
        logResult(prepareResult(real1, imagine1, real2, imagine2, result, '*'));
        return history;

    }

    public List<String> division(int real1, int imagine1, int real2, int imagine2) {

        String result = service.division(real1, imagine1, real2, imagine2);
        history.add(prepareResult(real1, imagine1, real2, imagine2, result, ':'));
        logResult(prepareResult(real1, imagine1, real2, imagine2, result, ':'));
        return history;

    }

    public List<String> revert() {

        service.revert();
        history.removeLast();
        return history;

    }

}
