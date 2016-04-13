/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01;

import java.util.Scanner;

/**
 *
 * @author samiorga
 */
public class A1Q06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 50 and 100 to stop at: ");
        int number = input.nextInt();

        while (number < 50) {
            System.out.print("Please enter a number between 50 and 100: ");
            number = input.nextInt();
        }

        int baseNumber = 100;

        for (int i = 100; i > 50; i--) {
            System.out.println(baseNumber);
            baseNumber = baseNumber - 5;
            if (baseNumber == number) {
                System.out.println(baseNumber);
                break;
            } else if (baseNumber <= number) {
                break;
            }
        }
    }
}
