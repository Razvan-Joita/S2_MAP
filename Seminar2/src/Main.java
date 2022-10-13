import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        List<String> cast=new ArrayList<>();
        cast.add("Jack Nickolson");
        cast.add("Smiley Duvall");
        cast.add("Andu");


        //System.out.println("Hello world!");
        Movie theShining=new HorrorMovies("The Shinning",1980,4,new ArrayList<>(List.of(new String[]{"Joita Razvan", "Andrei"})));


        OrderLine ol1=new OrderLine(theShining,5);
        OrderLine orderLine=new OrderLine(theShining,2);
        List<OrderLine> arr_o1=new ArrayList<OrderLine>();
        arr_o1.add(ol1);



        Date date=new Date(2022, Calendar.OCTOBER,20);

        Order  o1=new Order(date,arr_o1);


        List<Order> arr_o2=new ArrayList<Order>();
        arr_o2.add(o1);




        User u1=new User("Razvan","Joita",arr_o2);

        System.out.println(u1.calculateTotalPriceForOrder());




        System.out.println();



    }
}

