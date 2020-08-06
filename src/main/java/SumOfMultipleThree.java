import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfMultipleThree {

    public static void generateSumOfMultipleThree() {
        long integerList = Stream
                .iterate(3, number-> number<1000, number -> number + 3)
                .mapToInt(Integer::intValue).sum();
        System.out.println(integerList);

    }
}
