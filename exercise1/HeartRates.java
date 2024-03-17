package exercise1;

import java.util.Calendar;

/**
 * The HeartRates class represents a person's heart rates.
 */
public class HeartRates {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    /**
     * Constructs a HeartRates object with the specified attributes.
     * 
     * @param firstName   the first name of the person
     * @param lastName    the last name of the person
     * @param birthDay    the birth day of the person
     * @param birthMonth  the birth month of the person
     * @param birthYear   the birth year of the person
     */
    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
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

    /**
     * Calculate the person's age in years.
     * 
     * @return the person's age in years.
     */
    public int calculateAge() {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int currentMonth = now.get(Calendar.MONTH) + 1;
        int currentDay = now.get(Calendar.DAY_OF_MONTH);

        int age = currentYear - birthYear;

        // Adjust the birthday if it hasn't occurred yet this year
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age--;
        }

        return age;
    }

    /**
     * Calculate the person's maximum heart rate.
     * 
     * @return the person's maximum heart rate.
     */
    public int calculateMaximumHeartRate() {
        return 220 - calculateAge();
    }

    /**
     * Calculate the person's target heart rate range (50-85% of maximum heart rate).
     * 
     * @return the person's target heart rate range.
     */
    public String calculateTargetHeartRate() {
        int maxHeartRate = calculateMaximumHeartRate();
        int minTargetRate = (int) (maxHeartRate * 0.5); // 50%
        int maxTargetRate = (int) (maxHeartRate * 0.85); // 85%

        return minTargetRate + " - " + maxTargetRate;
    }
}
