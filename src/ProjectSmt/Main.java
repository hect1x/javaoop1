package ProjectSmt;
import java.util.Scanner;
import java.util.ArrayList;

class Info{
	String name, pass, phone;
	
	
	Info(String name, String pass, String phone){
		this.name = name;
		this.pass = pass;
		this.phone = phone;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner (System.in);
		ArrayList<Info> infos = new ArrayList<>();
		int x;
		do {
			System.out.println("1. Input Data");
			System.out.println("2. Show Data");
			System.out.println("3. Delete Data");
			System.out.println("4. Exit");
			
			do {
                System.out.print("Your Choice: ");
                x = cin.nextInt();
                if (x < 1 || x > 4) System.out.println("Invalid input! Please enter a number between 1 and 4.");
            } while (x < 1 || x > 4);
			
			cin.nextLine();
			
			if(x==1) {
				System.out.print("Name : ");
                String name = cin.nextLine();
                System.out.print("Pass : ");
                String pass = cin.nextLine();
                System.out.print("Phone : ");
                String phone = cin.nextLine();
                
                infos.add(new Info(name, pass, phone));
                System.out.println("New data is added");
			}
			if(x==2) {
				show(infos);
			}
			if(x==3) {
				if (show(infos)) {
                    System.out.print("Input data number to be deleted : ");
                    int index = cin.nextInt();
                    if (index < 1 || index > infos.size()) {
                        System.out.println("Invalid index");
                    } else {
                        infos.remove(index - 1);
                        System.out.println("Data is removed");
        				cin.nextLine();
                    }
                }
			}
			if(x!=4) {
				System.out.println("Press any key to continue..");
				cin.nextLine();
				cls();
			}
			
		} while(x!=4);
		System.out.println("You exited");
	}
	
	
	public static boolean show(ArrayList<Info> infos) {
        if (infos.isEmpty()) {
        	System.out.println("----------------------------------------------------------------");
        	System.out.printf("|%-4s| %-30s| %-10s| %-12s|\n", "No", "Name", "Pass", "Phone");
            System.out.println("----------------------------------------------------------------");
        	System.out.println("                         |No data exist|");
            return false;
        } else {
        	System.out.println("----------------------------------------------------------------");
        	System.out.printf("|%-4s| %-30s| %-10s| %-12s|\n", "No", "Name", "Pass", "Phone");
            System.out.println("|--------------------------------------------------------------|");
            for (int i = 0; i < infos.size(); i++) {
                Info info = infos.get(i);
                System.out.printf("|%-4d| %-30s| %-10s| %-12s|\n", (i + 1), info.name, info.pass, info.phone);
            }
            System.out.println("----------------------------------------------------------------\n");
            return true;
        }
    }	
	public static void cls() {
	    for (int i = 0; i < 20; i++) {
	        System.out.println();
	    }
	}
	

}