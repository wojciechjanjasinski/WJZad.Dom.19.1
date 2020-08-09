import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestMain {

    @Test
    public void shouldReturnTwentyThree() {
        //when
        final int GIVEN_FOR_TEST_PURPOSE = 10;
        final int EXPECTED_VALUE = 23;
        //then
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(GIVEN_FOR_TEST_PURPOSE))
                .isEqualTo(EXPECTED_VALUE);
    }
    @Test
    public void shouldReturnThirtyThree() {
        //when
        final int GIVEN_FOR_TEST_PURPOSE = 11;
        final int EXPECTED_VALUE = 33;
        //then
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(GIVEN_FOR_TEST_PURPOSE))
                .isEqualTo(EXPECTED_VALUE);
    }
    @Test
    public void shouldReturnThirtyThreeByGivenTwelve() {
        //when
        final int GIVEN_FOR_TEST_PURPOSE = 12;
        final int EXPECTED_VALUE = 33;
        //then
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(GIVEN_FOR_TEST_PURPOSE))
                .isEqualTo(EXPECTED_VALUE);
    }
    @Test
    public void shouldReturnFortyFive() {
        //when
        final int GIVEN_FOR_TEST_PURPOSE = 13;
        final int EXPECTED_VALUE = 45;
        //then
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(GIVEN_FOR_TEST_PURPOSE))
                .isEqualTo(EXPECTED_VALUE);
    }
    @Test
    public void shouldReturnSixty() {
        //when
        final int GIVEN_FOR_TEST_PURPOSE = 16;
        final int EXPECTED_VALUE = 60;
        //then
        assertThat(SumOfMultipleThreeAndFiveTogether.generateSumOfMultipleThreeAndFive(GIVEN_FOR_TEST_PURPOSE))
                .isEqualTo(EXPECTED_VALUE);
    }
}
