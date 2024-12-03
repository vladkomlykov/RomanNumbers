package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args)
    {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
            if (number > 0 && number < 4000)
            {
                String romanNumber = GenerateRomanNumber(number);
                System.out.println(romanNumber);
            }
            else
            {
                throw new IllegalArgumentException("Число должно быть от 1 до 3999");

            }
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Введено некорректное значение. Ожидается число.", e);
        }
    }
    public static String GenerateRomanNumber(int num)
    {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++)
        {
            while (num >= values[i])
            {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }
}