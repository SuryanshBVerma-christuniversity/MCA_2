package Business;
import Business.interfaces.*;

// Business class representing a product
public class Product implements Profitable {
    private String productName;
    private double cost;
    private double price;

    public Product(String productName, double cost, double price) {
        this.productName = productName;
        this.cost = cost;
        this.price = price;
    }

    @Override
    public double calculateProfit() {
        return price - cost;
    }

    public String getProductName() {
        return productName;
    }
}