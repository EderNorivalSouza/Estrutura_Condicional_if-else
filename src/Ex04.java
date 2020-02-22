import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int HI, HF, Duracao;
		
		System.out.println("Qual a hora inicial?");
		HI = sc.nextInt();
		System.out.println("Qual a hora final?");
		HF = sc.nextInt();
		
		if (HI<HF) {
			Duracao = HF - HI;
		}
		else {
			Duracao = 24 - HI + HF;
		}
		
		System.out.println("O JOGO DUROU "+Duracao+" Hora(s)");
		
		sc.close();
	}

}
