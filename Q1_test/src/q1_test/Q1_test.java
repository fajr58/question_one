
package q1_test;
public class Q1_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      emp_detail emp = new emp_detail();
      
      emp.setEmployeeName("mohammed");
      emp.setEmployeePosition("programmer");
      emp.setEmployeetype("Part");
      emp.setEmployeeExperience(3);
      emp.setSalary(14000.0);
      emp.setEmployeeEducationallevel("Bachelor");
      double sal = emp.getSalary();
      int exp = emp.getEmployeeExperience();
      sal = (sal+(sal*5)/100 *exp);
     String edulevel = emp.getEmployeeEducationallevel();
     switch (edulevel) {
            case "Bachelor":
                sal +=500;
                break;
            case "diploma":
                sal +=250;
                
                break;
            default:
                sal +=0;
                 
                break;
        }
   String type = emp.getEmployeetype();
    int Bonus  = 0;  
     switch(type) {
            case "Full":
                Bonus  += (sal * 3)/100;  
                sal = sal+Bonus ; 
                emp.setSalary(sal);
                break;
            case "Part":
                Bonus  += (sal *1.5)/100;  
                sal = sal+Bonus ; 
                emp.setSalary(sal);
               break;
      
        }
     
      System.out.print(emp);
      
      
    }
    
}
