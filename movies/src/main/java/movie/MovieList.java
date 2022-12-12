package movie;

public class MovieList {

    private Movie[] movies;
    private int numberOfStory;

    public MovieList(int capacity) {
        if (capacity <= 0) {
            capacity = 10;
        }
        movies = new Movie[capacity];
    }

    public int getNumberOfStory() {
        return numberOfStory;
    }

    public boolean isAvailable() {
        return this.numberOfStory != movies.length;
    }

    public boolean addMovie(String title, double hours, int grade) {
        if (isAvailable()) {
            movies[numberOfStory++] = new Movie(title, hours, grade);
            return true;
        }
        if (!isAvailable() || hours <= 0 || grade < 1 || grade > 5) {
            return false;
        }
        return false;
    }

    public Movie getMovieAt(int slot) {
        return (slot >= 0) ? movies[slot] : null;
    }

    public boolean resize(int newSize) {
        if (newSize > movies.length) {
            Movie[] newMovie = new Movie[newSize];
            for (int i = 0; i < movies.length; i++) {
                newMovie[i] = movies[i];
            }
            movies = newMovie;
            return true;
        }
        else {
            return false;
        }
    }

    public Movie searchForMovieTitle(String title) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getTitle().equals(title)) {
                return movies[i];
            }
        }
        return null;
    }
}
