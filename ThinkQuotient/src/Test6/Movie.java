package Test6;

import java.util.List;

public class Movie {
/*8.	Consider an ArrayList of Movie  [2M]
Movie has (int movieid, String  moviename, List<String> actor)
Find “Amitabh bachchan has acted in how many movies

*/
	
	int movieId;
    String movieName;
    List<String> actors;

    public Movie(int movieId, String movieName, List<String> actors) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.actors = actors;
    }
}