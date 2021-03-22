package design;

import java.util.ArrayList;

public interface Employee {
	
	/*
	Employee is an Interface which contains multiple unimplemented methods.
	A few methods have been declared below. You need to come up with more methods to meet business requirements of this
	    application
	*/

    /*
     Please read the following methods and understand the business requirements of these following methods
        and then implement these in a concrete class.
     */

    int employeeYearsOfExperience = 0;
    String level = null;


    // employeeId() will return employee id.
    int employeeId();

    //employeeName() will return employee name
    String employeeName();

    //assignDepartment() will assign employee to departments
    void assignDepartment();

    //calculate employee salary
    int calculateSalary();

    //employee benefit
    void benefitLayout();

    //employeeDOB() will return date of birth
    int employeeDOB();

    //employeeSSN() will return social security number
    int employeeSSN();

    //employeePTOrFT() will return full time or part time
    void employeePTOrFT();

    //employeeIsWorkingFromHome() will return location of workspace
    boolean employeeIsWorkingFromHome();

    //employeeExperience() will return employee's previous experience
    int employeeExperience(int employeeYearsOfExperience);

    //employeeJobLevel() will return level of job assigned
    static String employeeJobLevel(String level) {
        return null;
    }
    interface hiSami{
        String x="How are you sami";
        String y="Hope all is well";
        String b="Hire Me please";
    }


}
interface pizza{

}
interface coke{
}
