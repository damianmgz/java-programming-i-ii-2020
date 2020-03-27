
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
       
    public void eat() {
        System.out.println(this.getName() + " eats");
    }
    
    public void sleep() {
        System.out.println(this.getName() + " sleeps");
    }
}
