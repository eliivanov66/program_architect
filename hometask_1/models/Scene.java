package models;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    private int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
        id ++;
    }

    public Scene() {
        this.models = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
        id ++;
    }
    
    public int getId() {
        return id;
    }

    
}
