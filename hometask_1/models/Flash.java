package models;

import java.awt.Color;

public class Flash implements Move, Rotate {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public double power;

    public Flash(Point3D location, Angle3D angle, Color color, Double power){
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Flash(){
        this.location = new Point3D();
        this.angle = new Angle3D();
        this.color = Color.WHITE;
        this.power = 1.0;
    }

    public void move(Point3D location){
        this.location = location;
    }

    public void rotate(Angle3D angle){
        this.angle = angle;
    }
}
