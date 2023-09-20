package skolica;
import java.util.Scanner;
public class skankcinatest {
public static void main(String[]args) {
	Scanner upis= new Scanner(System.in);
	System.out.print("upisi znak +-*/");
	char operation= upis.nextLine().charAt(0);
	int x=24;
	int y=12;
	int z;
	if(operation =='+') {
		z=x+y;
		System.out.print("Rezultat:"+z);
	}else if(operation=='/') {
		z=x/y;
		System.out.print("Rezultat"+z);
	}else if(operation=='*') {
	z=x*y;
	System.out.print("Rezultat"+z);
	}else if(operation=='-') {
		z=x-y;
		System.out.print("Rezultat"+z);}
	else {System.out.print("pogresan unos");}
		
	}
	
				
	
}

