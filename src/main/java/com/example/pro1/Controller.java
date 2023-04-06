package com.example.pro1;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    //zmienne i funkcje pomocnicze
    private boolean isFirstNumber = true;
    private boolean firstDotIsUsed = false;
    private boolean secondDotIsUsed = false;

    private double firstNumber = 0;
    private double secondNumber = 0;
    private String firstNumberAsString = "";
    private String secondNUmberAsString = "";

    private double reasult;
    private char operation;
    private double memoryNumber;

    private void addNumber(String x) {
        if (isFirstNumber) {
            firstNumberAsString += x;
            reasultWindow.setText(firstNumberAsString);

        } else {
            secondNUmberAsString += x;
            reasultWindow.setText(secondNUmberAsString);
        }
//        if (isFirstNumber) {
//            firstNumber *= 10;
//            firstNumber += x;
//            if (isInt(firstNumber % 10)) {
//                reasultWindow.setText(Integer.toString((int)firstNumber));
//            } else {
//                reasultWindow.setText((Double.toString(firstNumber)));
//            }
//        } else {
//            reasultWindow.clear();
//            secondNumber *= 10;
//            secondNumber +=x;
//            if (isInt(secondNumber % 10)) {
//                reasultWindow.setText(Integer.toString((int)secondNumber));
//            } else {
//                reasultWindow.setText(Double.toString(secondNumber));
//            }
//        }
    }

    private boolean isInt(double x) {
        if (0 == (x % 10)) {
            return true;
        } else if (((x % 10) == 1) || ((x % 10) == 2) || ((x % 10) == 3) || ((x % 10) == 4) || ((x % 10) == 5) || ((x % 10) == 6) || ((x % 10) == 7) || ((x % 10) == 8) || ((x % 10) == 9)) {
            return true;
        } else {
            return false;
        }
    }
    private void setChar(char x) {
        firstNumber = Double.parseDouble(reasultWindow.getText());
        isFirstNumber = false;
        reasultWindow.clear();
        operation = x;
    }

    @FXML
    private TextField reasultWindow;

    //Przyciski numeryczne
    @FXML
    private void clickZero(Event event) {
        if (firstNumberAsString.length() == 0) {
            firstNumberAsString += "0.";
            reasultWindow.setText(firstNumberAsString);
            firstDotIsUsed = true;
        } else if (secondNUmberAsString.length() == 0) {
            secondNUmberAsString += "0.";
            reasultWindow.setText(secondNUmberAsString);
            secondDotIsUsed = true;
        } else {
            addNumber("0");
        }
    }

    @FXML
    private void clickOne() {
        addNumber("1");
    }

    @FXML
    private void clickTwo() {
        addNumber("2");
    }
    @FXML
    private void clickThree() {
        addNumber("3");
    }
    @FXML
    private void clickFour() {
        addNumber("4");
    }
    @FXML
    private void clickFive() {
        addNumber("5");
    }
    @FXML
    private void clickSix() {
        addNumber("6");
    }
    @FXML
    private void clickSeven() {
        addNumber("7");
    }
    @FXML
    private void clickEight() {
        addNumber("8");
    }
    @FXML
    private void clickNine() {
        addNumber("9");
    }

    //przyciski funkcyjne
    @FXML
    private void clickPlus() {
        setChar('+');
    }
    @FXML
    private void clickMinus() {
        setChar('-');
    }
    @FXML
    private void clickMultiplication() {
        setChar('*');
    }
    @FXML
    private void clickDivision() {
        setChar('/');
    }
    @FXML
    private void clickClear() {
        reasultWindow.clear();
        isFirstNumber = true;
        firstDotIsUsed = false;
        secondDotIsUsed = false;
        firstNumber = 0;
        secondNumber = 0;
        reasult = 0 ;
        firstNumberAsString = "";
        secondNUmberAsString = "";
    }
    @FXML
    private void clickDot() {
        if (firstNumberAsString.length() != 0 || secondNUmberAsString.length() != 0) {
            if (isFirstNumber) {
                if (!firstDotIsUsed) {
                    firstNumberAsString += ".";
                    reasultWindow.setText(firstNumberAsString);
                    firstDotIsUsed = true;
                }
            } else {
                if (!secondDotIsUsed) {
                    secondNUmberAsString += ".";
                    reasultWindow.setText(secondNUmberAsString);
                    secondDotIsUsed = true;
                }
            }
        }
    }
    @FXML
    private void clickMemoryPlus() {
        memoryNumber = Double.parseDouble(reasultWindow.getText());
    }
    @FXML
    private void clickMemoryMinus() {
        memoryNumber = 0;
    }
    @FXML
    private void clickMemoryRestore() {
        if (isInt(memoryNumber % 10)) {
            reasultWindow.setText(Integer.toString((int) memoryNumber));
        } else {
            reasultWindow.setText(Double.toString(memoryNumber));
        }
    }
    @FXML
    private void getResult() {
        secondNumber = Double.parseDouble(reasultWindow.getText());
        switch (operation) {
            case '+' -> {
                reasult = firstNumber + secondNumber;
                if (isInt(reasult % 10)) {
                    reasultWindow.setText(Integer.toString((int)reasult));
                } else {
                    reasultWindow.setText(Double.toString(reasult));
                }
            }
            case '-' -> {
                reasult = firstNumber - secondNumber;
                if (isInt(reasult % 10)) {
                    reasultWindow.setText(Integer.toString((int)reasult));
                } else {
                    reasultWindow.setText(Double.toString(reasult));
                }
            }
            case '*' -> {
                reasult = firstNumber * secondNumber;
                if (isInt(reasult % 10)) {
                    reasultWindow.setText(Integer.toString((int)reasult));
                } else {
                    reasultWindow.setText(Double.toString(reasult));
                }
            }
            case '/' -> {
                reasult = firstNumber / secondNumber;
                if (isInt(reasult % 10)) {
                    reasultWindow.setText(Integer.toString((int)reasult));
                } else {
                    reasultWindow.setText(Double.toString(reasult));
                }
            }
        }
    }
}
