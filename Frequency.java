import java.util.Scanner;
import java.util.InputMismatchException; // for later use in catch blocks to ensure user inputs numbers

public class Frequency implements MusicFunctions {
    Scanner input = new Scanner(System.in);
    private double numberOfCycles;
    private double cycleTime;
    private double frequency;

    //polymorphism, overriding MusicFunctions interface
    @Override
    public void function() {
        //Set up a boolean to control the while loop used to deal with exceptions expected.
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Enter number of cycles of a periodic signal: ");
                this.numberOfCycles = input.nextInt();
                //Make sure the input for number of cycles is greater than 0
                if (this.numberOfCycles <= 0) {
                    throw new IllegalArgumentException("!Error! The number of cycles must be greater than 0. Please try again!");
                }

                System.out.println("Enter cycle completion time: ");
                this.cycleTime = input.nextInt();
                //Make sure the input for cycle completion is greater than 0
                if (this.cycleTime <= 0) {
                    throw new IllegalArgumentException("!Error! The number of cycles must be greater than 0. Please try again!");
                }
                //calculates frequency and prints to the terminal
                this.frequency = numberOfCycles / cycleTime; //frequency conversion formula = f=1/T number of cycles divided by cycle completion time
                System.out.println("Frequency: " + frequency + "Hz");
                validInput = true; //end while loop
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                input.nextLine(); // Clear the input buffer
            } catch (InputMismatchException e) {
                System.out.println("!Error! Values entered must be numeric! Please try again."); //catch block for non-numeric input
                input.nextLine(); // Clear the input buffer

            }
        }
    }
}

