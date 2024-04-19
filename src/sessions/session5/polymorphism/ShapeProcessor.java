package sessions.session5.polymorphism;

public class ShapeProcessor {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red",2,5);
        int areaRectangle = rectangle.area();
        int perimeterRectangle = rectangle.perimeter();
        System.out.println(areaRectangle);
        System.out.println(perimeterRectangle);

        Shape circle = new Circle("red",4);
        int areaCircle = circle.area();
        int perimeterCircle = circle.perimeter();
        System.out.println(areaCircle);
        System.out.println(perimeterCircle);

        showShapeData(circle);
    }

    public static void showShapeData(Shape shape) {
        System.out.println(shape.type() + shape.area() + shape.perimeter());
    }
}
