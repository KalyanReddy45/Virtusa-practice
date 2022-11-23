import java.util.*;
class Employee
{
	int id;
	String name;
	float salary;
	long mobilenumber;
	String email;
	
	public Employee(int id ,String name , int salary , int mobilenumber , String email)
		{
			this.id =id;
			this.name=name;
			this.salary=salary;
			this.mobilenumber=mobilenumber;
			this.email=email;
			System.out.println("Employee details added sucessfully");
		}
	public void allEmployeeDetails()
	{
		System.out.print("\nid="+this.id);
		System.out.print(" name="+this.name);
		System.out.print(" salary="+this.salary);
		System.out.print(" mobilenum="+this.mobilenumber);
		System.out.print(" email="+this.email);
		System.out.println("\n");



	}
} 


class Test
{
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> al =new ArrayList<Employee>();
		do
		{

			System.out.println("\n1. Add employee details\n2. View Single Employee Details\n3.View All Employee Details\n4.Update Employee Details\n5.Delete Employee Details\n6.exit\n");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1 : 
					System.out.println("\nEnter employee id : ");
					int id=sc.nextInt();
					System.out.println("\nEnter employee name : ");
					String name=sc.next();
					System.out.println("\nEnter employee salary : ");
					int salary=sc.nextInt();
					System.out.println("\nEnter employee mobilenumber : ");
					int mobilenumber=sc.nextInt();
					System.out.println("\nEnter employee email : ");
					String email=sc.next();
					al.add(new Employee(id,name,salary,mobilenumber,email));
					break;
				case 2:
					boolean Found=false;
					System.out.println("employee id to search : ");
					int id1=sc.nextInt();
					for(Employee i:al)
					{
						if(i.id==id1)
						{
							i.allEmployeeDetails();
							 Found=true;
							break;
						}
					}
					if(!Found)
					{
						System.out.println("No such Employee");
					}
					break;

				case 3:
					for(Employee i:al)
					{
						i.allEmployeeDetails();
					}
					break;
				case 4: 
					boolean Found1=false;
					
					System.out.println("\nenter id to update details");
					int id2=sc.nextInt();
					for(Employee i:al)
					{
						if(i.id==id2)
						{
							Found1=true;
							
						do
						{
							int choice1 =0;
							System.out.println("\nEDIT Employee Details :\n" +
												"1). Employee ID\n" +
												"2). Name\n" +
												"3). Salary\n" +
												"4). Mobilenumber.\n" +
												"5). Email\n" +
												"6). GO BACK\n");
							System.out.println("\nEnter your choice : ");
							choice1 = sc.nextInt();
							switch(choice1)
							{
								case 1: System.out.println("\nEnter new Employee ID:");
									i.id =sc.nextInt();
									System.out.println(i+"\n");
									
									break;
							
								case 2: System.out.println("Enter new Employee Name:");
									i.name =sc.next();
									System.out.println(i+"\n");
									break;
									
								case 3: System.out.println("Enter new Employee Salary:");
									i.salary =sc.nextInt();
									System.out.println(i+"\n");
									break;
									
								case 4: System.out.println("Enter new Employee mobilenumber. :");
									i.mobilenumber =sc.nextInt();
									System.out.println(i+"\n");
									break;
									
								case 5: System.out.println("Enter new Employee Email-ID :");
									i.email =sc.next();
									System.out.println(i+"\n");
									break;

								case 6: Found1=true;
									break;
									
								default : System.out.println("\nEnter a correct choice from the List :");
										break;
							
							}
						}
						while(!Found1);
						}
					}
					if(!Found1)
					{
						System.out.println("\nNo such id present!!");
					}
					System.out.println(" employee details updated sucessfully");
					break;
			
			case 5:
				System.out.println("\nenter emp id to delete: ");
				int id3=sc.nextInt();
				boolean Found3=false;
				Employee del1=null;
				for(Employee i:al)
				{
					if(i.id==id3)
					{
						del1=i;
						Found3=true;
					
					}
				}
				if(!Found3)
				{
					System.out.println("\nNo such id present");
				}
				else
				{
					al.remove(del1);
				}
				System.out.println("employee details deleted sucessfully");
				break;	
			case 6:
				System.out.println("\n Exit sucessful");
				System.exit(0);
				
			}
		}
		while(true);
	}
}