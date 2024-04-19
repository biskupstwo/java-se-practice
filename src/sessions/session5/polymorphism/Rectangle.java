package sessions.session5.polymorphism;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    protected int area() {
        return height*width;
    }

    @Override
    public int perimeter() {
        return 2*(height+width);
    }

    @Override
    public String type() {
        return "Rectangle";
    }
}
