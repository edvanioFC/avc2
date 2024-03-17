package exercise2;

import java.util.Scanner;

/**
 * The Main2 class contains the main method to interactively create a HealthProfile object and display its information.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the person's information
        System.out.println("Please enter the person's information:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Birth Day: ");
        int birthDay = scanner.nextInt();

        System.out.print("Birth Month: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Birth Year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Weight (in kilograms): ");
        double weight = scanner.nextDouble();

        // Create a new HealthProfile object with the provided information
        HealthProfile person = new HealthProfile(firstName, lastName, gender, birthDay, birthMonth, birthYear, height, weight);

        // Display the person's information
        System.out.println("\nPerson's Information:");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Date of Birth: " + person.getBirthDay() + "/" + person.getBirthMonth() + "/" + person.getBirthYear());
        System.out.println("Height: " + person.getHeight() + " meters");
        System.out.println("Weight: " + person.getWeight() + " kilograms");
        System.out.println("Age: " + person.calculateAge() + " years");
        System.out.println("BMI: " + person.calculateBMI());
        System.out.println("Maximum Heart Rate: " + person.calculateMaximumHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + person.calculateTargetHeartRate() + " bpm");

        scanner.close();
    }
}
