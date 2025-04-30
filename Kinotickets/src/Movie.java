public class Movie {
    private String movieName;
    private String shortName;
    private int duration;
    private int price;

    public Movie(String movieName, String shortName, int duration, int price) {
        this.movieName = movieName;
        this.shortName = shortName;
        this.duration = duration;
        this.price = price;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getShortName() {
        return shortName;

    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }
}
