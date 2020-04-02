
public class Book {
    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return name;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }
        
    @Override
    public String toString() {
        return this.getName() + "(recommended for " + this.getAgeRecommendation() + " years-old or older)";
    }
}
