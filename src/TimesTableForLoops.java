// import Scanner
import java.util.Scanner;

public class TimesTableForLoops {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println ("What times table would you like? : ");
        //Asks for user input of which Times table is required
        int timesTable = reader.nextInt();
        for (int i = 1; i <= 12; i++) {
            // looping from 1 to the range = 12 to print the
            // multiplication table of the number.
            // printing the n*i,ie ‘i'th multiple of n.
            System.out.println(timesTable + " * " + i + " = " + timesTable * i);
        }
    }
}
