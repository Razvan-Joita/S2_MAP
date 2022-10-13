import java.util.List;

public class HorrorMovies extends Movie{
    private static final double basePrice = 0;

    public HorrorMovies(String title, int jahr, double rating, List<String> cast) {
        super(title, jahr, rating, cast, basePrice);
    }

    @Override
    public double calculatePrice()
    {

        return getBasePrice()*0.9;

    }
}
