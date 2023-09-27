package by.itacademy.jd2.firstApp.homework1;

import java.util.Date;

public class About implements Comparable<About> {
    Date date;
    String about;

    public About(Date date, String about) {
        this.date = date;
        this.about = about;
    }

    public Date getDate() {
        return this.date;
    }

    public String getAbout() {
        return this.about;
    }


    @Override
    public int compareTo(About o) {
        return this.date.compareTo(o.getDate());
    }

    @Override
    public String toString() {
        return "About{" +
                "date=" + date +
                ", about='" + about + '\'' +
                '}';
    }
}
