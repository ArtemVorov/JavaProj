package com.company.lesson01;

/*
1) Минимизировать повторяющийся код
2) Улучшить читабельность кода
3) Разбить монолитное приложение на части
*/

// public protected default private
public class Main {
    public static void main(String[] args) {
        byte b = -128; // Byte
        short s = 32000; // Short
        char c = 48247; // Character
        int i = 23; // Integer
        long l = 23452355324L; // Long
        boolean bool = false; // Boolean
        float f = 23.5F; // Float
        double d = 23.23423523; // Double
        String str = "23";

        System.out.println("text2");

        int res = sum(20, 30);
        System.out.println(res);

        int res1 = sum(25, 31231);
        System.out.println(res1);

        System.out.println(sum(124, 423));

        System.out.println(convert("text"));

        printTwoTimes("text");
    }

    private static int sum(int number1, int number2){
        int res = number1 + number2;
        return res;
    }

    private static String convert(String str){
        String res = str + " end.";
        return res;
    }

    private static void printTwoTimes(String str){
        System.out.println(str);
        System.out.println(str);
    }
}