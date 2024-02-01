
public class Main {

    public static void main(String[] args) {

        //Start task 3
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);

        //Start task 2
//        Answer ans = new Answer();
//        ans.printPrimeNums();

        //Start task 1
//        int n = 0;
//
//        if (args.length == 0) {
//            n = 4;
//        }
//        else{
//            n = Integer.parseInt(args[0]);
//        }
//
//        Answer ans = new Answer();
//        int itresume_res = ans.countNTriangle(n);
//        System.out.println(itresume_res);
    }
}

//Home Task № 3
class Calculator {
    public double calculate(char op, int a, int b) {
        // Введите свое решение ниже
        double res = 0;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                res = a / b;
            default:
                System.out.println("Некорректный оператор: 'оператор");
                break;
        }
        return res;
    }
}

//Home Task № 2
//class Answer {
//    public void printPrimeNums(){
//        // Напишите свое решение ниже
//        boolean flag;
//        for (int i = 2; i < 1000; i++) {
//            flag = false;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = true;
//                }
//            }
//            if (!flag) System.out.println(i);
//        }
//    }
//}

//Home Task № 1
//class Answer {
//    public int countNTriangle(int n){
//        // Введите свое решение ниже
//        if (n < -1) {
//            return -1;
//        } else {
//            double d = (n * (n + 1)) / 2;
//            return (int) d;
//        }
//
//    }
//}