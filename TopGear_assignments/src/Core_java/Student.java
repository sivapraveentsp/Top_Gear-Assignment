package Core_java;

public class Student extends Exception
{
	String Name; 
	int Roll_No;
	String Cls; 
	int a[] = new int[6];
	int result;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getCls() {
		return Cls;
	}
	public void setCls(String class1) {
		Cls = class1;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public int getResult() {
		System.out.println(result);
		return result;
	}
	public void setResult(int result) 
	{
		
		this.result = result;
		try
		{
		if (result <= 50 )
		{
		throw new Exception();	
		}
		else
	      getResult();
	}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
	Student s=new Student();
	s.setName("akash");
	s.setRoll_No(20);
	s.setCls("grade 10");
	int[] temp={50,60,70,80,90,100};
	s.setA(temp);
	Student s1=new Student();
	s1.setName("prakash");
	s1.setRoll_No(21);
	s1.setCls("grade 10");
	int[] temp1={30,60,40,50,20,30};
	s1.setA(temp1);
	int result=0;
	for(int i:temp)
	{
		result=result+i;
	}
	result=result/temp.length;
	s.setResult(result);
	for(int i:temp1)
	{
		result=result+i;
	}
	result=result/temp1.length;
	s1.setResult(result);
	for(int i:temp)
	{
	 if(i<=50)
	 {
		 result=-1;
	 }
	}
	s.setResult(result);
	for(int i:temp1)
	{
	 if(i<=50)
	 {
		 result=-1;
	 }
	}
	s1.setResult(result);
}
}
