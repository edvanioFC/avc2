package exercise5;

/**
 * This class represents a recyclable demon that grants wishes.
 * @author Edvanio Correia
 */
public class RecyclableDemon extends Genie {
    private boolean recycled;

    /**
     * Returns whether the demon has been recycled.
     *
     * @return true if the demon has been recycled, false otherwise
     */
    public boolean isRecycled() {
        return recycled;
    }

    /**
     * Recycles the demon.
     */
    public void recycle() {
        recycled = true;
    }

    /**
     * Grants a wish to the demon.
     *
     * @return true if the wish was granted, false otherwise
     */
    @Override
    public boolean grantWish() {
        grantedWishes++;
        return true;
    }

    /**
     * Returns a string representation of the demon.
     *
     * @return a string representation of the demon
     */
    @Override
    public String toString() {
        return recycled? "Demon has been recycled." : "Recyclable demon has granted " + grantedWishes + " wishes.";
    }
}
