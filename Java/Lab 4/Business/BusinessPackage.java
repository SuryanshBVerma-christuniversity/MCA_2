package Business;
import Business.interfaces.*;

// BusinessPackageDemo demonstrates the usage of the business package and interface
public class BusinessPackage implements BusinessInterface {

    @Override
    public void performBusinessFunction() {
        System.out.println("Executing business function...");
        // Add your business logic here
    }

    public static void main(String[] args) {
        
    }
}