package homeworkweek5;

import java.util.ArrayList;

public class Programme_4 {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();

        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Purple");

        System.out.println("Colors in the ArrayList: ");
        for (String color : colorList) {
            System.out.println(color);
        }
    }

}
