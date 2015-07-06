
public class AdministrationEmployee extends Employee{

	AdministrationEmployee(String _name) throws IllegalArgumentException {
		super(_name, 0);
		// TODO Auto-generated constructor stub
		salary=18000;
		contract=0;
		department="Administration";
	}
	public double getSalary(){
		return salary;
	}
}
