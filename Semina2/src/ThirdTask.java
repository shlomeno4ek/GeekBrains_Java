public class ThirdTask {
    public static boolean reversString(String myString) {
        String sourse = myString.replaceAll(" ", "");
        StringBuilder result = new StringBuilder(sourse);
        String reversed = result.reverse().toString();
        return sourse.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        System.out.println(ThirdTask.reversString("шалаш"));
    }
}
