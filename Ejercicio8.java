import java.util.Scanner;
public class Ejercicio8 {
	public static void main (String[] args){
		System.out.println("Cuantos anyos tienes?");
		Scanner sc = new Scanner(System.in);
		int anyos = sc.nextInt();
		int diasTotales = anyos * 365;
		System.out.println("Tienes " + diasTotales + " dias en " + anyos + " anyos de vida");
	}
}