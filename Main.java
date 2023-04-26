/**
 * Написать аквариум, или террариум по аналогии.создать согласно принципам ООП
 * пройдённым на семинаре.
 * Продумать и добавить интерфейсы.
 */
public class Main {

  public static void main(String[] args) {
    System.out.print("\033[H\033[J");

    Aquarium aquarium = new Aquarium();
    aquarium.addList(new Orca("Spot"))
        .addList(new Turtle("Speedy"));

    for (var item : aquarium.getListAquaInhabitants()) {
      System.out.println(item);
    }
    for (var item : aquarium.getListAquaInhabitants()) {
      System.out.println(item.food());
    }
  }
}