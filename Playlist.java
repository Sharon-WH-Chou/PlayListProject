import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;




     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
     public Playlist()
     {
         playlist = new ArrayList<Song>();
     }
     
     /**
      * Adds an existing song object
      */
     public void addSong(Song song)
     {
         playlist.add(song);
     }
     
     /**
      * Adds a new song object
      */
     public void addSong(String name, String artist, int dur)
     {
         Song song = new Song(name, artist, dur);
         playlist.add(song);
     }
     
     /**
      * Likes the given song.
      * @param name of the song
      */
     public void likeSong(String name)
     {
         for (Song song: playlist)
         {
             if (song.getName().equals(name))
             {
                 song.setLikedStatus();
             }
         }
     }
     
     /**
       * Removes a specific song from the playlist
       */
      public void removeSong(String name)
      {
          for (int i = 0; i < playlist.size(); i++)
          {
              if (playlist.get(i).getName().equals(name))
              {
                  playlist.remove(i);
              }
          }
      }
      
      /**
       * Displays the entire playlist
       * @return the entire playlist
       */
      public String showPlaylist()
      {
          String list = "";
          for (Song song : playlist)
          {
              list += song.toString();
          }
          list += "\n";
          return list;
      }
      
      


      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    
      
}
