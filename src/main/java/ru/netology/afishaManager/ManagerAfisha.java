package ru.netology.afishaManager;

public class ManagerAfisha {
    protected String[] movies = new String[0];
    protected int limit;
    public ManagerAfisha(int limit) {
        this.limit = limit;
    }

    public ManagerAfisha() {

        limit = 10;
    }


    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {

        return movies;
    }

    public String[] findLast() {
        int resultSize = limit < movies.length ? limit : movies.length;
        String[] result = new String[resultSize];
        for (int i = 0; i < resultSize; i++){
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}

