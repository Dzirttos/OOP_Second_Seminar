public class Seal extends Mammal implements Swimmable, LandWalkable{

    public Seal(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String food() {
        return "fish and mollusk";
    }
    @Override
    public String toString() {
        return String.format("Seal, %s", super.toString());
    }

    @Override
    public int swimmSpeed() {
        return 14;
    }

    @Override
    public int runSpeed() {
        return 20;
    }
    
}
