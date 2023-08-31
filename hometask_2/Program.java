import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        
        ArrayList<Primate> primates = new ArrayList<>();
        primates.add(new Primate("Шимпанзе"));
        primates.add(new Primate("Орангутан"));
        primates.add(new Primate("Горилла"));
        
        AdapterMonkeyToHuman makeHumanFromMonkey;

        for (Primate primate : primates) {
            makeHumanFromMonkey = new AdapterMonkeyToHuman(primate);
            makeHumanFromMonkey.speak();
            makeHumanFromMonkey.smoke();
            makeHumanFromMonkey.writeCode();
        }
    }
}
