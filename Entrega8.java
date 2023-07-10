package Aula1;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;
public class Entrega8 {
 public static void coordXY() throws Exception{
	 File f1 = new File("CoordX.txt");
	 PrintWriter pw1 = new PrintWriter(f1);
	 for (int i=0; i<25; i++) {
		 int ale = (int)(Math.random() * 100) + 1;
		 pw1.println(ale);
		 
	 }
	 File f2 = new File("CoordY.txt");
	 PrintWriter pw2 = new PrintWriter(f2);
	 for (int i=0; i<25; i++) {
		 int ale = (int)(Math.random() * 100) + 1;
		 pw2.println(ale);
		 
	 }
	 
	 pw1.close();
	 pw2.close();
 }
	 
 public static void main(String[] args) throws Exception {
	 coordXY();
	 File f3 = new File("CoordRetas.txt");
	 File f1 = new File("CoordX.txt");
	 File f2 = new File("CoordY.txt");
	 PrintWriter pw3 = new PrintWriter(f3);
	 double somayquad = 0; 
	 double somaxquad = 0;
	 double somay =0;
	 double somax = 0;
	 double somaxy = 0;
	 Scanner ent1 = new Scanner(f1).useLocale(Locale.ENGLISH);
	 Scanner ent2 = new Scanner(f2).useLocale(Locale.ENGLISH);
	 for (int i=0; i<25; i++) {
		 somax += ent1.nextDouble();
		 somay+= ent2.nextDouble();
		 somaxquad += (somax*somax);
		 somayquad += (somay*somay);
		 somaxy += (somax*somay);
		 
	 }
	 ent1.close();
	 ent2.close();
	 double a =((25*somaxy)-(somax*somay))/((25*somaxquad)-(somax*somax));
		
	 double b =((somay*somaxquad)-(somax*somaxy))/((25*somaxquad)-(somax*somax));
	 pw3.println("Coeficiente angular da reta: "+a);
	 pw3.println("Coeficiente linear da reta: "+b);
	 pw3.close();
	 
	 
 }
}
