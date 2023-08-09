
package q1_test;
public class emp_detail {
    
    private int employeeExperience;
    private String employeeName;
    private String employeePosition;
    private String employeeEducationallevel;
    private double salary;
    private String employeetype;

    public void setEmployeetype(String employeetype) {
        this.employeetype = employeetype;
    }

    public String getEmployeetype() {
        return employeetype;
    }


    public int getEmployeeExperience() {
        return employeeExperience;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public String getEmployeeEducationallevel() {
        return employeeEducationallevel;
    }

    public double getSalary() {
        return salary;
    }

  

    public void setEmployeeExperience(int employeeExperience) {
        this.employeeExperience = employeeExperience;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }

    public void setEmployeeEducationallevel(String employeeEducationallevel) {
        this.employeeEducationallevel = employeeEducationallevel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
    @Override
    public String toString() {
        return "Name: " + employeeName +"\n"+
               "Position: " + employeePosition +"\n"+
               "Experience: " + employeeExperience +"\n"+
               "Educational level: " + employeeEducationallevel +"\n"+  
               "salary: " + salary +"\n";
              
    }
     
    
    
    
}
