package by.itacademy.jd2.firstApp.homework1;

import java.util.Comparator;

public class Artist implements Comparable<Artist> {
    String name;
    int count;

    public Artist(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public int compareTo(Artist o) {
        return this.count - o.getCount();
    }

}
