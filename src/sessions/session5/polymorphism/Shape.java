package sessions.session5.polymorphism;

public abstract class Shape {

    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    protected abstract int area();
    public abstract int perimeter();
    public abstract String type();

}
