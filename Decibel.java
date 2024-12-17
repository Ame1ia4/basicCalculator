import java.util.Scanner;

public class Decibel implements MusicAspects{
    Scanner input = new Scanner(System.in);
    private double audioOutputV;
    private double audioInputV;
    private double decibel;

    @Override
    public void function() {
        System.out.println("Enter audio output voltage: ");
        this.audioOutputV = input.nextInt();

        System.out.println("Enter audio input voltage: ");
        this.audioInputV = input.nextInt();


        this.decibel = 20 * Math.log(this.audioOutputV / this.audioInputV);
        System.out.println("Voltage gain(dB): " + decibel + "dB");
    }
}
