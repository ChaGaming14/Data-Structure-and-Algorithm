import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
 
public class ListRecursion {
    public static void main(String[] args) {
       
        List<String> songs = new LinkedList<>();
        List<String> artist = new LinkedList<>();
        List<String> album = new LinkedList<>();
 
        
        songs.add("abcdefu");
        songs.add("Unwell");
        songs.add("Perfect");
        songs.add("Lover");
        songs.add("Pompeii");
 
        artist.add("Gayle    ");
        artist.add("Matchbox 20     ");
        artist.add("Simple Plan     ");
        artist.add("TaylorSwift     ");
        artist.add("Bastille        ");
        
        album.add("ASOHM (2020)");
        album.add("MTYTYA (2003)");
        album.add("XXX (2010)");
        album.add("ME! (2019)");
        album.add("BADLOOD (2013)");
        
        combine(songs.listIterator(), artist.listIterator(), album.listIterator());
    }
        public static void combine(Iterator<String> songs, Iterator<String> artist, Iterator<String> album) {
            while(songs.hasNext() && artist.hasNext() && album.hasNext()) {
                System.out.println(songs.next() + "-" + artist.next() + "-" + album.next());
            }
        }
            
      