package homeworkweek5;

import java.util.ArrayList;

public class Programme_6 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Rasberry");

        int indexToRetrieve = 2;

        if (indexToRetrieve >= 0 && indexToRetrieve < arrayList.size()) {
            // Retrieve the element at the specified index
            String element = arrayList.get(indexToRetrieve);
            System.out.println("Element at index " + indexToRetrieve + ": " + element);
        } else {
            System.out.println("Index is out of range");
        }
    }
}
