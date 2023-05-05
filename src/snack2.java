import java.util.Random;

public class snack2 {
public static void main(String[] args) {
	String[] nameList= {"nome1","nome2","nome3","nome4","nome5","nome6","nome7"};
	String[] surnameList= {"cognome1","cognome2","cognome3","cognome4","cognome5","cognome6","cognome7"};
	for(int i=0;i<=nameList.length;i++) {
		Random rnd=new Random();
		int val1=rnd.nextInt(nameList.length);
		int val2=rnd.nextInt(surnameList.length);
		System.out.println(nameList[val1]+" "+surnameList[val2]);
	}
	
}
}
