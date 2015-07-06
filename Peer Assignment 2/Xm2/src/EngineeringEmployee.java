
public class EngineeringEmployee extends Employee{

	EngineeringEmployee(String _name, Integer _years) throws IllegalArgumentException {
		super(_name, _years);
		// TODO Auto-generated constructor stub
		salary=25000+(2500*years);
		contract=1;
		department="Engineering";
	}
	public double getSalary(){
		return salary;
	}

}
