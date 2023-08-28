package models;

import java.util.ArrayList;
import java.util.List;

public class Poligon implements Rotate, Move {

    private List<Point3D> points;
    private Angle3D angle;

    public Poligon(List<Point3D> points) {
        this.points = points;
        this.angle = new Angle3D();
    }

    public Poligon() {
        this.points = new ArrayList<>();
        points.add(new Point3D());
        this.angle = new Angle3D();
    }

    public void move(Point3D location){
        for (Point3D point3d : points) {
            point3d.setX(point3d.getX() + location.getX());
            point3d.setY(point3d.getY() + location.getY());
            point3d.setZ(point3d.getZ() + location.getZ());
        }
    }

    public void rotate(Angle3D angle){
        this.angle = angle;
    }

}
