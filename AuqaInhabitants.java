public abstract class AuqaInhabitants {

    private String name;

    public abstract String food();

    @Override
    public String toString() {
          return String.format("Name %s: Food %s", name, food());
    }

}
