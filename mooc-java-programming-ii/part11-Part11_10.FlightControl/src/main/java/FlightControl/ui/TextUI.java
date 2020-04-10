package FlightControl.ui;

import FlightControl.domain.Plane;
import FlightControl.domain.Flight;
import FlightControl.domain.Airport;

import FlightControl.logic.FlightControl;

import java.util.Scanner;

public class TextUI {

    private FlightControl control;
    private Scanner scan;

    public TextUI(FlightControl control, Scanner scan) {
        this.control = control;
        this.scan = scan;
    }

    public void start() {
        System.out.println("Airport Asset Control");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");

            String selection = this.scan.nextLine();

            if (selection.equals("x")) {
                break;
            }

            if (selection.equals("1")) {
                System.out.println("Give the airplane id: ");
                String id = this.scan.nextLine();
                System.out.println("Give the airplane capacity: ");
                int capacity = Integer.valueOf(this.scan.nextLine());

                this.control.addPlane(id, capacity);
            }

            if (selection.equals("2")) {
                System.out.println("Give the airplane id: ");
                Plane plane = null;
                while (true) {
                    String id = scan.nextLine();
                    plane = this.control.getPlane(id);
                    if (plane == null) {
                        System.out.println("No plane with id" + id);
                    } else {
                        break;
                    }
                }
                System.out.println("Give the departure airport id: ");
                String departure = this.scan.nextLine();
                System.out.println("Give the target airport id: ");
                String destination = this.scan.nextLine();

                this.control.addFlight(plane, departure, destination);
            }
        }

        System.out.println("");
        this.flightControl();

    }

    public void flightControl() {
        System.out.println("Flight Control");
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");

            String selection = this.scan.nextLine();

            if (selection.equals("x")) {
                break;
            }

            if (selection.equals("1")) {
                this.control.printPlanes();
                System.out.println("");
            }

            if (selection.equals("2")) {
                this.control.printFlights();
                System.out.println("");
            }

            if (selection.equals("3")) {
                System.out.println("Give the airplane id: ");
                System.out.println(this.control.getPlane(scan.nextLine()).toString());
                System.out.println("");
            }
        }
    }
}
