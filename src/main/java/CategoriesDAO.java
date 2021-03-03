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
                "category_name TEXT)";

        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.println("Creating table .........");
            preparedStatement.executeUpdate();
            System.out.println("Table successfully created.......");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void createCategory(Categories categories){
        String query =  "INSERT INTO Categories(category_name) VALUES(?)";

        try{
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1,categories.getCategoryName());
            preparedStatement.executeUpdate();

            preparedStatement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
