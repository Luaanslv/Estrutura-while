package ex1;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha invalida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		sc.close();
	}

}
