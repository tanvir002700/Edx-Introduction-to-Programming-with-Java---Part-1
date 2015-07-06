public class ManagementEmployee extends Employee{

	ManagementEmployee(String _name,Integer _years) throws IllegalArgumentException {
		super(_name, _years);
		// TODO Auto-generated constructor stub
		salary=40000+years*6000;
		contract=2;
		department="Management";
	}
	public double getSalary(){
		return salary;
	}

}
