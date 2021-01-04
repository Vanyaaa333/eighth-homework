package Shapes;

public class Pyramid extends Shape{

    double high;
    double square;

    public String getName() {
        return name;
    }

    public Pyramid(double high, double square) {
        this.high = high;
        this.square = square;
        this.setVolume(square*high/3);
        this.setName("Пирамида");
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
