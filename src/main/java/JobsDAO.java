import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JobsDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/job";
    private static final String PASS = "";
    private static final String USER = "root";

    public static void createTableJobs() {
        String query = "CREATE TABLE IF NOT EXISTS Jobs(" +
                "job_id INT PRIMARY KEY AUTO_INCREMENT," +
                "job_title TEXT," +         //job_title TEXT
                "salary TEXT," +            //salary TEXT
                "description TEXT," +       //description TEXT
                "location TEXT," +          //location TEXT
                "position TEXT," +
                "category_id INT,"+         // category_id INT
                "company_id INT,"+          // company_id INT
                "FOREIGN KEY (category_id) REFERENCES Categories(category_id),"+
                "FOREIGN KEY (company_id) REFERENCES Companies(company_id))";


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
    public static void createJob(Jobs job){
        String query = "INSERT INTO Jobs(job_title,salary,description,location,position,category_id, company_id) VALUES(?,?,?,?,?,?,?)";
        try{
            Connection connection = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            System.out.println("Inserting record..");
            preparedStatement.setString(1, job.getJobTitle());
            preparedStatement.setDouble(2, job.getSalary());
            preparedStatement.setString(3, job.getDescription());
            preparedStatement.setString(4, job.getLocation());
            preparedStatement.setString(5, job.getPosition());
            preparedStatement.setInt(6, job.getCategoryId());
            preparedStatement.setInt(7, job.getCompanyId());

            preparedStatement.executeUpdate();
            System.out.println("New job was added...");

            preparedStatement.close();
            connection.close();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
