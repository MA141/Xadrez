package all;

public class Tower extends Piece {

	Tower(int color) {
		super(color);
	}

	int gtClass() {
		return 4;
	}
	
	boolean verif(int[] com, Board tab) {
		if ((tab.tabela[com[2]][com[3]]).color==this.color) { //A pos final esta ocupada por uma peca aliada
			return false;
		}
		
		if (com[0]!=com[2] && com[1]!=com[3]) { //Nao andou em linha reta
			return false;
		}
		
		if (com[0]==com[2]) { ///Verifica as posicoes entre a final e a inicial, andando na linha
			int i=com[1];
			if (i<com[3]) {
				i++;
			}
			else if (i>com[3]) {
				i--;
			}
			while (i!=com[3]) {
				if ((tab.tabela[com[0]][i]).gtClass()!=0) {
					return false;
				}
				if (i<com[3]) {
					i++;
				}
				else {
					i--;
				}
				
			}
		}
		
		else if (com[1]==com[3]) { ///Verifica as posicoes entre a final e a inicial, andando na coluna
			int i=com[0];
			if (i<com[2]) {
				i++;
			}
			else if (i>com[2]) {
				i--;
			}
			while (i!=com[2]) {
				if ((tab.tabela[i][com[1]]).gtClass()!=0) {
					return false;
				}
				if (i<com[2]) {
					i++;
				}
				else {
					i--;
				}
			}
		}
		
	return true;	
	}
}
