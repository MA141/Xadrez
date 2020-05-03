package all;

public class Converter {
	
	int[][] conv(String[] vet){// converte os movimentos da lista de comandos em uma lista de coordenas [[iInical,jInical,iFinal,jFinal,promocao],...]
		
		int realsize=0,i=0,realI=0;
		
		for(int n = 0;n<vet.length;n++) {//calcula o numero real de movimentos
			if(vet[n].length()>1) {
				realsize++;
			}
		}
		
		
		int[][] a= new int[realsize][5];
		while(i<vet.length){	
			a[realI][0]=7-(((int)(vet[i].charAt(1)))-49);
			a[realI][1]=(((int)(vet[i].charAt(0)))-97);
			a[realI][2]=7-(((int)(vet[i].charAt(4)))-49);
			a[realI][3]=(((int)(vet[i].charAt(3)))-97);
			a[realI][4]=0;
			if(i+1!=vet.length) {
				if(vet[i+1].length()==1) {
					if(vet[i+1].charAt(0)=='h') {
						a[realI][4]=2;
					}
					else if(vet[i+1].charAt(0)=='b') {
						a[realI][4]=3;
					}
					else if(vet[i+1].charAt(0)=='t') {
						a[realI][4]=4;
					}
					else if(vet[i+1].charAt(0)=='q') {
						a[realI][4]=5;
					}
					i++;
				}
			}
			realI++;
			i++;
		}
		return a;
	}
}
