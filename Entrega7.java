package Aula1;
import java.util.Scanner;
public class Entrega7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int r,l,m,n,i,j,k,c=0, x=0,b=0;
		double [][] tab1, tab2, tab3;
		do {
			do {
				System.out.println("Vamos conferir se as matrizes são inversas.\nInforme o número de linhas e colunas da matriz A.\nVale lembrar que o número de linhas de B será o número de colunas de A");
				l= ent.nextInt(); //usar valor 2 para teste
				m= ent.nextInt(); //usar valor 2 para teste
				System.out.println("Informe o número de colunas da matriz B");
				n= ent.nextInt(); //usar valor 2 para teste
				if(l<=0||m<=0||n<=0)
					System.out.println("Somente valores positivos para as matrizes");
			}while(l<=0||m<=0||n<=0);
			tab1 = new double [l][m];
			tab2 = new double [m][n];
			tab3 = new double [l][n];
			for (i=0; i<l;i++) {
				for (j=0; j<m;j++) {
					System.out.println("Infome um valor para a linha "+(i+1)+" da coluna "+(j+1)+" de A.");
					tab1[i][j] = ent.nextDouble();	//usar valores 1,2,3,4
				}
				
			}
			for (i=0; i<m;i++) {
				for (j=0; j<n;j++) {
					System.out.println("Infome um valor para a linha "+(i+1)+" da coluna "+(j+1)+" de B.");
					tab2[i][j] = ent.nextDouble();	//usar valores -2,1,1.5,-0.5
				}
			}
			for (i=0; i<l;i++) {
				for (j=0; j<n;j++) {
					for (k=0;k<m;k++)
						tab3[i][j] +=(tab1[i][k]*tab2[k][j]);
					}
				}
			for (i=0;i<l;i++) {
				for(j=0;j<n;j++) {
					++b;
					if((i==j) && (Math.abs(tab3[i][j]-1)<=0.01))
						++c;
					else
						++x;
				}
			}
			if (c==l||c==n && x==(b-c)) {
				System.out.println("A Matriz é identidade");
			}
			else {
				System.out.println("Existem "+x+" elementos que não tornam a matriz identidade:");
			}
			System.out.println("Valores C\n");
			for (i=0; i<l;i++) {
				for (j=0; j<n;j++) {
					System.out.print(tab3[i][j]+" ");
				}
				System.out.println(" ");
			}
			System.out.println("Desejar repetir a operação? Digite 1 para sim");
			r=ent.nextInt();
		}while (r==1);
	}
}
