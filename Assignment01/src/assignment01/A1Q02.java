/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

import java.util.Scanner;

/**
 *
 * @author iorgs3184
 */
public class A1Q02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 3 numbers: ");
        int n = input.nextInt();

        int[] nums = new int[2];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }
        int product = n;
        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];
        }
        double number = product;
        
        number = Math.sqrt(number);
        System.out.println("The Square Root of " + product + " is " + number);

        number = Math.pow(product, 2);
        System.out.println(product + " to the power of 2 is " + number);

        System.out.println("The final product is " + product);
    }
}
