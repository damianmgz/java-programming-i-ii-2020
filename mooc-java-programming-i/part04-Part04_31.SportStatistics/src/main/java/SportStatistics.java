
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Matchs> matchs = new ArrayList<>();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(",");
                String home = parts[0];
                String away = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);
                matchs.add(new Matchs(home, away, homeScore, awayScore));
                
            }
        } catch (Exception e) {
            System.out.println("Error file");
        }
        
        int count = 0;
        int wins = 0;
        int losses = 0;
        
        for (Matchs match:matchs) {
            String test = match.toString();
            if (test.contains(team)) {
                count++;
                if (match.winner().equals(team)) {
                    wins++;
                } else {
                    losses++;
                }
            }
            
        }
        
        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}
