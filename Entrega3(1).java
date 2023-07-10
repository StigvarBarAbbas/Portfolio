package Aula1;
import java.util.Scanner;

class Entrega3 {
	public static void main (String[] args) {
	int a, b, c, p, r;
	Scanner ent = new Scanner(System.in);
	do {
		System.out.println("Vamos medir a área e o perímetro do polígono!");
	System.out.println("Informe um número positivo para o lado A");
	a = ent.nextInt();
	if (a<0) {
		a=a*-1;
		System.out.println("Estamos medindo para o lado contrário, entendi.");
	}
	System.out.println("Informe um número positivo para o lado B");
	b = ent.nextInt();
	if (b<0) {
		b=b*-1;
		System.out.println("Estamos medindo para o lado contrário, entendi.");
	}
	while (a==0|b==0) {
		System.out.println("Nós precisamos de valores válidos para medir o polígono");
		System.out.println("Informe um número positivo para o lado A");
		a = ent.nextInt();
		System.out.println("Informe um número positivo para o lado B");
		b = ent.nextInt();
	}
	c= a*b;
	p= (2*a)+(2*b);
	if(a==b){
		System.out.println("O quadrado de lados "+a+" possui área de "+c+"u² e perímetro de "+p+"u");
	}else {
		System.out.println("O retângulo de lado A= " + a + " e lado B= " + b + " possui área de " + c + "u² e perímetro de " + p + "u");
	}
	System.out.println("Deseja calcular novamente? Digite 1 para sim e 2 para encerrar.");
	r = ent.nextInt();
	}while (r==1);
		
	}
	
}

