package com.example.pro1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    //zmienne pomocnicze
    boolean isFirstNumber = true;
    double firstNumber = 0;
    double secondNumber = 0;
    double reasult;
    char operation;

    private void addNumber(int x) {
        if (isFirstNumber) {
            firstNumber *= 10;
            firstNumber += x;
            reasultWindow.setText(Double.toString(firstNumber));
        } else {
            reasultWindow.clear();
            secondNumber *= 10;
            secondNumber +=x;
            reasultWindow.setText(Double.toString(secondNumber));
        }
    }
    @FXML
    private TextField reasultWindow;

    //Przyciski numeryczne
    @FXML
    private void clickZero() {
        addNumber(0);
    }
    @FXML
    private void clickOne() {
        addNumber(1);
    }
    @FXML
    private void clickTwo() {
        addNumber(2);
    }
    @FXML
    private void clickThree() {
        addNumber(3);
    }
    @FXML
    private void clickFour() {
        addNumber(4);
    }
    @FXML
    private void clickFive() {
        addNumber(5);
    }
    @FXML
    private void clickSix() {
        addNumber(6);
    }
    @FXML
    private void clickSeven() {
        addNumber(7);
    }
    @FXML
    private void clickEight() {
        addNumber(8);
    }
    @FXML
    private void clickNine() {
        addNumber(9);
    }

    //przyciski funkcyjne
    @FXML
    private void clickPlus() {
        isFirstNumber = false;
        reasultWindow.clear();
        operation = '+';
    }
    @FXML
    private void clickMinus() {
        isFirstNumber = false;
        reasultWindow.clear();
        operation = '-';
    }
    @FXML
    private void clickMultiplication() {
        isFirstNumber = false;
        reasultWindow.clear();
        operation = '*';
    }
    @FXML
    private void clickDivision() {
        isFirstNumber = false;
        reasultWindow.clear();
        operation = '/';
    }
    @FXML
    private void clear() {
        reasultWindow.clear();
        isFirstNumber = true;
        firstNumber = 0;
        secondNumber = 0;
    }
    @FXML
    private void getResult() {
        switch (operation) {
            case '+':
                reasult = firstNumber + secondNumber;
                if ((reasult / 10) > 9) {
                    reasultWindow.setText(Double.toString(reasult));
                } else {
                    reasultWindow.setText(Integer.toString((int)reasult));
                }
                break;
            case '-':
                reasult = firstNumber - secondNumber;
                reasultWindow.setText(Double.toString(reasult));
                break;
            case  '*':
                reasult = firstNumber * secondNumber;
                reasultWindow.setText(Double.toString(reasult));
                break;
            case '/':
                reasult = firstNumber / secondNumber;
                reasultWindow.setText(Double.toString(reasult));
                break;
        }
    }
}
