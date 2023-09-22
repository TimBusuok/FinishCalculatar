package Каркулятор;

import java.util.Scanner;
import java.util.logging.Logger;

public class prg{
    // создали лог для главного класса 
    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        CalculatorView view = new CalculatorViewImpl();
        CalculatorModel model = new CalculatorModel();
        CalculatorPresenter presenter = new CalculatorPresenterImpl(view, model);

        // Получаем входные данные от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();

        // Выполняем расчет с помощью Presenter
        presenter.calculate(num1, num2, operator);
        log.info("Операция выполнена");

        // Закрываем Scanner
        scanner.close();

    }
    
}

