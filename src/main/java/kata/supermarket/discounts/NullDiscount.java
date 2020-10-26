package kata.supermarket.discounts;

import java.math.BigDecimal;

public class NullDiscount implements Discount{

    @Override
    public BigDecimal calculate(BigDecimal price) {
        return BigDecimal.ZERO;
    }
}
