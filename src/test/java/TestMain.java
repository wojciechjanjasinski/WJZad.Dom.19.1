import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestMain {

    @Test
    public void shouldReturnTwentyThree() {
        //given
        final int givenForTestPurpose = 10;
        final int expectedValue = 23;
        //then
        SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //when
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose))
                .isEqualTo(expectedValue);
    }
    @Test
    public void shouldReturnThirtyThree() {
        //given
        final int givenForTestPurpose = 11;
        final int expectedValue = 33;
        //then
        SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //when
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose))
                .isEqualTo(expectedValue);
    }
    @Test
    public void shouldReturnThirtyThreeByGivenTwelve() {
        //given
        final int givenForTestPurpose = 12;
        final int expectedValue = 33;
        //then
        SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //when
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose))
                .isEqualTo(expectedValue);
    }
    @Test
    public void shouldReturnFortyFive() {
        //given
        final int givenForTestPurpose = 13;
        final int expectedValue = 45;
        //then
        SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //when
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose))
                .isEqualTo(expectedValue);
    }
    @Test
    public void shouldReturnSixty() {
        //given
        final int givenForTestPurpose = 16;
        final int expectedValue = 60;
        //then
        SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose);
        //when
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(givenForTestPurpose))
                .isEqualTo(expectedValue);
    }
}
