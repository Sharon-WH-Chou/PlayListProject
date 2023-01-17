/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @date
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private double dur; //duration in seconds
    private boolean liked;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String title, String artist, double dur)
    {
        this.title = title;
        this.artist = artist;
        this.dur = dur;
        liked = false;
    }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
     
     /**
      * Gets name.
      * @return name of song.
      */
     public String getName()
     {
         return title;
     }
     
     /**
      * Gets artist.
      * @return artist who wrote the song.
      */
     public String getArtist()
     {
         return artist;
     }
     
     /**
      * Gets duration. 
      * @return the length of the song in seconds. 
      */
     public double getDuration()
     {
         return dur;
     }
     
     /**
      * Returns a boolean value to show whether song is liked or not. 
      * @return boolean of liked status
      */
     public boolean getLiked()
     {
         return liked;
     }
     
     /**
    * Sets liked status
    */
    public void setLikedStatus()
    {
         liked = !liked;
    }
    
    /**
    * Creates a string that can be used to display the playlist
    * @return a string that can be used to display the playlist
    */
    public String toString()
    {
         String playlist = title + " by " + artist;
         playlist += " (" + (int) dur/60 + ":" + (int) dur%60 + ")";
         if (liked)
         {
             playlist += "-- liked";
         }
         return playlist;
    }
}
