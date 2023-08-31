public class AdapterMonkeyToHuman implements InterfaceHuman {
    private Primate monkey;
    
    public AdapterMonkeyToHuman(Primate monkey){
        this.monkey = monkey;
    }

    @Override
    public void smoke() {
        System.out.println(this.monkey.getName() + " курит");
    }

    @Override
    public void speak() {
        System.out.println(this.monkey.getName() + " говорит");  
    }

    @Override
    public void writeCode() {
        System.out.println(this.monkey.getName() + " пишет код");
    }

}
