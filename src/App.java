/**
 * 
 * Setup: The code is setup to take integer input from the user. The input will be
 * added to an ArrayList called "values" until the user enters -1.
 * 
 * Your task:
 * After the numbers have been collected, write code that will:
 *   1. Complete the method average
*    2. The average method takes in an ArrayList of integers and returns the average 
*     as a double
 * 
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();


        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            values.add(input);
        }

        System.out.println("");
        //Write your code below here

    }

    public static double average(ArrayList<Integer> nums){
    
    }
}
