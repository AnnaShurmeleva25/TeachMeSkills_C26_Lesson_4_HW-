package com.teachmeskills.homework4;
//Создайте и заполните массив случайным числами и выведете
// максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random().
// Пусть будет возможность создавать массив произвольного размера.
// Пусть размер массива вводится с консоли.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the array's length");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        double[] myArray = new double[length];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = Math.random();
        }
        Arrays.sort(myArray);
        System.out.println("Min value: " + myArray[0]);
        System.out.println("Middle value: " + myArray[(length - 1) / 2]);
        System.out.println("Max value: " + myArray[length - 1]);
        System.out.println(Arrays.toString(myArray));
    }
}
