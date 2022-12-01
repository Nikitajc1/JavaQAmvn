import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.BonusService;


public class BonuseServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void shouldCalculateForRegisteredAndUnderLimit(long amount, long expected, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data2.csv")
    public void shouldCalculateForRegisteredAndOverLimit(long amount, long expected, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data3.csv")
    public void shouldCalculateForUnRegisteredAndUnderLimit(long amount, long expected, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data4.csv")
    public void shouldCalculateForUnRegisteredAndOverLimit(long amount, long expected, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data5.csv")
     public void checkNegativeForRegisteredAndUnderLimit(long amount, long expected, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }


}
