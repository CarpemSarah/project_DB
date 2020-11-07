public class MoviesDTO {
    private int movie_ID;
    private String title;
    private String leaRole;// 주연
    private String trailerLink;// 유튜브 링크로 사용
    private double audienceRating;
    private int length;// 분단위로 기록
    private String genre;

    public MoviesDTO() {

    }

    // 겟셋터
    public int getMovie_ID() {
        return movie_ID;
    }
    public String getTitle() {
        return title;
    }
    public String getLeaRole() {
        return leaRole;
    }
    public String getTrailerLink() {
        return trailerLink;
    }
    public double getAudienceRating() {
        return audienceRating;
    }
    public int getLength() {
        return length;
    }
    public String getGenre() {
        return genre;
    }
    public void setMovie_ID(int movie_ID) {
        this.movie_ID = movie_ID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setLeaRole(String leaRole) {
        this.leaRole = leaRole;
    }
    public void setTrailerLink(String trailerLink) {
        this.trailerLink = trailerLink;
    }
    public void setAudienceRating(double audienceRating) {
        this.audienceRating = audienceRating;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // 생성자
    public MoviesDTO(int movie_ID, String title, String leaRole, String trailerLink, double audienceRating, int length,
                     String genre) {
        super();
        this.movie_ID = movie_ID;
        this.title = title;
        this.leaRole = leaRole;
        this.trailerLink = trailerLink;
        this.audienceRating = audienceRating;
        this.length = length;
        this.genre = genre;
    }
    @Override
    public String toString() {
        return "MoviesDTO [movie_ID=" + movie_ID + ", title=" + title + ", leaRole=" + leaRole + ", trailerLink="
                + trailerLink + ", audienceRating=" + audienceRating + ", length=" + length + ", genre=" + genre + "]";
    }
}