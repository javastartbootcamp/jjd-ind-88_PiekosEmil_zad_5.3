package pl.javastart.task;

public class CalculatePriceBrutto {

    void calculate23(Product product) {
        product.setPrice(product.getPrice() * 1.23);
    }

    void calculate8(Product product) {
        product.setPrice(product.getPrice() * 1.08);
    }

    void calculate5(Product product) {
        product.setPrice(product.getPrice() * 1.05);
    }

}
