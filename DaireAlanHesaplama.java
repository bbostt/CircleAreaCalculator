import java.util.Scanner;
public class DaireAlanHesaplama {

	public static void main(String[] args) {
		
		double r, alan , aci, pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yar� �ap� giriniz : ");
		
		r = input.nextDouble();
		
		System.out.print("Merkez a��s�n� giriniz : ");
		
		aci = input.nextDouble();
		
		alan = (pi * (r * r) * aci) / 360;
		
		System.out.println(alan);

	}

}
