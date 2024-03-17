package exercise5;

/**
 * This is a class that represents a genie in the lamp.
 * A genie is an object that grants wishes to people who rub its lamp.
 * A genie has a grantedWishes field that keeps track of the number of wishes it has granted.
 * It also has a grantWish method that returns a boolean value indicating whether the genie granted the wish or not.
 * The grantWish method is abstract, meaning that it is implemented in the subclasses.
 * @author Edvanio Correia
 * 
 */
public abstract class Genie {

    /**
     * This is the number of wishes that the genie has granted so far.
     */
    protected int grantedWishes;

    /**
     * This method returns the number of wishes that the genie has granted so far.
     *
     * @return the number of wishes that the genie has granted so far
     */
    public int getGrantedWishes() {
        return grantedWishes;
    }

    /**
     * This method is used to grant a wish to a person who rubs the lamp.
     * The implementation of this method is left to the subclasses.
     *
     * @return true if the wish was granted, false otherwise
     */
    public abstract boolean grantWish();

}

