import javax.persistence.*;

@Entity
@Table(name = "Jobs")
public class Jobs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private int jobId;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "salary")
    private double salary;
    @Column(name = "description")
    private String description;
    @Column(name = "location")
    private String location;
    @Column(name = "position")
    private String position;
    @Column(name = "company_id")
    private int companyId;
    @Column(name = "category_id")
    private int categoryId;

    public Jobs( String jobTitle, double salary, String description, String location, String position, int companyId, int categoryId) {

        this.jobTitle = jobTitle;
        this.salary = salary;
        this.description = description;
        this.location = location;
        this.position = position;
        this.companyId = companyId;
        this.categoryId = categoryId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "jobId=" + jobId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", position='" + position + '\'' +
                ", companyId=" + companyId +
                ", categoryId=" + categoryId +
                '}';
    }
}
