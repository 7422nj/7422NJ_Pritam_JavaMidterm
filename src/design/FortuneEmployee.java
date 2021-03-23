package design;

public class FortuneEmployee extends EmployeeInfo implements Employee{

    public FortuneEmployee() {
    }
    // Static variables
    static String companyName;
    static String companyLocation;
    static long companyPhoneNumber;


    // Final variables
    final String city = "Enter City";
    final int totalEmployees=500;
    final boolean openOnWeekends=false;

    // non-static variables
    String companyWebsite="Enter Website URL";
    double averageMonthlyPayRole=4000.78;
    boolean isHiring=true;
    String partyDate;
    String managerName;
    int dobOfCompany;

    // private variables
    private int employeeAge=34;
    private long employeePhoneNumber;
    private String employeePreviousJob;
    private String dateOfBirth;

    // Constructor from EmployeeInfo Class
    public FortuneEmployee(String companyWebsite, double averageMonthlyPayRole, boolean isHiring, int employeeAge, int employeePhoneNumber, String employeePreviousJob) {
        super("companyWebsite", 1200.76, true, 34, 333-344-5555, "employeePreviousJob");
    }

    /**
     * FortuneEmployee class has a main methods where you will be able to create Object from
     * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
     * to use with proper business work flow.Think as a Software Architect, Product Designer and
     * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
     * more to design an application that will meet for fortune 500 Employee Information
     * Services.
     *
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     *
     **/
    public static void main(String[] args) {
        EmployeeInfo ei = new EmployeeInfo();
        ei.employeeName();
        System.out.println(ei.employeeName());
        System.out.println(ei.employeeId());
        // setter
        System.out.println(ei.setEmployeeAge(34));
        // getter
        System.out.println(ei.getEmployeeAge());
        // ReAssign value
        int employeeAge = 43;
        System.out.println(employeeAge);
        System.out.println(ei.setDateOfBirth("01-03-1994"));

    }

    @Override
    public int getEmployeeAge() {
        System.out.println("Employee age should be entered here");
        return super.getEmployeeAge();
    }

    @Override
    public int setEmployeeAge(int employeeAge) {
        System.out.println("Employee age should be entered here+ int employeeAge should give a concise age");
        return super.setEmployeeAge(34);

    }

    @Override
    public void setEmployeePhoneNumber(long employeePhoneNumber) {
        System.out.println("Employee contact number should be displayed here");
        super.setEmployeePhoneNumber(434-545-3434);
    }

    @Override
    public void setEmployeePreviousJob(String employeePreviousJob) {
        System.out.println("Employee previous job should be entered here");
        super.setEmployeePreviousJob("Company Name");
    }

    @Override
    public String setDateOfBirth(String dateOfBirth) {
        System.out.println("Employee date of birth should be entered here");
        return super.setDateOfBirth("01-12-1989");
    }

    @Override
    public void EmployeeResume() {
        System.out.println("Employee resume should be entered here");
        super.EmployeeResume();
    }

    @Override
    public void EmployeeReferences() {
        System.out.println("Employee references numbers should be entered here");
        super.EmployeeReferences();
    }

    public FortuneEmployee(String companyWebsite, int employeeAge, int employeePhoneNumber) {
        super("companyWebsite", 34, 545-454-5454);
        System.out.println("Employee's age and contact number should be entered here. Also give access to company website.");
    }

    public FortuneEmployee(String companyWebsite, double averageMonthlyPayRole) {
        super("companyWebsite", 1200.75);
        System.out.println("Employee's monthly pay role should be entered here. Give access to company website for more questions.");
    }

    @Override
    public String employeeName() {
        System.out.println("Employee's name should be entered here");
        return super.employeeName();

    }

    @Override
    public void assignComputer() {
        System.out.println("Assign employee a cubicle and a computer");
        super.assignComputer();
    }

    @Override
    public void assignManager() {
        System.out.println("Assign employee a manager according to his job role and department");
        super.assignManager();
    }

    @Override
    public void criminalRecord() {

    }

    @Override
    public void reasonForLeavingPreviousJob() {

    }

    @Override
    public void goalsIn5Years() {

    }

    @Override
    public void questionsInMind() {

    }
}
