package com.learn;

/**
 * Класс математических операций
 * @version 1.0
 */
public class MyMath {
    /**
     * Функция деления
     * @param num1 - делимое
     * @param num2 - делитель
     * @return возвращает результат деления двух чисел
     */
    public static double divide(double num1, double num2){
        if (num2 == 0)
            throw  new ArithmeticException("Can't divide by zero!");
        return num1/num2;
    }
}
