package exercises.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    String name;
    String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String titleOfSong, double durationOfSong){
        if (this.findSong(titleOfSong) != null) return false;
        Song song = new Song(titleOfSong, durationOfSong);
        return songs.add(song);
    }

    public Song findSong(String titleOfSong){
        Song song = null;

        for (int i = 0; i < songs.size(); i++){
            if (songs.get(i).getTitle().equals(titleOfSong)) {
                song = songs.get(i);
                break;
            }
        }
        return song;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        if (trackNumber-1 > this.songs.size()) return false;
        if (playlist.contains(this.songs.get(trackNumber-1))) return false;
        boolean result = playlist.add(this.songs.get(trackNumber-1));
        return result;
    }

    public boolean addToPlaylist(String titleOfSong, LinkedList<Song> playlist){
        if (this.findSong(titleOfSong) == null) return false;
        boolean result = playlist.add(this.findSong(titleOfSong));
        return result;
    }
}
