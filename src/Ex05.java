import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cd;
		int qtd;
		double total = 0;
		
		cd = sc.nextInt();
		qtd = sc.nextInt();
		
		
		if (cd == 1) {
			total = (4.00*qtd);
		}
		else if (cd == 2) {
			total = (4.50 * qtd);
			}
		else if (cd == 3) {
			total = (5.00 * qtd);
			}
		else if(cd == 4) {
			total = (2.00 * qtd);
			}
		else if(cd == 5) {
			total = (1.50 * qtd);
			}
	
		
		System.out.printf("Valor total = %.2f%n", total);
		
		sc.close();
		
		
	}

}
