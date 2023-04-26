public class Turtle extends Reptiles implements Swimmable, LandWalkable{

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

    @Override
    public int swimmSpeed() {
        return 18;
    }

    @Override
    public int runSpeed() {
        return 5;
    }
}
