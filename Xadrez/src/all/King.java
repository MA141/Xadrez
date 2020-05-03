package all;

public class King extends Piece {

	King(int color) {
		super(color);
	}

	int gtClass() {
		return 6;
	}
	boolean verif(int[] com, Board tab) {
		if(Math.abs(com[0]-com[2])<=1 && Math.abs(com[1]-com[3])<=1) {
			if(tab.tabela[com[2]][com[3]].color!=this.color){//se a casa alvo nao tem uma peca amiga
				//falta checar se a casa esta sendo dominada por outra peca
				return true;
			}
		}
		return false;
	}
}
