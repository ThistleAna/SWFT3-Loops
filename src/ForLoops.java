public class ForLoops {
    public static void main(String[] args) {

        // for loop = repeat the statement several times, value is fixed
        for (int counter=1; counter <=10; counter++) {
            // body of the for loops
            System.out.println(counter + " : Kick the enemy!"); // counter = 10+1 = 11
        }

        // while loop= execute the code inside the body as long as the condition is true
        int i = 11;
        while (i <= 10) {
            // repeat this content
            System.out.println( "While loop counter i is " + i);
            // update the counter
            i++;
        }

        // Do...While = repeat the condition at least once before checking the condition
        int j=11;
        do {
            System.out.println(" Do While loop counter j is " + j);
            j++; // j = j+2;
        } while (j <= 10);





    }
}
