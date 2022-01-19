package com.sysvic;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest: ");
        float annualInterest = scanner.nextFloat();
        System.out.print("Period: ");
        int period = scanner.nextInt();
        System.out.println(mortgageCalculator(principal, annualInterest, period));
    }

    public static String mortgageCalculator(int principal, float annualInterest, int period){
        annualInterest /= 100;
        double payment = principal * (annualInterest/12);
        payment *= Math.pow(1+annualInterest/12, 12*period);
        payment /= Math.pow(1+annualInterest/12, 12*period) - 1;

        return "R"+ NumberFormat.getCurrencyInstance().format(payment);
    }
}
