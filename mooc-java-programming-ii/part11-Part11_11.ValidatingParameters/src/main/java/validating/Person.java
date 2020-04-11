package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("Name must not be null");
        }
        
        if (name.isEmpty()) {
            throw new IllegalArgumentException ("Name must not be empty");
        }
        
        if (name.length() > 40) {
            throw new IllegalArgumentException("Name length maximum 40 chars");
        }
                
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
