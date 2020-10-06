import java.util.*;

public class ArielLot implements CarLot {

    private HashMap<String,MotorVehicle> lot;

    public ArielLot(){
        this.lot = new HashMap<String,MotorVehicle>();
    }

    public ArielLot(HashMap<String,MotorVehicle> lot) {
        this.lot = lot;
    }

    public void setLot(HashMap<String, MotorVehicle> lot) {
        this.lot = lot;
    }

    /**
     * @param vehicle to add to the data-structure
     */
    @Override
    public void addVehicle(MotorVehicle vehicle) {
    this.lot.put(vehicle.getRegistrationPlate(),vehicle);
    }

    /**
     * @return the FastestVehicle
     */
    @Override
    public MotorVehicle getFastestVehicle() {
    MotorVehicle fastest = new Car();
    MotorVehicle curr = null;
        for (String s:this.lot.keySet()) {
            curr = this.lot.get(s);
            if (curr.getMaxSpeed() > fastest.getMaxSpeed() ) fastest = curr;
        }
    return  fastest;

    }

    /**
     * @return the most Economy Vehicle
     */
    @Override
    public MotorVehicle getLightestVehicle() {
        MotorVehicle lightest = new Car();
        lightest.setWeight(Double.MAX_VALUE);
        MotorVehicle curr = null;

        for (String s:this.lot.keySet()) {
            curr = this.lot.get(s);
            if (curr.getWeight() < lightest.getWeight() ) lightest = curr;
        }
        return  lightest;
    }

    /**
     * @return all the Vehicles
     */
    @Override
    public Collection<MotorVehicle> getAllVehicle() {
    return this.lot.values();
    }

    /**
     * @param comp Comparator
     * @return
     */
    @Override
    public Collection<MotorVehicle> getAllVehicleSorted(Comparator<MotorVehicle> comp) {



    return  null;
    }
}
