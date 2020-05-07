package all;

public class TheMain {

	public static void main(String[] args) {
		Board tab = new Board();
		tab.create();
		System.out.println("Tabuleiro inicial:");
		tab.show();
		
		CSVReader test = new CSVReader();
		test.setDataSource("_####_\\Xadrez\\xadrez.csv");
		String commands[] = test.requestCommands();
		Converter ini = new Converter();
		int [][] coords = ini.conv(commands);
		

		moveAll(coords, tab);
	}

	static void moveAll(int[][] coms, Board tab) {
		int lastTurn=-1; //Marca a cor que jogou no ultimo turno
		for(int k = 0; k<coms.length; k++) {
			if (tab.tabela[coms[k][0]][coms[k][1]].color==lastTurn) {
				System.out.println("Jogada invalida: Nao esta no turno certo");
				return;
			}
			lastTurn=tab.tabela[coms[k][0]][coms[k][1]].color;
			
			if(tab.tabela[coms[k][0]][coms[k][1]].verif(coms[k], tab)) {
				tab.move(coms[k]);
				tab.show();
			}
			else {
				System.out.println("Jogada invalida!");
				return;
			}
		}
	}
}
