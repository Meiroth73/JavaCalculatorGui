package com.example.pro1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    boolean isFirstNumber = true;
    double firstNumber = 0;
    double secondNumber = 0;

    private void addNumber(int x) {
        if (isFirstNumber) {
            firstNumber *= 10;
            firstNumber += x;
            reasultWindow.setText(Double.toString(firstNumber));
        } else {
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
}

