package design;

import org.apache.poi.ss.usermodel.ConditionFilterType;

import java.util.Scanner;

public class EmployeeInfo extends CompanyDatabase implements Employee  {

    /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
     * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
     * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
     * go to FortuneEmployee class to apply all the fields and attributes.
     *
     * Important: YOU MUST USE the
     * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
     * Use all kind of keywords(super,this,static,final........)
     * Implement Nested class.
     * Use Exception Handling.
     *
     */

    /*
     * declare few static and final fields and some non-static fields
     */

    // Static variables
    static String companyName;
    static String companyLocation;
    static long companyPhoneNumber;
    static int numberOfYearsWithCompany;
    static int salary;


    // Final variables
    final String city = "Newark";
    final int totalEmployees=500;
    final boolean openOnWeekends=false;

    // non-static variables
    String companyWebsite="www.DreamWorks.com";
    double averageMonthlyPayRole=4000.78;
    boolean isHiring=true;

    // private variables
    private int employeeAge=34;
    private long employeePhoneNumber;
    private String employeePreviousJob;
    private String dateOfBirth;
    private static ConditionFilterType Performance_p;
    private static Object obj;
    private static ConditionFilterType Performance;

    // Getter
    public static String getCompanyName() {
        return companyName;
    }
    // Setter
    public static void setCompanyName(String companyName) {
        EmployeeInfo.companyName = companyName;
    }
    // Getter
    public int getEmployeeAge() {
        return employeeAge;
    }
    // Setter
    public int setEmployeeAge(int employeeAge) {
        this.employeeAge=employeeAge;
        return employeeAge;
    }
    // Getter
    public long getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }
    // Setter
    public void setEmployeePhoneNumber(long employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }
    // Getter
    public String getEmployeePreviousJob() {
        return employeePreviousJob;
    }
    // Setter
    public void setEmployeePreviousJob(String employeePreviousJob) {
        this.employeePreviousJob = employeePreviousJob;
    }
    // Getter
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    // Setter
    public String setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return dateOfBirth;
    }



    /*
     * You must implement the logic for below 2 methods and
     * following 2 methods are prototype as well for other methods need to be design,
     * as you will come up with the new ideas.
     */
    public void EmployeeResume(){
        System.out.println(" Employee has a qualified resume ");
    }
    public void EmployeeReferences(){
        System.out.println(" Employee has references with contact details ");
    }
    public void EmployeeTravelMethod(){
        System.out.println(" Employee travels to work by train ");
    }

    public EmployeeInfo(String companyWebsite, int employeeAge, int employeePhoneNumber) {
        super("www.dreamworks.com", 4000.76, true, employeeAge, 444_434_234 );
        this.companyWebsite = companyWebsite;
        this.averageMonthlyPayRole = averageMonthlyPayRole;
        this.isHiring = isHiring;
        this.employeeAge = employeeAge;
        this.employeePhoneNumber = employeePhoneNumber;
    }
    /*
     * you must have multiple constructor.
     * Must implement below constructor.
     */

    public EmployeeInfo() {
        super();
    }


    public void employeeNationality(String nationality) {

    }

    public EmployeeInfo(int employeeId){


    }
    public EmployeeInfo(String name, int employeeId){

    }

    public EmployeeInfo(String companyWebsite) {
        this.companyWebsite = companyWebsite;
    }

    public EmployeeInfo(String companyWebsite, double averageMonthlyPayRole) {
        this.companyWebsite = companyWebsite;
        this.averageMonthlyPayRole = averageMonthlyPayRole;
    }

    public EmployeeInfo(String companyWebsite, double averageMonthlyPayRole, boolean isHiring) {
        this.companyWebsite = companyWebsite;
        this.averageMonthlyPayRole = averageMonthlyPayRole;
        this.isHiring = isHiring;
    }

    public EmployeeInfo(String companyWebsite, double averageMonthlyPayRole, boolean isHiring, int employeeAge) {
        this.companyWebsite = companyWebsite;
        this.averageMonthlyPayRole = averageMonthlyPayRole;
        this.isHiring = isHiring;
        this.employeeAge = employeeAge;
    }

    public EmployeeInfo(String companyWebsite, double averageMonthlyPayRole, boolean isHiring, int employeeAge, int employeePhoneNumber, String employeePreviousJob) {
        this.companyWebsite = companyWebsite;
        this.averageMonthlyPayRole = averageMonthlyPayRole;
        this.isHiring = isHiring;
        this.employeeAge = employeeAge;
        this.employeePhoneNumber = employeePhoneNumber;
        this.employeePreviousJob = employeePreviousJob;
    }
    EmployeeInfo ob=new EmployeeInfo();

    /*
     * This methods should calculate Employee bonus based on salary and performance.
     * Then it will return the total yearly bonus. So you need to implement the logic.
     * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
     * You can set arbitrary number for performance.
     * So you probably need to send 2 arguments.
     *
     */

    /*
     * This methods should calculate Employee Pension based on salary and numbers of years with the company.
     * Then it will return the total pension. So you need to implement the logic.
     * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
     *
     */
    public static int calculateEmployeePension() {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        //implement numbers of year from above two dates
        //Calculate pension





        return total;
    }


    @Override
    public int employeeId() {
        return 1234;
    }

    @Override
    public  String employeeName() {
        return "Employee's Name is: Adam";
    }

    @Override
    public void assignDepartment() {
        System.out.println(" Employee will be assigned to a department ");
    }

    public int calculateSalary() {
        Object salary = null;
        return (int) salary;
    }

    @Override
    public void benefitLayout() {
        System.out.println(" Employee will be given benefits for working in the company ");
    }

    @Override
    public void assignComputer() {
        System.out.println(" Employee will be assigned his cubicle with a computer ");
    }

    @Override
    public void assignManager() {
        System.out.println(" Employee will be assigned a manager according to his department ");
    }

    @Override
    public void employeeAddress() {
        System.out.println(" Employee's address should be provided in resume ");
    }

    @Override
    public void employeeJobRole() {
        System.out.println(" Employee will be given a job role in his department ");
    }

    @Override
    public void printEmployeeInfo() {
        //EmployeeInfo ei=new EmployeeInfo();
        System.out.println(employeePhoneNumber=231456454);
        System.out.println(dateOfBirth="01-06-1993");
        System.out.println(companyName="Dream Works");
        System.out.println(companyLocation="Delaware");
        System.out.println(companyPhoneNumber=323123212);
        System.out.println(employeePreviousJob="TD Bank");


    }


    public void companyUpcomingEvent() {
        System.out.println(" The company will be having an upcoming event for 1 year reunion ");
    }


    public void annualPartyDate(String partyDate) {
        System.out.println(" The company will have a party on the date of 01-09-2021 ");
    }

    // These are the Methods created inside the employeeDatabase Interface
    // Which was inherited by the Employee interface
    @Override
    public void criminalRecord() {
        System.out.println(" Employee has be given a background check");

    }

    @Override
    public void reasonForLeavingPreviousJob() {
        System.out.println(" Employee must give a solid and brief explanation on why he/she left their previous job");

    }

    @Override
    public void goalsIn5Years() {
        System.out.println("Employee's goals in 5 years");
    }

    @Override
    public void questionsInMind() {
        System.out.println("Employee's questions before joining the company");

    }


    private static class DateConversion {

        public DateConversion(Months months){

        }
        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
