package test1;

import java.util.Scanner;



public class Range {

    

    /** Creates a new instance of Range */

    public Range() {

    }

    

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        System.out.println("Greetings.");

        

        int min, max;

        

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a minimum and maximum value");

        min = keyboard.nextInt();

        max = keyboard.nextInt();

        

        /**

         * Make sure the user entered max and min correctly

         */

        if (max < min) {

            int t = min;

            min = max;

            max = t;

        }

        

        System.out.println("The number of values in the range from " + min + " to " + max + " is ");

        System.out.println(max-min+1);

    }

    

}