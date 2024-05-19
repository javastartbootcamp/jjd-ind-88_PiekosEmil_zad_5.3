package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Mleko", "Świeże", 3, "Nabiał");
        Product product2 = new Product("Chleb", "Baltonowski", 6, "Pieczywo");
        Product product3 = new Product("Baton", "Czekoladowy", 2, "Słodycze");

        CalculatePriceBrutto calculatePriceBrutto = new CalculatePriceBrutto();

        switch (product1.getCategory()) {
            case "Nabiał":
                calculatePriceBrutto.calculate8(product1);
                System.out.println(product1.getName() + " " + product1.getDescription() + " " + "Cena brutto: " + product1.getPrice());
                break;
            case "Pieczywo":
                calculatePriceBrutto.calculate5(product1);
                System.out.println(product1.getName() + " " + product1.getDescription() + " " + "Cena brutto: " + product1.getPrice());
                break;
            default:
                calculatePriceBrutto.calculate23(product1);
                System.out.println(product1.getName() + " " + product1.getDescription() + " " + "Cena brutto: " + product1.getPrice());

        }
        switch (product2.getCategory()) {
            case "Nabiał":
                calculatePriceBrutto.calculate8(product2);
                System.out.println(product2.getName() + " " + product2.getDescription() + " " + "Cena brutto: " + product2.getPrice());
                break;
            case "Pieczywo":
                calculatePriceBrutto.calculate5(product2);
                System.out.println(product2.getName() + " " + product2.getDescription() + " " + "Cena brutto: " + product2.getPrice());
                break;
            default:
                calculatePriceBrutto.calculate23(product2);
                System.out.println(product2.getName() + " " + product2.getDescription() + " " + "Cena brutto: " + product2.getPrice());

        }
        switch (product3.getCategory()) {
            case "Nabiał":
                calculatePriceBrutto.calculate8(product3);
                System.out.println(product3.getName() + " " + product3.getDescription() + " " + "Cena brutto: " + product3.getPrice());
                break;
            case "Pieczywo":
                calculatePriceBrutto.calculate5(product3);
                System.out.println(product3.getName() + " " + product3.getDescription() + " " + "Cena brutto: " + product3.getPrice());
                break;
            default:
                calculatePriceBrutto.calculate23(product3);
                System.out.println(product3.getName() + " " + product3.getDescription() + " " + "Cena brutto: " + product3.getPrice());
        }
    }
}
