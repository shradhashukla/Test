package TestCode;
import java.util.LinkedList;
public class PlayedSongs {
  
    private int capacity;
    private LinkedList<String> songs;

    public PlayedSongs(int capacity) {
        this.capacity = capacity;
        this.songs = new LinkedList<>();
    }

    public void playSong(String Newsong) {
        // Remove the first song if the playlist is full
        if (songs.size() == capacity) {
            songs.removeFirst();
        }
        // Add the new song to the end of the playlist
        songs.addLast(Newsong);
    }

    public void printPlaylist() {
        System.out.println("Songs played by user"+" Now User Current playlist will:");
        for (String song : songs) {
            System.out.println(song);
        }
    }

    
}
