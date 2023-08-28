package models;

import java.util.List;

public class PoligonalModel implements Move, Rotate {

    private List<Poligon> poligons;
    private List<Texture> textures;
    private Angle3D angle;

    public List<Poligon> getPoligins() {
        return poligons;
    }

    public List<Texture> getTextures() {
        return textures;
    }

    public PoligonalModel(List<Poligon> poligons) {
        this.poligons = poligons;
        this.angle = new Angle3D();
    }

    public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
        
    }

    public void move(Point3D location){
        for (Poligon poligon : poligons) {
            poligon.move(location);
        }
    }

    public void rotate(Angle3D angle){
        for (Poligon poligon : poligons) {
            poligon.rotate(angle);
        }
    }
}
