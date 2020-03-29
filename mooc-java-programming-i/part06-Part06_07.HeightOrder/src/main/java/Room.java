import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.room.add(person);
    }
    
    public boolean isEmpty() {
        if (this.room.size() == 0) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return this.room;
    }
    
    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        Person shortest = new Person("", 300);
        for (Person person:this.room) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        Person taken = this.shortest();
        this.room.remove(this.shortest());
        
        return taken;
    }
    
}
