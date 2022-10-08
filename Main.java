package com.company.java_core.homework24.task1;

public class Main {
    private static Object startTime;

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        Time time1 = new Time(45, 2);
        Movie movie1 = new Movie("Loki", time1);
        Seance seance1 = new Seance(movie1, 12, 14);

        Time time2 = new Time(0, 3);
        Movie movie2 = new Movie("Thor", time1);
        Seance seance2 = new Seance(movie1, 15, 17);

        cinema.getOpen();
        cinema.getSchedules();
        cinema.addMovie(movie1, time1);
        cinema.addSeance(seance1, "Loki");
        cinema.addMovie(movie2, time2);
        cinema.addSeance(seance2, "Thor");
        cinema.getMoviesLibrary();
        cinema.removeMovie(movie1);
        cinema.removeSeance(seance1);
        cinema.removeMovie(movie2);
        cinema.removeSeance(seance2);
        cinema.getMoviesLibrary();
        cinema.getSchedules();
        cinema.getClose();
    }
}
