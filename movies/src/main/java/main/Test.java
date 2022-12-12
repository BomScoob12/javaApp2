package main;

import movie.Movie;
import movie.MovieList;

public class Test {

    public static void main(String[] args) {
        testMovie();
        testList();
    }

    private static void testMovie() {
        Movie g = new Movie("", 2.0, 2);
        Movie gf = new Movie("ff", 5.1, 1);
        Movie gff = new Movie("", 2.0, 2);
        System.out.println(g.toString());
        System.out.println(gf.equals(g));
        System.out.println(gff.equals(g));
        System.out.println(gff.compareTo(gf));
        System.out.println(gff.compareTo(g));
    }

    private static void testList() {
        MovieList ml = new MovieList(2);
        ml.addMovie("Doctor Strange", 1.92, 3);
        ml.addMovie("Iron Man", 2.1, 1);
        System.out.println("re " + ml.resize(3));
        ml.addMovie("The Avengers", 2.33, 1);
        System.out.println("getMovie At 1 : " + ml.getMovieAt(1));
        System.out.println("getMovie At 2 : " + ml.getMovieAt(2));
        Movie m = ml.searchForMovieTitle("Doctor Strange");
        if (m != null) {
            System.out.println(m);
        }
    }
}
