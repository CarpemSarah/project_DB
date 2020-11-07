import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class AbstractDAO {
    Connection con;
    PreparedStatement pstmt;
    ResultSet rs;
    String server = "localhost"; // MySQL 서버 주소
    String database = "test"; // MySQL DATABASE 이름
    String user_name = "root"; //  MySQL 서버 아이디
    String password = "saera1203!"; // MySQL 서버 비밀번호

    public final void execute() {
        try {
            init();
            query();
            close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void init() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database + "?useSSL=false", user_name, password);
    }

    public abstract void query() throws Exception;

    private void close() {
        if (rs != null)
            try {
                rs.close();
            } catch (Exception e) {
            }
        if (pstmt != null)
            try {
                rs.close();
            } catch (Exception e) {
            }
        if (con != null)
            try {
                rs.close();
            } catch (Exception e) {
            }
    }

}