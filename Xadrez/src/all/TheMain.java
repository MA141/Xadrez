package all;

public class TheMain {

	public static void main(String[] args) {
		Board tab = new Board();
		tab.create();
		System.out.println("Tabuleiro inicial:");
		tab.show();
		
		CSVReader test = new CSVReader();
		test.setDataSource("C:\\Users\\Artur\\Desktop\\UNICAMP\\2020-1\\MC322\\lab7\\Xadrez\\teste.csv");
		String commands[] = test.requestCommands();
		Converter ini = new Converter();
		int [][] coords = ini.conv(commands);
		
		for(int k = 0; k<coords.length; k++) {
			for(int l = 0; l<5; l++) {
				System.out.print(coords[k][l]+"  ");
			}
			System.out.println("");
		}

		moveAll(coords, tab);
	}

	static void moveAll(int[][] coms, Board tab) {
		for(int k = 0; k<coms.length; k++) {
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
