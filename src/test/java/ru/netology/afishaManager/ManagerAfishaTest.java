package ru.netology.afishaManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ManagerAfishaTest {
    @Test
    public void shouldFindAllAddMovie() {
        String movie1 = "Movie1";
        String movie2 = "Movie2";
        String movie3 = "Movie3";
        String movie4 = "Movie4";
        String movie5 = "Movie5";
        String movie6 = "Movie6";
        String movie7 = "Movie7";


        ManagerAfisha manager = new ManagerAfisha();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
        };

        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddMovieOverTen() {
        String movie1 = "Movie1";
        String movie2 = "Movie2";
        String movie3 = "Movie3";
        String movie4 = "Movie4";
        String movie5 = "Movie5";
        String movie6 = "Movie6";
        String movie7 = "Movie7";
        String movie8 = "Movie8";
        String movie9 = "Movie9";
        String movie10 = "Movie10";
        String movie11 = "Movie11";
        String movie12 = "Movie12";
        String movie13 = "Movie13";
        String movie14 = "Movie14";

        ManagerAfisha manager = new ManagerAfisha();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
        manager.add(movie12);
        manager.add(movie13);
        manager.add(movie14);

        String[] expected = {
                movie14,
                movie13,
                movie12,
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldFindLastAddMovieOnlySeven() {
        String movie1 = "Movie1";
        String movie2 = "Movie2";
        String movie3 = "Movie3";
        String movie4 = "Movie4";
        String movie5 = "Movie5";
        String movie6 = "Movie6";
        String movie7 = "Movie7";
        String movie8 = "Movie8";
        String movie9 = "Movie9";
        String movie10 = "Movie10";
        String movie11 = "Movie11";


        ManagerAfisha manager = new ManagerAfisha(7);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        String[] expected = {
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldFindMovieWithoutLimit() {
        String movie1 = "Movie1";
        String movie2 = "Movie2";
        String movie3 = "Movie3";
        String movie4 = "Movie4";
        String movie5 = "Movie5";

        ManagerAfisha manager = new ManagerAfisha();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String [] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String [] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldFindMovieWithLimit() {

        String movie1 = "Movie1";
        String movie2 = "Movie2";
        String movie3 = "Movie3";
        String movie4 = "Movie4";
        String movie5 = "Movie5";
        String movie6 = "Movie6";
        String movie7 = "Movie7";
        String movie8 = "Movie8";
        String movie9 = "Movie9";
        String movie10 = "Movie10";
        String movie11 = "Movie11";


        ManagerAfisha manager = new ManagerAfisha(9);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        String[] expected = {
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
        };

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }
    @Test
    public void shouldFindMovieOverLimit() {

        String movie1 = "Movie1";
        String movie2 = "Movie2";
        String movie3 = "Movie3";
        String movie4 = "Movie4";
        String movie5 = "Movie5";
        String movie6 = "Movie6";
        String movie7 = "Movie7";
        String movie8 = "Movie8";
        String movie9 = "Movie9";
        String movie10 = "Movie10";
        String movie11 = "Movie11";


        ManagerAfisha manager = new ManagerAfisha(14);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        String[] expected = {
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(actual, expected);
    }
}


