package day05;

import java.util.ArrayList;

public class Demo07 {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie = new Movie("牛来", 6.0, "玉芬");
        movies.add(movie);

        movies.add(new Movie("举起手来", 6.4, "赵本山"));
        movies.add(new Movie("749", 1.6, "王俊凯"));

        for (Movie movie1 : movies) {
            System.out.println(movie1);
        }

        System.out.println("=============================");
        movies.forEach(System.out::println);
    }
}
