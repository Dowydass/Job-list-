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
                "company_name TEXT," +
                "description TEXT," +
                "headquarters_location TEXT," +
                "avarage_salary DOUBLE) ";
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
    public static void createCompany(Companies companies){
        String query = "INSERT INTO Companies(company_name,description,headquarters_location,avarage_salary) VALUES(?,?,?,?)";

        try{
            Connection connection = DriverManager.getConnection(URL,USER,PASS);
            PreparedStatement preparedStatement = connection.prepareStatement(query);


            preparedStatement.setString(1,companies.getCompanyName());
            preparedStatement.setString(2, companies.getDescription());
            preparedStatement.setString(3,companies.getHeadquartersLocation());
            preparedStatement.setDouble(4,companies.getAverageSalary());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
