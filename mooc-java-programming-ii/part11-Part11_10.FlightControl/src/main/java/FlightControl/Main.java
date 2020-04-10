package FlightControl;

import FlightControl.ui.TextUI;
import FlightControl.logic.FlightControl;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        
        FlightControl control = new FlightControl();
        Scanner scan = new Scanner(System.in);
        
        TextUI main = new TextUI(control, scan);
        
        main.start();
        
    }
}
