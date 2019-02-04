import java.util.Scanner; //Elle permet d'utiliser la classe Scanner

public class Calc {
	public static void main(String[] arg) {
		Scanner scanner; //Variable : Scanner
		scanner = new Scanner(System.in);
		int value1; //Variable : integer
		int value2; //Variable : integer
		System.out.println("Entrer le premier nombre : ");
		value1 = scanner.nextInt();
		System.out.println("Entrer le second nombre : ");
		value2 = scanner.nextInt();
		scanner.close();
		System.out.println("La somme de " + value1 + " et " + value2 + " est : " + (value1+value2));
		System.out.println("La différence de " + value1 + " et " + value2 + " est : " + (value1-value2));
		System.out.println("La multiplication de " + value1 + " par " + value2 + " est : " + (value1*value2));
		if (value2 != 0) {
			System.out.println("Le quotient de " + value1 + " par " + value2 + " est : " + (value1/value2));
			System.out.println("Le reste de " + value1 + " par " + value2 + " est : " + (value1%value2));
		} else {
			System.out.println("Le diviseur doit être différent de 0");
		}
	}
}
