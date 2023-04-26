public class Turtle extends Reptiles {

    public Turtle(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "zooplankton";
    }

    @Override
    public String toString() {
        return String.format("Turtle, %s", super.toString());
    }
}
