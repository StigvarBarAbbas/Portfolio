package Aula1;

import java.util.Scanner;

public class Entrega5 {
	public static void main (String[] args) {
		int a, c, r, x=0;
		Scanner ent = new Scanner(System.in);
		do {
			do {	
				System.out.println("Vamos descobrir os n�meros primos!.");
				System.out.println("Informe um n�mero positivo inteiro positivo.");
				a = ent.nextInt();
				if (a<0) {
				System.out.println("Somente n�meros positivos por favor.");
				}
			}while (a<0);
			if (a>=10000&a<99999)
				System.out.println("Temos uma alma curiosa entre n�s, �timo!");
			else if (a>=99999)
				System.out.println("Ao infinito...e ainda mais longe!");
			for (c=1; c<=a; c++) {
				if (a%c==0)
					x++;
			}
			if (x==2 & a>10000)
				System.out.println("O n�mero "+a+" � primo, e essa nem eu sabia!");
			else if (x==2)
				System.out.println("O n�mero "+a+" � primo.");
			else
				System.out.println("O n�mero "+a+" n�o � primo.");
			System.out.println("Deseja calcular novamente? Digite 1 para sim e 2 para encerrar.");
			r = ent.nextInt();
			x=0;
		}while (r==1);
	}
}
