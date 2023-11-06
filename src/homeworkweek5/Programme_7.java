package homeworkweek5;

import java.util.ArrayList;

public class Programme_7 {



        public static void main(String[] args) {
            // Create an ArrayList
            ArrayList<String> arrayList = new ArrayList<>();

            // Check if the ArrayList is empty
            if (arrayList.isEmpty()) {
                System.out.println("The ArrayList is empty.");
            } else {
                System.out.println("The ArrayList is not empty.");
            }

            // Add an element to the ArrayList
            arrayList.add("Element");

            // Check if the ArrayList is empty again
            if (arrayList.isEmpty()) {
                System.out.println("The ArrayList is empty.");
            } else {
                System.out.println("The ArrayList is not empty.");
            }
        }
    }

