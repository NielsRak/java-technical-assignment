package kata.supermarket;

import kata.supermarket.discounts.Discountable;

import java.math.BigDecimal;

public class WeighedProduct implements Discountable {

    private final BigDecimal pricePerKilo;

    public WeighedProduct(final BigDecimal pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    BigDecimal pricePerKilo() {
        return pricePerKilo;
    }

    public Item weighing(final BigDecimal kilos) {
        return new ItemByWeight(this, kilos);
    }

    @Override
    public BigDecimal calculateDiscount() {
        return BigDecimal.ZERO;
    }
}
