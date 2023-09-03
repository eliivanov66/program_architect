import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public final class Resurces {
        
        /**
         *
         */

        private static Random rand = new Random();

        private static ArrayList<String> makes = new ArrayList<String>(){
            {
            add("Toyota");
            add("Volkswagen");
            add("Volvo");
            add("Lada");
            }
        };

        private static ArrayList<String> models = new ArrayList<>(){
            {
            add("Model 1990");
            add("Model 2003");
            add("Model 1983");
            add("Model 2015");
            }
        };

        private static ArrayList<Color> colors = new ArrayList<>(){
            {
            add(Color.RED);
            add(Color.BLUE);
            add(Color.GREEN);
            add(Color.WHITE);
            add(Color.BLACK);
            }
        };

        private static ArrayList<FuelType> fuels = new ArrayList<>(){
            {
            add(FuelType.Diesel);
            add(FuelType.Gasoline);
            }
        };

        public static Object generate(){
            switch (rand.nextInt(2)){
                case 0: {
                    return new Harvester(
                        makes.get(rand.nextInt(makes.size())),
                        models.get(rand.nextInt(models.size())),
                        colors.get(rand.nextInt(colors.size())),
                        fuels.get(rand.nextInt(fuels.size()))
                    );
                }
                case 1: {
                    return new SoprtCar(
                        makes.get(rand.nextInt(makes.size())),
                        models.get(rand.nextInt(models.size())),
                        colors.get(rand.nextInt(colors.size())),
                        fuels.get(rand.nextInt(fuels.size()))
                    );
                }
            }
            return null;
        }

}
