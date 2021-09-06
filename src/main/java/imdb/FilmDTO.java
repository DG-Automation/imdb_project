package imdb;

public class FilmDTO {
    private String title;
    private double score;
    private int year;
    private int duration;
    private String rating;
    private int budget;
    private String genres;
    private int gross;
    private String director;
    private String actor1;
    private String actor2;
    private String actor3;
    private String language;
    private String country;

    public FilmDTO(String[] filmRawData) {
        this.title = filmRawData[0];
        this.score = Double.parseDouble(filmRawData[1]);
        this.year = Integer.parseInt(filmRawData[2]);
        this.duration = Integer.parseInt(filmRawData[3]);
        this.rating = filmRawData[4];
        this.budget = Integer.parseInt(filmRawData[5]);
        this.genres = filmRawData[6];
        this.gross = Integer.parseInt(filmRawData[7]);
        this.director = filmRawData[8];
        this.actor1 = filmRawData[9];
        this.actor2 = filmRawData[10];
        this.actor3 = filmRawData[11];
        this.language = filmRawData[12];
        this.country = filmRawData[13];
    }

    public String getTitle() {
        return title;
    }

    public double getScore() {
        return score;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    public int getBudget() {
        return budget;
    }

    public String getGenres() {
        return genres;
    }

    public int getGross() {
        return gross;
    }

    public String getDirector() {
        return director;
    }

    public String getActor1() {
        return actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public String getActor3() {
        return actor3;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }
}
