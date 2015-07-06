import java.lang.reflect.Array;
import java.util.ArrayList;


public class Staff {
	public static void main(String args[]){
		ArrayList<Employee>L=new ArrayList<>();
		
		ManagementEmployee m1=new ManagementEmployee("Bill", 9);
		L.add(m1);
		EngineeringEmployee e1=new EngineeringEmployee("Anna", 9);
		L.add(e1);
		EngineeringEmployee e2=new EngineeringEmployee("John", 5);
		L.add(e2);
		EngineeringEmployee e3=new EngineeringEmployee("Elizabeth", 3);
		L.add(e3);
		EngineeringEmployee e4=new EngineeringEmployee("Michael", 2);
		L.add(e4);
		AdministrationEmployee a1=new AdministrationEmployee("Albert");
		L.add(a1);
		
		double []total=new double[4];
		for(int i=0;i<L.size();i++){
			System.out.println(L.get(i).toString());
			total[L.get(i).getContract()]+=L.get(i).getSalary();
		}
		total[3]=total[0]+total[1]+total[2];
		
		System.out.println("MANAGEMENT TOTAL SALARY: "+ total[2] +" bitcoins");
		System.out.println("ENGINEERING TOTAL SALARY: "+ total[1] +" bitcoins");
		System.out.println("ADMINISTRATION TOTAL SALARY: "+ total[0] +" bitcoins");
		System.out.println("ACME TOTAL SALARY: "+ total[3] +" bitcoins");
	}

}
