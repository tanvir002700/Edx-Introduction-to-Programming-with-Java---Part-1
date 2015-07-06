interface Employed {
	double getSalary();
}
public class Employee implements Employed{

	protected String name;
	protected int contract;
	protected int years;
	protected String department;
	protected double salary;
	private String contractType[]={"TEMPORARY","TRAINING","INDEFINITE"};
	Employee(String _name,Integer _years)throws IllegalArgumentException{
		try{
			int val=Integer.valueOf(_name);
			throw new IllegalArgumentException("Not a String");
		}
		catch(NumberFormatException e){
			name=_name;
		}
		
		try
		{
			int val=Integer.valueOf(_years);
			years=val;
		}
		catch(NumberFormatException e){
			throw new IllegalArgumentException("Not an Integer value");
		}	
	}
	
public String getName(){
		return name;
	}
	
	public int getContract(){
		return contract;
	}
	
	public int getYears(){
		return years;
	}
	
	public String getDepartment(){
		return department;
	}
	
	public void setName(String _name)throws IllegalArgumentException{
		try{
			int val=Integer.valueOf(_name);
			throw new IllegalArgumentException("Not a String");
		}
		catch(NumberFormatException e){
			name=_name;
		}
	}
	
	public void setYears(String _years){
		try
		{
			int val=Integer.valueOf(_years);
			years=val;
		}
		catch(NumberFormatException e){
			throw new IllegalArgumentException("Not a Integer value");
		}
	}


	public String toString(){
		return name+": "+department+" department, "+contractType[contract]+" contract, "+years+" years in the company, salary of "+salary+" bitcoins";
	}
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
