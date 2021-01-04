package Shapes;

public abstract class Shape {

    double volume;
    String name;

    public abstract  void setName(String name);

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public abstract void setVolume(double volume);
}
