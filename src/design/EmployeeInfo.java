package design;

import java.util.Scanner;

public class EmployeeInfo extends AbstractEmployeeData implements Employee,pizza,coke, Employee.hiSami {
    // you can implement multiple interfaces
    // can only extend one class

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.

    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */

    //Create Variables
    static String companyName;
    int companyDOB;
    String companyLocation;

    //private variable
    private int companyContact;

    //final
    static final String companyLogo;

    static {companyLogo = "pada pada pa i'm dying from this midterm";}

    final boolean isOpen = true;

/*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors <- Make 3-4 constructors
     */

    public EmployeeInfo(int id, String name, String department, int hours, int daysOfWeek, int salary, String benefits, int dob, int ssn, String ftOrPT, boolean workspace, int employeeYearsOfExperience, String nationality, int startDate, boolean isAlive) {
        super(id, name, department, hours, daysOfWeek, salary, benefits, dob, ssn, ftOrPT, workspace, employeeYearsOfExperience, nationality, startDate, isAlive);

    }

    public EmployeeInfo(){

    }

    public EmployeeInfo(int laughForLaughs) {
        super(laughForLaughs);

    }

    public EmployeeInfo(int laughForLaughs, int companyDOB, String companyLocation, int companyContact) {
        super(laughForLaughs);
        this.companyDOB = companyDOB;
        this.companyLocation = companyLocation;
        this.companyContact = companyContact;

    }

    /*
         You need to implement the logic of this method as such:
            It should calculate Employee bonus based on salary and performance.
            It should return the total yearly bonus.
                Example: 10% of salary for best performance, 8% of salary for average performance and so on.
                You can set arbitrary number for performance, so you probably need to send 2 arguments.
         *
         */
    public static int calculateEmployeeBonus(int numberOfYearsWithCompany) {
        int total = 0;
        return total;
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
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

        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension

        return total;
    }


    @Override
    public int employeeId() {
        return 0;
    }

    @Override
    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    @Override
    public void benefitLayout() {

    }

    @Override
    public int employeeDOB() {
        return 0;
    }

    @Override
    public int employeeSSN() {
        return 0;
    }

    @Override
    public void employeePTOrFT() {

    }

    @Override
    public boolean employeeIsWorkingFromHome() {
        return false;
    }

    @Override
    public int employeeExperience(int employeeYearsOfExperience) {
        return super.employeeExperience(employeeYearsOfExperience);
    }

    @Override
    public String employeeJobLevel() {
        return super.employeeJobLevel();
    }

    @Override
    public void employeeNationality(String nationality) {

    }

    @Override
    public int employeeStartDate(int startDate) {
        return super.employeeStartDate(startDate);
    }

    @Override
    public boolean employeeIsAlive(boolean isAlive) {
        return super.employeeIsAlive(isAlive);
    }


    static class DateConversion {

        public DateConversion(Months months) {
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
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }

        interface jokes {  //made a interface inside a class
            String forLaughs = "lol";

        }

    }
}

