import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StartServiceTest {

    @Test
    public void shouldSum() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMax() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxSalesMonth(sales);
        long expected = 7;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindMin() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minSalesMonth(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindAboveAverage() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.aboveAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindBelowAverage() {
        StartService service = new StartService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.belowAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}
