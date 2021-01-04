package Shapes;

public abstract class SolidOfRevolution extends Shape{
    double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }
    public abstract void setVolume(double volume);
}

