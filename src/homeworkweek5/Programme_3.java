package homeworkweek5;

public class Programme_3 {


        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5};

            System.out.println("Original Array:");
            printArray(originalArray);

            int[] reversedArray = reverse(originalArray);

            System.out.println("\nReversed Array:");
            printArray(reversedArray);
        }

        public static int[] reverse(int[] array) {
            int length = array.length;
            int[] reversed = new int[length];

            for (int i = 0; i < length; i++) {
                reversed[i] = array[length - 1 - i];
            }

            return reversed;
        }

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }

