import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class MaxxRunner {
    public static void main(String[] args) {
        List<String> films = Arrays.asList("Matrix", "Abyss", "Predator");
        String longestTitle = Max.max(films, new LengthComparator());
        System.out.println(longestTitle);

        List<LocalDate> date = Arrays.asList(
                LocalDate.of(2005, 4, 3),
                LocalDate.of(1984, 4, 18),
                LocalDate.of(1979, 8, 8));
        LocalDate lastDate = Max.max(date, new DayInYearComparator());
        System.out.println(lastDate);
    }
}
