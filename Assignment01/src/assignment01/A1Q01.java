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
public class A1Q01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String name = input.nextLine();
        
        System.out.println("Hello " + name + "!");
    }
}
