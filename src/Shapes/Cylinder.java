package Shapes;

public class Cylinder extends SolidOfRevolution{

    double high;
    static final double  PI = 3.14;

    public Cylinder(double radius,double high) {
        super(radius);
        this.high = high;
        this.setVolume(PI*radius*radius*high);
        this.setName("Цилидндр");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }
}