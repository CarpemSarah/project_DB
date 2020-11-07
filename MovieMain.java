public class MovieMain {
    public static void main(String[] args){
        MovieDAO dao = new MovieDAO();
        MoviesDTO dto = new MoviesDTO();

        dto.setTitle("담보");
        dto.setLeaRole("성동일, 하지원, 김희원, 박소이");
        dto.setGenre("드라마 / 한국");
        dto.setLength(113);
        dto.setTrailerLink("http://caching.lottecinema.co.kr//Media/MovieFile/MovieMedia/202009/16334_301_1.mp4");

        try {
            dao.insert(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
