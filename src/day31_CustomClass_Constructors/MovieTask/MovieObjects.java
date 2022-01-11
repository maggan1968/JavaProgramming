package day31_CustomClass_Constructors.MovieTask;

import day31_CustomClass_Constructors.MovieTask.Movie;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.setInfo("USA",
                "Journey to SDET: Cydeo Batch 23", " Adventure, Comedy", 10/25/2021,
                "Kuzzat Altay");

        String[] casts = {"Adam", "Muhtar"};
        movie1.addCast("Asiya");
        movie1.addCast(casts);


        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Aziza", "Vesela", "Nilufar", "Margie", "Igor"));

        movie1.addCast(students);

        System.out.println(movie1);;

    }
}
/*
 3.2create a class called MovieObjects
            1. create an object of the movie:
                    title: Journey to SDET: Cydeo Batch 23
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 10/25/2021
                    director: Kuzzat Altay
                    Casts: Asiya, Adam, Muhtar and 5 more students from your group

        print the full info of the movie
 */