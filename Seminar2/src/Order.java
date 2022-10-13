import java.util.Date;
import java.util.List;

public class Order
{
    private Date orderDate;
    private List<OrderLine> orderLines;

    public double calculateTotalPrice()
    {
        double total=0;
        for(OrderLine o:this.orderLines)
        {
            total+=o.calculatePrice();
        }
        return total;
    }

    public Order(Date orderDate, List<OrderLine> orderLines) {
        this.orderDate = orderDate;
        this.orderLines = orderLines;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
