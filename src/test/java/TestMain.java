import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestMain {

    @Test
    public void shouldReturnTwentyThree() {
        //given
        final int givenForTestPurpose = 10;
        //when
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //then
        final int expectedValue = 23;
        assertThat(sum)
                .isEqualTo(expectedValue);
    }

    @Test
    public void shouldReturnThirtyThree() {
        //given
        final int givenForTestPurpose = 11;
        //when
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //then
        final int expectedValue = 33;
        assertThat(sum)
                .isEqualTo(expectedValue);
    }

    @Test
    public void shouldReturnThirtyThreeByGivenTwelve() {
        //given
        final int givenForTestPurpose = 12;
        //when
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //then
        final int expectedValue = 33;
        assertThat(sum)
                .isEqualTo(expectedValue);
    }

    @Test
    public void shouldReturnFortyFive() {
        //given
        final int givenForTestPurpose = 13;
        //when
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //then
        final int expectedValue = 45;
        assertThat(sum)
                .isEqualTo(expectedValue);
    }

    @Test
    public void shouldReturnSixty() {
        //given
        final int givenForTestPurpose = 16;
        //when
        int sum = SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //then
        final int expectedValue = 60;
        assertThat(sum)
                .isEqualTo(expectedValue);
    }
}
