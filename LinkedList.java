mport java.util.LinkedList;
import java.util.List;
 
public class ChaGaming {
    public static void main(String[] args) {
       
        List<String> songList = new LinkedList<>();
        List<String> artistList = new LinkedList<>();
        List<String> albumList = new LinkedList<>();
 
        
        songList.add("abcdefu");
        songList.add("Unwell");
        songList.add("Perfect");
        songList.add("Lover");
        songList.add("Pompeii");
 
        artistList.add("Gayle    ");
        artistList.add("Matchbox 20");
        artistList.add("Simple Plan");
        artistList.add("Taylor Swift");
        artistList.add("Bastille");
 
        
        for (int i = 0; i < songList.size(); i++) {
            String song = songList.get(i);
            String artist = artistList.get(i);
            String albumEntry = song + " - " + artist;
            albumList.add(albumEntry);
        }
 
       
        System.out.println("Songs:\t\tArtists:\t\tAlbums:");
        for (int i = 0; i < songList.size(); i++) {
            System.out.print(songList.get(i) + "\t\t");
            System.out.print(artistList.get(i) + "\t\t");
            System.out.println(albumList.get(i));
        }
    }
}