package all;

public class Board {
	Piece[][] tabela=new Piece[8][8];
	
	void create(){//cria o tabuleiro inicial
		tabela[0][0]= new Tower(1); tabela[0][7]= new Tower(1);
		tabela[0][1]= new Horse(1); tabela[0][6]= new Horse(1);
		tabela[0][2]= new Bishop(1); tabela[0][5]=new Bishop(1);
		tabela[0][3]=new Queen(1); tabela[0][4]= new King(1);
		
		tabela[7][0]= new Tower(0); tabela[7][7]= new Tower(0);
		tabela[7][1]= new Horse(0); tabela[7][6]= new Horse(0);
		tabela[7][2]= new Bishop(0); tabela[7][5]=new Bishop(0);
		tabela[7][3]=new Queen(0); tabela[7][4]= new King(0);
		
		for (int j=0; j<8; j++){
			tabela[1][j] = new Pawn(1);
			tabela[6][j] = new Pawn(0);
			for(int i = 2; i<=5;i++) {
				tabela[i][j]= new Piece(-1);
			}
		}
	}
	void show() {//printa o tabuleiro
		for (int i=0; i<8; i++){
			System.out.print(8-i+" ");
			for(int j=0; j<8; j++) {
				if(tabela[i][j].color==0){
					if(tabela[i][j].gtClass()==1) System.out.print("p ");
					if(tabela[i][j].gtClass()==2) System.out.print("h ");
					if(tabela[i][j].gtClass()==3) System.out.print("b ");
					if(tabela[i][j].gtClass()==4) System.out.print("t ");
					if(tabela[i][j].gtClass()==5) System.out.print("q ");
					if(tabela[i][j].gtClass()==6) System.out.print("k ");	
				}
				else if(tabela[i][j].color==1){
					if(tabela[i][j].gtClass()==1) System.out.print("P ");
					if(tabela[i][j].gtClass()==2) System.out.print("H ");
					if(tabela[i][j].gtClass()==3) System.out.print("B ");
					if(tabela[i][j].gtClass()==4) System.out.print("T ");
					if(tabela[i][j].gtClass()==5) System.out.print("Q ");
					if(tabela[i][j].gtClass()==6) System.out.print("K ");	
				}
				else System.out.print("- ");
			}
			System.out.println("");
		}
		System.out.println("  a b c d e f g h \n");
	}
}
