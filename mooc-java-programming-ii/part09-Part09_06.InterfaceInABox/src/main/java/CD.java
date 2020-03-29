
public class CD implements Packable {
    private String artist;
    private String name;
    private int year;
    private final double weight;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.year +")";
    }
}
