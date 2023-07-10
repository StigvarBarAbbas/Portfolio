package Aulas;
import java.io.*;
import java.util.*;

public class Entrega9 {

	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	int [] bin = new int[8];
	
	System.out.println("Vamos converter binários em decimais!\nInforme os números 0 e 1, um de cada vez, para que possamos converter para decimais");
	
	for (int i=0;i<8;i++) {
		bin[i]=ent.nextInt();
		
	}
	System.out.print("O número ");
	for (int i=0;i<8;i++)
		System.out.print(bin[i]) ;
	System.out.print(" convertido em decimal equivale a "+ConverteBinDec(bin));
	ent.close();
	}
	public static int ConverteBinDec(int[] vbin) {
		int som =0;
		for(int i=0;i<8;i++)
			som += vbin[i]*Math.pow(2,(7-i));
			return som;
	}
}
