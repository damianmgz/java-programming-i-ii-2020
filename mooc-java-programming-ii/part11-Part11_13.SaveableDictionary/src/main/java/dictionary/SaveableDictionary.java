package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.PrintWriter;

public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try (Scanner reader = new Scanner(Paths.get(this.file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");
                
                this.add(parts[0], parts[1]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + " file is unreadable");
            return false;
        }
        
        return true;
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (String key : this.dictionary.keySet()) {
                writer.println(key+":"+this.dictionary.get(key));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        
        return true;
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, translation);
    }

    public String translate(String word) {
        String translation = null;

        if (this.dictionary.containsKey(word)) {
            translation = this.dictionary.get(word);
        }

        if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    translation = key;
                }
            }
        }

        return translation;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.remove(word, this.dictionary.get(word));
        }

        if (this.dictionary.containsValue(word)) {
            String keyToRemove = null;

            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    keyToRemove = key;
                }
            }

            this.dictionary.remove(keyToRemove, word);
        }
    }
}
