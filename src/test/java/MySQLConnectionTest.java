import java.sql.Connection;
import java.sql.DriverManager;
import org.testng.annotations.Test;


public class MySQLConnectionTest {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/blog";
    private static final String USER = "root";
    private static final String PW = "1234";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        try (
                Connection conn = DriverManager.getConnection(URL, USER, PW)) {
            System.out.println(conn); // 콘솔창에서 연결정보를 출력하여 확인한다. } catch (Exception e) { // TODO: handle exception } } }

        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
