package Каркулятор;

class CalculatorViewImpl implements CalculatorView {
    @Override
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
