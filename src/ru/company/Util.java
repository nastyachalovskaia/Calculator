package ru.company;

public class Util {
    public Integer performingAnOperationOnTwoNums(int firstInt, int secondInt, String mark) {
        if (mark == "+") {
            return firstInt + secondInt;
        } else if (mark == "-") {
            return firstInt - secondInt;
        } else if (mark == "*") {
            return firstInt * secondInt;
        } else if (mark == "/") {
            if (secondInt == 0) {
                System.out.println("На ноль разделить нельзя.");
                System.exit(0);
            }
            return firstInt / secondInt;
        }
        return -1;
    }

    /**
     * проверяет явл ли строка числом
     **/
    public boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void numberVerification(int num) {
        if (num > 10 || num < 1) {
            System.out.println("Введите корректное выражение!");
            System.exit(0);
        }
    }
}
