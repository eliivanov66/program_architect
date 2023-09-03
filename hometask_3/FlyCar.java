import java.awt.*;

public class FlyCar extends Car {
    public FlyCar(String make, String model, Color color) {
        super(make, model, color);
        setWheelsCount(4);
    }

    public void fly(){
        System.out.println("Автомобиль летит!");
    }

    @Override
    public void movement() {
        fly();
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

    @Override
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
}
