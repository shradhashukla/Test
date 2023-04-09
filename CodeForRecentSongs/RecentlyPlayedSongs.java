package TestCode;
public class RecentlyPlayedSongs extends PlayedSongs {
    public RecentlyPlayedSongs(int capacity) {
		super(capacity);
	}

public static void main(String[] args) {
    PlayedSongs playlist = new PlayedSongs(3);
        playlist.playSong("S1");
        playlist.playSong("S2");
        playlist.playSong("S3");
        playlist.printPlaylist(); // Output: S1, S2, S3
        playlist.playSong("S4");
        playlist.printPlaylist(); // Output: S2, S3, S4
        playlist.playSong("S2");
        playlist.printPlaylist(); // Output: S3, S4, S2
        playlist.playSong("S1");
        playlist.printPlaylist(); // Output: S4, S2, S1
    }
    
}
