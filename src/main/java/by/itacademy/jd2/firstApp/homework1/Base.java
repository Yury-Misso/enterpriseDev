package by.itacademy.jd2.firstApp.homework1;

import java.util.*;

public class Base {
    private int artist1 = 0;
    private int artist2 = 0;
    private int artist3 = 0;
    private int artist4 = 0;

    private int genre1 = 0;
    private int genre2 = 0;
    private int genre3 = 0;
    private int genre4 = 0;
    private int genre5 = 0;
    private int genre6 = 0;
    private int genre7 = 0;
    private int genre8 = 0;
    private int genre9 = 0;
    private int genre10 = 0;

    private List<About> abouts = new ArrayList<>();

    private static Base instance;

    public static synchronized Base getInstance() {
        if (instance == null) {
            instance = new Base();
        }
        return instance;
    }

    public synchronized boolean addToBase(Map<String, String[]> map) {
        Set<Map.Entry<String, String[]>> entrySet = map.entrySet();
        for (Map.Entry<String, String[]> entry : entrySet) {
            if (entry.getKey().equalsIgnoreCase("genre")) {
                if (entry.getValue().length < 3) {
                    return false;
                }
            }
            if (entry.getKey().equalsIgnoreCase("artist")) {
                if (entry.getValue() == null) {
                    return false;
                }
            }
            if (entry.getKey().equalsIgnoreCase("about")) {
                if (entry.getValue()[0].isEmpty()) {
                    return false;
                }
            }
        }

        for (Map.Entry<String, String[]> entry : entrySet) {
            if (entry.getKey().equalsIgnoreCase("artist")) {
                if (entry.getValue()[0].equalsIgnoreCase("artist1"))
                    artist1 += 1;
                if (entry.getValue()[0].equalsIgnoreCase("artist2"))
                    artist2 += 1;
                if (entry.getValue()[0].equalsIgnoreCase("artist3"))
                    artist3 += 1;
                if (entry.getValue()[0].equalsIgnoreCase("artist4"))
                    artist4 += 1;
            } else if (entry.getKey().equalsIgnoreCase("genre")) {
                String[] values = entry.getValue();
                for (String genre : values) {
                    if (genre.equalsIgnoreCase("genre1"))
                        genre1 += 1;
                    if (genre.equalsIgnoreCase("genre2"))
                        genre2 += 1;
                    if (genre.equalsIgnoreCase("genre3"))
                        genre3 += 1;
                    if (genre.equalsIgnoreCase("genre4"))
                        genre4 += 1;
                    if (genre.equalsIgnoreCase("genre5"))
                        genre5 += 1;
                    if (genre.equalsIgnoreCase("genre6"))
                        genre6 += 1;
                    if (genre.equalsIgnoreCase("genre7"))
                        genre7 += 1;
                    if (genre.equalsIgnoreCase("genre8"))
                        genre8 += 1;
                    if (genre.equalsIgnoreCase("genre9"))
                        genre9 += 1;
                    if (genre.equalsIgnoreCase("genre10"))
                        genre10 += 1;
                }
            } else if (entry.getKey().equalsIgnoreCase("about")) {
                abouts.add(new About(new Date(), entry.getValue()[0]));
            }
        }
        return true;
    }

    public synchronized Map<String, String[]> getBaseData() {
        Artist artist1 = new Artist("artist1", this.artist1);
        Artist artist2 = new Artist("artist2", this.artist2);
        Artist artist3 = new Artist("artist3", this.artist3);
        Artist artist4 = new Artist("artist4", this.artist4);

        List<Artist> artists = new ArrayList<>();
        artists.add(artist1);
        artists.add(artist2);
        artists.add(artist3);
        artists.add(artist4);

        artists.sort((Comparator.comparingInt(Artist::getCount)));

        List<Genre> genres = new ArrayList<>();
        genres.add(new Genre("genre1", this.genre1));
        genres.add(new Genre("genre2", this.genre2));
        genres.add(new Genre("genre3", this.genre3));
        genres.add(new Genre("genre4", this.genre4));
        genres.add(new Genre("genre5", this.genre5));
        genres.add(new Genre("genre6", this.genre6));
        genres.add(new Genre("genre7", this.genre7));
        genres.add(new Genre("genre8", this.genre8));
        genres.add(new Genre("genre9", this.genre9));
        genres.add(new Genre("genre10", this.genre10));

        genres.sort((Comparator.comparingInt(Genre::getCount)));

        this.abouts.sort((Comparator.comparing(About::getDate)));

        Map<String, String[]> stringMap = new LinkedHashMap<>();

        String[] artistsArr = new String[4];
        for (int i = 0; i < artists.size(); i++) {
            artistsArr[i] = artists.get(i).name + " : " + artists.get(i).getCount();
        }
        stringMap.put("artist", artistsArr);

        String[] genresArr = new String[10];
        for (int i = 0; i < genres.size(); i++) {
            genresArr[i] = genres.get(i).name + " : " + genres.get(i).getCount();
        }
        stringMap.put("genre", genresArr);

        String[] aboutsArr = new String[abouts.size()];
        for (int i = 0; i < abouts.size(); i++) {
            aboutsArr[i] = abouts.get(i).getDate() + " : " + abouts.get(i).getAbout();
        }
        stringMap.put("about", aboutsArr);

        return stringMap;
    }

    @Override
    public String toString() {
        return "Base{" +
                "artist1=" + artist1 +
                ", artist2=" + artist2 +
                ", artist3=" + artist3 +
                ", artist4=" + artist4 +
                ", genre1=" + genre1 +
                ", genre2=" + genre2 +
                ", genre3=" + genre3 +
                ", genre4=" + genre4 +
                ", genre5=" + genre5 +
                ", genre6=" + genre6 +
                ", genre7=" + genre7 +
                ", genre8=" + genre8 +
                ", genre9=" + genre9 +
                ", genre10=" + genre10 +
                ", abouts=" + abouts +
                '}';
    }
}
