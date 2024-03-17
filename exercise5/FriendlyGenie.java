package exercise5;
/**
 * This class represents a friendly genie that grants wishes to its master.
 * It extends the Genie class and inherits all its properties and methods.
 * @author Edvanio Correia
 */
public class FriendlyGenie extends Genie {

    /**
     * The number of remaining wishes that the genie has to grant.
     */
    private int remainingWishes;

    /**
     * Constructs a new FriendlyGenie object with the specified number of remaining wishes.
     *
     * @param remainingWishes the number of remaining wishes
     */
    public FriendlyGenie(int remainingWishes) {
        this.remainingWishes = remainingWishes;
    }

    /**
     * Returns the number of remaining wishes that the genie has to grant.
     *
     * @return the number of remaining wishes
     */
    public int getRemainingWishes() {
        return remainingWishes;
    }

    /**
     * Checks if the genie has any wishes left to grant.
     *
     * @return true if the genie has wishes left, false otherwise
     */
    public boolean canGrantWish() {
        return remainingWishes > 0;
    }

    /**
     * Grants a wish to the genie's master and decrements the remaining wish count.
     *
     * @return true if the wish was granted, false otherwise
     */
    @Override
    public boolean grantWish() {
        if (remainingWishes > 0) {
            grantedWishes++;
            remainingWishes--;
            return true;
        }
        return false;
    }

    /**
     * Returns a string representation of the friendly genie, including the number of granted wishes and remaining wishes.
     *
     * @return a string representation of the friendly genie
     */
    @Override
    public String toString() {
        return "Friendly genie has granted " + grantedWishes + " wishes and still has " + remainingWishes + " to grant.";
    }
}
