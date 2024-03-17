package exercise5;

/**
 * Main class of the Arabian Nights program. This class demonstrates the usage
 * of the MagicLamp and its related classes (genies and demon).
 */
public class ArabianNights {

    /**
     * Main method to test the functionality of the MagicLamp and its genies and demon.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a new MagicLamp with a capacity of 4 genies
        MagicLamp lamp = new MagicLamp(4);
        
        // Display the name of the class for demonstration purposes
        System.out.println(lamp.getClass().getName());

        // Rub the lamp 5 times and print the result for each rub
        for (int i = 0; i < 5; i++) {
            Genie genie = lamp.rub(i + 1);
            System.out.println(genie);
        }

        // Rub the lamp 4 times, grant a wish for each genie, and print the result
        for (int i = 0; i < 4; i++) {
            Genie genie = lamp.rub(i + 1);
            System.out.println(genie);
            genie.grantWish();
            System.out.println(genie);
        }

        // Feed the demon and rub the lamp to summon the demon
        lamp.feedDemon();
        Genie demon = lamp.rub(7);
        System.out.println(demon);
    }
}
