import java.sql.*;
import java.time.LocalDateTime;

public class Helloworld {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String server = "localhost"; // MySQL 서버 주소
        String database = "test"; // MySQL DATABASE 이름
        String user_name = "root"; //  MySQL 서버 아이디
        String password = "saera1203!"; // MySQL 서버 비밀번호

        // 1.드라이버 로딩
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
            e.printStackTrace();
        }

        // 2.연결
        try {
            con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?useSSL=false", user_name, password);
            System.out.println("정상적으로 연결되었습니다.");

            String pSQL = "INSERT INTO test.music(idmusic,title,singer,hashtag,time) VALUES (?,?,?,?,?)";

//            pstmt = con.prepareStatement(pSQL);
//            pstmt.setInt(1,5);
//            pstmt.setString(2, "잠이 오질 않네요");
//            pstmt.setString(3, "장범준");
//            pstmt.setString(4, "사랑, 고백");
//            pstmt.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
//            pstmt.executeUpdate();

            String SQL = "SELECT * FROM test.music";
            String requestSinger = "담보";
            String SQL2 = "SELECT * FROM test.movies WHERE title = '"+requestSinger+"'";

            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL2);
            while(rs.next()) {
                //Long no = rs.getLong(1);
                int idmusic = rs.getInt(1);
                String title = rs.getString(2);
                String singer = rs.getString(3);
                String hashtag = rs.getString(4);
                Timestamp time = rs.getTimestamp(5);
                System.out.println(idmusic + " | " +title + " | " + singer +
                        " | " + hashtag+ " | " + time );
            }
        } catch(SQLException e) {
            System.err.println("con 오류:" + e.getMessage());
            e.printStackTrace();
        }

        // 3.해제
        finally {
            try{
                if (rs != null){rs.close();}
                if (stmt != null){stmt.close();}
                if (pstmt != null){pstmt.close();}
                if(con != null){con.close();}
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
}
