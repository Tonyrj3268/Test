
public class Employee {
private int ID;
private int baseSalary;
private double totalSalary;
private int sales;
private String name;
private String department;
private BankAccount account;

public Employee(int ID, String name, BankAccount account, String department, int baseSalary, int sales) {
	this.ID=ID;
	this.name=name;
	this.account=account;
	this.department=department;
	this.baseSalary=baseSalary;
	this.sales=sales;
	this.totalSalary=0;
}
public String getDepartment() {
	return department;
}
public int getSales() {
	return sales;
}
public double getTotalSalary() {
	return totalSalary;
}
public void  setSales(int sales) {
	this.sales=sales;
}
public void monthEnd() {
	double taxRate=0.03;
	int salesBonus=500;
	totalSalary=(baseSalary+(sales * salesBonus))*(1 - taxRate);
	account.deposit(totalSalary);
}
public String getInfo() {
	String info="";
	info="ID:"+ID;
	info+="\nName:"+name;
	info+="\nDepartment:"+department;
	info+="\nTotal sales:"+sales;
	info+="\nTotal salary:";
	info+=String.format("%.0f", totalSalary);
	info+="\n";		
	return info;
}
}