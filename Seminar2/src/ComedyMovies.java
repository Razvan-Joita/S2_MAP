import java.util.List;

public class ComedyMovies extends Movie{
    public ComedyMovies(String title, int jahr, double rating, List<String> cast, double basePrice) {
        super(title, jahr, rating, cast, basePrice);
    }

    @Override
    public double calculatePrice()
    {
        return 0.0;

    }


}

