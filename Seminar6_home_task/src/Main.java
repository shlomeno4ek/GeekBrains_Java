/***
 * Реализуйте структуру телефонной книги с помощью HashMap.
 * Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
 * их необходимо считать, как одного человека с разными телефонами.
 * Вывод должен быть отсортирован по убыванию числа телефонов.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingInt;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    /***
     * add(String name, Integer phoneNum): Добавляет запись в телефонную книгу.
     *  * Если запись с именем name уже существует, добавляет новый номер телефона в существующую запись.
     *  * Если запись с именем name не существует, создает новую запись с этим именем и номером телефона phoneNum.
     * @param name
     * @param phoneNum
     */
    public void add(String name, Integer phoneNum) {
        // Введите свое решение ниже
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList <Integer> value = new ArrayList<>();
            value.add(phoneNum);
            phoneBook.put(name, value);
        }
    }

    /***
     * find(String name): Поиск номеров телефона по имени в телефонной книге.
     *  * Если запись с именем name существует, возвращает список номеров телефона для этой записи.
     *  * Если запись с именем name не существует, возвращает пустой список.
     * @param name
     * @return
     */
    public ArrayList<Integer> find(String name) {
        // Введите свое решение ниже
        if (!phoneBook.containsKey(name)) {
            return new ArrayList<>();
        }
        return phoneBook.get(name);
    }

    /***
     * printPhoneBook(): Выводин отсортированный HashMap по убыванию количества телефоно у одной записи,
     * где ключи - это имена,
     * а значения - списки номеров телефона.
     * @return
     */
    public static void printPhoneBook() {
        // Введите свое решение ниже
        if (!phoneBook.isEmpty()) {
            // Сортировка по убыванию числа телефонов.
            Map<String, List<Integer>> sorted = phoneBook.entrySet().stream()
                    .sorted(comparingInt(e -> -e.getValue().size()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> {
                        throw new AssertionError();
                    }, LinkedHashMap::new));

            System.out.println(sorted);
        } else {
            System.out.println("Телефонная книга пуста");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        PhoneBook myPhoneBook = new PhoneBook();

        myPhoneBook.add("Елена", 2345678);
        myPhoneBook.add("Елена", 3456789);
        myPhoneBook.add("Витя", 3456789);
        myPhoneBook.add("Витя", 2345678);
        myPhoneBook.add("Коля", 2345678);
        myPhoneBook.add("Коля", 4567890);
        myPhoneBook.add("Коля", 5678901);
        myPhoneBook.add("Максим", 5555555);
        myPhoneBook.add("Алексей", 1111111);
        myPhoneBook.add("Алексей", 2222222);
        myPhoneBook.add("Алексей", 3333333);
        myPhoneBook.add("Ольга", 9999999);
        myPhoneBook.add("Ольга", 8888888);
        myPhoneBook.add("Ольга", 7777777);
        myPhoneBook.add("Ольга", 6666666);


        PhoneBook.printPhoneBook();
    }
}


