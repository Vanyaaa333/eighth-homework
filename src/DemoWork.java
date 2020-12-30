import Shapes.*;

public class DemoWork {

    public static void main(String[] args) {
        Shape[] figuresVolumes = new Shape[3];
        figuresVolumes[0] = new Pyramid(3,886);
        System.out.printf("Объем пирамиды равен %.1f cm^3\n",figuresVolumes[0].getVolume());
        figuresVolumes[1] = new Ball(3);
        System.out.printf("Объем шара равен %.1f cm^3\n",figuresVolumes[1].getVolume());
        figuresVolumes[2] = new Cylinder(4,6);
        System.out.printf("Объем цилиндра равен %.1f cm^3\n",figuresVolumes[2].getVolume());
        Box box = new Box(10);
        System.out.printf("Объем бокса равен %.1f cm^3\n",box.getVolume());

        for (int i = 0; i < figuresVolumes.length; i++) {
            if(box.add(figuresVolumes[i])){
                System.out.printf("Фигура %s была добавлена оставшееся место в боксе равно %.2f cm^3\n",figuresVolumes[i].getName(),box.getVolume());
            }
            else{
                double remainingSpaceOfBox = figuresVolumes[i].getVolume() - box.getVolume();
                System.out.printf("Фигура %s не была добавлена ,недостаток места равен %.2f cm^3 ,купите бокс побольше ^^",figuresVolumes[i].getName(),remainingSpaceOfBox);
            }
        }

    }
}
