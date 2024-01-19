package objectarrays;

import java.util.Comparator;

class ProfitComp implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Double.compare((movie1.getCollectionAmount() - movie1.getBudget()), (movie2.getCollectionAmount() - movie2.getBudget()));
    }
}
