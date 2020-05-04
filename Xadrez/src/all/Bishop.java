package all;

public class Bishop extends Piece {

	Bishop(int color) {
		super(color);
	}

	int gtClass() {
		return 3;
	}
	
	boolean verif(int[] com, Board tab) {
		///Verificar se anda na diagonal, e se nao ha uma peça aliada no caminho
		///Ver se Math.abs(com[0]-com[2])==Math.abs(com[1]-com[3]).
		//Se sim-> fazer um loop e vai ver qual diagonal seguir (ou seja, se tem que diminuir ou aumentar os indices;
		if ((tab.tabela[com[2]][com[3]]).color==this.color) {
			return false;
		}
		
		if(Math.abs(com[1]-com[3])!=Math.abs(com[0]-com[2])) { //Se isso ocorrer, o movimento nao foi na diagonal.
			return false;
		}
		
		//Verificar as posicoes entre o fim e o inicio..
		
		int i=com[0], j=com[1];
		if (i<com[2]) {
			i++;
		}
		else if (i>com[2]) {
			i--;
		}
		
		if (j<com[3]) {
			j++;
		}
		else if (j>com[3]) {
			j--;
		}
		
		while(i!=com[2] && j!=com[3]) {
			if (tab.tabela[i][j].gtClass()!=0) {
				return false;
			}
			if (i<com[2]) {
				i++;
			}
			else {
				i--;
			}
			
			if (j<com[3]) {
				j++;
			}
			else{
				j--;
			}
		}
	
		
		
		return true;
	}
}
