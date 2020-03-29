
public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }

    public void addObservation() {
        this.observations++;
    }
    
    public String toString() {
        return this.name + "(" + this.latinName + "): " + this.observations + " observations";
    }
    
}
