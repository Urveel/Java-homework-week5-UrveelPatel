package homeworkweek5;

import java.util.HashMap;
import java.util.Map;

public class Programme_9 {
    public static void main(String[] args) {

        Programme_9 x = new Programme_9();//object creation
        x.people();
    }
    public void people(){
        HashMap<String,Integer>object=new HashMap<>();// Hasmap using
        // using value to the map
        object.put("Mehul",01);
        object.put("Nikhil",02);
        object.put("Nimesh",03);
        object.put("Urvil",04);
        object.put("Dhara",05);
        object.put("Indu",06);

        for (Map.Entry<String,Integer>people:object.entrySet()){//for each loop
            System.out.println(people);
        }
    }

}


