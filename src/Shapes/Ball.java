package Shapes;

public class Ball extends SolidOfRevolution{

    public Ball(double radius) {
        super(radius);
        this.setVolume(Cylinder.PI*4/3*radius*radius*radius);
        this.setName("Шар");
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