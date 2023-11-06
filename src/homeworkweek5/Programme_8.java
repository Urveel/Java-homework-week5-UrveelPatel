package homeworkweek5;

import java.util.HashSet;

public class Programme_8 {

    public static void main(String[] args) {

        HashSet<Integer> numberSet = new HashSet<>();

        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(3);

        System.out.println("Number in the set between 1 and 5 : ");
        for (int i = 1; i <= 5; i++) {
            if (numberSet.contains(i)) {
                System.out.println(i + " is in the set");
            } else {
                System.out.println(i + " is not in the set");
            }
        }
    }
}
