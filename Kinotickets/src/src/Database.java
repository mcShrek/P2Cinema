import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Movie> movieList = new ArrayList<>();
    private List<Show> showList = new ArrayList<>();

    public List<Movie> getMovieList() {
        return movieList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void addShow(Show show) {
        showList.add(show);
    }
}
