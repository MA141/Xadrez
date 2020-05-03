package all;

public class Horse extends Piece {

	Horse(int color) {
		super(color);
	}
	
	int gtClass() {
		return 2;
	}
	
	boolean verif(int[] com, Board tab) {// falta checar se esta pinado
		if(com[0]!=com[2] && com[1]!=com[3] && Math.abs(com[2]-com[0])+Math.abs(com[3]-com[1])==3) {
			if(tab.tabela[com[2]][com[3]].color!=this.color) return true;
		}
		return false;
	}
}
