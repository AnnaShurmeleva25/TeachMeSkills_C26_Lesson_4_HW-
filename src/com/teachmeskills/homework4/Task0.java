package com.teachmeskills.homework4;


//0. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int a = scanner.nextInt();
        int[] numbers = {1, 4, 90, 67, 78, 5, 98};
        Arrays.sort(numbers);
        int exit = Arrays.binarySearch(numbers, a);
        if (Math.signum(exit) == -1){
            System.out.println("There is no such number in the array");
        } else if (numbers[exit] == a) {
            System.out.println("This number is in the array");
        }
    }
}
