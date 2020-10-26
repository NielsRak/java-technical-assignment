package kata.supermarket;

import kata.supermarket.discounts.Discount;
import kata.supermarket.discounts.Discountable;
import kata.supermarket.discounts.NullDiscount;

import java.math.BigDecimal;

public class Product implements Discountable {

    private final BigDecimal pricePerUnit;
    private final Discount discount;

    public Product(final BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
        this.discount = new NullDiscount();
    }

    public Product(final BigDecimal pricePerUnit, final Discount discount) {
        this.pricePerUnit = pricePerUnit;
        this.discount = discount;
    }

    BigDecimal pricePerUnit() {
        return pricePerUnit;
    }

    public BigDecimal calculateDiscount(BigDecimal price) {
        return discount.calculate(price);
    }

    public Item oneOf() {
        return new ItemByUnit(this);
    }
}
