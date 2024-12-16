public class Frequency implements MusicAspects{
private double numberOfCycles;
private double cycleTime;
private double frequency;


public Frequency(double numberOfCycles, double cycleTime){
    this.numberOfCycles = numberOfCycles;
    this.cycleTime = cycleTime;
}

    @Override
    public void frequencyConversion() {
        this.frequency = numberOfCycles / cycleTime;
        System.out.println("Frequency: " + frequency + "Hz");
    }

    @Override
    public void pitchConversion() {

    }
}
//frequency conversion formula = f=1/T number of cycles divided by cycle completion time