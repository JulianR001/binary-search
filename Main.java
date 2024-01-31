
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
public static int binarySearch(int start, int end, int[] myArray, int key) {
        if (start <= end) {
            if (myArray[start] == key) {
                return start; // Element found
            } else if (myArray[start] < key) {
                return binarySearch(start + 1, end, myArray, key); 
            }
        }

        return -1; // Element not found
    }
}
