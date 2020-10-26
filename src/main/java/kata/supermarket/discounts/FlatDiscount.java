package kata.supermarket.discounts;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class FlatDiscount implements Discount {

    private BigDecimal rate;

    public FlatDiscount(BigDecimal rate) throws BadDiscountException {
        if (rate.compareTo(BigDecimal.ONE) > 0 ){
            throw new BadDiscountException("Discount rate is > 1: " + rate.toString());
        }
        this.rate = BigDecimal.ONE.subtract(rate);
    }

    @Override
    public BigDecimal apply(BigDecimal undiscountedCost) {
        return undiscountedCost.multiply(rate).setScale(2, RoundingMode.HALF_UP);
    }
}
