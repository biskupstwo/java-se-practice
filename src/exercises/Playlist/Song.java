package exercises.Playlist;

public class Song {

    private String title;
    double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return String.format("%s: %.2f", getTitle(), this.duration);
    }
}