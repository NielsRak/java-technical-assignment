package kata.supermarket;

import kata.supermarket.discounts.Discount;
import kata.supermarket.discounts.NullDiscount;

import java.math.BigDecimal;

public class ItemByWeight implements Item {

    private final WeighedProduct product;
    private final BigDecimal weightInKilos;
    private final Discount discount;

    ItemByWeight(final WeighedProduct product, final BigDecimal weightInKilos) {
        this.product = product;
        this.weightInKilos = weightInKilos;
        this.discount = new NullDiscount();
    }

    ItemByWeight(final WeighedProduct product, final BigDecimal weightInKilos, final Discount discount) {
        this.product = product;
        this.weightInKilos = weightInKilos;
        this.discount = discount;
    }

    public BigDecimal price() {
        return product.pricePerKilo().multiply(weightInKilos).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public BigDecimal discount() {
        return discount.apply(price());
    }
}
