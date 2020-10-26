package kata.supermarket;

import kata.supermarket.discounts.Discount;
import kata.supermarket.discounts.Discountable;
import kata.supermarket.discounts.NullDiscount;

import java.math.BigDecimal;

public class WeighedProduct implements Discountable {

    private final BigDecimal pricePerKilo;
    private final Discount discount;

    public WeighedProduct(final BigDecimal pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
        this.discount = new NullDiscount();
    }

    BigDecimal pricePerKilo() {
        return pricePerKilo;
    }

    public Item weighing(final BigDecimal kilos) {
        return new ItemByWeight(this, kilos);
    }

    @Override
    public BigDecimal calculateDiscount(final BigDecimal price) {
        return discount.calculate(price);
    }
}
