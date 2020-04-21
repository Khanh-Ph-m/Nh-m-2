import java.util.Scanner;

public class CapSoThanThiet {
	//tinh uoc cua so da nhap
		public static int tongCacUoc(int number) {
		int tongCacUoc= 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				tongCacUoc += i;
			}
		}
		return tongCacUoc;
		} 
		//so sanh cac uoc cua hai so da nhap
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Nhap so thu nhat: ");
			int firsNumber = scan.nextInt();
			System.out.print("Nhap so thu hai: ");
			int secondNumber = scan.nextInt();
			
			if ((tongCacUoc(firsNumber) == secondNumber) || (tongCacUoc(secondNumber) == firsNumber)) {
				System.out.println("cap so tren la so than thiet");
			} else {
				System.out.println("cap so tren khong phai la so than thiet");
				
			}
			
			
		}

}
