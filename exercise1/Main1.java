package exercise1;
import java.util.Scanner;

public class Main1 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the person's information:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Birth Day: ");
        int birthDay = scanner.nextInt();

        System.out.print("Birth Month: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Birth Year: ");
        int birthYear = scanner.nextInt();

        HeartRates person = new HeartRates(firstName, lastName, birthDay, birthMonth, birthYear);
        System.out.println("\nPerson's Information:");
        System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
        System.out.println("Date of Birth: " + person.getBirthDay() + "/" + person.getBirthMonth() + "/" + person.getBirthYear());
        System.out.println("Age: " + person.calculateAge() + " years");
        System.out.println("Maximum Heart Rate: " + person.calculateMaximumHeartRate() + " bpm");
        System.out.println("Target Heart Rate Range: " + person.calculateTargetHeartRate() + " bpm");

        scanner.close();
    }  
}
