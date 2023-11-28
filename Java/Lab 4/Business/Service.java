package Business;
import Business.interfaces.Profitable;


// Business class representing a service
public class Service implements Profitable {
    private String serviceName;
    private double cost;
    private double revenue;

    public Service(String serviceName, double cost, double revenue) {
        this.serviceName = serviceName;
        this.cost = cost;
        this.revenue = revenue;
    }

    @Override
    public double calculateProfit() {
        return revenue - cost;
    }

    public String getServiceName() {
        return serviceName;
    }
}