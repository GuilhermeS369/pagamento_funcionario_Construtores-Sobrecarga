package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> emplist = new ArrayList <>();
		
		System.out.print("Enter the number of employees: ");
		int x = sc.nextInt();
		
		for (int i = 1; i<=x ; i++) {
				System.out.println("Employee "+ i + " data:");
				System.out.print("Outsourced y/n? ");
				char y = sc.next().charAt(0);
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
		
		
		if (y == 'y') {
			
			System.out.println("Additional charge: ");
			double additionalCharge = sc.nextDouble();
						
			emplist.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
		}
		else {
						
			emplist.add(new Employee(name, hours, valuePerHour));
		}
}
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for (Employee z : emplist)
		{
			System.out.println(z.getName() + " - $" + String.format("%.2f", z.payment()));
			
		}
		sc.close();
	
	}

}