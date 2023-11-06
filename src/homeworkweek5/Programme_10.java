package homeworkweek5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programme_10 {


        public static void main(String[] args) {
            // Create a map to store station-line information
            Map<String, String> stationLines = new HashMap<>();

            // Populate the map with Zone 1 station-line data (hardcoded)
            stationLines.put("Oxford Circus", "Bakerloo, Central, Victoria");
            stationLines.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");
            stationLines.put("Liverpool Street", "Central, Circle, Hammersmith & City, Metropolitan");

            // Input station name from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a Zone 1 station name: ");
            String stationName = scanner.nextLine();

            // Check if the station exists in the map
            if (stationLines.containsKey(stationName)) {
                String lines = stationLines.get(stationName);
                System.out.println("The following lines pass through " + stationName + ": " + lines);
            } else {
                System.out.println("Station not found in Zone 1.");
            }
        }
    }


