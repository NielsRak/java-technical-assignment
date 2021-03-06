package kata.supermarket.discounts;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FlatDiscountTest {

    @Test
    public void zeroTest() throws Exception {
        assertThat("Zero discount is no change",
                (new FlatDiscount(BigDecimal.ZERO)).apply(BigDecimal.ONE),
                is(new BigDecimal("0.00")));
    }

    @Test
    public void nonZeroTest() throws Exception {
        assertThat("Zero discount is no change",
                (new FlatDiscount(new BigDecimal("0.2"))).apply(new BigDecimal("2.0")),
                is(new BigDecimal("0.40")));
    }

    @Test
    public void roundingTest() throws Exception {
        assertThat("Zero discount is no change",
                (new FlatDiscount(new BigDecimal("0.5"))).apply(new BigDecimal("0.49")),
                is(new BigDecimal("0.25")));//0.098
    }
}
