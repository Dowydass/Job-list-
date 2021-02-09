

public class main {
    public static void main(String[] args) {

        CompaniesDAO.createTableCompanies();
        CategoriesDAO.createTableCategories();
        JobsDAO.createTableJobs();

        Jobs jobs = new Jobs("Kebabai",800,"Kebabu pakuotojas","Kaunas","Full-stack",1,1);
        JobsDAO.createJob(jobs);



    }
}



