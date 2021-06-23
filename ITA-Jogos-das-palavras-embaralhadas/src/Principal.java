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
			System.out.println("Sejam muito bem vindos ao jogo Heróis das Palavras Embaralhadas!!!");
			System.out.println("");
			System.out.println("Neste jogo você deverá descobrir a palavra embaralhada para derrotar o monstro");
			System.out.println("e se tornar um grande herói ou uma grande heroína da nação!!!");
			System.out.println("");
			System.out.println("Digite o modo de jogo que deseja se aventurar:");
			System.out.println(
					"1: nível 'Épico - A Caça de Monstros Sem Fim' (você tem 3 vidas e cada letra do monstro vale 1 ponto)");
			System.out.println(
					"2: nível 'Lendário - Desafio Perfeito Sem Fim' (você tem 1 vida e cada letra do monstro vale 2 pontos)");
			System.out.println("");

			do {
				nivel = s.nextLine();
				if (!nivel.equals("1") && !nivel.equals("2"))
					System.out.println("Opção inválida. Digite novamente");
			} while (!nivel.equals("1") && !nivel.equals("2"));

			if (nivel.equals("2")) {
				mj = fmj.retornoMecanica(2);
				System.out.println("Você escolheu o nível 'Lendário - Desafio do Infinito'");
			} else {
				mj = fmj.retornoMecanica(1);
				System.out.println("Você escolheu o nível 'Épico - Caça aos Monstros'");
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
					System.out.println("Você acertou! O monstro " + palavra + " foi derrotado!");
					mj.acertou(mj.getPalavraAleatoria().length());
				} else {
					System.out.println(
							"Você errou! O monstro " + mj.getPalavraAleatoria() + " te tirou uma vida e escapou.");
					mj.perdeuUmaVida();
					if (mj.getVida() != 0)
						System.out.println("Você ainda tem: " + mj.getVida() + " vida(s).");
				}
				System.out.println("------------------------------------------------------------------------");
				mj.novaPalavraAleatoria();

			} while (mj.getVida() > 0);

			System.out.println("O jogo acabou!");
			System.out.println("Sua pontuação foi de " + mj.getPontos() + " pontos.");
			System.out.println("");
			System.out.println("Gostaria de desafiar os monstros novamente? Digite:");
			System.out.println("1 - Sim; 2 - Não");
			System.out.println("");
			do {
				n = s.nextLine();
				if (!n.equals("1") && !n.equals("2"))
					System.out.println("Opção inválida, tente novamente.");
			} while (!n.equals("1") && !n.equals("2"));
		} while (n.equals("1"));
		System.out.println("Game Over! O jogo acabou!");
		s.close();
	}
}
