

public class main {
    public static void main(String[] args) {

        CompaniesDAO.createTableCompanies();
        Companies companies = new Companies("Oracle","Product manager","Vilnius",3000);
        CompaniesDAO.createCompany(companies);


        CategoriesDAO.createTableCategories();
        Categories categories = new Categories("Java developer");


        JobsDAO.createTableJobs();
        Jobs jobs = new Jobs("Junior developer",1500,"SE software tester","Kaunas","Full-stack",1,1);
        JobsDAO.createJob(jobs);




    }
}



