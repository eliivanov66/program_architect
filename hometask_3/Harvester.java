import java.awt.*;

public class Harvester extends Car implements Fueling, Wiping, Washing {


    private Refueling refueling;
    private Washing washing;

    public Harvester(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(6);
    }

    public Harvester(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(6);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setWashingStation(Washing washingStation) {
        this.washing =  washingStation;
    }

    /**
     * Заправить автомобиль
     */
    @Override
    public void fuel() {
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }
    /**
     * Помыть автомобиль
     */

    @Override
    public void wash() {
        if (washing != null){
            washing.wash();
        }
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

    public String info(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.getClass().toString());
        builder.append(" производитель: ");
        builder.append(this.getMake());
        builder.append(" модель: ");
        builder.append(this.getModel());
        builder.append(" цвет: ");
        builder.append(this.getColor().toString());
        builder.append(" работает на: ");
        builder.append(this.getFuel().toString());
        return builder.toString();
    }


    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }

}
