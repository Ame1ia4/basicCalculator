import java.util.Scanner;

public class Decibel implements MusicFunctions{
    Scanner input = new Scanner(System.in);
    private double audioOutputV;
    private double audioInputV;
    private double decibel;

    //polymorphism, overriding MusicFunctions interface
    @Override
    public void function() {
        System.out.println("Enter audio output voltage: ");
        this.audioOutputV = input.nextInt();

        System.out.println("Enter audio input voltage: ");
        this.audioInputV = input.nextInt();

        //calculating the decibel(Voltage gain) and printing it to the terminal
        this.decibel = 20 * Math.log(this.audioOutputV / this.audioInputV);
        System.out.println("Voltage gain(dB): " + decibel + "dB");
    }
}
