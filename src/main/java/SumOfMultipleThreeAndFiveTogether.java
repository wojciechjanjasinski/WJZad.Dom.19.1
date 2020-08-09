
import java.util.stream.Stream;

public class SumOfMultipleThreeAndFiveTogether {

    public static int generateSumOfMultipleThreeAndFive(int numberFromUser) {
        int sum = Stream
                .iterate(0, number-> number<numberFromUser, number -> number + 1)
                .filter(number -> number % 3 ==0 || number % 5 == 0)
                .mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        return sum;
    }

}
