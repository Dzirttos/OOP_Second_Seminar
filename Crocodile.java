public class Crocodile extends Reptiles implements Swimmable, LandWalkable {

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "fish, birds, frogs";
    }

    @Override
    public String toString() {
        return String.format("Crocodile, %s", super.toString());
    }

    @Override
    public int swimmSpeed() {
        return 48;
    }

    @Override
    public int runSpeed() {
        return 20;
    }

}
