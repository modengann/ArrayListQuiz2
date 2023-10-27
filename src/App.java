/**
 * 
 * Setup: The code is setup to take integer input from the user. The input will be
 * added to an ArrayList called "values" until the user enters -1.
 * 
 * Your task:
 * After the numbers have been collected, write code that will:
 *   1. Find and print the average of the numbers on values
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

        for(Integer num : values){
            num *= 2;
        }

        System.out.println(values);
    }
}
