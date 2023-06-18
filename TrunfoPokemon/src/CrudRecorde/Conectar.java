package CrudRecorde;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conectar {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "159357456";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/historico";
    
    public static Connection createConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        
        return connection;
    }
}
