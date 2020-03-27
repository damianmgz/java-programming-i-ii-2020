
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
          
    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }
    
    public int price() {
        return this.squares * this.princePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.price() - compared.price());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return this.price() > compared.price();
    }

}
