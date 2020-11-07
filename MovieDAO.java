public class MovieDAO {
    public void insert(MoviesDTO dto) throws Exception {
        StringBuilder sql = new StringBuilder();
        //insert into movies(actors, genre, length, title, trailer) values ('kim', 'dsadsad', 149, 'happy', 'www.dfsdfds.com');
        sql.append("insert into movies");
        sql.append("(leaRole, genre, length, title, trailerlink)");
        sql.append("values (?, ?, ?, ?, ?)");

        new AbstractDAO() {
            @Override
            public void query() throws Exception {
                pstmt = con.prepareStatement(sql.toString());
                pstmt.setString(1, dto.getLeaRole());
                pstmt.setString(2, dto.getGenre());
                pstmt.setInt(3, dto.getLength());
                pstmt.setString(4, dto.getTitle());
                pstmt.setString(5, dto.getTrailerLink());
                pstmt.executeUpdate();
            }
        }.execute();
    }
}