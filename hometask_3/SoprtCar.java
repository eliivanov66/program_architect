import java.awt.*;

public class SoprtCar extends Car implements Fueling, Washing {

    private Refueling refueling;
    private Washing washing;

    public SoprtCar(String make, String model, Color color, FuelType fuelType) {
        super(make, model, color, fuelType);
        setWheelsCount(3);
    }

    public SoprtCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(3);
    }

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    public void setWashingStation(Washing washingStation) {
        this.washing =  washingStation;
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
}
