/***
 * Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort).
 * Программа должна работать следующим образом:
 *
 * Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен,
 * программа использует массив по умолчанию.
 *
 * Сначала выводить исходный массив на экран.
 *
 * Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
 *
 * Выводить отсортированный массив на экран.
 *
 * Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива,
 * и heapSort, который выполняет собственно сортировку кучей.
 *
 * Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.
 *
 * На входе:
 *
 *
 * '5 8 12 3 6 9'
 * На выходе:
 *
 *
 * Initial array:
 * [5, 8, 12, 3, 6, 9]
 * Sorted array:
 * [3, 5, 6, 8, 9, 12]
 */

import java.util.Arrays;

class HeapSort {

    //buildTree, который строит сортирующее дерево на основе массива
    public static void buildTree(int[] tree, int sortLength) {
        // Введите свое решение ниже

    }

    //heapSort, который выполняет собственно сортировку кучей
    public static void heapSort(int[] sortArray, int sortLength) {
// Введите свое решение ниже
    }
}

public class Third {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}