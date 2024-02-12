import java.util.ArrayList;

/**
 * Даны следующие строки, cравнить их с помощью == и
 * метода equals() класса Object
 * String s1 = "hello";
 * String s2 = "hello";
 * String s3 = s1;
 * String s4 = "h" + "e" + "l" + "l" + "o";
 * String s5 = new String("hello");
 * String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
 */
public class FirstTask {

    public static void compare() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        ArrayList<String> strings = new ArrayList<>();
        strings.add(s1);
        strings.add(s2);
        strings.add(s3);
        strings.add(s4);
        strings.add(s5);
        strings.add(s6);

        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                boolean flag = strings.get(i) == strings.get(j);
                /*
                    null.equals(obj) - будет исключение
                    obj.equals(null) - исключения не будет
                 */
                System.out.println((i+1) + " " + (j+1) + " == " + flag);
                System.out.println((i+1) + " " + (j+1) + " equals " + strings.get(i).equals(strings.get(j)));
                System.out.println("------------------");
            }
        }
    }
}
