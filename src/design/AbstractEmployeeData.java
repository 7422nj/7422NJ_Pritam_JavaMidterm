package design;

//public class className -> public abstract className
public abstract class AbstractEmployeeData implements Employee {  //can only implement interfaces not classes

    //Create variables
    int id;
    String name;
    String department;
    int hours;
    int daysOfWeek;
    int Salary = hours * daysOfWeek;
    String benefits;
    int dob;
    int ssn;
    String FtOrPT;
    boolean workspace;
    int employeeYearsOfExperience;
    String nationality;
    int startDate;
    boolean isAlive;

    //private
    private int laughForLaughs;

    public AbstractEmployeeData(int laughForLaughs) {
        this.laughForLaughs = laughForLaughs;
    }

    public AbstractEmployeeData(int id, String name, String department, int hours, int daysOfWeek, int salary, String benefits, int dob, int ssn, String ftOrPT, boolean workspace, int employeeYearsOfExperience, String nationality, int startDate, boolean isAlive) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.hours = hours;
        this.daysOfWeek = daysOfWeek;
        Salary = salary;
        this.benefits = benefits;
        this.dob = dob;
        this.ssn = ssn;
        FtOrPT = ftOrPT;
        this.workspace = workspace;
        this.employeeYearsOfExperience = employeeYearsOfExperience;
        this.nationality = nationality;
        this.startDate = startDate;
        this.isAlive = isAlive;
    }

    protected AbstractEmployeeData() {
    }

    public int employeeId(int id) {
        return id;
    }

    public String employeeName(String name) {
        return name;
    }

    public void assignDepartment(String department) {

    }

    public int calculateSalary(int salary) {
        return salary = hours * daysOfWeek;
    }

    public void benefitLayout(String benefits) {

    }

    public int employeeDOB(int dob) {
        return dob;

    }

    public int employeeSSN(int ssn) {
        return ssn;
    }


    public void employeePTOrFT(String FtOrPT) {

    }


    public boolean employeeIsWorkingFromHome(boolean workspace) {
        return workspace;

    }


    public int employeeExperience(int employeeYearsOfExperience) {
        return employeeYearsOfExperience;

    }

    public String employeeJobLevel() {
        String arr[] = {"Intern", "Entry Level", "Mid Level", "Manager", "Boss", "CEO"};
        for (String level : arr) {
            System.out.println(level);
            return level;
        }

        return null;
    }


    public abstract void employeeNationality(String nationality);


    public int employeeStartDate(int startDate) {
        return startDate;

    }

    public boolean employeeIsAlive(boolean isAlive){
        return isAlive;
    }


}
