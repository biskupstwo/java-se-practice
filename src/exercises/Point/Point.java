package exercises.Point;

import static java.lang.Math.sqrt;

public class Point {

    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        return sqrt(((this.x-0)*(this.x-0))+((this.y-0)*(this.y-0)));
    }

    public double distance(int x, int y){
        return sqrt(((this.x-x)*(this.x-x))+((this.y-y)*(this.y-y)));
    }

    public double distance(Point secondPoint){
        return sqrt(((this.x-secondPoint.x)*(this.x-secondPoint.x))+((this.y-secondPoint.y)*(this.y-secondPoint.y)));
    }
}
