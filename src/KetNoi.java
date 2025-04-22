import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KetNoi {
    private static final String URL = "jdbc:sqlserver://LAPTOP-VFDBDQ66:1433;databaseName=QLy_HopDong;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "251405";

    // Phương thức để trả về một kết nối đến database
    public static Connection ketNoiCSDL() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Kết nối thành công đến SQL Server!");
            return conn;
        } catch (SQLException e) {
            System.out.println("Kết nối thất bại.");
            e.printStackTrace();
            return null;
        }
    }

}
