import java.util.Scanner;

public class Frequency implements MusicFunctions{
    Scanner input = new Scanner(System.in);
private double numberOfCycles;
private double cycleTime;
private double frequency;

    @Override
    public void function() {

    System.out.println("Enter number of cycles: ");
    this.numberOfCycles = input.nextInt();

    System.out.println("Enter cycle completion time");
    this.cycleTime = input.nextInt();

        this.frequency = numberOfCycles / cycleTime;
        System.out.println("Frequency: " + frequency + "Hz");
    }

}
//frequency conversion formula = f=1/T number of cycles divided by cycle completion time