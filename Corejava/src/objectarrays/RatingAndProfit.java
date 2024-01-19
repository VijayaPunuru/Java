package objectarrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class RatingAndProfit {

    public static void main(String args[]){

        Movie o1=new Movie(2020,4.3,23456.66,1111223.55);
        Movie o2=new Movie(2022,4.9,34561.66,5678723.55);
        Movie o3=new Movie(1998,4.1,67889.66,6789223.55);

        List<Movie> movies = new ArrayList<>();
        movies.add(o1);
        movies.add(o2);
        movies.add(o3);
        // Sorting by rating
        Collections.sort(movies, new Ratingcomp());
        System.out.println("Movies sorted by rating:");
        for (Movie movie : movies) {
            System.out.println(" - Rating: " + movie.getRating());
        }

        // Sorting by profit
        Collections.sort(movies, new ProfitComp());
        System.out.println("\nMovies sorted by profit:");
        for (Movie movie : movies) {
            System.out.println(" - Profit: " + (movie.getCollectionAmount() - movie.getBudget()));
        }
    }
}
