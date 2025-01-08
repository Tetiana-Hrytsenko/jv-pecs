package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    public static final int NUMBER_OF_TRUCKS = 3;
    private final List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> get() {
        for (int i = 0; i < NUMBER_OF_TRUCKS; i++) {
            trucks.add(new Truck());
        }
        return trucks;
    }
}
