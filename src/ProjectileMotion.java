/*
 * Author : Devarsh Patel
 * Filename : ProjectileMotion.java
 * Description: This java file calculate the horizontal and vertical distance travelled from projectile motion at given time
 * Version : 1.0
 * Date: 29-05-2024
*/

import java.util.Scanner;

public class ProjectileMotion {

    public static void main(String[] args) {
        // Create instance of scanner class
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the initial angle of the projectile
        System.out.print("Enter the initial angle of the projectile (degrees): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: The input must be an integer.");
            System.out.print("Enter the initial angle of the projectile (degrees): ");
            scanner.next();
        }

        // Store the initial angle input into variable
        double initialAngle = scanner.nextDouble();

        // Validate the user input (must be positive)
        while (initialAngle <= 0) {
            System.out.println("Error: The initial angle must be a positive integer value.");
            System.out.print("Enter the initial angle of the projectile (degrees): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: The input must be an integer.");
                System.out.print("Enter the initial angle of the projectile (degrees): ");
                scanner.next();
            }
            initialAngle = scanner.nextDouble();
        }

        // Prompt the user to enter the initial velocity of the projectile
        System.out.print("Enter the initial velocity of the projectile (m/s): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: The input must be an integer.");
            System.out.print("Enter the initial velocity of the projectile (m/s): ");
            scanner.next();
        }
        // Store initial velocity input into variable
        double initialVelocity = scanner.nextDouble();

        // Validate the user input (must be positive)
        while (initialVelocity <= 0) {
            System.out.println("Error: The initial velocity must be a positive integer value.");
            System.out.print("Enter the initial velocity of the projectile (m/s): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: The input must be an integer.");
                System.out.print("Enter the initial velocity of the projectile (m/s): ");
                scanner.next();
            }
            initialVelocity = scanner.nextDouble();
        }

        // Prompt the user to enter the time instance
        System.out.print("Enter the time instance (seconds): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: The input must be an integer.");
            System.out.print("Enter the time instance (seconds): ");
            scanner.next();
        }
        // Store time input into variable
        double timeInstance = scanner.nextDouble();

        // Validate the user input (must be positive)
        while (timeInstance < 0) {
            System.out.println("Error: The time instance must be a positive integer value.");
            System.out.print("Enter the time instance (seconds): ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: The input must be an integer.");
                System.out.print("Enter the time instance (seconds): ");
                scanner.next();
            }
            timeInstance = scanner.nextDouble();
        }

        // Calculate the horizontal distance
        double horizontalDistance = (initialVelocity * Math.cos(initialAngle)) * timeInstance;

        // Calculate the vertical distance
        double gravity = -9.81; // gravitation force constant
        double verticalDistance = (initialVelocity * Math.sin(initialAngle) ) - (0.5 * gravity * timeInstance * timeInstance);

        // Print the results
        System.out.printf("The horizontal distance is: %.2f %n", horizontalDistance);
        System.out.printf("The vertical distance is: %.2f %n", verticalDistance);

        // Close the scanner
        scanner.close();
    }
}