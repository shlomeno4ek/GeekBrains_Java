import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Пройти по списку из предыдущего задания и удалить
 * повторяющиеся элементы.
 */
public class ThirdTaskInAddition {

    private List<String> planets = new ArrayList<>();

    public ThirdTaskInAddition() {
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Марс");
        planets.add("Марс");
    }

    public void removeRepeated() {
        System.out.println(planets);
        Iterator<String> iterator = planets.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (Collections.frequency(planets, next) > 1) {
                iterator.remove();
            }
        }
        System.out.println(planets);
        // ["Меркурий", "Венера", "Земля", "Венера"]
    }
}
