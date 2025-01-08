package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double workingCapacity;
    private double workingRange;

    public Excavator() {
    }

    public Excavator(double workingCapacity, double workingRange) {
        this.workingCapacity = workingCapacity;
        this.workingRange = workingRange;
    }

    public double getWorkingCapacity() {
        return workingCapacity;
    }

    public void setWorkingCapacity(double workingCapacity) {
        this.workingCapacity = workingCapacity;
    }

    public double getWorkingRange() {
        return workingRange;
    }

    public void setWorkingRange(double workingRange) {
        this.workingRange = workingRange;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to dig a trench");
    }
}
