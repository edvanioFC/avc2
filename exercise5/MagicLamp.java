package exercise5;

/**
 * Thisclass represents a magical lamp that can grant wishes or summon demons.
 */
public class MagicLamp {
    private int geniesAvailable;
    private int demonsFed;
    private boolean recycled;

    /**
     * Creates a new magic lamp with the specified number of genies available.
     *
     * @param geniesAvailable the number of genies available
     */
    public MagicLamp(int geniesAvailable) {
        this.geniesAvailable = geniesAvailable;
    }

    /**
     * Returns the number of genies available.
     *
     * @return the number of genies available
     */
    public int getGeniesAvailable() {
        return geniesAvailable;
    }

    /**
     * Returns the number of demons fed.
     *
     * @return the number of demons fed
     */
    public int getDemonsFed() {
        return demonsFed;
    }

    /**
     * Returns whether the lamp has been recycled.
     *
     * @return whether the lamp has been recycled
     */
    public boolean isRecycled() {
        return recycled;
    }

    /**
     * Rubes the lamp, which may result in a genie being summoned or a demon being fed.
     *
     * @param wishes the number of wishes to rub
     * @return the genie that was summoned, or a demon if the lamp was recycled
     */
    public Genie rub(int wishes) {
        if (!recycled && geniesAvailable > 0) {
            geniesAvailable--;
            return geniesAvailable % 2 == 0? new GrumpyGenie() : new FriendlyGenie(wishes);
        } else {
            recycled = false;
            demonsFed++;
            return new RecyclableDemon();
        }
    }

    /**
     * Feeds a demon to the lamp, which recycles it.
     */
    public void feedDemon() {
        recycled = true;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     *
     * @param obj the reference object with which to compare.
     * @return {@code true} if this object is the same as the obj argument; {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;

        MagicLamp magicLamp = (MagicLamp) obj;
        return geniesAvailable == magicLamp.geniesAvailable && demonsFed == magicLamp.demonsFed;
    }
}