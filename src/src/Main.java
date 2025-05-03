import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class Main {
    private UserInterface ui;
    private Scanner scanner;
    private AdminInterface ai;
    private Database data;
    public Main() {
        scanner = new Scanner(System.in);
        data = new Database();
        ui = new UserInterface(scanner,data);
        ai = new AdminInterface(scanner,data);


    }

    public static void main(String[] args) {
        Main program = new Main();
        program.whichUser();
    }

    public void whichUser() {
        System.out.print("For User interface type 1, for AdminInterface type 2");

        int input = HelpMethods.askForInt(scanner);

        switch (input) {
            case 1 -> ui.start();
            case 2 -> ai.start();
            default -> System.out.println("Ungültige Eingabe");
        }
    }
}
