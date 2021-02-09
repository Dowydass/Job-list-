public class Jobs {
  private int jobId;
  private String jobTitle;
  private int companyId;
  private double salary;
  private String description;
  private String location;
  private String position;
  private int categoryId;



    public Jobs(String jobTitle, double salary, String description, String location, String position,int companyId, int categoryId) {
        this.jobTitle = jobTitle;
        this.companyId = companyId;
        this.salary = salary;
        this.description = description;
        this.location = location;
        this.position = position;
        this.categoryId = categoryId;
    }


    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
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
                ", companyId=" + companyId +
                ", salary=" + salary +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", position='" + position + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
