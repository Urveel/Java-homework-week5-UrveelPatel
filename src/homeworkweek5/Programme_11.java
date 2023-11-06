package homeworkweek5;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Programme_11 {

    public static void main(String[] args) {
        // Declare and initialize the first ArrayList
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Declare and initialize the second ArrayList
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the two ArrayLists
        for (int i = 0; i < c1.size(); i++) {
            if (c2.contains(c1.get(i))) {
                //if elements exist in c2 it will be print on console
                System.out.println("Exist in c2" + c1.get(i));
            } else {
                //if elements do not exist in c2 it will not allow to print in the console
                System.out.println("Not exist in c2 " + c1.get(i));
            }
        }
    }
}








