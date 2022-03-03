import java.util.Scanner;

public class Vicky{
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Distance: ");

		int distance = sc.nextInt();
		
		int jump = 0;
		int rest = 0;

		while (distance > jump) {
			jump += 5;
			if (distance < jump) {
				System.out.println("Vicky jumbed " + distance+"m");
				System.out.println("Vicky took " + rest+"s" );
				break;
			}

				else{	
					rest+=1;
					jump+=3;
				}

				if (distance < jump) {
					System.out.println("Vicky jumbed " + distance+"m");
					System.out.println("Vicky took " + rest+"s" );
					break;
				}

				else{
					rest+=2;
					jump+=1;
				}
				if (distance < jump) {
					System.out.println("Vicky jumbed " + distance+"m");
					System.out.println("Vicky took " + rest+"s" );
					break;
				}
				
				else{
					rest+=3;

				}
				if (distance == jump) {
					System.out.println("Vicky jumbed " + distance+"m");
					System.out.println("Vicky took " + rest+"s" );
					break;
				}
		}
	}
}