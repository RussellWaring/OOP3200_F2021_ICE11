/** RandomVector.java
 * @author          Russell Waring
 * @file            OOP3200 - ICE 10
 * @date            November 25th, 2021
 * @description     The tenth in-class exercise. Created in week 11.
 */
package ca.durhamcollege;

import java.util.Random;

public class RandomVector
{
    private Random m_rand;

    // Step 1. private static instance
    private static RandomVector m_instance = null;

    // Step 2. make the default constructor private
    private RandomVector()
    {
        m_rand = new Random(); // instance of random class
    }

    // Step 3. make a public instance method that acts as "portal" to the class
    public static RandomVector Instance()
    {
        if(m_instance == null)
        {
            m_instance = new RandomVector();
        }
        return m_instance;
    }

    // Sample values 5,10 and 20,30
    // minx = 5
    // maxx = 20

    // miny = 10
    // maxy = 30

    public final Vector2D createVector2D(final Vector2D start, final Vector2D end) // make method 'final' to prevent override
    {
        // generate random X value
        float minX = Math.min(start.getX(), end.getX());
        float maxX = Math.max(start.getX(), end.getX());
        float randomX = (m_rand.nextFloat() * (maxX - minX)) + minX;

        // generate random Y value
        float minY = Math.min(start.getY(), end.getY());
        float maxY = Math.max(start.getY(), end.getY());
        float randomY = (m_rand.nextFloat() * (maxY - minY)) + minY;

        return new Vector2D(randomX, randomY);
    }
}
