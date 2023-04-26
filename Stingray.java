public class Stingray extends Fish implements Swimmable {

    public Stingray(String name) {
        super(name);
    }

    @Override
    public String food() {
        return "mollusk and shellfish";
    }

    @Override
    public String toString() {
        return String.format("Stingray, %s", super.toString());
    }

    @Override
    public int swimmSpeed() {
        return 11;
    }

}
