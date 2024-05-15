package exercises.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    String name;
    String artist;
    SongList songs;

    class SongList{
        ArrayList<Song> songList;

        public SongList(ArrayList<Song> songList) {
            this.songList = songList;
        }
        public boolean add(Song song){
            if (this.findSong(song.getTitle()) != null) return false;
            return songList.add(song);
        }

        public Song findSong(String title){
            Song song = null;

            for (int i = 0; i < songList.size(); i++){
                if (songList.get(i).getTitle().equals(title)) {
                    song = songList.get(i);
                    break;
                }
            }
            return song;
        }
        public Song findSong(int trackNumber){
            Song song = null;

            for (int i = 0; i < songList.size(); i++){
                if (i == trackNumber) {
                    song = songList.get(i);
                    break;
                }
            }
            return song;
        }
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList(new ArrayList<Song>());
    }

    public boolean addSong(String titleOfSong, double durationOfSong){
        Song song = new Song(titleOfSong, durationOfSong);
        return songs.add(song);
    }
    /*
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

     */

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist){
        if (trackNumber-1 > this.songs.songList.size()) return false;
        if (playlist.contains(this.songs.songList.get(trackNumber-1))) return false;
        boolean result = playlist.add(this.songs.songList.get(trackNumber-1));
        return result;
    }

    public boolean addToPlaylist(String titleOfSong, LinkedList<Song> playlist){
        if (this.songs.findSong(titleOfSong) == null) return false;
        return playlist.add(this.songs.findSong(titleOfSong));
    }
}
