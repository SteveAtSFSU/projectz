/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoperations;

import java.util.Random;

/**
 *
 * @author sstev
 */
public class ArrayOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nums = new int[10000];               //set up array of 10000 size
        int sum = 0;                               // will hold sum of all numbers.
        double average = 0;                        // will hold average of all numbers
        int eSum = 0;                                  // will hold sum of all numbers                  

        for (int i = 0; i < nums.length; i++) {                       // creates random number for indexes
            Random randomNum = new Random();
            int randomNumber = randomNum.nextInt(201);
            nums[i] = randomNumber;
        }

        for (int n = 0; n < nums.length; n++) {                        // computes the sum of all numbers added. 
            sum += nums[n];
        }

        for (int t = 0; t < nums.length; t++){                   // computes the sum again and average. 
            eSum += nums[t];
            average = (double) sum / nums.length;
            
        }

        int minValue = nums[0];                                     // will hold minimum value
        int minValueIndex = 0;                                      // will hold minimum value location

        for (int z = 0; z < nums.length; z++) {
            if (nums[z] < minValue) {                                  // checks every number to see if its less than that number then assigns it to a variable to store index.
                minValue = nums[z];
                minValueIndex = z;
            }
        }

        int maxValue = nums[0];                                      // will hold maximum value
        int maxValueIndex = 0;                                      // will hold maximum value location

        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] > maxValue) {                                // checks every number to see if that number is greater than that number then assigns it to a variable to store index.
                maxValue = nums[idx];
                maxValueIndex = idx;
            }
        }

        int evenCount = 0;                                           // will hold even count
        int oddCount = 0;                                            // will hold odd count

        for (int index = 0; index < nums.length; index++) {                      // checks every number to see if its even if else it is odd. Add to counts depending if the number is odd or even.
            if (nums[index] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }

        System.out.println("The sum is: " + sum);                                                             // print statements for each of the values the program found. 
        System.out.println("The average is: " + average);
        System.out.println("The minimum value is: " + minValue + " and it occurs at index " + minValueIndex);
        System.out.println("The maximum value is: " + maxValue + " and it occurs at index " + maxValueIndex);
        System.out.println("The array contains " + evenCount + " even numbers.");
        System.out.println("The array contains " + oddCount + " odd numbers.");

    }

}
