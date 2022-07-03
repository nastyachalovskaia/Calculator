package ru.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String s1 = scan.nextLine();
        System.out.println(calc(s1));
    }

    public static String calc(String input) {
        String mark = "";
        if (input.indexOf("+") > 0) {
            mark = "+";
        } else if (input.indexOf("-") > 0) {
            mark = "-";
        } else if (input.indexOf("*") > 0) {
            mark = "*";
        } else if (input.indexOf("/") > 0) {
            mark = "/";
        } else {
            System.out.println("Введите корректное выражение!!!");
            System.exit(1);
        }

        Roman roman = new Roman();
        Util util = new Util();
        String first = input.substring(0, input.indexOf(mark)).toUpperCase().trim();
        String second = input.substring(input.indexOf(mark) + 1).toUpperCase().trim();
        int firstInt;
        int secondInt;
        if (util.isDigit(first) && util.isDigit(second)) {
            firstInt = Integer.parseInt(first);
            secondInt = Integer.parseInt(second);
        } else {
            firstInt = roman.romanToNumber(first);
            secondInt = roman.romanToNumber(second);
            util.numberVerification(firstInt);
            util.numberVerification(secondInt);
            System.out.println(roman.convertNumToRoman(util.performingAnOperationOnTwoNums(firstInt, secondInt, mark)));
            System.exit(0);
        }

        util.numberVerification(firstInt);
        util.numberVerification(secondInt);

        return util.performingAnOperationOnTwoNums(firstInt, secondInt, mark).toString();


    }

}