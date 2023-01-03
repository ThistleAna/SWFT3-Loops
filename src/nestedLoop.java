public class nestedLoop {
    public static void main(String[] args) {
        // nested loop: consist of an outer loop and one or more inner loops
        // task: to print number 1 0 to 19

        for (int i=1; i <= 1; i++) { // control the first digit
            for (int j=0; j<=9 ; j++){ // control the second digit
                System.out.println(i + " " + j);
            }
        }
    }
}
