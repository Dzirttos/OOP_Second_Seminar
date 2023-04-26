public class Orca extends Mammal implements Swimmable{

    public Orca(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "fish";
    }

    @Override
    public String toString() {
        return String.format("Orca, %s", super.toString());
    }

    @Override
    public int swimmSpeed() {
        return 56;
    }
}
