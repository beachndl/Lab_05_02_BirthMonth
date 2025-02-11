import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        int userMonth = 0;
        String trash = "";

        // Get user input
        System.out.print("Please enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            // Safe to read in an integer
            userMonth = in.nextInt();
            in.nextLine(); // Clear the buffer

            // Process and output
            if (userMonth >=1 && userMonth <= 12) {
                System.out.println("Your birth month is: " + userMonth);
            } else {
                System.out.println("You entered an incorrect month value: " + userMonth);
            }
        } else {
            // Not an integer, cannot use nextInt()
            trash = in.nextLine(); // Read input as String
            System.out.println("You entered an incorrect month value: " + trash);
        }
    }
}