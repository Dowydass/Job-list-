import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CompaniesDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/job";
    private static final String PASS = "";
    private static final String USER = "root";

    public static void createTableCompanies() {
        String query = "CREATE TABLE IF NOT EXISTS Companies(" +
                "company_id INTEGER PRIMARY KEY AUTO_INCREMENT," +
                "company_name VARCHAR(255)," +
                "description TEXT," +
                "headquarters_location VARCHAR(255)," +
                "avarage_salary DOUBLE) ";
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
