//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class m4 {
    public static void main(String[] args) {
       // List list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Type (A for Action, T for thriller, C for comedy, or Q to quit): ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title: ");
            String title = scanner.nextLine();
            movie Movie = movie.getMovie(type, title); //Polymorphism
            Movie.watchMovie(); //Polymorphism
        }

        //movie theMovie = movie.getMovie("action", "Dark Knight");
        //theMovie.watchMovie();

    }
}
