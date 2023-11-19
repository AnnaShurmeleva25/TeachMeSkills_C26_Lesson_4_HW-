package com.teachmeskills.homework4;

import java.util.Arrays;
//Создайте 2 массива из 5 чисел.
// Выведите массивы на консоль в двух отдельных строках.
// Посчитайте среднее арифметическое элементов каждого массива и
// сообщите, для какого из массивов это значение оказалось больше (либо
// сообщите, что их средние арифметические равны).

public class Task3 {
    public static void main(String[] args) {

        int[] one = {4, 2, 9, 1, 11};
        int[] two = {6, 79, 43, 32, 99};
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        int middle1 = 0;
        for (int i = 0; i < one.length; i++) {
            middle1 = middle1 + one[i];
        }
        int middle2 = 0;
        for (int i = 0; i < two.length; i++) {
            middle2 = middle2 + two[i];
        }
        if (middle1 / 2 < middle2 / 2) {
            System.out.println("The arithmetic mean of the sum of numbers in the second array is greater");
        } else if (middle2 / 2 < middle1 / 2) {
            System.out.println("The arithmetic mean of the sum of numbers in the first array is greater");
        } else {
            System.out.println("The arithmetic mean of the arrays are equal");
        }
    }
}