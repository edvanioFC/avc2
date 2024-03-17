package exercise2;

import java.util.Calendar;

/**
 * The HealthProfile class represents a person's health profile.
 */
public class HealthProfile {
    private String firstName;
    private String lastName;
    private char gender;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double height; 
    private double weight; 

    /**
     * Constructs a HealthProfile object with the specified attributes.
     * 
     * @param firstName   the first name of the person
     * @param lastName    the last name of the person
     * @param gender      the gender of the person
     * @param birthDay    the birth day of the person
     * @param birthMonth  the birth month of the person
     * @param birthYear   the birth year of the person
     * @param height      the height of the person in meters
     * @param weight      the weight of the person in kilograms
     */
    public HealthProfile(String firstName, String lastName, char gender, int birthDay, int birthMonth, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
    }


    // Getters and setters for all attributes
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Calculates the age of the person.
     * 
     * @return the age of the person
     */
    public int calculateAge() {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int currentMonth = now.get(Calendar.MONTH) + 1;
        int currentDay = now.get(Calendar.DAY_OF_MONTH);

        int age = currentYear - birthYear;

        // Adjust the birthday 
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        return age;
    }

    /**
     * Calculates the body mass index (BMI) of a person.
     *
     * @return the BMI of the person
     */
    public double calculateBMI() {
        return weight / (height * height);
    }

    /**
     * Calculates the maximum heart rate of a person based on their age.
     *
     * @return the maximum heart rate of the person
     */
    public int calculateMaximumHeartRate() {
        // Calculate the age of the person
        int age = calculateAge();

        // Calculate the maximum heart rate based on the age
        int maxHeartRate = 220 - age;

        return maxHeartRate;
    }

    /**
     * Calculates the target heart rate range for a person based on their maximum heart rate.
     * 
     * @return a string containing the minimum and maximum target heart rate separated by a hyphen
     */
    public String calculateTargetHeartRate() {
        int maxHeartRate = calculateMaximumHeartRate();
        int minTargetRate = (int) (maxHeartRate * 0.5); // 50%
        int maxTargetRate = (int) (maxHeartRate * 0.85); // 85%

        return minTargetRate + " - " + maxTargetRate;
    }
}
