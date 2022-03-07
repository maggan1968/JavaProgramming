package day31_CustomClass_Constructors.MovieTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country;
    public String title;
    public String genre;
    public int releaseDate;
    public String director;
    public ArrayList<String>casts = new ArrayList<>();

    public void setInfo(String country, String title, String genre, int releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;

    }


    //addCast(String): adds the given string argument to the arrayList casts
    public void addCast(String cast){
        casts.add(cast);

    }

   // addCasts(String[]): adds the given string array argument to the arrayList casts
    public void addCast(String[] casts){
        this.casts.addAll( Arrays.asList(casts) );
    }

    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM/dd/YYYY EEEE");
        return "Movie{" +
                "title= '" + title + '\'' +
                ", country= '" + country + '\'' +
                ", genre= '" + genre + '\'' +
                ", director= '" + director + '\'' +
                ", releaseDate= " + releaseDate +
                ", total number of casts= " + casts.size() +
                '}';
    }

    public void addCast(ArrayList<String> students) {
    }
}




/*
3. Movie Task:

	3.1. Create a class named Movie
	    Attributes:
	        country (String), title (String), Genre (String), releaseDate (String), director (String),
	         casts (ArrayList<String>)

		Add a constructor to set the country, title, release date, and director of the Movie

	    Actions
	        addCast(String): adds the given string argument to the arrayList casts
	        addCasts(String[]): adds the given string array argument to the arrayList casts
	        toString(): returns the name of country, title, release date, and total number of casts
 */