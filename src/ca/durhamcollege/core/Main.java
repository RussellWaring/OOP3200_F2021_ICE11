/** Main.java
 * @author          Russell Waring
 * @file            OOP3200 - ICE 11
 * @date            November 29th, 2021
 * @description     The eleventh in-class exercise, during week 12 of OOP3200. Using ICE10 as a base.
 */
package ca.durhamcollege.core;

import ca.durhamcollege.utility.*;
import java.util.Scanner;
import java.util.Vector;

public class Main
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String prompt = "";
        int numOfPoints = 4;

        // Instantiates the collection container
        Vector<Vector2D> points = new Vector<Vector2D>();

        // Builds a vector of n points
        for (int i = 0; i < numOfPoints; i++)
        {
            points.add(Vector2D.zero());
        }

        // points.get(0).set() // 'get()' is the portal to accessing the class

        for (int i = 0; i < 3; i += 2)
        {
            System.out.print("Enter the first point (x, y): ");
            prompt = keyboard.nextLine();
            var values = prompt.split(",");
            points.get(i).set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));

            System.out.println("\n--------------------------------------------------------------");
            System.out.println("You Entered " + points.get(i).toString() + " for the first point");
            System.out.println("--------------------------------------------------------------\n");
            //Vector2D point2 = new Vector2D();
            System.out.print("Enter the second point (x, y): ");

            prompt = keyboard.nextLine();
            values = prompt.split(",");
            points.get(i+1).set(Float.parseFloat(values[0]), Float.parseFloat(values[1]));

            System.out.println("\n--------------------------------------------------------------");
            System.out.println("You Entered " + points.get(i+1).toString() + " for the second point");
            System.out.println("--------------------------------------------------------------\n");

            Vector2D randomVector2D = Vector2D.random(points.get(i), points.get(i+1));
            System.out.println("\n--------------------------------------------------------------");
            System.out.println("The Random Vector is: " + randomVector2D.toString());
            System.out.println("--------------------------------------------------------------\n");

            points.add(randomVector2D);
        }

        System.out.printf("Magnitude of first random point is: %.3f \n", points.get(4).getMagnitude());
        System.out.printf("Magnitude of second random point is: %.3f \n", points.get(5).getMagnitude());
        System.out.printf("Distance between first random point and second random point is: %.3f \n", Vector2D.distance(points.get(4), points.get(5)));
        System.out.println("--------------------------------------------------------------\n");
    }
}
