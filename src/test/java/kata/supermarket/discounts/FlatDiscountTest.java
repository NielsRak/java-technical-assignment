package kata.supermarket.discounts;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FlatDiscountTest {

    @Test
    public void simpleRate() {
        assertThat("simple rate calculation",
                new FlatDiscount(new BigDecimal("0.2")).calculate(new BigDecimal("2.00")),
                is(new BigDecimal("0.40")));
    }

    @Test
    public void zeroRate() {
        assertThat("simple rate calculation",
                new FlatDiscount(new BigDecimal("0")).calculate(new BigDecimal("2.00")),
                is(new BigDecimal("0.00")));
    }

    @Test
    public void rounding() {
        assertThat("simple rate calculation",
                new FlatDiscount(new BigDecimal("0.2")).calculate(new BigDecimal("0.49")),
                is(new BigDecimal("0.10")));
    }
}
