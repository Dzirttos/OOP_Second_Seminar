public class Orca extends Mammal {

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
}
