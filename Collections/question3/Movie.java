package Collections.question3;

import java.util.*;
public class Movie implements Comparable<Movie>{
	
	    private String name;
	    private String language;
	    private Date releaseDate;
	    private String director;
	    private String producer;
	    private int duration; 

	    public Movie(String name, String language, Date releaseDate, String director, String producer, int duration) {
	        this.name = name;
	        this.language = language;
	        this.releaseDate = releaseDate;
	        this.director = director;
	        this.producer = producer;
	        this.duration = duration;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getLanguage() {
	        return language;
	    }

	    public void setLanguage(String language) {
	        this.language = language;
	    }

	    public Date getReleaseDate() {
	        return releaseDate;
	    }

	    public void setReleaseDate(Date releaseDate) {
	        this.releaseDate = releaseDate;
	    }

	    public String getDirector() {
	        return director;
	    }

	    public void setDirector(String director) {
	        this.director = director;
	    }

	    public String getProducer() {
	        return producer;
	    }

	    public void setProducer(String producer) {
	        this.producer = producer;
	    }

	    public int getDuration() {
	        return duration;
	    }

	    public void setDuration(int duration) {
	        this.duration = duration;
	    }

	    @Override
	    public String toString() {
	        return "Movie{name='" + name + "', language='" + language + "', director='" + director + "', duration=" + duration + "}";
	    }

	    @Override
	    public int compareTo(Movie otherMovie) {
	        return this.language.compareTo(otherMovie.language); // Sorting by language
	    }

	    public static Comparator<Movie> sortByDirector = new Comparator<Movie>() {
	        @Override
	        public int compare(Movie movie1, Movie movie2) {
	            return movie1.director.compareTo(movie2.director);
	        }
	    };
	}
