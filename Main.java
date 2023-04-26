/**
 * Написать аквариум, или террариум по аналогии.создать согласно принципам ООП
 * пройдённым на семинаре.
 * Продумать и добавить интерфейсы.
 */
public class Main {

  public static void main(String[] args) {
    System.out.print("\033[H\033[J");

    Aquarium aquarium = new Aquarium();
    aquarium.setCafe(new Cafe());
    aquarium.addList(new Orca("Spoty"))
        .addList(new Turtle("Speedy"))
        .addList(new Shark("Teethy"))
        .addList(new Stingray("Stingy"))
        .addList(new Seal("Fluffy"))
        .addList(new Crocodile("Skinny"));

    for (var item : aquarium.getListAquaInhabitants()) {
      System.out.println(item);
    }
    for (var item : aquarium.getFeedables()) {
      System.out.println(item.food());
    }
  }
}