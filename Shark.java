public class Shark extends Fish implements Swimmable{

    public Shark(String name) {
        super(name);
         }

    @Override
    public String food() {
        return "fish and crustacean";
    }
    
    @Override
    public String toString() {
        return String.format("Shark, %s", super.toString());
    }

    @Override
    public int swimmSpeed() {
        return 50;
    }
}
