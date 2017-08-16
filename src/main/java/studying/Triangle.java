package studying;

public class Triangle extends Shape {
    String name = "Triangle name";

    @Override
    public void draw() {
        super.draw();
        System.out.println("Triangle");
    }
}
