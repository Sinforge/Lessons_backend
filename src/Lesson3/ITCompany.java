package Lesson3;

public class ITCompany extends EmployersManager<Worker> {
    private String CompanyName;


    public ITCompany(int maxSize, String CompanyName) {
        super(maxSize, Worker.class);
        this.CompanyName = CompanyName;
    }

    public void startWork() {
        for(int i = 0; i < this.getSize(); i++) {
            Worker[] workers = this.getEmployers();
            workers[i].work();
        }
    }

}
