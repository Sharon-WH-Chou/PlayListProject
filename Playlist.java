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
      * 
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
       * 
       * @return a String of the entire playlist
       */
      public String showPlaylist()
      {
          String list = "";
          for (Song song : playlist)
          {
              list += song.toString();
              list += "\n";
          }
          return list;
      }
      
      /**
       * Examines a sublist of just the "liked" songs
       * 
       * @return a String of the sublist of the "liked" songs
       */
      public String showLikedPlaylist()
      {
          String likedList = "";
          for (Song song : playlist)
          {
              if (song.getLiked())
              {
                  likedList += song.toString();
                  likedList += "\n";
              }
          }
        return likedList;
      }
      
      /**
       * Prints the total duration of the playlist
       * 
       * @return String of duration of playlist in minutes
       */
      public String printDuration()
      {
          int sum = 0;
          String total = "";
          for (Song song : playlist)
          {
              sum += song.getDuration();
          }
          total += (int) sum/60 + ":";
         if ((int)sum%60 < 10)
         {
             total += "0" + (int)sum%60;
         }
         else
         {
             total += (int)sum%60;
         }
         return total;
      }
      
      

    /**
     * Removes all “unliked” songs in a playlist
     */
    public void removeUnliked()
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (!playlist.get(i).getLiked())
            {
                playlist.remove(i);
                i--;
            }
        }
    }
}
