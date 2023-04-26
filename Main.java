/**
 * Написать аквариум, или террариум по аналогии.создать согласно принципам ООП
 * пройдённым на семинаре.
 * Продумать и добавить интерфейсы.
 */
public class Main {

  public static void main(String[] args) {
    System.out.print("\033[H\033[J");
    System.out.print("Welcome to our Aquarium. Below you can find information about its residents, their name, what they eat and how they give birth:\n");
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
    System.out.println("\u001B[37m---------------------");
    System.out.print("\u001B[36mHere is a list of all Aquarium food - both residents and customers:\n");
    for (var item : aquarium.getFeedables()) {
      System.out.println(item.food());
    }
    System.out.println("\u001B[37m---------------------");
    System.out.print("\u001B[35mHere is a list of all residents which can swim and their swimming speed:\n");
    for (var item : aquarium.swimmables()) {
      System.out.printf("%s - %d\n", item.toString(), item.swimmSpeed());
    }
    System.out.println("\u001B[37m---------------------");
    System.out.print("\u001B[33mHere is a list of all residents which can also walk on the land and their runnining speed:\n");
    for (var item : aquarium.landWalkables()) {
      System.out.printf("%s - %d\n", item.toString(), item.runSpeed());
    }
    System.out.println("\u001B[37m---------------------");
    System.out.print("\u001B[32m And the fastest swimmer and runner are:\n");
    System.out.println("Swimming champion is: " + aquarium.swimmingChampion());
    System.out.println("Running champion is: " + aquarium.runningChampion());
  }
}