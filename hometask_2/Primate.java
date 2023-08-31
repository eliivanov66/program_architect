public class Primate implements InterfacePrimate {
    private String name;

    public Primate(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public void useObjects() {
        System.out.println(name + " использует и создаёт орудия труда");
    }

    @Override
    public void walkStraight() {
        System.out.println(name + "ходит прямо");
    }

    @Override
    public void workWithHands() {
        System.out.println(name + "развитая моторика кистей рук");
    }
    
}
