import java.util.ArrayList;

public class Customer {
    private 
        int id;
        String Name;
        ArrayList<String> cart= new ArrayList<String>();

    Customer(int id, String Name){
        this.id = id;
        this.Name = Name;
    }

    // To add single item
    public void addItem(String item){
        cart.add(item);
    }

    // To add multiple items at once (Method Overloading)
    public void addItem(String item[]){
        
        for(int i = 0; i < item.length; i++){
            cart.add(item[i].strip());
        }
        
    }

    public void displayCart(){
        System.out.println("\nYour Cart :");

        for(String Name : cart){
            System.out.println(Name);
        }
    }

    void displayCustomerDetails(){
        System.out.println("\nYour Details :");
        String id = String.format("Id : %s", this.id);
        String Name = String.format("Name : %s", this.Name);
        System.out.println(id);
        System.out.println(Name);
    }

    void updateCustomerDetails(int id, String Name){
        this.id = id;
        this.Name = Name;
    }
}