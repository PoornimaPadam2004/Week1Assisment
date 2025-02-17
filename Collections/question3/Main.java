package Collections.question3;

import java.util.*;
public class Main {
	    public static void main(String[] args) {
	        
	        List<Movie> movieList = createMovieSet();

	        sortByLanguage(movieList);
	        System.out.println("Movies sorted by language:");
	        for (Movie movie : movieList) {
	            System.out.println(movie);
	        }

	        sortByDirector(movieList);
	        System.out.println("\nMovies sorted by director:");
	        for (Movie movie : movieList) {
	            System.out.println(movie);
	        }

	        sortByDuration(movieList);
	        System.out.println("\nMovies sorted by duration:");
	        for (Movie movie : movieList) {
	            System.out.println(movie);
	        }
	    }

	    public static List<Movie> createMovieSet() {
	        List<Movie> movieList = new ArrayList<>();
	        
	        movieList.add(new Movie("Inception", "English", new GregorianCalendar(2010, Calendar.JULY, 16).getTime(), "Christopher Nolan", "Emma Thomas", 148));
	        movieList.add(new Movie("Parasite", "Korean", new GregorianCalendar(2019, Calendar.MAY, 30).getTime(), "Bong Joon-ho", "Bong Joon-ho", 132));
	        movieList.add(new Movie("Amélie", "French", new GregorianCalendar(2001, Calendar.APRIL, 25).getTime(), "Jean-Pierre Jeunet", "Pierre Grise", 122));
	        movieList.add(new Movie("The Dark Knight", "English", new GregorianCalendar(2008, Calendar.JULY, 18).getTime(), "Christopher Nolan", "Charles Roven", 152));
	        movieList.add(new Movie("Spirited Away", "Japanese", new GregorianCalendar(2001, Calendar.JULY, 20).getTime(), "Hayao Miyazaki", "Toshio Miyahara", 125));

	        return movieList;
	    }

	    public static void sortByLanguage(List<Movie> movieList) {
	        Collections.sort(movieList);
	    }

	    public static void sortByDirector(List<Movie> movieList) {
	        Collections.sort(movieList, Movie.sortByDirector);
	    }

	    public static void sortByDuration(List<Movie> movieList) {
	        movieList.sort(Comparator.comparingInt(Movie::getDuration));
	    }
	}
