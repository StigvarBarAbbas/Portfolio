package Aula1;
import java.util.Scanner; 

public class Entrega6 {

	public static void main(String[] args) {
		int n,c=0,r,ale;
		Scanner ent = new Scanner(System.in);
		do {
		ale = (int)(Math.random() * 100) + 1; 
		System.out.println("Vamos brincar de advinhar!\nInforme um número de 1 a 100, vamos ver o quão bom você é!\nVocê tem 5 chances.");
		do {
		n=ent.nextInt();
		++c;
		if (n==ale&&c==1)
			System.out.println("Parabéns, você acertou! E de primeira!");
		else if (n==ale && c<=5)
			System.out.println("Parabéns, você acertou!");
		else if (n<ale && c==4)
			System.out.println("Chutou um pouco baixo, tente novamente!\nÚltimo lance!");
		else if (n>ale && c==4)
			System.out.println("Chutou um pouco alto, tente novamente!\nÚltimo lance!");
		else if (n>ale && c<5)
			System.out.println("Chutou um pouco alto, tente novamente!\nVocê tem mais "+(5-c)+" chances");
		else if (n<ale && c<5) 
			System.out.println("Chutou um pouco baixo, tente novamente!\nVocê tem mais "+(5-c)+" chances");
		else if (n!=ale && c==5) 
			System.out.println("Poxa, não foi dessa vez, melhor sorte na próxima vez!\nO número sorteado era: "+ale);
		}while(n!=ale || c<5);
		System.out.println("Deseja brincar de novo? 1 para sim");
		r= ent.nextInt();
		c=0;
		}while(r==1);
		
	}
}
