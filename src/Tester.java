import java.util.ArrayList;
public class Tester {

	public static void main(String[] args) {
		
			BankAccount account1 = new BankAccount(102603901, 1000);
			BankAccount account2 = new BankAccount(102603902, 1500);
			BankAccount account3 = new BankAccount(102603903, 1400);
			BankAccount account4 = new BankAccount(102603904, 1800);
			Employee Alex = new Employee(109306201, "Alex",account1, "Sales Dept.", 35000, 50);
			Employee Lily = new Employee(109306203, "Lily",account3, "Sales Dept.", 27500, 8);
			Employee Tony = new Employee(109306204, "Tony",account4, "Marketing Dept.", 40000, 30);

			ArrayList <Employee>employess=new ArrayList<Employee>();
			employess.add(Alex);
			employess.add(Lily);
			employess.add(Tony);
			
			
			ArrayList <Employee> SalesSubOrdinates = new ArrayList <Employee>();
			
			
			for(Employee subordinate:employess) { 
				if(subordinate.getDepartment()=="Sales Dept.") {
					SalesSubOrdinates.add(subordinate);
				}
			}
			Supervisor Bob = new Supervisor(109306202,"Bob",account2,"Sales Dept.",50000,SalesSubOrdinates,21);
			Bob.monthEnd();
			for(int i=0;i<employess.size();i++) {
				employess.get(i).monthEnd();
				System.out.println(employess.get(i).getInfo());
			}
			
			System.out.println(Bob.getInfo());	
		
		
		

	}

}
