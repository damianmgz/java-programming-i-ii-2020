
public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euro/month";
    }
    
}
