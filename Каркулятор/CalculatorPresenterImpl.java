package Каркулятор;

class CalculatorPresenterImpl implements CalculatorPresenter {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorPresenterImpl(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void calculate(double num1, double num2, String operator) {
        model.calculate(num1, num2, operator);
        view.displayResult(model.getResult());
    }
}
