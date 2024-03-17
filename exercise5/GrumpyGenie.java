package exercise5;
/**
 * This class represents a grumpy genie that has the ability to grant wishes.
 * @author Edvanio Correia
 */
public class GrumpyGenie extends Genie {

    /**
     * A boolean value indicating whether the genie has granted a wish or not.
     */
    private boolean grantedWish;

    /**
     * This method returns a boolean value indicating whether the genie has granted a wish or not.
     *
     * @return true if the genie has granted a wish, false otherwise
     */
    public boolean isGrantedWish() {
        return grantedWish;
    }

    /**
     * This method grants a wish to the genie. If the genie has already granted a wish, this method returns false.
     *
     * @return true if the wish was granted, false otherwise
     */
    @Override
    public boolean grantWish() {
        if (!grantedWish) {
            grantedWishes++;
            grantedWish = true;
            return true;
        }
        return false;
    }

    /**
     * This method returns a string indicating whether the genie has a wish to grant or has granted a wish.
     *
     * @return a string indicating whether the genie has a wish to grant or has granted a wish
     */
    @Override
    public String toString() {
        return grantedWish? "Grumpy genie has granted a wish." : "Grumpy genie has a wish to grant.";
    }
}