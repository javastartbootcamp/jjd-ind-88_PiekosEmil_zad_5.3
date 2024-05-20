package pl.javastart.task;

import java.util.Objects;

public class CalculatePriceBrutto {

    double calculate(Product product) {
        double priceBrutto = 0;
        double priceNetto = product.getPrice();
        String category = product.getCategory();
        switch (category) {
            case "Nabiał":
                priceBrutto = priceNetto * 1.05;
                break;
            case "Pieczywo":
                priceBrutto = priceNetto * 1.08;
                break;
            default:
                priceBrutto = priceNetto * 1.23;
        }
        return priceBrutto;
    }
}
