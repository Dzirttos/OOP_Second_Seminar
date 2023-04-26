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

}
