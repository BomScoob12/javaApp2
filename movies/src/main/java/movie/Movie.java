
package movie;

public class Movie {
    private String title;
    private double hours;
    private int grade;

    public Movie(String title, double hours, int grade) {
        if (title.isBlank()) title = "No title";
        if (hours <= 0.0) hours = 2.0;
        if (grade < 1 || grade > 5) grade = 3;
        
        this.title = title;
        this.hours = hours; 
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public double getHours() {
        return hours;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Movie: " + title + "(" + hours + ", grade:" + grade + ")";
    }
    
    public boolean equals(Movie m){
        return this.getTitle().equals(m.getTitle()) &&
                this.getHours() == m.getHours() &&
                this.getGrade() == m.getGrade();
        
    }
    
    public int compareTo(Movie m){
        if (this.getGrade() < m.getGrade() || m.getClass()== null) return 1;
        if (this.getGrade() > m.getGrade()) return -1;
        return 0;
    }
}
