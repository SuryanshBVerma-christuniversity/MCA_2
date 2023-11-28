import Business.BusinessPackage;
import Business.Product;
import Business.Service;

public class Main {
    
    public static void main(String[] args) {
        
        // Creating a product
        Product product = new Product("Widget", 50.0, 100.0);
        System.out.println("Product: " + product.getProductName());
        System.out.println("Profit: $" + product.calculateProfit());

        System.out.println();

        // Creating a service
        Service service = new Service("Consulting", 200.0, 500.0);
        System.out.println("Service: " + service.getServiceName());
        System.out.println("Profit: $" + service.calculateProfit());

        System.out.println();
        
        // Creating a business package
        BusinessPackage demo = new BusinessPackage();
        demo.performBusinessFunction();
    }
}
