import java.util.Scanner;
import java.util.InputMismatchException; // for later use in catch blocks to ensure user inputs numbers

public class Decibel implements MusicFunctions {
    Scanner input = new Scanner(System.in);
    private double audioOutputV;
    private double audioInputV;
    private double decibel;

    //polymorphism, overriding MusicFunctions interface
    @Override
    public void function() {
        //set up boolean to control while loop used to deal with exceptions expected
        boolean validInput = false;
        //while loop for Input
        while (!validInput) {
            try {
                System.out.println("Enter audio output voltage: ");
                this.audioOutputV = input.nextInt();

                if (this.audioOutputV <= 0) {
                    throw new IllegalArgumentException("Error! The audio output must be greater than 0. Please try again!");
                } // Gives user an error if audio output is not greater than 0

                System.out.println("Enter audio input voltage: ");
                this.audioInputV = input.nextInt();

                if (this.audioInputV <= 0) {
                    throw new IllegalArgumentException("Error! The audio input must be greater than 0. Please try again!");
                } // Gives user an error if audio input is not greater than 0

                //calculating the decibel(Voltage gain) and printing it to the terminal
                this.decibel = 20 * Math.log(this.audioOutputV / this.audioInputV);
                System.out.println("Voltage gain(dB): " + decibel + "dB");
                validInput = true; //end while loop
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                input.nextLine(); // Clear the input buffer
            } catch (InputMismatchException e) {
                System.out.println("!Error! Values entered must be numeric! Please try again."); // catch block for non-numeric input
                input.nextLine(); // Clear the input buffer
            }
        }
    }
}
