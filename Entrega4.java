package Aula1;
import java.util.Scanner;

public class Entrega4 {
	public static void main (String[] args) {
		double a, b, c, s;
		int r;
		Scanner ent = new Scanner(System.in);
		do {
			do {
			System.out.println("Informe o valor, em graus, do primeiro ângulo interno");
			a = ent.nextDouble();
			if (a<0) {
				a=a*-1;
				System.out.println("Vamos tentar com valores positivos dessa vez.");
			}
			System.out.println("Informe o valor, em graus, do segundo ângulo interno");
			b = ent.nextDouble();
			if (b<0) {
				b=b*-1;
				System.out.println("Vamos tentar com valores positivos dessa vez.");
			}
			System.out.println("Informe o valor, em graus, do terceiro ângulo interno");
			c = ent.nextDouble();
			if (c<0) {
				c=c*-1;
				System.out.println("Vamos tentar com valores positivos dessa vez.");
			}
			while (a==0.0||b==0.0||c==0.0) {
				System.out.println("Nós precisamos de valores válidos para medir o triângulo");
				if (a==0.0) {
					System.out.println("Informe o valor, em graus, do primeiro ângulo interno");
					a = ent.nextDouble();
					if (a<0) {
						a=a*-1;
						System.out.println("Vamos tentar com valores positivos dessa vez");
					}
				} else if (b==0.0) {
					System.out.println("Informe o valor, em graus, do segundo ângulo interno");
					b = ent.nextDouble();
					if (b<0) {
						b=b*-1;
						System.out.println("Vamos tentar com valores positivos dessa vez");
					}
				}else if(c==0.0) {
					System.out.println("Informe o valor, em graus, do terceiro ângulo interno");
					c = ent.nextDouble();
					if (c<0) {
						c=c*-1;
						System.out.println("Vamos tentar com valores positivos dessa vez");
					}
				}
			}
			s = a+b+c;
			if (s!=180.0) {
				System.out.println("Os valores não formam um triângulo, por favor informe outros valores para os ângulos");
			}
			} while (s!=180.0);
			if (a==60.0 && b==60.0 && c==60.0) {
				System.out.println("O triângulo formado é do tipo Equilátero.");
			} else if ((a==b && a!=c)||(a==c && a!=b)||(c==b && a!=b)) {
				System.out.println("O triângulo formado é do tipo Isósceles.");
			} else {
				System.out.println("O triângulo formado é do tipo Escaleno.");
			}
			System.out.println("Deseja calcular novamente? Digite 1 para sim e 2 para encerrar.");
			r = ent.nextInt();
			}while (r==1);
		
	}

}
