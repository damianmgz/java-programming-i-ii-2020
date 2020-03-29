
public class Cat extends Animal implements NoiseCapable {

    public Cat() {
        super("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    public void purr() {
        System.out.println(this.getName() + " purrs");
    }
    
    @Override
    public void makeNoise() {
        this.purr();
    }
}
