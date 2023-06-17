import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        // hw 1
        List<Object> list = Utilts.oddNames(List.of(
                "Марк",
                "Иван",
                "Глеб",
                "Демьян",
                "Макар",
                "Юрий",
                "Давид",
                "Майкл",
                "Кайл",
                "Ренат"), true);

        System.out.println(list);

        System.out.println("-------------------");
        // hw 2
        list.stream().filter(s -> s instanceof String).toList().stream().map(s -> s.toString().toUpperCase()).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("-------------------");
        // hm 3
        System.out.println(Stream.of("1, 2, 0", "3, 4, 5").flatMap(s -> Arrays.stream(s.split(", ")))
                .map(String::trim)
                .sorted()
                .collect(Collectors.joining(", ")));

        System.out.println("-------------------");
        // hw 4
        Utilts.generateRandomStream(25214903917L, 11L, (long) Math.pow(2, 48)).limit(10).forEach(System.out::println);
        System.out.println("-------------------");
        // hw 5
        Utilts.zip(Stream.of(1, 2, 3, 4, 5), Stream.of(6, 7, 8)).forEach(System.out::println);

    }
}