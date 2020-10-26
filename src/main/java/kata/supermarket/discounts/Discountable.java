package kata.supermarket.discounts;

import java.math.BigDecimal;

public interface Discountable {

    BigDecimal calculateDiscount(BigDecimal price);
}
