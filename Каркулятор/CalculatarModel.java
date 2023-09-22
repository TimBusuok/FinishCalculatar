package Каркулятор;

import java.util.logging.Logger;

// Определяем класс Model
class CalculatorModel {
    private static final Logger log = Logger.getGlobal();
    private double result;


    // сами опирации с числами
    public void calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                result = num1 + num2;
                log.info("Выполнилась операция сложения");
                break;
            case "-":
                result = num1 - num2;
                log.info("Выполнилась операция вычетания");
                break;
            case "*":
                result = num1 * num2;
                log.info("Выполнилась операция умножения");
                break;
            case "/":
                result = num1 / num2;
                log.info("Выполнилась операция деления");
                break;
            default:
                System.out.println("Неподдерживаемая операция");
                return;
        }
    }

    // Возращаем ответ
    public double getResult() {
        return result;
    }
}