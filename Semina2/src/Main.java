import java.util.Scanner;

public class Main {

//Task № 2
//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd, выход: abcd

    private String myInputString;

    public Main() {
        Scanner in = new Scanner(System.in);
        myInputString = in.next();
        in.close();
    }

    public void getUniqSequence() {
        StringBuilder result = new StringBuilder();
        char[] charArray = myInputString.toCharArray();
        boolean isRepeated;

        for (int i = 0; i < charArray.length; i++) {
            isRepeated = false;
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                result.append(charArray[i]);
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Main start = new Main();
        start.getUniqSequence();
    }






////    Task № 1
////    Дано четное число N (>0) и символы c1 и c2.
////    Написать метод, который вернет строку длины N, которая
////    состоит из чередующихся символов c1 и c2, начиная с c1.
//    int n;
//    char a;
//    char b;
//
//    public Main() {
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        a = in.next().charAt(0);
//        b = in.next().charAt(0);
//        in.close();
//    }
//
//    private boolean isValid() {
//        return n % 2 == 0;
//    }
//
//    public void getResult() {
//        StringBuilder result = new StringBuilder();
//
//        int count = 0;
//        if (isValid()) {
//            while (count < n) {
//                result.append(a).append(b);
//                count += 2;
//            }
//            System.out.println(result);
//        }
//    }
//
//    public static void main(String[] args) {
//        Main start = new Main();
//        start.getResult();
//    }



//    //Home task №1
//    public static void main(String[] args) {

//        String QUERY = "";
//        String PARAMS = "";
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            QUERY = "select * from students where ";
//            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//        }
//        else{
//            QUERY = args[0];
//            PARAMS = args[1];
//        }
//
//        Answer ans = new Answer();
//        System.out.println(ans.answer(QUERY, PARAMS));
//    }
//
//    //Home task №1
//    static class Answer {
//        public static StringBuilder answer(String QUERY, String PARAMS){
//            // Напишите свое решение ниже
//            StringBuilder get = new StringBuilder(QUERY);
//            System.out.println(PARAMS);
//            String [] list = PARAMS.split(", ");
//           // System.out.println(list[0]);
//            for (int i = 0; i < list.length; i++) {
//                String [] temp = list[i].split("\"");
//                //System.out.println(list[i]);
//                for (int j = 0; j < temp.length; j++) {
//                    System.out.println(temp[j]);
//
//                }
//            }
//
//            return new StringBuilder();
//        }
//    }


}
