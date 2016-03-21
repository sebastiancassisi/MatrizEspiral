package ar.com.cassisi.matrizespiral;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
	int n= 7;//Probamos con una matriz de 7x7
	int nlimite= n-1;
	int inicio = 0;
	int c=1;
	while(c<=(n*n)){
		for(int i=inicio;i<=nlimite;i++){ //Ciclo 1
			matriz[inicio][i]=c++;
		} 
		for(int i=inicio+1;i<=nlimite;i++){//Ciclo 2
			matriz[i][nlimite]=c++;
		}
		for(int i=nlimite-1;i>=inicio;i--){//Ciclo 3
			matriz[nlimite][i]=c++;
		}
		for(int i=nlimite-1;i>=inicio+1;i--){//Ciclo 4
			matriz[i][inicio]=c++;
		}
		nlimite=nlimite-1;
		inicio = inicio+1;
	}
	for(int i=0;i<n;i++){ /*Mostrar la matriz en pantalla*/
		System.out.println();
		for(int j=0;j<n;j++){
			System.out.print(matriz[i][j]+"\t");
		}
	}
    }
}

