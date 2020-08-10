import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestMain {

    @Test
    public void shouldReturnTwentyThree() {
        //given
        final int givenForTestPurpose = 10;


        //then
        final int expectedValue = 23;
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);

        //when
        assertThat(sum)
                .isEqualTo(expectedValue);
    }
    @Test
    public void shouldReturnThirtyThree() {
        //given
        final int givenForTestPurpose = 11;


        //then
        final int expectedValue = 33;
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);

        //when
        assertThat(sum)
                .isEqualTo(expectedValue);
    }
    @Test
    public void shouldReturnThirtyThreeByGivenTwelve() {
        //given
        final int givenForTestPurpose = 12;


        //then
        final int expectedValue = 33;
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);

        //when

        assertThat(sum)
                .isEqualTo(expectedValue);
    }
    @Test
    public void shouldReturnFortyFive() {
        //given
        final int givenForTestPurpose = 13;


        //then
        final int expectedValue = 45;
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);

        //when

        assertThat(sum)
                .isEqualTo(expectedValue);
    }
    @Test
    public void shouldReturnSixty() {
        //given
        final int givenForTestPurpose = 16;


        //then
        final int expectedValue = 60;
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);

        //when

        assertThat(sum)
                .isEqualTo(expectedValue);
    }
}
