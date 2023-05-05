import java.util.Scanner;

public class snack4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Scrivi una parola!");
	String word=in.nextLine();
	in.close();
	StringBuilder strbld=new StringBuilder(word);
	String reversed =strbld.reverse().toString();
	
	if(word.equals(reversed)) {
		System.out.println("La parola è palindroma!");
	}else {
		System.out.println("La parola non è palindroma");
	}
}
}
