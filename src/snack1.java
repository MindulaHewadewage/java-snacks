import java.util.Scanner;

public class snack1 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Scrivi un numero");
	int userNumber=in.nextInt();
	
	if(userNumber % 2 == 0) {
		System.out.println(userNumber);
	}else if(userNumber % 3 == 0){
		System.out.println("Mi piacciono solo i numeri pari");
	}
}
}
