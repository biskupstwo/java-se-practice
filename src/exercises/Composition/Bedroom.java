package exercises.Composition;

public class Bedroom {

    private String name;
    private Walls walls1;
    private Walls walls2;
    private Walls walls3;
    private Walls walls4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Walls walls1, Walls walls2, Walls walls3, Walls walls4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.walls1 = walls1;
        this.walls2 = walls2;
        this.walls3 = walls3;
        this.walls4 = walls4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.print("Bedroom -> Making bed | ");
        bed.make();
    }
}