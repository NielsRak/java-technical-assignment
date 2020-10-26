package kata.supermarket.discounts;

import java.math.BigDecimal;

public interface Discount {

    public BigDecimal calculate(final BigDecimal price);
}
