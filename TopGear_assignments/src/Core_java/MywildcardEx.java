package Core_java;

public class MywildcardEx 
{ 
	public static void main(String a[])
	{        
		        MyEmployeeUtil empA = new MyEmployeeUtil(new CompAEmp("Ram", 20000));
		        MyEmployeeUtil empB = new MyEmployeeUtil(new CompBEmp("Krish", 30000));
		        MyEmployeeUtil empC = new MyEmployeeUtil(new CompAEmp("Nagesh", 20000));
		        System.out.println("Is salary same? "+empA.isSalaryEqual(empB));
		        System.out.println("Is salary same? "+empA.isSalaryEqual(empC));
		    }
		} 
class MyEmployeeUtil
{    
	Emp emp;
    public MyEmployeeUtil(Emp e)
    {
        emp = e;
    }
    public int getSalary()
    {
        return emp.getSalary();
    }
    public boolean isSalaryEqual(MyEmployeeUtil otherEmp)
    {    
        if(emp.getSalary() == otherEmp.getSalary()){
            return true;
        }
        return false;
    }
}
		 
	class Emp{
		     
		    private String name;
		    private int salary;
		     
		    public Emp(String name, int sal){
		        this.name = name;
		        this.salary = sal;
		    }
		    public int getSalary() {
		        return salary;
		    }
		}
		 
		class CompAEmp extends Emp{
		     
		    public CompAEmp(String nm, int sal){
		        super(nm, sal);
		    }
		}
		 
		class CompBEmp extends Emp{
		     
		    public CompBEmp(String nm, int sal){
		        super(nm, sal);
		    }
		}