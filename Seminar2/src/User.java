import java.util.List;

public class User
{
    private String firstName;
    private String lastName;

    private List<Order> orders;

    public User(String firstName, String lastName, List<Order> orders)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = orders;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public double calculateTotalPriceForOrder()
    {


        return 1;
    }

    public double calculateTotalPriceForAllOrders()
    {

        double sum=0.0;
        for(int i=0;i<orders.size();i++)
        {
            sum+=orders.get(i).calculateTotalPrice();

        }
        return sum;

    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
