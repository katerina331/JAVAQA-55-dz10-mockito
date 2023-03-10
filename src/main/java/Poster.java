public class Poster {
    private int id;
    private String filmName;
    private String filmUrl;
    private String filmStyle;
    private boolean premiereTomorrow;

    public Poster(int id, String filmName, String filmUrl, String filmStyle, boolean premiereTomorrow) {
        this.id = id;
        this.filmName = filmName;
        this.filmUrl = filmUrl;
        this.filmStyle = filmStyle;
        this.premiereTomorrow = premiereTomorrow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmUrl() {
        return filmUrl;
    }

    public void setFilmUrl(String filmUrl) {
        this.filmUrl = filmUrl;
    }

    public String getFilmStyle() {
        return filmStyle;
    }

    public void setFilmStyle(String filmStyle) {
        this.filmStyle = filmStyle;
    }

    public boolean isPremiereTomorrow() {
        return premiereTomorrow;
    }

    public void setPremiereTomorrow(boolean premiereTomorrow) {
        this.premiereTomorrow = premiereTomorrow;
    }
}
