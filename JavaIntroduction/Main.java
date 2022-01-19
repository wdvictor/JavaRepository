package com.sysvic;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //primitive types
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        //Complex types
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);


        //Strings
        String message = "Hello Word" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("A"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));

        System.out.println(message.replace("!", "*"));
        //replace It does not change the original message. Strings are
        //not mutable in java

        //Arrays. Arrays a fix length
        //old way to initialize arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(Arrays.toString(numbers));

        //New way to initialize arrays
        int[] numbers2 = {2,3,5,1,5};
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));

        //2D and multiple Dimensions arrays
        int[][] matrix = new int[2][3]; //2 rows and 3 columns
        // int[][] matrix = new {{1,2,3},{1,2,3}};
        matrix[0][0] = 1;
        System.out.println(Arrays.deepToString(matrix));
        // [[1,0,0], [0,0,0]]

        //Constants. We define constants with capital letters
        final float PI = 3.14F;
        // PI = 1; //Compilation Error

        //Arithmetic Expressions
        double result = (double) 10 / (double) 3; //Castin

        //implicit casting
        // byte > short > int > long >float >double
        short x = 1;
        int y = x + 2;

        double x1 = 1.1;
        int y1 = (int) x + 2;

        String s = "1";
        int s1 = Integer.parseInt(s) + 2;

        //The math class
        System.out.println(Math.round(1.1));
        int x2 = Math.round(1.1F);
        int x3 = (int) Math.ceil(1.1);

        double random = Math.round(Math.random() * 100);
        int ran = (int) (Math.random() * 100);

        //Formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("R" + currency.format(123456));

        NumberFormat percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(0.1));

        ///Method chaining
        System.out.println(NumberFormat.getPercentInstance().format(0.1));


        ///Reading input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte inputAge = scanner.nextByte();

        System.out.println("Yor are " + inputAge);

        System.out.print("Name:");
        //String inputAgeString = scanner.next();
        String inputAgeString = scanner.nextLine().trim();
        System.out.println("Welcome Sr." + inputAgeString);
    }
}
