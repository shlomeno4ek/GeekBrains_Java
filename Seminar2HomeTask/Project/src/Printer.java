import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class BubbleSort {
    // Создание логгера с нужным форматом вывода
    private static Logger logger = null;

    static {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "%1$tF %1$tR %5$s %n");
        logger = Logger.getLogger(BubbleSort.class.getName());
    }

    public void sort(int[] mas) {

        configureLogger();
        bubbleSort(mas);
    }

    private int[] bubbleSort(int[] mas) {
        boolean isSorted = false;
        int buffer;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buffer = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buffer;
                }
            }
            logger.info(Arrays.toString(mas));
        }
        return mas;
    }

    public void configureLogger() {
        try {
            FileHandler fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            arr = new int[] { 9, 4, 8, 3, 1 };
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);
    }
}





////моё решение
//import java.io.File;
//import java.io.FileWriter;
//import java.io.FileReader;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.util.Arrays;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//class BubbleSort {
//    private static File log;
//    private static FileWriter fileWriter;
//
//    public static void sort(int[] mas) {
//        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm ");
//        log = new File("log.txt");
//        int len = mas.length;
//        boolean flag = true;
//        StringBuilder result = new StringBuilder();
//
//        while(flag) {
//            flag = false;
//            for (int j = 0; j < len -1; j++) {
//                if (mas[j] > mas[j + 1]){
//                    int temp = mas[j];
//                    mas[j] = mas[j + 1];
//                    mas[j + 1] = temp;
//                    flag = true;
//                }
//            }
//            result.append(formatter.format(new Date())).append(Arrays.toString(mas)).append("\n");
//        }
//
//        try {
//            fileWriter = new FileWriter(log);
//            fileWriter.write(result.toString());
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//public class Printer{
//    public static void main(String[] args) {
//        int[] arr = {};
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
//        }
//        else{
//            arr = Arrays.stream(args[0].split(", "))
//                    .mapToInt(Integer::parseInt)
//                    .toArray();
//        }
//
//        BubbleSort ans = new BubbleSort();
//        ans.sort(arr);
//
//        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}