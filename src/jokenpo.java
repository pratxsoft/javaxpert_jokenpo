import java.util.Random;
import java.util.Scanner;

public class jokenpo {

	public static void main(String[] args) {
		//variaveis
				int escolha, maquina, pedra = 1, papel = 2, tesoura = 3;
				String nome;
				
				Random random = new Random();
				
				//objeto
				Scanner leitor = new Scanner(System.in);
				
				System.out.println("_________________");
				System.out.println("");
				System.out.println("    JOKENPO");
				System.out.println("_________________");
				System.out.println("");
				System.out.println("JOGADOR, Digite seu nome: ");
				nome = leitor.next();
				
				System.out.println("");
				System.out.println( nome + " , O Jogo vai começar... Escolha uma opção abaixo: ");
				System.out.println("");
				System.out.println("1 - PEDRA");
				System.out.println("2 - PAPEL");
				System.out.println("3 - TESOURA");
				
				escolha = leitor.nextInt();
				
				if (escolha == 1) {
					System.out.println(nome + " escolheu PEDRA!!");
					System.out.println("");
				} if (escolha == 2) {
					System.out.println(nome +  " escolheu PAPEL!!");
					System.out.println("");
				} if (escolha == 3) {
					System.out.println(nome +  " escolheu TESOURA!!");
					System.out.println("");
				}	 
				
				maquina = random.nextInt(3) +1;
				
				if (maquina == 1) {
					System.out.println("O Computador escolheu PEDRA!!");
					System.out.println("");
				} if (maquina == 2) {
					System.out.println("O Computador escolheu PAPEL!!");
					System.out.println("");
				} if (maquina == 3) {
					System.out.println("O Computador escolheu TESOURA!!");
					System.out.println("");
				}
				switch (escolha){
				case 1: 
					switch (maquina){
						case 1:
							System.out.println("Empate");
							break;
						case 2:
							System.out.println("O COMPUTADOR VENCEU!!");
							break;
						case 3:
							System.out.println("Parabéns " + nome + ", VOCÊ VENCEU!!");
							break;
							default: 
								
					} break;
				case 2:
					switch(maquina) {
						case 1: 
							System.out.println("Parabéns " + nome + ", VOCÊ VENCEU!!");
							break;
						case 2:
							System.out.println(" Empatou");
							break;
						case 3:
							System.out.println("O COMPUTADOR VENCEU");
							break;
						default: 
							
					} break;
				case 3:
					switch(maquina) {
							case 1:
								System.out.println("O COMPUTADOR VENCEU");
								break;
							case 2:
								System.out.println("Parabéns " + nome + ", VOCÊ VENCEU!!");
								break;
							case 3:
								System.out.println("Empate");
								break;
							default: 
					            
					} break;
				default: 
		}
 }
}