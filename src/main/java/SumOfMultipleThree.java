
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfMultipleThree {

    public static List<Integer> generateListOfMultipleThree() {
        List<Integer> integerList = Stream
                .iterate(0, number -> number < 1000, number -> number + 3)
                .collect(Collectors.toList());
        System.out.println(integerList);
        return integerList;
    }
    public static void generateSumOfMultipleThree() {
        long integerList = Stream
                .iterate(0, number-> number<1000, number -> number + 3)
                .mapToInt(Integer::intValue).sum();
        System.out.println(integerList);

    }

    public static List<Integer> generateListOfMultipleFive() {
        List<Integer> integerList = Stream
                .iterate(0, number -> number < 1000, number -> number + 5)
                .collect(Collectors.toList());
        System.out.println(integerList);
        return integerList;
    }

    public static void generateSumOfMultipleFive() {
        long integerList = Stream
                .iterate(0, number-> number<1000, number -> number + 5)
                .mapToInt(Integer::intValue).sum();
        System.out.println(integerList);

    }
}
