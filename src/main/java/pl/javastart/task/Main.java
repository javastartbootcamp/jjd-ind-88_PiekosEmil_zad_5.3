package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Mleko", "Świeże", 2.9, "Nabiał");
        Product product2 = new Product("Chleb", "Baltonowski", 6, "Pieczywo");
        Product product3 = new Product("Baton", "Czekoladowy", 2, "Słodycze");

        CalculatePriceBrutto calculatePriceBrutto = new CalculatePriceBrutto();
        product1.printFullInfo();
        System.out.println(" Cena brutto: " + calculatePriceBrutto.calculate(product1) + "zł");
        product2.printFullInfo();
        System.out.println(" Cena brutto: " + calculatePriceBrutto.calculate(product2) + "zł");
        product3.printFullInfo();
        System.out.println(" Cena brutto: " + calculatePriceBrutto.calculate(product3) + "zł");

    }
}
