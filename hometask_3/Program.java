
import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Program {

    /**
     * 1. Спроектировать абстрактный класс «Car» у которого должны
     *  быть свойства: марка, модель, цвет, тип кузова, число колёс, тип
     *  топлива, тип коробки передач, объём двигателя; методы:
     *  движение, обслуживание, переключение передач, включение
     *  фар, включение дворников.
     *
     * 2. Создать конкретный автомобиль путём наследования класса
     *  «Car».
     * 3. Расширить абстрактный класс «Car», добавить метод: подметать
     * улицу. Создать конкретный автомобиль путём наследования
     * класса «Car». Провести проверку принципа SRP.
     *
     * 4. Расширить абстрактный класс «Car», добавить метод:
     * включение противотуманных фар, перевозка груза. Провести
     * проверку принципа OCP.
     *
     * 5. Создать конкретный автомобиль путём наследования класса
     * «Car», определить число колёс = 3. Провести проверку принципа LSP.
     *
     * 6. Создать конкретный автомобиль путём наследования класса
     * «Car», определить метод «движение» - «полёт». Провести
     * проверку принципа LSP.
     *
     * 7. Создать интерфейс «Заправочная станция», создать метод:
     * заправка топливом.
     *
     *
     * 8. Имплементировать метод интерфейса «Заправочная станция» в
     * конкретный класс «Car».
     *
     * 9. Добавить в интерфейс «Заправочная станция» методы: протирка
     * лобового стекла, протирка фар, протирка зеркал.
     *
     * 10. Имплементировать все методы интерфейса «Заправочная
     * станция» в конкретный класс «Car». Провести проверку
     * принципа ISP. Создать дополнительный/е интерфейсы и
     * имплементировать их в конкретный класс «Car». Провести
     * проверку принципа ISP.
     *
     * 11. Создать путём наследования класса «Car» два
     * автомобиля: с бензиновым и дизельным двигателями,
     * имплементировать метод «Заправка топливом» интерфейса
     * «Заправочная станция». Реализовать заправку каждого
     * автомобиля подходящим топливом. Провести проверку принципа DIP.
     *
     */
    public static void main(String[] args) {
        RefuelingStation refuelingStation = new RefuelingStation();
        WashingStation washingStation = new WashingStation();

        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            Car temp_car = (Car) Resurces.generate();
            cars.add(temp_car);
        }

        for (Car car : cars) {
            if (car.getClass().equals(Harvester.class)) {
                System.out.println(car.info());
                ((Harvester) car).setRefuelingStation(refuelingStation);
                ((Harvester) car).setWashingStation(washingStation);
                ((Harvester) car).fuel();
                ((Harvester) car).wash();
            }

            if (car.getClass().equals(SoprtCar.class)) {
                System.out.println(car.info());
                ((SoprtCar) car).setRefuelingStation(refuelingStation);
                ((SoprtCar) car).setWashingStation(washingStation);
                ((SoprtCar) car).fuel();
                ((SoprtCar) car).wash();
            }
        }

    }
}
