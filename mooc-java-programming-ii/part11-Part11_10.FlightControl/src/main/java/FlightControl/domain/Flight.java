
package FlightControl.domain;

public class Flight {
    private Plane plane;
    private Airport departure;
    private Airport destination;

    public Flight(Plane plane, Airport departure, Airport destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }

    public Plane getPlane() {
        return plane;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getDestination() {
        return destination;
    }
    
    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.departure + "-" + this.destination + ")";
    }
    
    
}
