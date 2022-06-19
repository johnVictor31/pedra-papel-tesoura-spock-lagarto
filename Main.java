
import java.util.Scanner;
import java.util.Random;

public class Main {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			int jogador, computador;
			
			System.out.println("==================================");
			System.out.println("O jogo começou");
			System.out.println("Escolha:");
			System.out.println();
			System.out.println("1 - Pedra ");
			System.out.println("2 - Papel ");
			System.out.println("3 - Tesoura");
			System.out.println("4 - Lagarto");
			System.out.println("5 - Spock ");
			System.out.println();
			System.out.print("Digite o numero escolhido: ");
			jogador = scanner.nextInt();
			System.out.println("==================================");
			System.out.println(" ");
			
			switch(jogador) {
			case 1:
				System.out.println("Você escolhe pedra");
				break;
			case 2:
				System.out.println("Você escolhe papel");
				break;
			case 3:
				System.out.println("Você escolhe tesoura");
				break;
			case 4:
				System.out.println("Você escolhe lagarto");
				break;
			case 5:
				System.out.println("Você escolhe spock");
				break;
				default: System.err.println("ERROR");
			}
			
			computador = (int)(Math.random()*5+1);
			
			switch(computador) {
			case 1:
				System.out.println("Seu oponente escolheu pedra");
				break;
			case 2:
				System.out.println("Seu oponente escolheu papel");
				break;
			case 3:
				System.out.println("Seu oponente escolheu tesoura");
				break;
			case 4:
				System.out.println("Seu oponente escolheu lagarto");
				break;
			case 5:
				System.out.println("Seu oponente escolheu spock");
				break;
				default: System.err.println("ERROR");
			}
			if(computador == jogador) {
				System.out.println("Empate");
			}else { 
				
				//1. Computador usou Pedra
				if ((computador == 1 && jogador == 2)){
					System.out.println("Você venceu!!");
				}
				if ((computador == 1 && jogador == 3)){
					System.out.println("Você perdeu...");
				}
				if ((computador == 1 && jogador == 4)){
					System.out.println("Você perdeu...");
				}
				if ((computador == 1 && jogador == 5)){
					System.out.println("Você venceu!!");
				}
				
				//2. Computador usou Papel
				if ((computador == 2 && jogador == 1)){
					System.out.println("Você perdeu...");
				}
				if ((computador == 2 && jogador == 3)){
					System.out.println("Você venceu!!");
				}
				if ((computador == 2 && jogador == 4)){
					System.out.println("Você venceu!!");
				}
				if ((computador == 2 && jogador == 5)){
					System.out.println("Você perdeu...");
				}
				
				//3. Computador usou Tesoura
				if ((computador == 3 && jogador == 1)){
					System.out.println("Você venceu!!");
				}
				if ((computador == 3 && jogador == 2)){
					System.out.println("Você perdeu...");
				}
				if ((computador == 3 && jogador == 4)){
					System.out.println("Você perdeu...");
				}
				if ((computador == 3 && jogador == 5)){
					System.out.println("Você venceu!!");
				}
				
				//4. Computador usou Lagarto
				if ((computador == 4 && jogador == 1)){
					System.out.println("Você venceu!!");
				}
				if ((computador == 4 && jogador == 2)){
					System.out.println("Você perdeu...");
				}
				if ((computador == 4 && jogador == 3)){
					System.out.println("Você venceu!!");
				}
				if ((computador == 4 && jogador == 5)){
					System.out.println("Você perdeu...");
				}
				
				//5. Computador usou Spock
				if ((computador == 5 && jogador == 1)){
					System.out.println("Você perdeu...");
				}
				if ((computador == 5 && jogador == 2)){
					System.out.println("Você venceu!!");
				}
				if ((computador == 5 && jogador == 3)){
					System.out.println("Você perdeu...");
				}
				if ((computador == 5 && jogador == 4)){
					System.out.println("Você venceu!!");
				}
				
			}//Fim do IF
			
			
			
		}//
	}//