package all;

public class Piece {
	int color;//0 branco, 1 preto, -1 vazio
	
	Piece(int color){
		this.color=color;
	}
	
	int gtClass() {
		return 0;
		//0 se piece, 1 se pawn, 2 se horse, 3 se bishop, 4 se tower, 5 se queen e 6 se king
	}
	boolean verif(int[] com, Board tab) {
		return false;
	}
}
