package by.itacademy.jd2.firstApp.homework1;

public class Genre implements Comparable<Genre> {
    String name;
    int count;

    public Genre(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }


    @Override
    public int compareTo(Genre o) {
        return this.count - o.getCount();
    }
}
