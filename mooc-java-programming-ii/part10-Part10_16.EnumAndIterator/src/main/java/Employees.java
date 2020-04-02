
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {

    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.list = peopleToAdd;
    }

    public void fire(Education education) {
        Iterator<Person> iterator = this.list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }

    public void print() {
        this.list.stream().forEach(person -> System.out.println(person));
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.list.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }
}
