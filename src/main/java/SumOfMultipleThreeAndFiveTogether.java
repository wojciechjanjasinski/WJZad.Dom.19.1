
import java.util.stream.IntStream;

public class SumOfMultipleThreeAndFiveTogether {

    public static int generateSumOfMultipleThreeAndFive(int limit) {
        return IntStream.range(0, limit)
                .filter(number -> number % 3 == 0 || number % 5 == 0)
                .sum();
    }
}
