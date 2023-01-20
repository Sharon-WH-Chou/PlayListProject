/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @authors Sharon Chou and Kamryn Chan
 * @version 2023-01-19
 */
public class PlaylistTester 
{
    public static void main(String[] args) 
    {
        System.out.println("Initializing a Playlist...\n");
        Playlist p = new Playlist();
        
        System.out.println("Creating a Song object to add to playlist...\n");
        Song s = new Song("A Sky Full of Stars", "Coldplay", 267);

        System.out.println("Adding songs to the Playlist...\n");
        p.addSong("505", "Arctic Monkeys", 252);
        p.addSong("I Want You", "Mitski", 182);
        p.addSong("Heat Waves", "Glass Animals", 138);
        p.addSong(s);
        p.addSong("Blackbird", "The Beatles", 137);

        System.out.println("Printing the songs...\n");
        System.out.println(p.showPlaylist());

        System.out.println("\nLiking the songs in position 2, 3, 5....\n");
        p.likeSong("I Want You");
        p.likeSong("Heat Waves");
        p.likeSong("Blackbird");

        System.out.println("Printing the songs...\n");
        System.out.println(p.showPlaylist());

        System.out.println("\nRemoving the song in position 4...\n");
        p.removeSong("A Sky Full of Stars");

        System.out.println("Printing the songs...\n");
        System.out.println(p.showPlaylist());

        System.out.println("\nPrinting only the liked songs...\n");
        System.out.println(p.showLikedPlaylist());

        System.out.println("\nPrinting the total duration of all songs...\n");
        System.out.println(p.printDuration());

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        p.removeUnliked();

        System.out.println("Printing all songs...\n");
        System.out.println(p.showPlaylist());
    }
}
