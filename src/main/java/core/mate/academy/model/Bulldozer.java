package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeWidth;    
    private boolean hasRippler;

    public Bulldozer() {
    }

    public Bulldozer(int bladeWidth, boolean hasRippler) {
        this.bladeWidth = bladeWidth;
        this.hasRippler = hasRippler;
    }

    public int getBladeWidth() {
        return bladeWidth;
    }

    public void setBladeWidth(int bladeWidth) {
        this.bladeWidth = bladeWidth;
    }

    public boolean isHasRippler() {
        return hasRippler;
    }

    public void setHasRippler(boolean hasRippler) {
        this.hasRippler = hasRippler;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started clearing the site.");
    }
}
