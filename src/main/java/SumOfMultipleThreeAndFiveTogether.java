
import java.util.stream.IntStream;

public class SumOfMultipleThreeAndFiveTogether {

    public static int generateSumOfMultipleThreeAndFive(int limitFromUser) {
        return IntStream.range(0, limitFromUser)
                .filter(number -> number % 3 ==0 || number % 5 == 0)
                .sum();
    }
}
