package kata.supermarket.discounts;

import java.math.BigDecimal;

public class NullDiscount implements Discount{
    @Override
    public BigDecimal apply(BigDecimal undiscountedCost) {
        return BigDecimal.ZERO;
    }
}
