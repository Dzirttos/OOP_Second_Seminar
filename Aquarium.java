import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<AquaInhabitants> listAquaInhabitants = new ArrayList<>();

    public List<AquaInhabitants> getListAquaInhabitants() {
        return listAquaInhabitants;
    }

    public Aquarium addList(AquaInhabitants auqaInhabitants) {
        listAquaInhabitants.add(auqaInhabitants);
        return this;
    }

    public Cafe cafe;

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public List<Feedable> getFeedables() {
        List<Feedable> feedables = new ArrayList<>();
        for (var item : listAquaInhabitants) {
            feedables.add(item);
        }
        feedables.add(cafe);
        return feedables;
    }

    public List<Swimmable> swimmables(){
        List<Swimmable> swimmables = new ArrayList<>();
        for (var item : listAquaInhabitants) {
            if(item instanceof Swimmable)
            swimmables.add((Swimmable) item);
        }
        return swimmables;
    }
    public List<LandWalkable> landWalkables(){
        List<LandWalkable> landWalkables = new ArrayList<>();
        for (var item : listAquaInhabitants) {
            if(item instanceof LandWalkable)
            landWalkables.add((LandWalkable) item);
        }
        return landWalkables;
    }

    public Swimmable swimmingChampion(){
        int index = 0;
        for (int i = 0; i < swimmables().size(); i++) {
            if(swimmables().get(i).swimmSpeed() > swimmables().get(index).swimmSpeed()) index = i;
        }
        return swimmables().get(index);
    }

    public LandWalkable runningChampion(){
        int index = 0;
        for (int i = 0; i < landWalkables().size(); i++) {
            if(landWalkables().get(i).runSpeed() > landWalkables().get(index).runSpeed()) index = i;
        }
        return landWalkables().get(index);
    }
}
