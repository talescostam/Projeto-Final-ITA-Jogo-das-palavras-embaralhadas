import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		String palavra;
		String nivel;
		String n;

		FabricaMecanicaDoJogo fmj = new FabricaMecanicaDoJogo();
		MecanicaDoJogo mj;

		Scanner s = new Scanner(System.in);
		do {
			System.out.println("Sejam muito bem vindos ao jogo Her�is das Palavras Embaralhadas!!!");
			System.out.println("");
			System.out.println("Neste jogo voc� dever� descobrir a palavra embaralhada para derrotar o monstro");
			System.out.println("e se tornar um grande her�i ou uma grande hero�na da na��o!!!");
			System.out.println("");
			System.out.println("Digite o modo de jogo que deseja se aventurar:");
			System.out.println(
					"1: n�vel '�pico - A Ca�a de Monstros Sem Fim' (voc� tem 3 vidas e cada letra do monstro vale 1 ponto)");
			System.out.println(
					"2: n�vel 'Lend�rio - Desafio Perfeito Sem Fim' (voc� tem 1 vida e cada letra do monstro vale 2 pontos)");
			System.out.println("");

			do {
				nivel = s.nextLine();
				if (!nivel.equals("1") && !nivel.equals("2"))
					System.out.println("Op��o inv�lida. Digite novamente");
			} while (!nivel.equals("1") && !nivel.equals("2"));

			if (nivel.equals("2")) {
				mj = fmj.retornoMecanica(2);
				System.out.println("Voc� escolheu o n�vel 'Lend�rio - Desafio do Infinito'");
			} else {
				mj = fmj.retornoMecanica(1);
				System.out.println("Voc� escolheu o n�vel '�pico - Ca�a aos Monstros'");
			}

			do {
				System.out.println("");
				System.out.println("Adivinhe a palavra para derrotar o monstro:");
				System.out.println("");
				System.out.println(mj.getProximaPalavraAleatoria());
				System.out.println("");
				System.out.println("Digite sua resposta:");
				palavra = s.nextLine();
				if (mj.verificaPalavra(palavra)) {
					System.out.println("Voc� acertou! O monstro " + palavra + " foi derrotado!");
					mj.acertou(mj.getPalavraAleatoria().length());
				} else {
					System.out.println(
							"Voc� errou! O monstro " + mj.getPalavraAleatoria() + " te tirou uma vida e escapou.");
					mj.perdeuUmaVida();
					if (mj.getVida() != 0)
						System.out.println("Voc� ainda tem: " + mj.getVida() + " vida(s).");
				}
				System.out.println("------------------------------------------------------------------------");
				mj.novaPalavraAleatoria();

			} while (mj.getVida() > 0);

			System.out.println("O jogo acabou!");
			System.out.println("Sua pontua��o foi de " + mj.getPontos() + " pontos.");
			System.out.println("");
			System.out.println("Gostaria de desafiar os monstros novamente? Digite:");
			System.out.println("1 - Sim; 2 - N�o");
			System.out.println("");
			do {
				n = s.nextLine();
				if (!n.equals("1") && !n.equals("2"))
					System.out.println("Op��o inv�lida, tente novamente.");
			} while (!n.equals("1") && !n.equals("2"));
		} while (n.equals("1"));
		System.out.println("Game Over! O jogo acabou!");
		s.close();
	}
}
