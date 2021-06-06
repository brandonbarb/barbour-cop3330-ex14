/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Brandon Barbour
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("What is the order amount? ");
        Scanner input = new Scanner(System.in);
        double amount = input.nextInt();
        System.out.print("What is the state? ");
        String state = input.next();
        String out = "";
        double total = amount;
        if (state.equals("WI")) {
            BigDecimal tax = new BigDecimal(Double.toString(amount * 0.055));
            tax = tax.setScale(2, RoundingMode.UP);
            total = amount + tax.doubleValue();
            out += String.format("The subtotal is $%.2f.\nThe tax is $%.2f.\n", amount, tax);
        }
        System.out.printf("%sThe total is $%.2f.", out, total);
    }
}
