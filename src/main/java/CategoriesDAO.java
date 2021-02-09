import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriesDAO {


    private static final String URL = "jdbc:mysql://localhost:3306/job";
    private static final String PASS = "";
    private static final String USER = "root";


    public static void createTableCategories() {
        String query = "CREATE TABLE IF NOT EXISTS Categories(" +
                "category_id INTEGER PRIMARY KEY AUTO_INCREMENT," +
                "category_name VARCHAR(255))";
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.println("Creating table .........");
            preparedStatement.executeUpdate(query);
            System.out.println("Table successfully created.......");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
