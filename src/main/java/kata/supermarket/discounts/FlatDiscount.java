package kata.supermarket.discounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlatDiscount implements Discount {

    private final  BigDecimal rate;

    public FlatDiscount(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(rate).setScale(2, RoundingMode.HALF_UP);
    }
}
