package Shapes;

public class Box extends Shape{

    double high;

    public Box(double high) {
        this.high = high;
        this.setVolume(high*high*high);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean add(Shape shape){
        if(this.getVolume()> shape.getVolume()){
            this.setVolume(this.getVolume()- shape.getVolume());
            return true;
        }
        return false;
    }
}