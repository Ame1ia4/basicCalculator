public class Decibel implements MusicAspects{
    private double audioOutputV;
    private double audioInputV;
    private double decibel;

    @Override
    public void function() {
        this.decibel = 20 * Math.log(this.audioOutputV / this.audioInputV);
        System.out.println("Voltage gain(dB): " + decibel + "dB");
    }
}
