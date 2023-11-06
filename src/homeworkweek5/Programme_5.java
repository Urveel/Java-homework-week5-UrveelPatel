package homeworkweek5;

import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5 {
    public static void main(String[] args) {

        ArrayList<String>arrayList =new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");

        Iterator<String> iterator = arrayList.iterator();

        System.out.println("Elements in the ArrayList: ");
        while (iterator.hasNext()){
            String element= iterator.next();
            System.out.println(element);
        }
    }
}
