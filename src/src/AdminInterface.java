import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class AdminInterface {
    private Scanner scanner;
    private Database data;

    public AdminInterface(Scanner scanner, Database data) {
        this.data = new Database();

    }
    public void start(){
        while (true){
            System.out.print("What would you like to do?\n " +
                    "1 -- to add Movies\n" +
                    "2 -- to add Show\n"+
                    "3 -- to change prices\n");

            int input = HelpMethods.askForInt(scanner);

            switch (input){
                case 1 -> addMovie();
                case 2 -> addShow();
            }
        }
    }

    public void addMovie(){

        System.out.println("Movie title?");
        String title = scanner.nextLine();;

        System.out.println("Shortname?");
        String shortname = scanner.nextLine();

        System.out.println("Duration?");
        int duration = HelpMethods.askForInt(scanner);

        System.out.println("Price?");
        int price = HelpMethods.askForInt(scanner);

        Movie movie = new Movie(title, shortname, duration, price);
        data.addMovie(movie);


    }
    public void listMovieList(){
        System.out.println("These are The films: please select the film with the Number:");
        for (int i = 0; i < data.getMovieList().size();i++){
            System.out.println(i + " " + data.getMovieList().get(i));

        }
    }
    public void addShow(){
        listMovieList();

        System.out.println("Which film would you like to add?");
        int index = HelpMethods.askForInt(scanner);
        Movie movie = data.getMovieList().get(index);

        System.out.println("On which date?");
        LocalDate date = HelpMethods.askForDate(scanner);

        System.out.println("On which time does the movie Start?");
        LocalTime time = HelpMethods.askForTime(scanner);

        System.out.println("Which room?");
        int roomNumber = HelpMethods.askForInt(scanner);
        Room room = new Room(roomNumber);

        Show show = new Show(date,time,movie,room);
        for(Show a : data.getShowList()){
            checkPause(show,a);
            checkPause(a,show);
        }
        data.addMovie(movie);

    }
    public void setPrice(){
        listMovieList();

        System.out.println("For which movie would you like to change the Price? Use index please");
        int index = HelpMethods.askForInt(scanner);
        Movie movie = data.getMovieList().get(index);

        System.out.println("Which Price would you like to set for the Movie?");
        int newPrice = HelpMethods.askForInt(scanner);
        movie.setPrice(newPrice);

    }
    public void checkPause(Show show1, Show show2){

        if (show1.getStartTime().plusMinutes(show1.getMovie().getDuration()+15).isAfter(show2.getStartTime())){
            throw new IllegalArgumentException("There need to be  at least 15 minutes between the end of a Movie and the Start of the next one in the Same room");
        }

    }



}

