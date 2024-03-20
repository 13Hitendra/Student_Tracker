package Test6;

import java.util.ArrayList;
import java.util.List;

public class MovieList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Movie> movies = new ArrayList<>();
		 
		 	movies.add(new Movie(1, "Movie1", List.of("Amitabh Bachchan", "Shahrukh Khan")));
	        movies.add(new Movie(2, "Movie2", List.of("Amitabh Bachchan", "Aamir Khan")));
	        movies.add(new Movie(3, "Movie3", List.of("Salman Khan", "Amitabh Bachchan")));
	        
	        int moviesWithAmitabh = countMovie(movies, "Amitabh Bachchan");
	        System.out.println("Amitabh Bachchan acted in " + moviesWithAmitabh + " movies.");

	}
	public static int countMovie(List<Movie> movies, String actorName) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.actors.contains(actorName)) {
                count++;
            }
        }
        return count;
    }

}
