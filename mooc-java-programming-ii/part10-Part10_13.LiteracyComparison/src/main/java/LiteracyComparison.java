
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String[]> list = read("literacy.csv");

        list.stream()
                .sorted((l1, l2) -> {
                    return Double.compare(Double.valueOf(l1[5]), Double.valueOf(l2[5]));
                })
                .forEach(line -> System.out.println(line[3] + " (" + line[4] + "), " + line[2] + ", " + line[5]));

    }

    public static ArrayList<String[]> read(String file) {
        ArrayList<String[]> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(line -> line.split(","))
                    .forEach(part -> list.add(part));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String[] line : list) {
            line[2] = line[2].trim();
            String[] gender = line[2].split(" ");
            line[2] = gender[0];            
        }

        return list;
    }
}
