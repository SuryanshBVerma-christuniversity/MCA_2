
public class Business {
    public static void main(String[] args) {
        // Instantiate objects and demonstrate functionality
        Store store = new Store("SuperMart", "Main Street", "Grocery");
        store.displayInfo();

        SalesProcess salesProcess = new SalesProcess();
        salesProcess.execute();

        FinalClass finalObj = new FinalClass(42);
        finalObj.displayValue();
    }
}


// A generic business entity
class BusinessEntity {
    protected String name;
    protected String location;

    public BusinessEntity(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
    }   
}

// Derived class representing a specific type of business entity (e.g., a store)
class Store extends BusinessEntity {
    private String category;

    public Store(String name, String location, String category) {
        super(name, location);
        this.category = category;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category: " + category);
    }
}

// Abstract class 
abstract class BusinessProcess {
    public abstract void execute();
}

class SalesProcess extends BusinessProcess {
    @Override
    public void execute() {
        System.out.println("Executing sales process.");
    }
}

final class FinalClass {
    private int value;

    public FinalClass(int value) {
        this.value = value;
    }

    public void displayValue() {
        System.out.println("Value: " + value);
    }
}

// Attempting to inherit from FinalClass will result in a compilation error
// class AnotherClass extends FinalClass {
//     // ...
// }


