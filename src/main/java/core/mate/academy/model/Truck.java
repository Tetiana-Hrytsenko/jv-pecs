package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String bodyType;
    private double payloadCapacity;

    public Truck() {
    }

    public Truck(String bodyType, double payloadCapacity) {
        this.bodyType = bodyType;
        this.payloadCapacity = payloadCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to transport soil");
    }
}
