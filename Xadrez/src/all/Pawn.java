package all;

public class Pawn extends Piece {

	Pawn(int color) {
		super(color);
	}
	
	int gtClass() {
		return 1;
	}
	boolean verif(int[] com, Board tab) {// falta checar se esta pinado
		if(this.color==0) {
			if(com[0]-1==com[2] && Math.abs(com[1]-com[3])<=1) {
				if(com[1]==com[3]) {
					if(tab.tabela[com[2]][com[3]].color==-1) return true;
				}
				else {
					if(tab.tabela[com[2]][com[3]].color==1) return true;
				}
			}
			if(com[0]==6 && com[2]==4 && com[1]==com[3]) {
				if(tab.tabela[com[2]][com[3]].color==-1) return true;
			}
		}
		if(this.color==1) {
			if(com[0]+1==com[2] && Math.abs(com[1]-com[3])<=1) {
				if(com[1]==com[3]) {
					if(tab.tabela[com[2]][com[3]].color==-1) return true;
				}
				else {
					if(tab.tabela[com[2]][com[3]].color==0) return true;
				}
			}
			if(com[0]==1 && com[2]==3 && com[1]==com[3]) {
				if(tab.tabela[com[2]][com[3]].color==-1) return true;
			}
		}
		return false;
	}
}
