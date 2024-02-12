import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Заполнить список названиями планет Солнечной
 * системы в произвольном порядке с повторениями.
 * <p>
 * Вывести название каждой планеты и количество его
 * повторений в списке
 *
 */
public class ThirdTask {

    private static List<String> planets = List.of("Меркурий", "Венера", "Земля", "Венера", "Марс", "Земля",
            "Земля", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон", "Марс", "Марс");

    public static void solvation() {
        List<String> uniquePlanets = new ArrayList<>();
        for (String planet : planets) {
            if (!uniquePlanets.contains(planet)) {
                uniquePlanets.add(planet);
            }
        }

        for (String planet : uniquePlanets) {
            int frequency = Collections.frequency(planets, planet);
            System.out.println(planet + " : " + frequency);
        }
    }
}
