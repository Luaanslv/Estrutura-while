package ex3;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("Bem vindo ao posto de gasolina.");
		System.out.println("Estamos fazendo uma pesquisa para saber qual a preferencia de combustivel dos nossos clientes.");
		System.out.println("Digite 1: Alcool, 2: Gasolina, 3: Diesel e quando terminar 4 para finalizar!");
		
		int tipo = sc.nextInt();
		
		while(tipo != 4) {
			
			if(tipo == 1) {
				alcool += 1;
			}
			else if(tipo == 2) {
				gasolina += 1;
			}
			else if (tipo == 3) {
				diesel += 1;
			}
			else if(tipo > 4) {
				System.out.println("Digite um codigo valido!");
			}
			
//			Serve para o codigo não entrar em reptição e deixar o usuario escolher si quer sair ou mostrar 
//			outra preferencia.
			tipo = sc.nextInt();
			
		}
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}
}
