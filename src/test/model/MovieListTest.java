package model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class MovieListTest {
    private MovieList movieList1;

    @BeforeEach
    void runBefore() {
        movieList1 = new MovieList();
    }

    @Test
    void testConstructor() {
        assertEquals(0, movieList1.size());

    }

    @Test
    void testAddMoviesList() throws IOException {
        movieList1.addMoviesList();
        assertEquals("The Godfather", movieList1.get(1).getTitle());
    }


}
