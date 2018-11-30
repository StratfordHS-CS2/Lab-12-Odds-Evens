import java.util.Arrays;

/**
 *
 *
 * @author
 * @version
 */
public class OddsEvens {

    public static int count(int[] array, boolean odd) {
        // use this method to count the number of evens or odds in the array.
        // array is the array to search for odd or even values.
        // if "odd" is true, search array for odd values.
        // if "odd" is false, search array for even values.
        // return the number of even or odd numbers.
        int count = 0;

        // find the number of even or odds as appropriate
        
        return count;
    }

    public static int[] getAllEvens(int[] array) {
        // return a new array of all the even values in "array"

        // use count() to figure out how long your array of evens should be (replace the ??? with that length)
        int[] evens = new int[ ??? ];

        // you'll have to keep track of your location in evens[] with a variable
        // while you loop through array[] in a for loop.
        int spot = 0; // you can use this to keep track of your location in evens[]

        // your for loop goes here

        return evens;
    }

    public static int[] getAllOdds(int[] array) {
        // return a new array of all the odd values in "array"

        // use count() to figure out how long your array of odds should be (replace the ??? with that length)
        int[] odds = new int[ ??? ];

        // you'll have to keep track of your location in odds[] with a variable
        // while you loop through array[] in a for loop.
        int spot = 0; // you can use this to keep track of your location in odds[]

        // your for loop goes here

        return odds;
    }

    /**
     *
     * @param args not used
     */
    public static void main(String[] args) {
        // you do not need to edit this method unless you want to try different situations.
        System.out.println("Odds - " + Arrays.toString(getAllOdds(new int[] { 2, 4, 6, 8, 10, 12, 14 })));
        System.out.println("Evens - " + Arrays.toString(getAllEvens(new int[] { 2, 4, 6, 8, 10, 12, 14 })));

        System.out.println("\nOdds - " + Arrays.toString(getAllOdds(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 })));
        System.out.println("Evens - " + Arrays.toString(getAllEvens(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 })));

        System.out.println("\nOdds - " + Arrays.toString(getAllOdds(new int[] { 2, 10, 20, 21, 23, 24, 40, 55, 60, 61 })));
        System.out.println("Evens - " + Arrays.toString(getAllEvens(new int[] { 2, 10, 20, 21, 23, 24, 40, 55, 60, 61 })));
    }

}
