package com.teachmeskills.homework4;

   // Создайте массив целых чисел. Удалите все вхождения заданного
   // числа из массива.
    // Пусть число задается с консоли (класс Scanner). Если такого числа нет -
   // выведите сообщения об этом.
   // В результате должен быть новый массив без указанного числа.

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search and delete");
        int a = scanner.nextInt();
        int[] numbers = {1, 4, 6, 8, 9};
        Arrays.sort(numbers);
        int exit = Arrays.binarySearch(numbers, a);
        int sum = 0;

        if (Math.signum(exit) == -1){
            System.out.println("There is no such number in the array");
            return;
        } else {
            for (int i = 0; i < numbers.length; i++) {
                if(numbers[i] == a){
                    sum++;
                }
            }
        }
        int [] arrayNew = new int[numbers.length-sum];
        int place = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != a) {
                arrayNew[place] = numbers[i];
                place++;
            }
        }
        System.out.println(Arrays.toString(arrayNew));
    }
}


