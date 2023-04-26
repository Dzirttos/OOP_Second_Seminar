public abstract class AquaInhabitants implements Feedable{

    private String name;

    public AquaInhabitants(String name) {
        this.name = name;
    }

    public abstract String birth();

    @Override
    public String toString() {
          return String.format("Name: %s, Food: %s, Birth: %s", name, food(), birth());
    }

}
