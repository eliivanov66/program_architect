package models;

public class Camera implements Move, Rotate {

    public Point3D location;
    public Angle3D angle;

    public Camera(Point3D location, Angle3D angle){
        this.location = location;
        this.angle = angle;
    }

    public Camera(){
        this.location = new Point3D();
        this.angle = new Angle3D();
    }

    public void move(Point3D location){
        this.location = location;
    }

    public void rotate(Angle3D angle){
        this.angle = angle;
    }
}
