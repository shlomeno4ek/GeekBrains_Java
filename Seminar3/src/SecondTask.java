import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Заполнить список десятью случайными числами.
 * Отсортировать список методом sort() и вывести его на
 * экран.
 */
public class SecondTask {
    private static List<Integer> integerList = new ArrayList<>();

    private static void initListValues() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt();
            integerList.add(number);
        }
        System.out.println("Проинициализированный список: " + integerList);
    }

    public static void sortNPrint() {
        initListValues();
        Collections.sort(integerList);
        System.out.println("Отсортированная коллекция: " + integerList);
    }
}
