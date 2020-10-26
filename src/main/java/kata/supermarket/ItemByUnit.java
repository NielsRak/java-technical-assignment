package kata.supermarket;

import java.math.BigDecimal;
import java.math.RoundingMode;

/** line item for the Basket **/
public class ItemByUnit implements Item {

    private final Product product;
    private final int units;

    ItemByUnit(final Product product) {
        this.product = product;
        this.units = 1;
    }

    ItemByUnit(final Product product, int units) {
        this.product = product;
        this.units = units;
    }

    public BigDecimal price() {
        return product.pricePerUnit().multiply(new BigDecimal(units)).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public BigDecimal discount() {
        return product.calculateDiscount(price());
    }
}
